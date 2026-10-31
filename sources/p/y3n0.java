package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y3n0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new zem0(this, (byte) 14));

    public y3n0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        y3n0 y3n0Var = (y3n0) this.c.getValue();
        return y3n0Var != null ? y3n0Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("live_video_internal_enabled", "music-libs-video", a()));
    }
}
