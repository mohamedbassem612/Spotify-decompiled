package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wg4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new cg4(this, (byte) 13));

    public wg4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        wg4 wg4Var = (wg4) this.d.getValue();
        return wg4Var != null ? wg4Var.a() : this.a;
    }

    public final boolean b() {
        wg4 wg4Var = (wg4) this.d.getValue();
        return wg4Var != null ? wg4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_reinstall_notifications_prompt", "android-feature-notifications-permissions", a()), new fpb("navigate_to_os_settings_only", "android-feature-notifications-permissions", b()));
    }
}
