package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h3b implements hsw {
    public final bpb1 a;
    public final Set b;
    public final x010 c;
    public final ix7 d;
    public final f3b e;
    public final yd91 f;

    public h3b(lzn0 lzn0Var, String str, m911 m911Var, gdq gdqVar, koc0 koc0Var) {
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.a = bpb1VarB;
        this.b = f46.S0(new String[]{"blend.referrals_entrypoint.body", "blend.referrals_entrypoint.ctaTitle", "blend.referrals_entrypoint.redirectUri", "blend.referrals_entrypoint.closeButtonAccessibilityTitle"});
        this.c = new x010(bpb1VarB, rqt0.u(new c64(((roc0) koc0Var).d(), this, (byte) 29)), new ce2(3, (lnm) null, (byte) 6), (byte) 1);
        this.d = new ix7(this, m911Var, str, (byte) 27);
        this.e = new f3b(lzn0Var);
        this.f = new yd91(3, new vv8(gdqVar, this));
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.f;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.c;
    }
}
