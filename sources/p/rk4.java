package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rk4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public rk4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new gk4(this, (byte) 4));
    }

    public final boolean a() {
        rk4 rk4Var = (rk4) this.d.getValue();
        return rk4Var != null ? rk4Var.a() : this.a;
    }

    public final boolean b() {
        rk4 rk4Var = (rk4) this.d.getValue();
        return rk4Var != null ? rk4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("kids_family_exclude_visible", "android-homeia-settings", a()), new fpb("managed_account_prompt_enabled", "android-homeia-settings", b())});
    }

    public rk4(luk lukVar) {
        this(false, false, lukVar);
    }
}
