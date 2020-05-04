<!DOCTYPE html>
<html>
<head>
	<h1>Mandelbrot &amp; Julia Set Plotting</h1>
</head>
<body>
    <h2>What is this repository for?</h2>
        <ul>
        <li>This repository is for plotting Mandelbrot fractal set &amp; Julia fractal set</li>
        <li>System requirements : Java 8</li>
        </ul>
	
    <h2>Program Description</h2>
	<p>Your program should accept arguments; at least one which would specify what set to plot. If
the set selected is Mandelbrot the user should give either 0, 4 or 5 arguments. If there are 0 arguments
then use the default values as specified in the table below. 4 arguments will be the region of interest in
the complex plane and the 5th one is the number of iterations to do for a point.</br>
For the Julia set the user should give 0 or 2 arguments. If there are no arguments one should use the
		default arguments and 2 arguments will be the real and complex part for C. </p>	
		
    <h2>How do I run this?</h2>
        <ul>
        <li>Clone or download this repository</li>
        <li>Go to the folder where java class files exsist</li>
        <li>Open terminal and compile the all files
             <ul>
             	<li>javac Fractal.java Panel.java Mandelbrot.java Julia.java Set.java ComplexNumber.java</li>
             </ul>	
        </li>
        <li>Run Fractal.java file with user input arguments in the terminal
            <ul>
            	<li>java Fractal.java Mandelbrot</li>
            	<li>java Fractal.java Julia</li>
            </ul>
        </li>
        </ul>
        <table>
            <tr>
                <th><img src="Screenshots/Screenshot from 2020-05-05 02-03-22.png" alt="loading screenshot" width= "700" > </th>   
                <th><img src="Screenshots/Screenshot from 2020-05-05 02-03-37.png" alt="loading screenshot" width= "700" > </th>  
            </tr>
        </table> 
	
	
</body>
</html>
