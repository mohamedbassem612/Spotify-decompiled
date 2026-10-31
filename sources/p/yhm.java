package p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yhm {
    public static final String e = nik1.U6.a;
    public final Activity a;
    public final lzn0 b;
    public final a1r0 c;
    public final bbr0 d;

    public yhm(Activity activity, lzn0 lzn0Var, a1r0 a1r0Var, bbr0 bbr0Var) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = a1r0Var;
        this.d = bbr0Var;
    }

    public final void a(oim oimVar, tv80 tv80Var) {
        ou80 ou80Var;
        mmr0 mmr0VarN = oqn1.n("context-menu-parameters", oimVar);
        bn70 bn70VarA = this.d.b0(bn70.class).a();
        String str = null;
        Bundle bundleH = mno1.h(mmr0VarN, oqn1.n("context-menu-source-view-uri", bn70VarA != null ? bn70VarA.b : null));
        lzn0 lzn0Var = this.b;
        Activity activity = this.a;
        boolean zJ = lzn0Var.j(activity);
        String str2 = e;
        if (zJ) {
            if (tv80Var != null) {
                lzn0Var.a(str2, tv80Var, bundleH);
                return;
            } else {
                lzn0Var.g(bundleH, str2);
                return;
            }
        }
        a1r0 a1r0Var = this.c;
        if (!a1r0Var.h(activity)) {
            a1r0.m(a1r0Var, str2, tv80Var, bundleH, 8);
            return;
        }
        if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
            str = ou80Var.a;
        }
        a1r0Var.a(str2, str, bundleH);
    }
}
