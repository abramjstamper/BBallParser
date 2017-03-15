grammar Basketball;

start   :  shot  ';';
shot: FGM player assist
    | FGM player
    | FGA player assist
    |



player: TEAM NUMBER;

assist: TEAM NUMBER;

turnover: 'T' player
         | 'T' player player;

freethrow;

NUMBER : '^'[1-9]{2}'$';

FGM: [2|3]'fgm';
FGMA: [2|3]'fga';

TEAM : [a-zA-Z];

WS : [ \r\t\n] -> skip ;
