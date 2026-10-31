package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.concertcampaignview.v1.CtaType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nhw0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ phw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhw0(phw0 phw0Var, byte b) {
        super(3);
        this.a = b;
        this.b = phw0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Uri uri;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        phw0 phw0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                w0h1.a(spx.c, isl.a, u291.m(nim0Var, 20.0f), 0L, 0L, false, x340Var, spx.d | 432, 56);
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).c.a;
                qim0 qim0VarX = uyn1.x(nim0Var, 8.0f);
                x340 x340Var2 = x340Var;
                boolean zF = x340Var2.f(j) | x340Var2.g(phw0Var);
                Object objT = x340Var2.T();
                if (zF || objT == fkj0.X) {
                    objT = new n82(j, phw0Var, (byte) 12);
                    x340Var2.s0(objT);
                }
                j0o1.b(6, x340Var2, (iu30) objT, qim0VarX);
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                w0h1.a(xpx.c, isl.a, d9y0.k(anm1.N("preview_element_play_overlay_test_tag", u291.m(nim0Var, 20.0f)), phw0Var.h ? 1.0f : 0.3f), 0L, 0L, false, b0kVar, xpx.d | 48, 56);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                boolean z = phw0Var.f;
                byte b2 = 1;
                byte b3 = 0;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                tob1 tob1VarB = z95.b(z ? 0.0f : 1.0f, irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, null, 6), "alpha", (iu30) null, x340Var4, 3120, 20);
                int iC = l1d.C(phw0Var.d);
                if (iC == 0) {
                    i = 2131231471;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2131232444;
                }
                fwx fwxVarE = hso1.E(i, 0L, false, 0L, x340Var4, 0, 14);
                String str = phw0Var.b;
                if (str == null || (uri = Uri.parse(str)) == null) {
                    uri = Uri.EMPTY;
                }
                Uri uri2 = uri;
                uri2.getClass();
                cso1.f(oi7.a(uri2, (gw70) null, (xb10) null, (yqi1) null, fwxVarE, fwxVarE, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var4, 2359296, 0, 130974), isl.a, anm1.N("preview_element_image_test_tag", d9y0.k(xcg1.k(cbx.a, u291.m(i1p1.q(nim0Var, er31.b(4.0f)), 64.0f)), ((Number) tob1VarB.getValue()).floatValue())), mif1.P0, null, x340Var4, 3120, 48);
                fq7.g(phw0Var.f, d9y0.k(anm1.N("preview_element_pause_overlay_test_tag", nim0Var), phw0Var.h ? 1.0f : 0.3f), (bby) null, (ln00) null, (String) null, apo.r(-1215189614, new nhw0(phw0Var, b3), x340Var4), x340Var4, 196608, 28);
                fq7.g(!z, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(1534041531, new nhw0(phw0Var, b2), x340Var4), x340Var4, 196608, 30);
                return rih1Var;
        }
    }
}
