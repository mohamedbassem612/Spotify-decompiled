package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sp4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new lp4(this, (byte) 6));

    public sp4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        sp4 sp4Var = (sp4) this.d.getValue();
        return sp4Var != null ? sp4Var.a() : this.a;
    }

    public final boolean b() {
        sp4 sp4Var = (sp4) this.d.getValue();
        return sp4Var != null ? sp4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("magpie_enabled", "android-list-ux-platform-consumers-magpie", a()), new fpb("reasoning_enabled", "android-list-ux-platform-consumers-magpie", b()));
    }
}
