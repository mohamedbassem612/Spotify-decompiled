package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class do4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public do4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new zn4(this, (byte) 3));
    }

    public final boolean a() {
        do4 do4Var = (do4) this.e.getValue();
        return do4Var != null ? do4Var.a() : this.a;
    }

    public final boolean b() {
        do4 do4Var = (do4) this.e.getValue();
        return do4Var != null ? do4Var.b() : this.b;
    }

    public final boolean c() {
        do4 do4Var = (do4) this.e.getValue();
        return do4Var != null ? do4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("hide_chapter_download_button", "android-libs-podcast-entity-adapter-delegate", a()), new fpb("is_audiobook_playback_enabled", "android-libs-podcast-entity-adapter-delegate", b()), new fpb("is_video_label_enabled", "android-libs-podcast-entity-adapter-delegate", c())});
    }

    public do4(luk lukVar) {
        this(true, true, false, lukVar);
    }
}
