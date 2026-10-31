package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f54 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public f54(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new m44(this, (byte) 14));
    }

    public final boolean a() {
        f54 f54Var = (f54) this.f.getValue();
        return f54Var != null ? f54Var.a() : this.a;
    }

    public final boolean b() {
        f54 f54Var = (f54) this.f.getValue();
        return f54Var != null ? f54Var.b() : this.b;
    }

    public final boolean c() {
        f54 f54Var = (f54) this.f.getValue();
        return f54Var != null ? f54Var.c() : this.c;
    }

    public final boolean d() {
        f54 f54Var = (f54) this.f.getValue();
        return f54Var != null ? f54Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_artist_catalog_videos_for_mft_plus", "android-artist-releases", a()), new fpb("show_locked_album_ui", "android-artist-releases", b()), new fpb("use_new_releases_page", "android-artist-releases", c()), new fpb("use_platform_release_row", "android-artist-releases", d())});
    }

    public f54(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}
