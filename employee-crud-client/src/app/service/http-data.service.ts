import { Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class HttpDataService {

  constructor(private http:HttpClient) { }

  post(url:string, data:any): Observable<any> 
  {
     return this.http.post(environment.append+url,data);    
  }

  get(url:string):Observable<any>{

    return this.http.get(environment.append+url);
  }


}
