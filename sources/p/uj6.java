package p;

import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class uj6 {
    public static final long a = z4p1.g(4280690214L);
    public static final /* synthetic */ int b = 0;

    public static final void a(yj41 yj41Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1819513843);
        int i2 = (x340Var.i(yj41Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = x340Var.g(yj41Var.a);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new yk4(yj41Var.a);
                x340Var.s0(objT);
            }
            eso1.f((yk4) objT, isl.a, qim0Var, (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, x340Var, 1797552, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eg6(yj41Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void b(gj6 gj6Var, boolean z, boolean z2, boolean z3, xd6 xd6Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, int i, tob1 tob1Var, tob1 tob1Var2, y3g1 y3g1Var, b0k b0kVar, int i2, int i3) {
        tob1 tob1Var3;
        int i4;
        tob1 tob1Var4;
        char c;
        int i5;
        x340 x340Var;
        y3g1 y3g1Var2;
        tob1 tob1Var5;
        tob1 tob1Var6;
        int i6;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1627553307);
        int i7 = i2 | (x340Var2.g(gj6Var) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.h(z3) ? 2048 : 1024) | (x340Var2.g(xd6Var) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536) | (x340Var2.i(iu30Var) ? 1048576 : 524288) | (x340Var2.g(qim0Var) ? 8388608 : 4194304);
        int i8 = i3 & 256;
        if (i8 != 0) {
            i7 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i7 |= x340Var2.e(i == 0 ? -1 : l1d.C(i)) ? 67108864 : 33554432;
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i4 = i7 | 805306368;
            tob1Var3 = tob1Var;
        } else {
            tob1Var3 = tob1Var;
            i4 = i7 | (x340Var2.g(tob1Var3) ? 536870912 : 268435456);
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            c = 6;
            tob1Var4 = tob1Var2;
        } else {
            tob1Var4 = tob1Var2;
            c = x340Var2.g(tob1Var4) ? (char) 4 : (char) 2;
        }
        int i11 = i3 & 2048;
        if (i11 != 0) {
            i5 = c | '0';
        } else {
            i5 = c | (x340Var2.g(y3g1Var) ? ' ' : (char) 16);
        }
        if (x340Var2.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            int i12 = i8 != 0 ? 1 : i;
            if (i9 != 0) {
                tob1Var3 = null;
            }
            tob1 tob1Var7 = i10 != 0 ? null : tob1Var4;
            y3g1 y3g1Var3 = i11 != 0 ? null : y3g1Var;
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new b4g1(z);
                x340Var2.s0(objT);
            }
            b4g1 b4g1Var = (b4g1) objT;
            int i13 = i12;
            boolean z4 = ((i4 & 7168) == 2048) | ((i4 & 1879048192) == 536870912) | ((i4 & 112) == 32);
            Object objT2 = x340Var2.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = yv91.a(new rj6(z3, b4g1Var, tob1Var3, z));
                x340Var2.s0(objT2);
            }
            w2g0.c(d7e.r(0.71428573f, qim0Var, false), (tl3) null, apo.r(1414482437, new pj6(z, z2, z3, xd6Var, i13, b4g1Var, iu30Var, gj6Var, tob1Var3, (tob1) objT2, y3g1Var3, function0, tob1Var7), x340Var2), x340Var2, 3072, 6);
            x340Var = x340Var2;
            tob1Var6 = tob1Var3;
            y3g1Var2 = y3g1Var3;
            tob1Var5 = tob1Var7;
            i6 = i13;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            y3g1Var2 = y3g1Var;
            tob1Var5 = tob1Var4;
            tob1Var6 = tob1Var3;
            i6 = i;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qj6(gj6Var, z, z2, z3, xd6Var, function0, iu30Var, qim0Var, i6, tob1Var6, tob1Var5, y3g1Var2, i2, i3);
        }
    }

    public static final void c(gj6 gj6Var, int i, xd6 xd6Var, qim0 qim0Var, y3g1 y3g1Var, Function0 function0, b4g1 b4g1Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(249827531);
        int i3 = i2 | (x340Var.g(gj6Var) ? 4 : 2) | (x340Var.g(xd6Var) ? 256 : 128) | (x340Var.g(y3g1Var) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536);
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            w2g0.c(qim0Var, (tl3) null, apo.r(-1535454559, new tj6((byte) 0, i, gj6Var, y3g1Var, xd6Var, function0, b4g1Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(gj6Var, i, xd6Var, qim0Var, y3g1Var, function0, b4g1Var, i2);
        }
    }

    public static final cr31 d(float f, int i) {
        float f2 = 0.375f * f;
        float f3 = f * 0.05f;
        int iC = l1d.C(i);
        if (iC == 0) {
            return er31.c(f2, f3, f3, f3);
        }
        if (iC == 1) {
            return er31.c(f3, f2, f3, f3);
        }
        eg.o();
        return null;
    }
}
