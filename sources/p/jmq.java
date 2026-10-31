package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jmq {
    public final Object a;
    public final Object b;
    public Object c;

    public jmq(y281 y281Var, oud oudVar) {
        this.a = y281Var;
        byte b = 24;
        this.b = iy81.a(new jxp(this, 1, b));
        this.c = iy81.a(new jxp(this, 0, b));
    }

    public static final /* synthetic */ bpb1 a(jmq jmqVar) {
        return (bpb1) jmqVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object b(boolean z, onm onmVar) {
        w2r w2rVar;
        Boolean m231Var;
        bpb1 bpb1Var = (bpb1) this.b;
        if (onmVar instanceof w2r) {
            w2rVar = (w2r) onmVar;
            int i = w2rVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w2rVar.d = i - Integer.MIN_VALUE;
            } else {
                w2rVar = new w2r(this, onmVar);
            }
        } else {
            w2rVar = new w2r(this, onmVar);
        }
        Object objA = w2rVar.b;
        int i2 = w2rVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                x231 x231Var = new x231(z);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, x231Var);
                m2r m2rVar = (m2r) this.a;
                w2rVar.a = z;
                w2rVar.d = 1;
                objA = m2rVar.a(z, w2rVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = w2rVar.a;
                hm5.M(objA);
            }
            m231Var = (Boolean) objA;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        Object x231Var2 = m231Var != null ? new x231(z) : n231.a;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, x231Var2);
        return x231Var2;
    }

    public cn91 c() {
        koc0 koc0Var = ((lbt) this.a).b;
        teq teqVar = ((jbq) this.c).b;
        return new cn91(koc0Var, teqVar.g4(), new zq91((kt91) teqVar.d.f8.get()));
    }

    public jmq(m2r m2rVar) {
        this.a = m2rVar;
        this.b = gio1.b((Object) null);
        this.c = h4p1.g(new v2r(this, null, (byte) 1));
    }

    public jmq(bbt bbtVar, Scheduler scheduler, yqg yqgVar) {
        this.a = bbtVar;
        this.b = scheduler;
        this.c = yqgVar;
    }

    public jmq(t1r t1rVar, mr20 mr20Var) {
        this.a = t1rVar;
        this.b = mr20Var;
        this.c = new idd1(new z5o(this, (byte) 8));
    }

    public jmq(fyh1 fyh1Var) {
        this.a = fyh1Var;
        this.b = new ttq(this, 0, (byte) 12);
        this.c = new ttq(this, 1, (byte) 12);
    }

    public jmq(l1r l1rVar) {
        this.a = l1rVar;
        byte b = 16;
        this.b = new jxp(this, 0, b);
        this.c = new jxp(this, 1, b);
    }

    public jmq(ujq ujqVar, qop qopVar) {
        this.a = ujqVar;
        this.b = qopVar;
        this.c = new hsq(this, (byte) 28);
    }

    public jmq(l0q l0qVar, qop qopVar, jbt jbtVar) {
        this.a = qopVar;
        this.b = l0qVar;
        this.c = new bpq(this, (byte) 3);
    }

    public jmq(m0q m0qVar, qop qopVar, jbt jbtVar) {
        this.a = qopVar;
        this.b = m0qVar;
        this.c = new hsq(this, (byte) 10);
    }

    public jmq(m0q m0qVar, qop qopVar, lbt lbtVar) {
        this.a = qopVar;
        this.b = m0qVar;
        this.c = new bpq(this, (byte) 4);
    }

    public jmq(k3q k3qVar, qop qopVar, jbt jbtVar) {
        this.a = qopVar;
        this.b = k3qVar;
        this.c = new hsq(this, (byte) 27);
    }

    public jmq(jbq jbqVar, qop qopVar, jbt jbtVar) {
        this.a = qopVar;
        this.b = jbqVar;
        this.c = new uyp(this, (byte) 22);
    }

    public jmq(p0q p0qVar, qop qopVar, gl90 gl90Var) {
        this.a = gl90Var;
        this.c = p0qVar;
        this.b = iy81.a(new bpq(this, (byte) 24));
    }

    public jmq(ld00 ld00Var, cu71 cu71Var) {
        this.a = ld00Var;
        this.b = cu71Var;
    }

    public jmq(g4j1 g4j1Var) {
        this.a = g4j1Var;
        this.b = new ttq(this, 1, (byte) 2);
        this.c = new ttq(this, 0, (byte) 2);
    }

    public jmq(yzp yzpVar, qop qopVar, gl90 gl90Var) {
        this.a = yzpVar;
        byte b = 29;
        this.b = new jxp(this, 0, b);
        this.c = new jxp(this, 1, b);
    }

    public jmq(lzp lzpVar, qop qopVar, bct bctVar) {
        this.a = qopVar;
        this.c = lzpVar;
        this.b = iy81.a(new hsq(this, (byte) 7));
    }

    public jmq(jbq jbqVar, qop qopVar, lbt lbtVar) {
        this.a = lbtVar;
        this.c = jbqVar;
        this.b = xqu.b(new bpq(this, (byte) 10));
    }

    public jmq(pr21 pr21Var, rr21 rr21Var, q7r0 q7r0Var) {
        this.a = pr21Var;
        byte b = 13;
        this.b = new jxp(this, 0, b);
        this.c = new jxp(this, 1, b);
    }

    public jmq(uo51 uo51Var, vo51 vo51Var) {
        this.a = uo51Var;
        byte b = 15;
        this.b = xqu.b(new jxp(this, 1, b));
        this.c = new jxp(this, 0, b);
    }

    public jmq(e691 e691Var, f691 f691Var) {
        this.a = e691Var;
        byte b = 18;
        this.b = xqu.b(new jxp(this, 1, b));
        this.c = new jxp(this, 0, b);
    }

    public jmq(h4j1 h4j1Var, z4j1 z4j1Var) {
        this.a = h4j1Var;
        this.b = new ttq(this, 1, (byte) 3);
        this.c = new ttq(this, 0, (byte) 3);
    }

    public jmq(ibq ibqVar, qop qopVar, bct bctVar) {
        this.a = ibqVar;
        this.c = new ttq(this, 1, (byte) 7);
        this.b = iy81.a(new ttq(this, 0, (byte) 7));
    }

    public jmq(zib1 zib1Var, ajb1 ajb1Var) {
        this.a = zib1Var;
        byte b = 22;
        this.b = xqu.b(new jxp(this, 0, b));
        this.c = new jxp(this, 1, b);
    }

    public jmq(z8i1 z8i1Var, a9i1 a9i1Var) {
        this.a = z8i1Var;
        this.c = new ttq(this, 1, (byte) 0);
        this.b = iy81.a(new ttq(this, 0, (byte) 0));
    }

    public jmq(cdi1 cdi1Var, fdi1 fdi1Var, q7r0 q7r0Var) {
        this.a = q7r0Var;
        this.c = new ttq(this, 1, (byte) 1);
        this.b = xqu.b(new ttq(this, 0, (byte) 1));
    }

    public jmq(mwj1 mwj1Var, ryj ryjVar) {
        this.a = mwj1Var;
        this.b = xqu.b(new ttq(this, 0, (byte) 5));
        this.c = new ttq(this, 1, (byte) 5);
    }

    public jmq(xkz0 xkz0Var, ryj ryjVar, ykz0 ykz0Var) {
        this.a = xkz0Var;
        byte b = 9;
        this.b = xqu.b(new jxp(this, 1, b));
        this.c = iy81.a(new jxp(this, 0, b));
    }

    public jmq(rml1 rml1Var, sml1 sml1Var, q7r0 q7r0Var) {
        this.a = q7r0Var;
        this.c = new ttq(this, 1, (byte) 10);
        this.b = xqu.b(new ttq(this, 0, (byte) 10));
    }

    public jmq(ccc1 ccc1Var, pcc1 pcc1Var) {
        this.a = ccc1Var;
        byte b = 23;
        this.b = iy81.a(new jxp(this, 1, b));
        this.c = iy81.a(new jxp(this, 0, b));
    }
}
