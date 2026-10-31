package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ue4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new pe4(this, (byte) 2));

    public ue4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        ue4 ue4Var = (ue4) this.e.getValue();
        return ue4Var != null ? ue4Var.a() : this.a;
    }

    public final boolean b() {
        ue4 ue4Var = (ue4) this.e.getValue();
        return ue4Var != null ? ue4Var.b() : this.b;
    }

    public final boolean c() {
        ue4 ue4Var = (ue4) this.e.getValue();
        return ue4Var != null ? ue4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("show_locked_audiobook_strings_enabled", "android-external-integration-loaders", a()), new fpb("use_episode_access_for_paywall_filtering", "android-external-integration-loaders", b()), new fpb("use_kotlin_list_loader", "android-external-integration-loaders", c()));
    }
}
