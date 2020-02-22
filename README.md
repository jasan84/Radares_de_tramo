# Radares_de_tramo

https://www.aceptaelreto.com/problem/statement.php?id=112&cat=4

 Los radares de tramo consisten en colocar dos cámaras en dos puntos alejados de una carretera para poder comprobar cuánto tiempo ha tardado el coche en recorrer ese tramo. Si la velocidad media supera la velocidad máxima permitida, gracias al teorema anterior podremos saber (aunque no le hayamos visto) que en algún punto del trayecto ha superado esa velocidad. Por ejemplo, si colocamos las cámaras separadas 10Km en un tramo cuya velocidad está limitada a 110Km/h, y un coche tarda 5 minutos en ser visto por la segunda cámara, sabremos que su velocidad media ha sido de 120Km/h, y por tanto en algún sitio ha superado el límite de velocidad aunque al pasar por debajo de las dos cámaras el coche fuera a 80Km/h. <br/><br/>
Entrada

La entrada estará formada por un número indeterminado de casos de prueba. Cada caso de prueba consistirá en tres números: el primero será la distancia (en metros) que separan las dos cámaras, el segundo indicará la velocidad máxima permitida en todo ese tramo (en Km/h) y el tercer y último número indicará el número de segundos que ha tardado un coche en recorrer el tramo. Todos esos números serán enteros.

La entrada terminará cuando todos los números sean cero. <br/><br/>
Salida

Para cada caso de prueba, el programa generará una línea, indicando si el coche debe ser multado o no. En concreto, indicará "OK" si el coche no superó la velocidad máxima, indicará "MULTA" si se superó esa velocidad en menos de un 20% de la velocidad máxima permitida, y "PUNTOS" si la velocidad fue superada en un 20% o más de esa velocidad; en ese caso además de la multa se le quitarán puntos del carnet.

El sistema de radar puede fallar y registrar entradas incorrectas (por ejemplo, indicando que el tiempo que ha tardado el coche es negativo). En esos casos, el sistema mostrará la cadena "ERROR". <br/> <br/>
Entrada de ejemplo
 <br/>
9165 110 300 <br/>
9165 110 299 <br/>
12000 100 433 <br/>
12000 100 431 <br/>
12000 100 359 <br/>
-1000 -50 -100 <br/>
0 0 0 
 <br/> <br/>
Salida de ejemplo
 <br/>
OK <br/>
MULTA <br/>
OK <br/>
MULTA <br/>
PUNTOS <br/>
ERROR <br/>

