package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ys41 implements d6o0 {
    public final du41 a;
    public boolean b;

    public ys41(du41 du41Var, boolean z) {
        this.a = du41Var;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.d6o0
    public final Object Q0(long j, long j2, lnm lnmVar) throws Throwable {
        xs41 xs41Var;
        long jF;
        if (lnmVar instanceof xs41) {
            xs41Var = (xs41) lnmVar;
            int i = xs41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xs41Var.d = i - Integer.MIN_VALUE;
            } else {
                xs41Var = new xs41(this, (onm) lnmVar);
            }
        } else {
            xs41Var = new xs41(this, (onm) lnmVar);
        }
        Object objA = xs41Var.b;
        int i2 = xs41Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            jF = 0;
            if (this.b) {
                du41 du41Var = this.a;
                if (!du41Var.i) {
                    xs41Var.a = j2;
                    xs41Var.d = 1;
                    objA = du41Var.a(j2, xs41Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                }
                jF = qui1.f(j2, jF);
            }
            return qui1.a(jF);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = xs41Var.a;
        hm5.M(objA);
        jF = ((qui1) objA).j();
        jF = qui1.f(j2, jF);
        return qui1.a(jF);
    }

    @Override // p.d6o0
    public final long h0(int i, long j, long j2) {
        if (!this.b) {
            return 0L;
        }
        du41 du41Var = this.a;
        if (du41Var.a.b()) {
            return 0L;
        }
        return du41Var.i(du41Var.e(du41Var.a.e(du41Var.e(du41Var.h(j2)))));
    }
}
