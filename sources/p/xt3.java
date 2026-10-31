package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xt3 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt3(String str, ven0 ven0Var, byte b) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var2.b0();
                } else {
                    if (((c8e1) ven0Var.getValue()).a.b.length() == 0) {
                        x340Var2.i0(1648700585);
                        uwr uwrVar = cbx.a;
                        uwo1.e(this.b, null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1648870682);
                        x340Var2.r(false);
                    }
                    vu30Var.invoke(x340Var2, Integer.valueOf(iIntValue & 14));
                }
                break;
            case 1:
                vu30 vu30Var2 = (vu30) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.i(vu30Var2) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var4.b0();
                } else {
                    if (((c8e1) ven0Var.getValue()).a.b.length() == 0) {
                        x340Var4.i0(-339433156);
                        uwr uwrVar2 = cbx.a;
                        uwo1.e(this.b, null, cbx.d(x340Var4).g, cbx.a(x340Var4).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2034);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-339251527);
                        x340Var4.r(false);
                    }
                    vu30Var2.invoke(x340Var4, Integer.valueOf(iIntValue2 & 14));
                }
                break;
            default:
                i2c i2cVar = (i2c) obj;
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                wr21 wr21Var = (wr21) ven0Var.getValue();
                if (wr21Var == null || (str = wr21Var.a) == null) {
                    str = this.b;
                }
                Uri uri = Uri.parse(str);
                h6m h6mVar = mif1.Q0;
                bnx bnxVar = bnx.c;
                eso1.e(uri, isl.a, anm1.N(((wr21) ven0Var.getValue()) != null ? "reserved_onboarding_share_preview" : "reserved_onboarding_share_fallback", d7e.r(((wr21) ven0Var.getValue()) != null ? 0.5657143f : 1.0f, u291.h(nim0.a, yoi1.m(new p3v(i2cVar.c()), new p3v(340.0f)).a), false)), (p3v) null, (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, new nux(bnxVar, bnxVar), false, false, b0kVar, 1073966128, 0, 3456);
                break;
        }
        return rih1Var;
    }
}
