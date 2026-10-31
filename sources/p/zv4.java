package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zv4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new fv4(this, (byte) 12));

    public zv4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        zv4 zv4Var = (zv4) this.e.getValue();
        return zv4Var != null ? zv4Var.a() : this.a;
    }

    public final boolean b() {
        zv4 zv4Var = (zv4) this.e.getValue();
        return zv4Var != null ? zv4Var.b() : this.b;
    }

    public final boolean c() {
        zv4 zv4Var = (zv4) this.e.getValue();
        return zv4Var != null ? zv4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("disable_samsung_now_brief", "android-oem-integrations-samsung", a()), new fpb("samsung_now_brief_use_ai_partner_api", "android-oem-integrations-samsung", b()), new fpb("samsung_s_finder_use_ai_partner_api", "android-oem-integrations-samsung", c())});
    }
}
