package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ot4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new rq4(this, (byte) 27));

    public ot4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        ot4 ot4Var = (ot4) this.d.getValue();
        return ot4Var != null ? ot4Var.a() : this.a;
    }

    public final boolean b() {
        ot4 ot4Var = (ot4) this.d.getValue();
        return ot4Var != null ? ot4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("mup_start_page_v2_enabled", "android-multi-user-plan-verification-verification-code-start", a()), new fpb("qr_capture_protection_enabled", "android-multi-user-plan-verification-verification-code-start", b())});
    }
}
