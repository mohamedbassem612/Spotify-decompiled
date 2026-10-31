package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iw70 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ jw70 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ short d;
    public final /* synthetic */ short e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iw70(jw70 jw70Var, String str, int i, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = jw70Var;
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new iw70(this.b, this.c, this.d, this.e, lnmVar);
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
        ixg ixgVarF = this.b.a.f(this.c);
        ixgVarF.p(this.d, this.e, 2);
        ixgVarF.d();
        ixgVarF.g = false;
        Single singleI = ixgVarF.i();
        this.a = true;
        Object objJ = fc11.j(singleI, this);
        d9n d9nVar = d9n.a;
        return objJ == d9nVar ? d9nVar : objJ;
    }
}
