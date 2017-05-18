# Mini_dungeon
Basically, this project is to build a turn-based rogue-like game. The idea of this game is from Desktop Dungeon and only those simple rules have been kept.

Each game starts with a random constructed dungeon with monsters, traps, divines and treasures in a 2D tile-based map.

  * Monsters: monsters can attack hero and can be destroyed by hero. They have HP, skills and some other attributes. After   killed by hero, hero gains exp.

  * Traps: an item that only attacks hero once then destroy itself.

  * Divines: can buff/debuff hero infinitely based on some choices hero made.

  * Treasures: a skill rune or an equipment.

There is an exit on the map showing the entrance of next level. The goal of player is trying to collect treasures as much as possible, gain exp as much as possible and then reaching the exit.

## TODO List
| Task          | Status     |
| ------------- |:----------:|
| Map:          |            |
| 2D Matrix     | Done       |
| Map Item      | Processing | 
| Map GUI       | Not Yet    | 
| Dungeon Item: |            | 
| Hero          | Processing | 
| Monster       | Processing | 
| Trap          | Not Yet    | 
| Divines       | Not Yet    | 
| Treasure      | Processing | 
| Game State:   |            |
| Save/Load     | Not Yet    |

## Change Log
  * 2017/05/13 - Complete 2D Matrix and unit test.
  * 2017/5/17 - Update UML, create several Classed for the Map and Dungeon.


