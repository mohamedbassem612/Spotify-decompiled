package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gy0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy0(int i, qim0 qim0Var, String str) {
        super(2);
        this.a = (byte) 9;
        this.d = i;
        this.c = qim0Var;
        this.b = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        String str = this.b;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        qim0 qim0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                i3p1.c(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                v9p1.l(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                vbe.a(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                vbe.d(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                kyo1.i(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                d9p1.c(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                kqn1.a(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                dgo1.f(i, czo1.p(49), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 8:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = x340Var2.g((Object) null);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new qrk(1, (byte) 22);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarW = uyn1.w(dug.f(qim0VarB, ((yex) zex.a.d).g, er31.b(rjx.b(i, x340Var2))), rjx.h(i, x340Var2));
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarW);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2046);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lee1 lee1VarJ = rjx.j(i, x340Var4);
                    uwr uwrVar2 = cbx.a;
                    b3o1.j(lee1.a(lee1VarJ, cbx.a(x340Var4).b.a, fc11.G(9), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777212), 0L, apo.r(-1696402092, new gy0(qim0Var, i, str), x340Var4), x340Var4, 384, 2);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                rqt0.n(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                rjo1.j(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                zgo1.c(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                zgo1.c(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                h0p1.f(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ozn1.b(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                tho1.e(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                kln1.n(i, czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                grn1.a(i, czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ilo1.j(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                ilo1.l(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ilo1.m(czo1.p(i | 1), str, (b0k) obj, qim0Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy0(byte b, int i, int i2, String str, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = str;
        this.d = i;
        this.c = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy0(String str, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = qim0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy0(qim0 qim0Var, int i, String str) {
        super(2);
        this.a = (byte) 8;
        this.c = qim0Var;
        this.d = i;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy0(qim0 qim0Var, String str, int i, byte b) {
        super(2);
        this.a = b;
        this.c = qim0Var;
        this.b = str;
        this.d = i;
    }
}
