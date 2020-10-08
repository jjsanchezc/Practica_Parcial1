def notacionPolaca(s):

     pila = []

     for c in s:

         if esUnNumero(c):

             pila.push(int(c))

         else: #Es un operador

             numeroArriba = pila.pop()

             numeroAbajo =  pila.pop()

             resultado = 0

             if (c == "+"):

                 resultado = numeroArriba + numeroAbajo

             if (c == "-"): #arriba - abajo? abajo - arriba?

                 resultado = numeroAbajo - numeroArriba

             if (c == "*"): #arriba - abajo? abajo - arriba?

                 resultado = numeroAbajo * numeroArriba

             if (c == "/"): #arriba - abajo? abajo - arriba?

                 resultado = numeroAbajo / numeroArriba                

             pila.push(resultado)

     return None
  
def __main__():

    print(notacionPolaca("23+5*"))


__main__()