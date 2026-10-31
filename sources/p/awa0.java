package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class awa0 implements acr0 {
    public final swa0 a;
    public final Set b = f46.S0(new blc0[]{blc0.g9, blc0.t9});

    public awa0(swa0 swa0Var) {
        this.a = swa0Var;
    }

    public final Set a() {
        return this.b;
    }

    public final Class b() {
        return yva0.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        yxa0 yxa0Var;
        blc0 blc0Var;
        lik1 lik1Var;
        Bundle extras = intent.getExtras();
        yxa0 yxa0Var2 = txa0.a;
        if (extras == null || (yxa0Var = (yxa0) extras.getParcelable("key_flow_type")) == null) {
            yxa0Var = yxa0Var2;
        }
        if (yxa0Var.equals(yxa0Var2) || (yxa0Var instanceof vxa0)) {
            blc0Var = blc0.g9;
        } else {
            if (!(yxa0Var instanceof uxa0) && !(yxa0Var instanceof wxa0)) {
                eg.o();
                return null;
            }
            blc0Var = blc0.t9;
        }
        swa0 swa0Var = this.a;
        swa0Var.getClass();
        int iOrdinal = blc0Var.ordinal();
        if (iOrdinal == 446) {
            lik1Var = swa0.e(swa0Var.d) ? nik1.y3 : nik1.t3;
        } else {
            if (iOrdinal != 459) {
                eg.m("Current page is not COPPA.");
                return null;
            }
            lik1Var = swa0.e(swa0Var.d) ? nik1.J3 : nik1.K3;
        }
        return new e4n(yxa0Var, lik1Var);
    }

    public final e6w0 d() {
        return new c6w0(1, true, (hd5) null, 12);
    }

    public final String getDescription() {
        return "A page for the plan manager to consent to the COPPA agreement";
    }
}
