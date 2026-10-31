package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yn4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new om4(this, (byte) 29));

    public yn4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        yn4 yn4Var = (yn4) this.d.getValue();
        return yn4Var != null ? yn4Var.a() : this.a;
    }

    public final boolean b() {
        yn4 yn4Var = (yn4) this.d.getValue();
        return yn4Var != null ? yn4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("always_show_windowed_tracks_in_playlists", "android-libs-playlist-endpoints", a()), new fpb("use_traits_mapping", "android-libs-playlist-endpoints", b()));
    }
}
