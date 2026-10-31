package p;

import com.spotify.agesignal.agesignalverifierimpl.proto.AppStoreAgeSignalGeneric;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class si8 implements ohv0 {
    public final ohv0 a;
    public final t2j0 b;
    public final jqt c;

    public si8(ohv0 ohv0Var, t2j0 t2j0Var, jqt jqtVar) {
        this.a = ohv0Var;
        this.b = t2j0Var;
        this.c = jqtVar;
    }

    public final void a(xap1 xap1Var) {
        if (!(xap1Var instanceof khv0)) {
            this.a.a(xap1Var);
            return;
        }
        xw5 xw5VarN = AppStoreAgeSignalGeneric.n();
        xw5VarN.r(this.c.a());
        khv0 khv0Var = (khv0) xap1Var;
        xw5VarN.q(khv0Var.d);
        b7x b7xVar = khv0Var.e;
        if (b7xVar == null) {
            b7xVar = b7x.a;
        }
        xw5VarN.n(b7xVar);
        this.b.a(xw5VarN.build());
    }
}
