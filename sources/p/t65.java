package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t65 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public t65(int i, luk lukVar, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = lukVar;
        this.e = new idd1(new f55(this, (byte) 16));
    }

    public final int a() {
        t65 t65Var = (t65) this.e.getValue();
        return t65Var != null ? t65Var.a() : this.a;
    }

    public final boolean b() {
        t65 t65Var = (t65) this.e.getValue();
        return t65Var != null ? t65Var.b() : this.c;
    }

    public final boolean c() {
        t65 t65Var = (t65) this.e.getValue();
        return t65Var != null ? t65Var.c() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("check_in_sheet_presentation_timeout_ms", "android-usersnearby-settings-impl", a(), 5000, 30000), new fpb("is_enabled", "android-usersnearby-settings-impl", c()), new fpb("users_nearby_qr_code", "android-usersnearby-settings-impl", b())});
    }

    public t65(luk lukVar) {
        this(5000, lukVar, true, true);
    }
}
