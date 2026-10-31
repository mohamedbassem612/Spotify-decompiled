package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i35 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f = new idd1(new k25(this, (byte) 13));

    public i35(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
    }

    public final boolean a() {
        i35 i35Var = (i35) this.f.getValue();
        return i35Var != null ? i35Var.a() : this.a;
    }

    public final boolean b() {
        i35 i35Var = (i35) this.f.getValue();
        return i35Var != null ? i35Var.b() : this.b;
    }

    public final boolean c() {
        i35 i35Var = (i35) this.f.getValue();
        return i35Var != null ? i35Var.c() : this.c;
    }

    public final boolean d() {
        i35 i35Var = (i35) this.f.getValue();
        return i35Var != null ? i35Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("cache_stable_intents", "android-system-playback-notifications", a()), new fpb("media_action_api_enabled", "android-system-playback-notifications", b()), new fpb("notification_dsl_enabled", "android-system-playback-notifications", c()), new fpb("should_use_vit", "android-system-playback-notifications", d()));
    }
}
