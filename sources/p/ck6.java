package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ck6 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ SceneTemplate.ArtistCardsContent.TradingCard c;
    public final /* synthetic */ gw70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck6(SceneTemplate.ArtistCardsContent.TradingCard tradingCard, gw70 gw70Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = tradingCard;
        this.d = gw70Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        gw70 gw70Var = this.d;
        SceneTemplate.ArtistCardsContent.TradingCard tradingCard = this.c;
        switch (b) {
            case 0:
                return new ck6(tradingCard, gw70Var, lnmVar, (byte) 0);
            default:
                return new ck6(tradingCard, gw70Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        gw70 gw70Var = this.d;
        SceneTemplate.ArtistCardsContent.TradingCard tradingCard = this.c;
        u3k u3kVar = u3k.a;
        d9n d9nVar = d9n.a;
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
                Image imageO = tradingCard.o();
                this.b = true;
                Object objK = u3kVar.k(imageO, gw70Var, this);
                return objK == d9nVar ? d9nVar : objK;
            default:
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
                Image imageE = tradingCard.E();
                this.b = true;
                Object objK2 = u3kVar.k(imageE, gw70Var, this);
                return objK2 == d9nVar ? d9nVar : objK2;
        }
    }
}
