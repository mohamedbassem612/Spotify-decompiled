package p;

import com.spotify.concertcampaignview.v1.CtaType;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z180 implements qt1 {
    public final vwm1 a;
    public final ho1 b;
    public final av1 c;

    public z180(vwm1 vwm1Var, ho1 ho1Var, av1 av1Var) {
        this.a = vwm1Var;
        this.b = ho1Var;
        this.c = av1Var;
    }

    @Override // p.qt1
    public final mr20 a(hy1 hy1Var, x010 x010Var) {
        gy1 gy1Var = this.c.i;
        boolean z = gy1Var instanceof by1;
        vwm1 vwm1Var = this.a;
        if (!z && !(gy1Var instanceof fy1)) {
            return h5p1.s(x010Var, vwm1Var.d(hy1Var.c()), new evz(vwm1Var.d(hy1Var.a()), gy1Var, (byte) 29), new w63(this, (lnm) null, (byte) 10));
        }
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarB = hy1Var.b();
        hvm1VarB.q(true);
        gvm1VarO.n(hvm1VarB);
        gvm1VarO.t(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
        gvm1VarO.s(hy1Var.d(cho.b));
        return new x010(x010Var, vwm1Var.d(gvm1VarO.build()), new t83(gy1Var, this, (lnm) null, (byte) 4), (byte) 1);
    }
}
