package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qh6 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ SceneTemplate.ArtistCardsContent.Card2 c;
    public final /* synthetic */ vh6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh6(SceneTemplate.ArtistCardsContent.Card2 card2, vh6 vh6Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = card2;
        this.d = vh6Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        vh6 vh6Var = this.d;
        SceneTemplate.ArtistCardsContent.Card2 card2 = this.c;
        switch (b) {
            case 0:
                return new qh6(card2, vh6Var, lnmVar, (byte) 0);
            case 1:
                return new qh6(card2, vh6Var, lnmVar, (byte) 1);
            default:
                return new qh6(card2, vh6Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        vh6 vh6Var = this.d;
        SceneTemplate.ArtistCardsContent.Card2 card2 = this.c;
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
                Image imageO = card2.o();
                gw70 gw70Var = (gw70) vh6Var.d;
                this.b = true;
                Object objK = u3kVar.k(imageO, gw70Var, this);
                return objK == d9nVar ? d9nVar : objK;
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
                Image imageH = card2.H();
                gw70 gw70Var2 = (gw70) vh6Var.d;
                this.b = true;
                Object objK2 = u3kVar.k(imageH, gw70Var2, this);
                return objK2 == d9nVar ? d9nVar : objK2;
            default:
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
                Image imageW = card2.w();
                gw70 gw70Var3 = (gw70) vh6Var.d;
                this.b = true;
                Object objK3 = u3kVar.k(imageW, gw70Var3, this);
                return objK3 == d9nVar ? d9nVar : objK3;
        }
    }
}
