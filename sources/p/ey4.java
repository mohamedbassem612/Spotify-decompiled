package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ey4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new sx4(this, (byte) 9));

    public ey4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        ey4 ey4Var = (ey4) this.d.getValue();
        return ey4Var != null ? ey4Var.a() : this.a;
    }

    public final boolean b() {
        ey4 ey4Var = (ey4) this.d.getValue();
        return ey4Var != null ? ey4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("unified_leavebehind_see_all_music_enabled", "android-podcastads-podcastsponsors", a()), new fpb("unified_leavebehind_see_all_podcast_enabled", "android-podcastads-podcastsponsors", b())});
    }
}
