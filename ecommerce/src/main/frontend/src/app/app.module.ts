import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductsComponent } from './ecommerce/products/products.component';
import { OrdersComponent } from './ecommerce/orders/orders.component';
import { ShoppingCartComponent } from './ecommerce/shopping-cart/shopping-cart.component';
import { EcommerceComponent } from './ecommerce/ecommerce.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    OrdersComponent,
    ShoppingCartComponent,
    EcommerceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule

    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
