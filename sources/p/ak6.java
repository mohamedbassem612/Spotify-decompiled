package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ak6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ SceneTemplate.ArtistCardsContent.ArtistCard c;
    public final /* synthetic */ gw70 d;
    public final /* synthetic */ bju e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak6(SceneTemplate.ArtistCardsContent.ArtistCard artistCard, gw70 gw70Var, bju bjuVar, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = artistCard;
        this.d = gw70Var;
        this.e = bjuVar;
        this.f = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ak6(this.c, this.d, this.e, this.f, lnmVar, (byte) 0);
            case 1:
                return new ak6(this.c, this.d, this.e, this.f, lnmVar, (byte) 1);
            default:
                return new ak6(this.c, this.d, this.e, this.f, lnmVar, (byte) 2);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        SceneTemplate.ArtistCardsContent.ArtistCard artistCard = this.c;
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
                Image imageV = artistCard.v();
                this.b = true;
                Object objE = yj6.e(this.d, this.e, this.f, imageV, "bottom_end", this);
                return objE == d9nVar ? d9nVar : objE;
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
                Image imageW = artistCard.w();
                this.b = true;
                Object objE2 = yj6.e(this.d, this.e, this.f, imageW, "middle_start", this);
                return objE2 == d9nVar ? d9nVar : objE2;
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
                Image imageX = artistCard.x();
                this.b = true;
                Object objE3 = yj6.e(this.d, this.e, this.f, imageX, "top_end", this);
                return objE3 == d9nVar ? d9nVar : objE3;
        }
    }
}
