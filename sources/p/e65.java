package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e65 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new f55(this, (byte) 13));

    public e65(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        e65 e65Var = (e65) this.d.getValue();
        return e65Var != null ? e65Var.a() : this.a;
    }

    public final boolean b() {
        e65 e65Var = (e65) this.d.getValue();
        return e65Var != null ? e65Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("is_direct_to_checkout_enabled", "android-upsell-offer-flags", a()), new fpb("is_offer_cta_enabled", "android-upsell-offer-flags", b()));
    }
}
