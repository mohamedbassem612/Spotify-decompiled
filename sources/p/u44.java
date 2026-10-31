package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u44 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new m44(this, (byte) 7));

    public u44(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        u44 u44Var = (u44) this.d.getValue();
        return u44Var != null ? u44Var.a() : this.a;
    }

    public final boolean b() {
        u44 u44Var = (u44) this.d.getValue();
        return u44Var != null ? u44Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("header_progress_bar_enabled", "android-album-albumpage", a()), new fpb("music_video_download_enabled", "android-album-albumpage", b())});
    }
}
