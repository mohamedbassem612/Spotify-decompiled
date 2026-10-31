package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class o8 {
    public static final long a = fc11.G(25);
    public static final long b = fc11.G(20);

    public static final n8 a(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        uyx uyxVarD = cbx.d(b0kVar);
        yfu yfuVar = ajx.a;
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(uyxVarD) | x340Var.g(yfuVar);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            Object obj = yfuVar.b;
            bjx bjxVar = (bjx) yfuVar.c;
            i930 i930VarA = u7n0.A((FontWeight) bjxVar.g);
            i930 i930VarA2 = u7n0.A((FontWeight) bjxVar.f);
            lee1 lee1VarZ = u7n0.z(i930VarA, uyxVarD.c, vz31.a);
            lee1 lee1VarE = u7n0.E(uyxVarD.p);
            lee1 lee1VarA = lee1.a(u7n0.z(i930VarA, uyxVarD.c, a), 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, b, (u8e1) null, (wdt0) null, (shc0) null, 0, 16646143);
            lee1 lee1Var = uyxVarD.n;
            objT = new n8(lee1VarZ, lee1VarE, lee1VarA, u7n0.z(i930VarA2, lee1Var, lee1Var.a.b));
            x340Var.s0(objT);
        }
        return (n8) objT;
    }
}
