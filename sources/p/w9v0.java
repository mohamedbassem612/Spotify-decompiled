package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w9v0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new z6v0(this, (byte) 4));

    public w9v0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        w9v0 w9v0Var = (w9v0) this.c.getValue();
        return w9v0Var != null ? w9v0Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("setting_visible", "podcastexperience-settings-trailingactions", a()));
    }
}
