package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rb4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public rb4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new u74(this, (byte) 25));
    }

    public final boolean a() {
        rb4 rb4Var = (rb4) this.e.getValue();
        return rb4Var != null ? rb4Var.a() : this.a;
    }

    public final boolean b() {
        rb4 rb4Var = (rb4) this.e.getValue();
        return rb4Var != null ? rb4Var.b() : this.b;
    }

    public final boolean c() {
        rb4 rb4Var = (rb4) this.e.getValue();
        return rb4Var != null ? rb4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_3_day_countdown_override", "android-content-windowing-flags", a()), new fpb("enable_content_windowing_experience", "android-content-windowing-flags", b()), new fpb("enable_track_preview_upsell", "android-content-windowing-flags", c())});
    }

    public rb4(luk lukVar) {
        this(false, false, false, lukVar);
    }
}
