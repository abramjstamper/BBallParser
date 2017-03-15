grammar Basketball;

start       : (shot
            | foul
            | turnover
            | CLOCK
            | QUARTER)
            SEMI;

shot        : FGM player assist?
            | FGA player assistAtt? rebound
            | ;

rebound     : player;

assist      : player;

assistAtt   : player;

player      : TEAM NUMBER?;

turnover    : 't' player
            | 't' player player ;

foul        : 'f' player CLOCK { System.out.println("What time is it?"); } freethrow+;

freethrow   : 'm' player
            | 'a' player rebound ;

CLOCK       : [0-9]':'[0-5][0-9];

QUARTER     : 'q'[1-8];

SEMI        : ';';

NUMBER : [0-9][0-9];

FGM: [2|3]'fgm';

FGA: [2|3]'fga';

TEAM : [a-zA-Z];

WS : [ \r\t\n] -> skip ;
