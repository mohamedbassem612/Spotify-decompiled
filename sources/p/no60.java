package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class no60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ un60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no60(un60 un60Var, byte b) {
        super(2);
        this.a = b;
        this.b = un60Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        un60 un60Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    String str = un60Var.c;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    eqr0.b(0, 0, str, x340Var2, uyn1.z(4.0f, 0.0f, 2, nim0Var));
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.i0(-1639379374);
                    ye5 ye5Var = new ye5();
                    uwr uwrVar2 = cbx.a;
                    int iO = ye5Var.o(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, cbx.d(x340Var4).k.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65503));
                    try {
                        ye5Var.g(un60Var.c);
                        ye5Var.k(iO);
                        af5 af5VarP = ye5Var.p();
                        x340Var4.r(false);
                        cvx cvxVar2 = cbx.b(x340Var4).b;
                        eqr0.c(af5VarP, uyn1.z(4.0f, 0.0f, 2, nim0Var), x340Var4, 0, 0);
                    } catch (Throwable th) {
                        ye5Var.k(iO);
                        throw th;
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
