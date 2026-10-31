package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class me6 extends a8d1 implements vu30 {
    public final /* synthetic */ a3k X;
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ yj41 e;
    public final /* synthetic */ yj41 f;
    public final /* synthetic */ yj41 g;
    public final /* synthetic */ yj41 h;
    public final /* synthetic */ g7m1 i;
    public SceneTemplate.ArtistCardsContent.TradingCard t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me6(int i, Object obj, lnm lnmVar, yj41 yj41Var, yj41 yj41Var2, yj41 yj41Var3, yj41 yj41Var4, g7m1 g7m1Var, a3k a3kVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i;
        this.d = obj;
        this.e = yj41Var;
        this.f = yj41Var2;
        this.g = yj41Var3;
        this.h = yj41Var4;
        this.i = g7m1Var;
        this.X = a3kVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        a3k a3kVar = this.X;
        switch (b) {
            case 0:
                return new me6(this.c, this.d, lnmVar, this.e, this.f, this.g, this.h, this.i, (oe6) a3kVar, (byte) 0);
            default:
                return new me6(this.c, this.d, lnmVar, this.e, this.f, this.g, this.h, this.i, (vh6) a3kVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        SceneTemplate.ArtistCardsContent.TradingCard tradingCard;
        Object objS;
        SceneTemplate.ArtistCardsContent.TradingCard tradingCard2;
        Object objS2;
        byte b = this.a;
        a3k a3kVar = this.X;
        g7m1 g7m1Var = this.i;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        SceneTemplate.ArtistCardsContent.TradingCard tradingCard3 = this.t;
                        hm5.M(obj);
                        tradingCard = tradingCard3;
                        objS = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                tradingCard = (SceneTemplate.ArtistCardsContent.TradingCard) obj2;
                tradingCard.getClass();
                bju bjuVar = g7m1Var.b;
                oe6 oe6Var = (oe6) a3kVar;
                gw70 gw70Var = (gw70) oe6Var.g;
                ti31 ti31Var = oe6Var.e;
                kj31 kj31Var = oe6Var.f;
                cxc cxcVar = oe6Var.d;
                this.t = tradingCard;
                this.b = true;
                objS = smo1.s(new ek6(tradingCard, bjuVar, this.c, this.e, this.g, this.h, this.f, gw70Var, ti31Var, kj31Var, cxcVar, null), this);
                if (objS == d9nVar) {
                    return d9nVar;
                }
                gj6 gj6Var = (gj6) objS;
                if (gj6Var != null) {
                    return new re6(new le6(tradingCard, (byte) 0), gj6Var);
                }
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        SceneTemplate.ArtistCardsContent.TradingCard tradingCard4 = this.t;
                        hm5.M(obj);
                        tradingCard2 = tradingCard4;
                        objS2 = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                tradingCard2 = (SceneTemplate.ArtistCardsContent.TradingCard) obj2;
                tradingCard2.getClass();
                bju bjuVar2 = g7m1Var.b;
                vh6 vh6Var = (vh6) a3kVar;
                gw70 gw70Var2 = (gw70) vh6Var.d;
                ti31 ti31Var2 = vh6Var.f;
                kj31 kj31Var2 = vh6Var.g;
                cxc cxcVar2 = vh6Var.e;
                this.t = tradingCard2;
                this.b = true;
                objS2 = smo1.s(new ek6(tradingCard2, bjuVar2, this.c, this.e, this.g, this.h, this.f, gw70Var2, ti31Var2, kj31Var2, cxcVar2, null), this);
                if (objS2 == d9nVar) {
                    return d9nVar;
                }
                gj6 gj6Var2 = (gj6) objS2;
                if (gj6Var2 != null) {
                    return new yqz0(tradingCard2.H() ? new le6(tradingCard2, (byte) 1) : null, gj6Var2);
                }
                return null;
        }
    }
}
