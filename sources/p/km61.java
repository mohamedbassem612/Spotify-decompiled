package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class km61 {
    public final gu61 a;
    public final jgb1 b;
    public final y441 c;

    public km61(jp61 jp61Var) {
        gu61 gu61Var = jp61Var.a;
        jgb1 jgb1Var = jp61Var.b;
        y441 y441Var = jp61Var.e;
        this.a = gu61Var;
        this.b = jgb1Var;
        this.c = y441Var;
    }

    public static boolean a(km61 km61Var, String str, Bundle bundle, boolean z, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        y441 y441Var = km61Var.c;
        gu61 gu61Var = km61Var.a;
        String str2 = km61Var.b.a;
        kn61 kn61Var = new kn61(str2, str, bundle, z);
        if (z) {
            if (((nu71) ((ogr) y441Var.b).b).a(gu61Var.a).h(bma1.b.n(gvg.h("settings_dialog_do_not_show_again_", str2, "_", str)), false)) {
                return false;
            }
        }
        ((hrr0) y441Var.d).setValue(kn61Var);
        return true;
    }
}
