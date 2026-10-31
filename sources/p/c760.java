package p;

import android.content.Intent;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class c760 {
    public static final void a(nmo nmoVar, boolean z, boolean z2, gt40 gt40Var, float f, boolean z3, boolean z4, b0k b0kVar, int i) {
        b0k b0kVar2;
        Object z660Var;
        String str;
        whb1 cz31Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1702770511);
        int i2 = (b0kVar3.i(nmoVar) ? 4 : 2) | i | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.h(z2) ? 256 : 128) | (b0kVar3.i(gt40Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.d(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.h(z3) ? 131072 : 65536;
        }
        int i3 = i2 | (b0kVar3.h(z4) ? 1048576 : 524288);
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            String str2 = (String) b0kVar3.k(wol1.a);
            String str3 = (String) b0kVar3.k(wol1.b);
            String str4 = (String) b0kVar3.k(wol1.c);
            boolean zI = b0kVar3.i(nmoVar) | b0kVar3.g(str3) | b0kVar3.g(str4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                str = str2;
                z660Var = new z660(nmoVar, str3, str4, z, z2);
                b0kVar3.s0(z660Var);
            } else {
                str = str2;
                z660Var = objT;
            }
            Function0 function0 = (Function0) z660Var;
            if (z2) {
                Intent intentB = dro.B((String) null, str, (WidgetInteraction) function0.invoke());
                intentB.setFlags(268435456);
                cz31Var = new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
            } else {
                cz31Var = new cz31(w0h1.A(new y60[]{new y60(apl1.b, (WidgetInteraction) function0.invoke()), new y60(apl1.a, str)}));
            }
            b0kVar2 = b0kVar3;
            j2h1.b(gt40Var, (ql3) null, apo.r(368856493, new jx10(z3, nmoVar, cz31Var, f, z4), b0kVar3), b0kVar2, ((i3 >> 9) & 14) | 384, 2);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new y660(nmoVar, z, z2, gt40Var, f, z3, z4, i);
        }
    }

    public static final void b(nmo nmoVar, q10 q10Var, gt40 gt40Var, float f, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1500373585);
        int i2 = i | (x340Var.i(nmoVar) ? 4 : 2) | (x340Var.i(q10Var) ? 32 : 16) | (x340Var.i(gt40Var) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            jch0.f(dm5.I(gt40Var), 1, apo.r(-1588023349, new a760(f, nmoVar, z, q10Var, (byte) 0), x340Var), x340Var, 3072, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b760(nmoVar, q10Var, gt40Var, f, z, i, (byte) 0);
        }
    }

    public static final void c(nmo nmoVar, q10 q10Var, gt40 gt40Var, float f, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1167219329);
        int i2 = (x340Var.i(nmoVar) ? 4 : 2) | i | (x340Var.i(q10Var) ? 32 : 16) | (x340Var.i(gt40Var) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            float fMin = Math.min(f, (s3v.b(((s3v) x340Var.k(p4k.a)).a) - 48.0f) - 32.0f);
            if (fMin < 0.0f) {
                fMin = 0.0f;
            }
            eqr0.a(dm5.J(gt40Var), 0, 0, apo.r(1411051339, new a760(nmoVar, q10Var, fMin, z), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b760(nmoVar, q10Var, gt40Var, f, z, i, (byte) 1);
        }
    }
}
