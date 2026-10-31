package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f4f0 {
    public final t3f0 a;
    public final ca40 b;

    public f4f0(t3f0 t3f0Var, ca40 ca40Var) {
        this.a = t3f0Var;
        this.b = ca40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lik1 lik1Var, tv80 tv80Var, onm onmVar) {
        d4f0 d4f0Var;
        if (onmVar instanceof d4f0) {
            d4f0Var = (d4f0) onmVar;
            int i = d4f0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4f0Var.e = i - Integer.MIN_VALUE;
            } else {
                d4f0Var = new d4f0(this, onmVar);
            }
        } else {
            d4f0Var = new d4f0(this, onmVar);
        }
        Object objJ = d4f0Var.c;
        int i2 = d4f0Var.e;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = this.b.a();
            d4f0Var.a = lik1Var;
            d4f0Var.b = tv80Var;
            d4f0Var.e = 1;
            objJ = fc11.j(singleA, d4f0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80Var = d4f0Var.b;
            lik1Var = d4f0Var.a;
            hm5.M(objJ);
        }
        tv80 tv80Var2 = tv80Var;
        if (((Boolean) objJ).booleanValue()) {
            ca40.d(this.b, lik1Var.a, tv80Var2, (u0t0) null, new e4f0(this, (byte) 0), 8);
        } else {
            this.a.a(yg8.d);
        }
        return rih1.a;
    }
}
