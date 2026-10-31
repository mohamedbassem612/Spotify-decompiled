package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class abp implements kj31 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ abp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final zj31 a(oi31 oi31Var) {
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                hbp hbpVar = (hbp) ((gbp) r7qVar).c;
                hbpVar.getClass();
                pe peVarA = hbpVar.a.a();
                c8o.l(peVarA);
                boolean zV = pwo1.v(peVarA, (tjs0) hbpVar.x1.get());
                hbpVar.getClass();
                tjs0 tjs0Var = (tjs0) hbpVar.x1.get();
                if (tjs0Var.equals(tjs0.a) || tjs0Var.equals(tjs0.c)) {
                    z = false;
                } else {
                    if (!tjs0Var.equals(tjs0.b) && !tjs0Var.equals(tjs0.d)) {
                        eg.o();
                        return null;
                    }
                    z = true;
                }
                return new zj31(zV, z, tq21.x((tjs0) hbpVar.x1.get()), new mm31(), (hj31) hbpVar.y1.get(), oi31Var);
            case 1:
                mxp mxpVar = (mxp) ((gbp) r7qVar).c;
                mxpVar.getClass();
                pe peVarA2 = mxpVar.a.a();
                c8o.l(peVarA2);
                boolean zV2 = pwo1.v(peVarA2, (tjs0) mxpVar.x1.get());
                mxpVar.getClass();
                tjs0 tjs0Var2 = (tjs0) mxpVar.x1.get();
                if (tjs0Var2.equals(tjs0.a) || tjs0Var2.equals(tjs0.c)) {
                    z2 = false;
                } else {
                    if (!tjs0Var2.equals(tjs0.b) && !tjs0Var2.equals(tjs0.d)) {
                        eg.o();
                        return null;
                    }
                    z2 = true;
                }
                return new zj31(zV2, z2, tq21.x((tjs0) mxpVar.x1.get()), new mm31(), (hj31) mxpVar.y1.get(), oi31Var);
            default:
                r7q r7qVar2 = r7qVar;
                s7q s7qVar = (s7q) r7qVar2.d;
                s7qVar.getClass();
                boolean zV3 = pwo1.v((pe) s7qVar.b.p9.get(), (tjs0) s7qVar.Mf.get());
                s7qVar.getClass();
                tjs0 tjs0Var3 = (tjs0) s7qVar.Mf.get();
                if (tjs0Var3.equals(tjs0.a) || tjs0Var3.equals(tjs0.c)) {
                    z3 = false;
                } else {
                    if (!tjs0Var3.equals(tjs0.b) && !tjs0Var3.equals(tjs0.d)) {
                        eg.o();
                        return null;
                    }
                    z3 = true;
                }
                return new zj31(zV3, z3, tq21.x((tjs0) s7qVar.Mf.get()), new mm31(), (hj31) r7qVar2.b.Gn.get(), oi31Var);
        }
    }
}
