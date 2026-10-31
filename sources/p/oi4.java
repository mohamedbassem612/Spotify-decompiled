package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oi4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sh4(this, (byte) 13));

    public oi4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        oi4 oi4Var = (oi4) this.c.getValue();
        return oi4Var != null ? oi4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("track_video_indicator_enabled", "android-feature-track-row-configuration-builder", a()));
    }
}
