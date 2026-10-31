package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pr4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new rq4(this, (byte) 14));

    public pr4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        pr4 pr4Var = (pr4) this.d.getValue();
        return pr4Var != null ? pr4Var.a() : this.a;
    }

    public final boolean b() {
        pr4 pr4Var = (pr4) this.d.getValue();
        return pr4Var != null ? pr4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_auth_for_mbs", "android-media-browser-service", a()), new fpb("ensure_connected_on_session_connect", "android-media-browser-service", b())});
    }
}
