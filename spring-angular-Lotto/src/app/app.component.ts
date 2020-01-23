import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'spring-angular-Lotto';

    // Object to save the response returned from the service.
    myresponse: any;

    // Url to fetch the winning mumbers from the spring application.
    readonly APP_URL = 'http://localhost:8080//LottoMVC-ANGULAR';

    constructor(private _http: HttpClient) { }


    getAllWinningNumbers() {
      this._http.get(this.APP_URL + '/getLottoNumbers').subscribe(
        data => {
          this.myresponse = data;
        },
        error => {
          console.log('Error occured', error);
        }
      );
    }

}
