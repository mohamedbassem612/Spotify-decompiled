package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a24 extends m5v {
    public t24 j1;
    public iq20 k1;
    public iq20 l1;
    public wat m1;

    public final Object L1(swn swnVar, rzu rzuVar) {
        t24 t24Var = this.j1;
        Object objA = t24Var.f.a(hfn0.a, new i24(t24Var, new qt(swnVar, this, (lnm) null, (byte) 7), null, (byte) 1), rzuVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }

    public final boolean Z1() {
        return this.j1.l.getValue() != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c2(float f, onm onmVar) {
        x14 x14Var;
        m811 m811Var;
        if (onmVar instanceof x14) {
            x14Var = (x14) onmVar;
            int i = x14Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                x14Var.d = i - os00.INVALID_ID;
            } else {
                x14Var = new x14(this, onmVar);
            }
        } else {
            x14Var = new x14(this, onmVar);
        }
        Object obj = x14Var.b;
        int i2 = x14Var.d;
        lnm lnmVar = null;
        byte b = 1;
        if (i2 == 0) {
            hm5.M(obj);
            boolean zD = this.j1.d();
            d9n d9nVar = d9n.a;
            if (zD) {
                t24 t24Var = this.j1;
                x14Var.d = 1;
                Object objH = t24Var.h(f, x14Var);
                if (objH != d9nVar) {
                    return objH;
                }
            } else {
                m811 m811Var2 = new m811();
                m811Var2.a = f;
                t24 t24Var2 = this.j1;
                z14 z14Var = new z14(this, m811Var2, f, null);
                x14Var.a = m811Var2;
                x14Var.d = 2;
                Object objA = t24Var2.f.a(hfn0.a, new i24(t24Var2, z14Var, lnmVar, b), x14Var);
                if (objA != d9nVar) {
                    objA = rih1.a;
                }
                if (objA != d9nVar) {
                    m811Var = m811Var2;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(obj);
            return obj;
        }
        if (i2 != 2) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m811Var = x14Var.a;
        hm5.M(obj);
        return new Float(m811Var.a);
    }

    public final boolean d2() {
        return oap1.B(this).a1 == flb0.b && ((m5v) this).Q0 == qqq0.b;
    }

    public final void e2(iq20 iq20Var) {
        if (iq20Var == null) {
            pxg1 pxg1Var = d14.a;
            z9 z9Var = d14.b;
            wat watVar = oap1.B(this).Z0;
            this.m1 = watVar;
            iq20Var = new ru91(new h14(this.j1, z9Var, new g14(watVar, (byte) 0)), wm5.b, pxg1Var);
        }
        this.l1 = iq20Var;
    }

    public final void i() {
        K0();
        if (((pim0) this).N0) {
            wat watVar = oap1.B(this).Z0;
            wat watVar2 = this.m1;
            if (watVar2 == null || !watVar2.equals(watVar)) {
                this.m1 = watVar;
                e2(this.k1);
            }
        }
    }

    public final void z1() {
        e2(this.k1);
    }
}
