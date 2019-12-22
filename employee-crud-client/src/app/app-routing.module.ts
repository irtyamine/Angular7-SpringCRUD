import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeDetailsComponent } from './component/employee-details/employee-details.component';
import { AddressDetailsComponent } from './component/address-details/address-details.component';
import { HomePageComponent } from './component/home-page/home-page.component';

const routes: Routes = [
  {path:"employee-details",component: EmployeeDetailsComponent},
  {path:"address-details",component: AddressDetailsComponent},
  {path:"home-page",component: HomePageComponent},
  {path:"**",component:HomePageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 

  constructor(){
    console.log('---AppRoutingModule--While Navigating from One component to another component it get called------');
  }


}
