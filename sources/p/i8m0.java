package p;

import com.spotify.mobius.MobiusLoop;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i8m0 implements o5s {
    public final /* synthetic */ j8m0 a;
    public final /* synthetic */ m9m0 b;
    public final /* synthetic */ swu0 c;

    public i8m0(j8m0 j8m0Var, m9m0 m9m0Var, iac0 iac0Var, swu0 swu0Var) {
        this.a = j8m0Var;
        this.b = m9m0Var;
        this.c = swu0Var;
    }

    public final void onStart(iac0 iac0Var) {
        j8m0 j8m0Var = this.a;
        ddd1 ddd1Var = j8m0Var.a;
        MobiusLoop.Builder builder = this.b.a;
        swu0 swu0Var = this.c;
        int i = swu0Var.a;
        vcd1 vcd1Var = new vcd1(swu0Var.b);
        j8m0Var.b = builder.g(new d5d0(ddd1Var, false, false, w7x.a, new LinkedHashSet(), i, vcd1Var));
    }

    public final void onStop(iac0 iac0Var) {
        j8m0 j8m0Var = this.a;
        MobiusLoop mobiusLoop = j8m0Var.b;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        j8m0Var.b = null;
    }
}
