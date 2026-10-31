package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qn4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new om4(this, (byte) 22));

    public qn4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        qn4 qn4Var = (qn4) this.d.getValue();
        return qn4Var != null ? qn4Var.a() : this.a;
    }

    public final boolean b() {
        qn4 qn4Var = (qn4) this.d.getValue();
        return qn4Var != null ? qn4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_playback_control_switcher", "android-libs-nowplaying-reinvent-free-mode", a()), new fpb("skip_next_feedback_enabled", "android-libs-nowplaying-reinvent-free-mode", b())});
    }
}
