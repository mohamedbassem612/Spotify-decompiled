package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zy0 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ long b;
    public final /* synthetic */ dz0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(dz0 dz0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.c = dz0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj2).longValue();
        zy0 zy0Var = new zy0(this.c, (lnm) obj3);
        zy0Var.b = jLongValue;
        return zy0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j = this.b;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Single singleA = this.c.c.a(new i9u0(j));
            this.b = j;
            this.a = true;
            Object objJ = fc11.j(singleA, this);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
