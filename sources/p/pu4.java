package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pu4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new st4(this, (byte) 17));

    public pu4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        pu4 pu4Var = (pu4) this.c.getValue();
        return pu4Var != null ? pu4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_new_episodes_page", "android-newepisodes-newepisodes", a()));
    }
}
