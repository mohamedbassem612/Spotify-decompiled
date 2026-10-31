package p;

import com.spotify.browse.clientnative.mobius.BrowseEffect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z0e0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ b1e0 b;
    public final /* synthetic */ BrowseEffect.Load c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0e0(b1e0 b1e0Var, BrowseEffect.Load load, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.b = b1e0Var;
        this.c = load;
        this.d = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new z0e0(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        y8c y8cVar = this.b.b;
        jce0 loadingStrategy = this.c.getLoadingStrategy();
        this.a = true;
        Object objB = y8cVar.b(loadingStrategy, this.d, this);
        d9n d9nVar = d9n.a;
        return objB == d9nVar ? d9nVar : objB;
    }
}
