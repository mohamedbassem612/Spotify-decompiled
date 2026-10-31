package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p9w0 implements wat {
    public final /* synthetic */ wat a;
    public boolean b;
    public boolean c;
    public final xgn0 d = new xgn0(false);

    public p9w0(wat watVar) {
        this.a = watVar;
    }

    public final long I(int i) {
        return this.a.I(i);
    }

    public final long L(float f) {
        return this.a.L(f);
    }

    public final float M0(int i) {
        return this.a.M0(i);
    }

    public final float N0(float f) {
        return this.a.N0(f);
    }

    public final float U0() {
        return this.a.U0();
    }

    public final float X0(float f) {
        return this.a.X0(f);
    }

    public final void a() {
        this.c = true;
        xgn0 xgn0Var = this.d;
        if (xgn0Var.f()) {
            xgn0Var.c((Object) null);
        }
    }

    public final void b() {
        this.b = true;
        xgn0 xgn0Var = this.d;
        if (xgn0Var.f()) {
            xgn0Var.c((Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        n9w0 n9w0Var;
        if (onmVar instanceof n9w0) {
            n9w0Var = (n9w0) onmVar;
            int i = n9w0Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                n9w0Var.c = i - os00.INVALID_ID;
            } else {
                n9w0Var = new n9w0(this, onmVar);
            }
        } else {
            n9w0Var = new n9w0(this, onmVar);
        }
        Object obj = n9w0Var.a;
        int i2 = n9w0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            n9w0Var.c = 1;
            Object objA = this.d.a(n9w0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        this.b = false;
        this.c = false;
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        o9w0 o9w0Var;
        if (onmVar instanceof o9w0) {
            o9w0Var = (o9w0) onmVar;
            int i = o9w0Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                o9w0Var.c = i - os00.INVALID_ID;
            } else {
                o9w0Var = new o9w0(this, onmVar);
            }
        } else {
            o9w0Var = new o9w0(this, onmVar);
        }
        Object obj = o9w0Var.a;
        int i2 = o9w0Var.c;
        xgn0 xgn0Var = this.d;
        if (i2 == 0) {
            hm5.M(obj);
            if (!this.b && !this.c) {
                o9w0Var.c = 1;
                Object objA = xgn0Var.a(o9w0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            }
            return Boolean.valueOf(this.b);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        xgn0Var.c((Object) null);
        return Boolean.valueOf(this.b);
    }

    public final float h() {
        return this.a.h();
    }

    public final int i0(float f) {
        return this.a.i0(f);
    }

    public final long k1(long j) {
        return this.a.k1(j);
    }

    public final float q0(long j) {
        return this.a.q0(j);
    }

    public final long s(float f) {
        return this.a.s(f);
    }

    public final long t(long j) {
        return this.a.t(j);
    }

    public final float y(long j) {
        return this.a.y(j);
    }
}
