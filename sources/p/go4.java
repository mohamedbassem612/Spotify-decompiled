package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class go4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new zn4(this, (byte) 6));

    public go4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        go4 go4Var = (go4) this.e.getValue();
        return go4Var != null ? go4Var.a() : this.a;
    }

    public final boolean b() {
        go4 go4Var = (go4) this.e.getValue();
        return go4Var != null ? go4Var.b() : this.b;
    }

    public final boolean c() {
        go4 go4Var = (go4) this.e.getValue();
        return go4Var != null ? go4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_podcast_poll_reporting", "android-libs-podcast-interactivity-polls", a()), new fpb("enable_report_flow", "android-libs-podcast-interactivity-polls", b()), new fpb("should_show_polls_feature_in_episode_page", "android-libs-podcast-interactivity-polls", c())});
    }
}
