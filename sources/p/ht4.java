package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ht4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new rq4(this, (byte) 21));

    public ht4(int i, luk lukVar, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = lukVar;
    }

    public final int a() {
        ht4 ht4Var = (ht4) this.e.getValue();
        return ht4Var != null ? ht4Var.a() : this.a;
    }

    public final boolean b() {
        ht4 ht4Var = (ht4) this.e.getValue();
        return ht4Var != null ? ht4Var.b() : this.b;
    }

    public final boolean c() {
        ht4 ht4Var = (ht4) this.e.getValue();
        return ht4Var != null ? ht4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("cache_refresh_interval", "android-messaging-clientmessagingplatform-clientmessagingplatformproperties", a(), 0, 86400), new fpb("is_back_online_trigger_enabled", "android-messaging-clientmessagingplatform-clientmessagingplatformproperties", b()), new fpb("is_click_action_enum_enabled", "android-messaging-clientmessagingplatform-clientmessagingplatformproperties", c()));
    }
}
