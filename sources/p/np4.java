package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class np4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public np4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new lp4(this, (byte) 1));
    }

    public final boolean a() {
        np4 np4Var = (np4) this.e.getValue();
        return np4Var != null ? np4Var.a() : this.a;
    }

    public final boolean b() {
        np4 np4Var = (np4) this.e.getValue();
        return np4Var != null ? np4Var.b() : this.b;
    }

    public final boolean c() {
        np4 np4Var = (np4) this.e.getValue();
        return np4Var != null ? np4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_playlist_episode_swipe_actions", "android-list-ux-platform-consumers-episode-shared", a()), new fpb("show_show_image_next_to_subtitle", "android-list-ux-platform-consumers-episode-shared", b()), new fpb("use_standard_title_and_subtitle_for_music_episodes", "android-list-ux-platform-consumers-episode-shared", c())});
    }

    public np4(luk lukVar) {
        this(false, false, false, lukVar);
    }
}
