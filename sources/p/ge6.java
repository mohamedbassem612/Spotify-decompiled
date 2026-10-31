package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ge6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ g7m1 c;
    public final /* synthetic */ SceneTemplate.ArtistCardsContent.Card3 d;
    public final /* synthetic */ oe6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge6(SceneTemplate.ArtistCardsContent.Card3 card3, oe6 oe6Var, g7m1 g7m1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.d = card3;
        this.e = oe6Var;
        this.c = g7m1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        g7m1 g7m1Var = this.c;
        oe6 oe6Var = this.e;
        SceneTemplate.ArtistCardsContent.Card3 card3 = this.d;
        switch (b) {
            case 0:
                return new ge6(card3, g7m1Var, oe6Var, lnmVar);
            case 1:
                return new ge6(this.c, this.d, this.e, lnmVar, (byte) 1);
            case 2:
                return new ge6(this.c, this.d, this.e, lnmVar, (byte) 2);
            case 3:
                return new ge6(this.c, this.d, this.e, lnmVar, (byte) 3);
            default:
                return new ge6(card3, oe6Var, g7m1Var, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g7m1 g7m1Var = this.c;
        oe6 oe6Var = this.e;
        d9n d9nVar = d9n.a;
        SceneTemplate.ArtistCardsContent.Card3 card3 = this.d;
        byte b2 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bh bhVar = new bh(card3.n(), null, g7m1Var, oe6Var);
                this.b = true;
                Object objS = smo1.s(bhVar, this);
                return objS == d9nVar ? d9nVar : objS;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bju bjuVar = g7m1Var.b;
                he6 he6Var = new he6(card3, oe6Var, lnmVar, (byte) 0);
                this.b = true;
                Object objE = bjuVar.e("border", he6Var, this);
                return objE == d9nVar ? d9nVar : objE;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bju bjuVar2 = g7m1Var.b;
                he6 he6Var2 = new he6(card3, oe6Var, lnmVar, b2);
                this.b = true;
                Object objE2 = bjuVar2.e("wrapped_logo", he6Var2, this);
                return objE2 == d9nVar ? d9nVar : objE2;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bju bjuVar3 = g7m1Var.b;
                he6 he6Var3 = new he6(card3, oe6Var, lnmVar, (byte) 2);
                this.b = true;
                Object objE3 = bjuVar3.e("artist_cards_noise", he6Var3, this);
                return objE3 == d9nVar ? d9nVar : objE3;
            default:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return (yj41) obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                h290 h290VarN = card3.n();
                if (!h290VarN.isEmpty()) {
                    Iterator it = h290VarN.iterator();
                    while (it.hasNext()) {
                        if (((SceneTemplate.ArtistCardsContent.TradingCard) it.next()).C()) {
                            if (card3.B() && card3.w().getUrl().length() > 0) {
                                Image imageW = card3.w();
                                gw70 gw70Var = (gw70) oe6Var.g;
                                bju bjuVar4 = g7m1Var.b;
                                this.b = true;
                                obj = u3k.a.l(imageW, gw70Var, bjuVar4, "artist_cards_sparkle", this);
                                if (obj == d9nVar) {
                                    return d9nVar;
                                }
                                return (yj41) obj;
                            }
                        }
                    }
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge6(SceneTemplate.ArtistCardsContent.Card3 card3, g7m1 g7m1Var, oe6 oe6Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.d = card3;
        this.c = g7m1Var;
        this.e = oe6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge6(g7m1 g7m1Var, SceneTemplate.ArtistCardsContent.Card3 card3, oe6 oe6Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = g7m1Var;
        this.d = card3;
        this.e = oe6Var;
    }
}
