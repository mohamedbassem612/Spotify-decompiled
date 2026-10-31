package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ur6 implements oi51 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ur6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(ji50 ji50Var, tcr0 tcr0Var) {
        byte b = this.a;
        Object obj = this.b;
        w7x w7xVar = w7x.a;
        switch (b) {
            case 0:
                xb2 xb2Var = new xb2(this, (byte) 29);
                Set set = sr6.h;
                ji50Var.b.put(zer0.class, r4o1.Q(gn6.a1, set, xb2Var, ad5.S0));
                break;
            case 1:
                mu6 mu6Var = new mu6(this, (byte) 14);
                ji50Var.b.put(ier0.class, r4o1.Q(db8.O0, w7xVar, mu6Var, c37.Y0));
                break;
            case 2:
                ji50Var.b.put(ler0.class, new r3r(new xzq(((meq) obj).a(ji50Var.a), oc8.c), c37.d1, 4));
                break;
            case 3:
                ji50Var.b.put(ser0.class, new r3r(new xzq(new sb00(((bnr) obj).a(ji50Var.a)), fa00.c), yty.R0, 4));
                break;
            case 4:
                hzw hzwVar = new hzw(this, (byte) 26);
                Set set2 = xk10.g;
                ji50Var.b.put(ter0.class, r4o1.Q(xc10.Z, set2, hzwVar, yty.c1));
                break;
            case 5:
                s2c0 s2c0Var = new s2c0(this, (byte) 9);
                ji50Var.b.put(yer0.class, r4o1.Q(l1d0.h, w7xVar, s2c0Var, f7c0.e1));
                break;
            case 6:
                yih0 yih0Var = new yih0(this, (byte) 17);
                Set set3 = rui0.g;
                ji50Var.b.put(bfr0.class, r4o1.Q(fii0.d1, set3, yih0Var, ish0.d1));
                break;
            case 7:
                t1t0 t1t0Var = new t1t0(this, (byte) 19);
                ji50Var.b.put(dfr0.class, r4o1.Q(o5v0.V0, w7xVar, t1t0Var, vbv0.d));
                break;
            case 8:
                u841 u841Var = new u841(this, (byte) 8);
                ji50Var.b.put(ffr0.class, r4o1.Q(th51.b, w7xVar, u841Var, jh31.V0));
                break;
            default:
                wcf1 wcf1Var = new wcf1(this, (byte) 6);
                Set set4 = glf1.f;
                ji50Var.b.put(lfr0.class, r4o1.Q(udf1.S0, set4, wcf1Var, ggf1.d));
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return zer0.class;
            case 1:
                return ier0.class;
            case 2:
                return ler0.class;
            case 3:
                return ser0.class;
            case 4:
                return ter0.class;
            case 5:
                return yer0.class;
            case 6:
                return bfr0.class;
            case 7:
                return dfr0.class;
            case 8:
                return ffr0.class;
            default:
                return lfr0.class;
        }
    }

    public final Set c() {
        byte b = this.a;
        return w7x.a;
    }
}
