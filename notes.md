# Notes

## Triangle

```
drawTriangle(4);

Output:
   *   
  * *  
 *   * 
*******
```
* Height input is also number of chars to the middle * (both the top and bottom row)

```
// Example variables
height = 4
width = height * 2 - 1
midpointIndex = height - 1
```

## Carpet

### Size
* Smallest Unit Size ^ Order = Carpet Size
* Size must be a square/cube etc number

| Smallest Unit Size | Order | Carpet Size     |
|--------------------|-------|-----------------| 
| 3                  | 2     | 9               |
| 3                  | 3     | 27              |
| 3                  | 4     | 108             |
| 3                  | 5     | 324             |

#### IDEA
Don't be strict about the size, but round down to nearest valid size for the order
* Less validation
* Can log eg "Input 40 was capable of generating a size 27 with 13 in excess"
* If using >3 smallest unit, same behaviour could be applied ie round down to nearest valid (more calculations required)
  * Ex. Input: Order 2, Size 40
  * Could create a size 9 (as in table above) or a size 36 with smallest unit being a 6x6
  * Latter would be more impressive to fill more of the desired size according to the input

### Smallest Unit
* Must be multiple of 3x3
``` 
3x3

███
█ █
███
```
```
6x6

██████
██████
██  ██
██  ██
██████
██████
```
```
9x9

█████████
█████████
█████████
███   ███
███   ███
███   ███
█████████
█████████
█████████
```
#### IDEA
Focus on ONLY the smallest unit of 3x3
* Less to think about
* Less to code
* Not specified directly in brief(?)


### Order

* Is effectively a power number to determine size
  * ie Order 2 on smallest unit of 6 will give a carpet of size 6 ^ 2 = 36

``` 
1

███
█ █
███
```
``` 
2

█████████
█ ██ ██ █
█████████
███   ███
█ █   █ █
███   ███
█████████
█ ██ ██ █
█████████
```
``` 
3

███████████████████████████
█ ██ ██ ██ ██ ██ ██ ██ ██ █
███████████████████████████
███   ██████   ██████   ███
█ █   █ ██ █   █ ██ █   █ █
███   ██████   ██████   ███
███████████████████████████
█ ██ ██ ██ ██ ██ ██ ██ ██ █
███████████████████████████
█████████         █████████
█ ██ ██ █         █ ██ ██ █
█████████         █████████
███   ███         ███   ███
█ █   █ █         █ █   █ █
███   ███         ███   ███
█████████         █████████
█ ██ ██ █         █ ██ ██ █
█████████         █████████
███████████████████████████
█ ██ ██ ██ ██ ██ ██ ██ ██ █
███████████████████████████
███   ██████   ██████   ███
█ █   █ ██ █   █ ██ █   █ █
███   ██████   ██████   ███
███████████████████████████
█ ██ ██ ██ ██ ██ ██ ██ ██ █
███████████████████████████
```
