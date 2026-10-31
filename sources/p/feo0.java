package p;

import com.spotify.agesignal.agesignalverifierimpl.proto.AppStoreAgeSignalGenericNonAuth;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class feo0 implements ohv0 {
    public final iu30 a;
    public final x2g1 b;

    public feo0(iu30 iu30Var, x2g1 x2g1Var) {
        this.a = iu30Var;
        this.b = x2g1Var;
    }

    public final void a(xap1 xap1Var) {
        if (xap1Var instanceof khv0) {
            zw5 zw5VarO = AppStoreAgeSignalGenericNonAuth.o();
            x2g1 x2g1Var = this.b;
            zw5VarO.s(x2g1Var.a.a());
            zw5VarO.r(x2g1Var.a.b());
            khv0 khv0Var = (khv0) xap1Var;
            zw5VarO.q(khv0Var.d);
            b7x b7xVar = khv0Var.e;
            if (b7xVar == null) {
                b7xVar = b7x.a;
            }
            zw5VarO.n(b7xVar);
            this.a.invoke(zw5VarO.build());
        }
    }
}
