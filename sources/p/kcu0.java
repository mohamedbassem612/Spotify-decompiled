package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kcu0 extends hab0 implements xu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcu0(int i, long j, long j2, String str, boolean z) {
        super(3);
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        nim0 nim0Var = nim0.a;
        String str = this.a;
        if (str == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1164076830);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1164076831);
            Uri uri = Uri.parse(str);
            h6m h6mVar = mif1.Q0;
            qim0 qim0VarA = i2cVar.a(u291.r(u291.B(nim0Var, (gra) null, 1), 56.0f), een.f);
            boolean zD = x340Var3.d(56.0f);
            Object objT = x340Var3.T();
            if (zD || objT == fkj0.X) {
                objT = new ewq0(1, (byte) 7);
                x340Var3.s0(objT);
            }
            eso1.e(uri, isl.a, i541.C(qim0VarA, (iu30) objT), (p3v) null, (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var3, 48, 0, 3512);
            x340Var3.r(false);
        }
        qim0 qim0VarX = u291.x(0.0f, i2cVar.d(), 1, nim0Var);
        jw31 jw31VarA = ew31.a(h36.b, een.O0, x340Var, 0);
        x340 x340Var4 = x340Var;
        int iHashCode = Long.hashCode(x340Var4.T);
        xos0 xos0VarM = x340Var4.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
        hzj.A.getClass();
        x340 x340Var5 = x340Var;
        if (x340Var5.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var5.m0();
        if (x340Var5.S) {
            x340Var5.l(hmb0.t1);
        } else {
            x340Var5.v0();
        }
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String strValueOf = String.valueOf(this.b);
        uwr uwrVar = cbx.a;
        lee1 lee1Var = cbx.d(x340Var).a;
        boolean z = this.c;
        lee1 lee1VarA = lee1.a(lee1Var, 0L, z ? fc11.G(80) : fc11.G(48), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
        FontWeight fontWeight = (FontWeight) ((bjx) ajx.a.c).f;
        cjc0 cjc0Var = new cjc0(1);
        px8 px8Var = new px8(fc11.G(z ? 24 : 16), z ? fc11.G(80) : fc11.G(48), 0L, (mx8) null, 12);
        if (1.0f <= 0.0d) {
            of80.a("invalid weight; must be greater than zero");
        }
        gxo1.c(strValueOf, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).then(new vul1(xl3.a)), lee1VarA, this.d, new a0e1(6), 0, false, cjc0Var, px8Var, 0.0f, fontWeight, (iu30) null, x340Var, 134217728, 0, 2656);
        gxo1.c("%", new vul1(xl3.a), cbx.d(x340Var).d, this.e, new a0e1(5), 0, false, new cjc0(1), (qx8) null, 0.0f, (FontWeight) null, (iu30) null, x340Var, 6, 0, 3936);
        x340Var5.r(true);
        return rih1.a;
    }
}
