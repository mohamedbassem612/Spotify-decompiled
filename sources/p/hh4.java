package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hh4 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new cg4(this, (byte) 20));

    public hh4(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        hh4 hh4Var = (hh4) this.c.getValue();
        return hh4Var != null ? hh4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("days_after_release_with_unrestricted_playback", "android-feature-on-demand-new-releases", a(), 0, 30));
    }
}
