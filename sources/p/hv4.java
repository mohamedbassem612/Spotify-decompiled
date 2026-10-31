package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hv4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new fv4(this, (byte) 1));

    public hv4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        hv4 hv4Var = (hv4) this.e.getValue();
        return hv4Var != null ? hv4Var.a() : this.a;
    }

    public final boolean b() {
        hv4 hv4Var = (hv4) this.e.getValue();
        return hv4Var != null ? hv4Var.b() : this.b;
    }

    public final boolean c() {
        hv4 hv4Var = (hv4) this.e.getValue();
        return hv4Var != null ? hv4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("book_progress_in_npv_header_enabled", "android-nowplaying-navcontext", a()), new fpb("book_progress_in_playlist_context_header_enabled", "android-nowplaying-navcontext", b()), new fpb("show_artist_title_from_search_enabled", "android-nowplaying-navcontext", c()));
    }
}
