package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o55 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f = new idd1(new f55(this, (byte) 8));

    public o55(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
    }

    public final boolean a() {
        o55 o55Var = (o55) this.f.getValue();
        return o55Var != null ? o55Var.a() : this.a;
    }

    public final boolean b() {
        o55 o55Var = (o55) this.f.getValue();
        return o55Var != null ? o55Var.b() : this.b;
    }

    public final boolean c() {
        o55 o55Var = (o55) this.f.getValue();
        return o55Var != null ? o55Var.c() : this.c;
    }

    public final boolean d() {
        o55 o55Var = (o55) this.f.getValue();
        return o55Var != null ? o55Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_logger_coroutine", "android-ubi-page-bound-ubi-logger", a()), new fpb("enable_page_impression_logger_ai_playlist", "android-ubi-page-bound-ubi-logger", b()), new fpb("enable_page_impression_logger_artist_page", "android-ubi-page-bound-ubi-logger", c()), new fpb("enable_page_impression_logger_artist_releases_page", "android-ubi-page-bound-ubi-logger", d()));
    }
}
