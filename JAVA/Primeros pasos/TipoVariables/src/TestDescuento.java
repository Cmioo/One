public class TestDescuento {
    public static void main(String[] args) {
        
        double valorCompra =148.0;
        double descuento =0.0;

        if(valorCompra>=100 && valorCompra<200){
            descuento=10.0;
        }
            else if (valorCompra>=200 && valorCompra<300){
                descuento=15.0;
            }
            else if (valorCompra >=300){
                descuento=20.0;
            }

        double valorFinal=valorCompra - (valorCompra*(descuento/100));

        System.out.println("Valor de la compra: $" + valorCompra);
        System.out.println("Descuento:"+descuento + "%");
        System.out.println("Valor final:$"+valorFinal);




        }
    }
