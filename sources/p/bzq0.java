package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bzq0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ bju c;
    public final /* synthetic */ SceneTemplate.ArtistCardsContent.Wrapper d;
    public final /* synthetic */ gw70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bzq0(bju bjuVar, SceneTemplate.ArtistCardsContent.Wrapper wrapper, gw70 gw70Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = bjuVar;
        this.d = wrapper;
        this.e = gw70Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new bzq0(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new bzq0(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        byte b = this.a;
        gw70 gw70Var = this.e;
        SceneTemplate.ArtistCardsContent.Wrapper wrapper = this.d;
        bju bjuVar = this.c;
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
                azq0 azq0Var = new azq0(wrapper, gw70Var, null, (byte) 0);
                this.b = true;
                Object objE = bjuVar.e("pack_wrapper_background", azq0Var, this);
                return objE == d9nVar ? d9nVar : objE;
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
                azq0 azq0Var2 = new azq0(wrapper, gw70Var, null, (byte) 1);
                this.b = true;
                Object objE2 = bjuVar.e("pack_wrapper_title", azq0Var2, this);
                return objE2 == d9nVar ? d9nVar : objE2;
        }
    }
}
