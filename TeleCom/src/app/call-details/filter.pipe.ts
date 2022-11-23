import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(value: any[], ...args: any[]): any[] {
    console.log('Value ', value);
    console.log('Argument ', args);

    let output = value;
    if(args[0]) {
      output = value.filter(data => {
        console.log('First Value: ', data.calledBy.toString().includes(args[0].toString()));
        console.log('Second Value: ', data.calledTo.toString().includes(args[0].toString()));

        return data.calledBy.toString().includes(args[0].toString()) || data.calledTo.toString().includes(args[0].toString());
      })
    }

    console.log('Output: ', output);

    return output;
  }

}
