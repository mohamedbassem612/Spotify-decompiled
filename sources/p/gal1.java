package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gal1 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public gal1(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new bkk1(this, (byte) 12));
    }

    public final boolean a() {
        gal1 gal1Var = (gal1) this.f.getValue();
        return gal1Var != null ? gal1Var.a() : this.a;
    }

    public final boolean b() {
        gal1 gal1Var = (gal1) this.f.getValue();
        return gal1Var != null ? gal1Var.b() : this.b;
    }

    public final boolean c() {
        gal1 gal1Var = (gal1) this.f.getValue();
        return gal1Var != null ? gal1Var.c() : this.c;
    }

    public final boolean d() {
        gal1 gal1Var = (gal1) this.f.getValue();
        return gal1Var != null ? gal1Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("spotify_playlist_check_enabled", "watch-feed-playlist-section", a()), new fpb("watchfeed_entity_explorer_in_header_enabled", "watch-feed-playlist-section", b()), new fpb("watchfeed_inline_entity_explorer_row_enabled", "watch-feed-playlist-section", c()), new fpb("watchfeed_playlist_enabled", "watch-feed-playlist-section", d())});
    }

    public gal1(luk lukVar) {
        this(true, true, true, false, lukVar);
    }
}
