package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ig4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new cg4(this, (byte) 2));

    public ig4(int i, luk lukVar, boolean z) {
        this.a = i;
        this.b = z;
        this.c = lukVar;
    }

    public final int a() {
        ig4 ig4Var = (ig4) this.d.getValue();
        return ig4Var != null ? ig4Var.a() : this.a;
    }

    public final boolean b() {
        ig4 ig4Var = (ig4) this.d.getValue();
        return ig4Var != null ? ig4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("announcement_cooldown_minutes", "android-feature-limited-experience-indicator", a(), 0, Integer.MAX_VALUE), new fpb("exit_announcements_enabled", "android-feature-limited-experience-indicator", b()));
    }
}
