package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w65 implements pdy0 {
    public final boolean a;
    public final idd1 b = new idd1(new wam1(this, (byte) 26));

    public w65(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        w65 w65Var = (w65) this.b.getValue();
        return w65Var != null ? w65Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("allow_showing_music_videos_setting", "android-video", a()));
    }
}
