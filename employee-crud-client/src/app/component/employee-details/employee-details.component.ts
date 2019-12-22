import { Component, OnInit, OnChanges } from '@angular/core';
import { HttpDataService } from 'src/app/service/http-data.service';
import { EmployeeModel } from 'src/app/model/employee-model';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  employeeModel:EmployeeModel;

  constructor(private http: HttpDataService){
    console.log('----constructor-----');
    this.employeeModel= new EmployeeModel("Gaurav","Navi Mumbai",18,789456613);
   }
  
   ngOnInit() {
    console.log('----ngOnInit-----');
    this.http.get('getAllEmp').subscribe(
      (response)=>
      {
        console.log('--response---',response)
      },
      (error)=>{},
      ()=>{},
   );

  //  this.submitForm();
   this.getNameList();
}


submitForm(){
  this.http.post('saveData',this.employeeModel).subscribe(
    (response)=>
    {
      console.log('--response---',response)
    },
    (error)=>{},
    ()=>{},

  );

}

getNameList(){

  this.http.post('getNameList',18).subscribe(
    (response)=>
    {
      console.log('--response---',response)
    },
    (error)=>{},
    ()=>{},

  );
}



}
