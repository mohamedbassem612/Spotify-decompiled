package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l44 implements pdy0 {
    public final boolean a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new g82(this, (byte) 29));

    public l44(int i, luk lukVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = lukVar;
    }

    public final boolean a() {
        l44 l44Var = (l44) this.d.getValue();
        return l44Var != null ? l44Var.a() : this.a;
    }

    public final int b() {
        l44 l44Var = (l44) this.d.getValue();
        return l44Var != null ? l44Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_sponsored_playlist_horizontal_video", "android-adsdisplay-productssponsorship", a()), new fpb("sponsored_playlist_v2_artwork_collapse_delay_ms", "android-adsdisplay-productssponsorship", b(), 0, 2000)});
    }
}
