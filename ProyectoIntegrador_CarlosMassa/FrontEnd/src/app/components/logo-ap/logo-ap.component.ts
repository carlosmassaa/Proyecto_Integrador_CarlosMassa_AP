import { Component, OnInit } from '@angular/core';
import { LoginComponent } from '../login/login.component';
import { Router } from '@angular/router';
import { TokenService } from '../../service/token.service';

@Component({
  selector: 'app-logo-ap',
  templateUrl: './logo-ap.component.html',
  styleUrls: ['./logo-ap.component.css']
})
export class LogoAPComponent implements OnInit{
  isLogged = false;

  constructor(private router:Router, private TokenService: TokenService){

  }



  ngOnInit(): void {
    if(this.TokenService.getToken()){
      this.isLogged=true;
    }else{
      this.isLogged = false;
    }
  }

  onLogOut():void{
    this.TokenService.logOut();
    window.location.reload();
  }

  login(){

  this.router.navigate(['/login'])

  }

}
