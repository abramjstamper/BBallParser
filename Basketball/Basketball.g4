grammar Basketball;

start       : action+;

action      : (shot
            | foul
            | turnover
            | CLOCK
            | quarter)
            SEMI;

shot        : FGM player assist?
            | FGA player assist? rebound
            | ;

rebound     : player;

assist      : player;

player      : TEAM NUMBER?;

turnover    : 't' player
            | 't' player player ;

foul        : 'f' player CLOCK freethrow? freethrow? freethrow?;

freethrow   : 'm' player
            | 'a' player rebound;

quarter     : 'q'QUARTERS CLOCK;

CLOCK       : [0-9]':'[0-5][0-9];

QUARTERS    : [1-8];

SEMI        : ';';

NUMBER : [0-9][0-9];

FGM: [2|3]'fgm';

FGA: [2|3]'fga';

TEAM : [h|g];

WS : [ \r\t\n] -> skip ;
