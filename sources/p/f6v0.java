package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f6v0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new kks0(this, (byte) 29));

    public f6v0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        f6v0 f6v0Var = (f6v0) this.c.getValue();
        return f6v0Var != null ? f6v0Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("use_playback_settings_system", "podcast-playback-speed-domain", a()));
    }
}
