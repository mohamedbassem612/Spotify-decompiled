package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uyv0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ syv0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uyv0(float f, float f2, syv0 syv0Var, byte b) {
        super(3);
        this.a = b;
        this.b = f;
        this.c = f2;
        this.d = syv0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        syv0 syv0Var = this.d;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarB = uyn1.B(anm1.N("release-year-view", nim0Var), this.b, 0.0f, 0.0f, this.c, 6);
                String strN0 = cwl1.n0(2131963504, new Object[]{Integer.valueOf(syv0Var.e.getYear())}, b0kVar);
                uwr uwrVar = cbx.a;
                uwo1.e(strN0, qim0VarB, lee1.a(cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2040);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarB2 = uyn1.B(anm1.N("prerelease-title-view", nim0Var), this.b, this.c, 0.0f, 0.0f, 12);
                String str = syv0Var.b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str, qim0VarB2, lee1.a(cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1720);
                break;
        }
        return rih1Var;
    }
}
