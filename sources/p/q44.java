package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q44 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 3));

    public q44(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        q44 q44Var = (q44) this.c.getValue();
        return q44Var != null ? q44Var.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("enable_video_blocker", "android-age-verification-age-assurance-video-blocker-impl", a()));
    }
}
