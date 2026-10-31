package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zs61 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final tgp0 d;
    public final luk e;
    public final idd1 f;
    public final idd1 g;

    public zs61(boolean z, boolean z2, boolean z3, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = tgp0Var;
        this.e = lukVar;
        this.f = new idd1(new ys61(this, (byte) 1));
        this.g = new idd1(new ys61(this, (byte) 0));
    }

    public final boolean a() {
        zs61 zs61Var = (zs61) this.g.getValue();
        return zs61Var != null ? zs61Var.a() : this.a;
    }

    public final boolean b() {
        zs61 zs61Var = (zs61) this.g.getValue();
        return zs61Var != null ? zs61Var.b() : this.b;
    }

    public final boolean c() {
        zs61 zs61Var = (zs61) this.g.getValue();
        return zs61Var != null ? zs61Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_quick_access_settings_customization", "settings-quickaccess", a()), new fpb("show_quick_access_settings_in_settings", "settings-quickaccess", b()), new fpb("use_quick_settings_grid", "settings-quickaccess", c())});
    }

    public zs61(tgp0 tgp0Var, luk lukVar) {
        this(false, false, false, tgp0Var, lukVar);
    }
}
