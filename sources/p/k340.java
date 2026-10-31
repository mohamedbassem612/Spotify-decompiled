package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k340 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wam b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k340(wam wamVar, byte b) {
        super(2);
        this.a = b;
        this.b = wamVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wam wamVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (wamVar instanceof vam) {
                    x340Var2.i0(-540649005);
                    vam vamVar = (vam) wamVar;
                    String str = vamVar.b;
                    uwr uwrVar = cbx.a;
                    gxo1.c(str, (qim0) null, cbx.d(x340Var2).a, vamVar.d, new a0e1(3), 2, false, new cjc0(2), new px8(cbx.d(x340Var2).e.a.b, cbx.d(x340Var2).a.a.b, 0L, (mx8) null, 12), 150.0f, (FontWeight) ((bjx) ajx.a.c).f, (iu30) null, x340Var2, 134217728, 0, 2114);
                    kk0.s(0.2f, true, x340Var2);
                    uwo1.e(vamVar.c, (qim0) null, lee1.a(cbx.d(x340Var2).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, yah.a, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), 0L, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, new px8(cbx.d(x340Var2).m.a.b, cbx.d(x340Var2).g.a.b, 0L, (mx8) null, 12), x340Var2, 0, 8, 682);
                    x340Var2.r(false);
                } else {
                    if (!(wamVar instanceof uam)) {
                        throw p3d1.k(x340Var2, 1645126577, false);
                    }
                    x340Var2.i0(-539430767);
                    uam uamVar = (uam) wamVar;
                    String strC = f4i1.c(uamVar.b, "+");
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var2).c;
                    long j = uamVar.d;
                    yfu yfuVar = ajx.a;
                    gxo1.c(strC, (qim0) null, lee1Var, j, (a0e1) null, 0, false, (djc0) null, (qx8) null, 150.0f, (FontWeight) ((bjx) yfuVar.c).f, (iu30) null, x340Var2, 0, 0, 2546);
                    String upperCase = uamVar.c.toUpperCase(uct0.a.i().b().a);
                    lee1 lee1Var2 = cbx.d(x340Var2).a;
                    FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).f;
                    gxo1.c(upperCase, (qim0) null, lee1Var2, uamVar.d, new a0e1(3), 2, false, new cjc0(2), new px8(cbx.d(x340Var2).e.a.b, cbx.d(x340Var2).a.a.b, 0L, (mx8) null, 12), 150.0f, fontWeight, (iu30) null, x340Var2, 134217728, 0, 2114);
                    x340Var2.r(false);
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    String strA = wamVar.a();
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(strA, (qim0) null, cbx.d(x340Var4).h, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, new px8(cbx.d(x340Var4).o.a.b, cbx.d(x340Var4).h.a.b, 0L, (mx8) null, 12), x340Var4, 0, 8, 762);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
