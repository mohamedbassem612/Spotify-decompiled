package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class whm1 {
    public static final d261 a = new d261("StoryCardId");

    public static final void a(i2c i2cVar, wj41 wj41Var, ycl1 ycl1Var, boolean z, boolean z2, boolean z3, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(734243507);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(wj41Var) : x340Var.i(wj41Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ycl1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z3) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 112;
            boolean z4 = ((i2 & 7168) == 2048) | (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(wj41Var)));
            Object objT = x340Var.T();
            if (z4 || objT == m4cVar) {
                objT = new uhm1(z, wj41Var, null, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean z5 = ((57344 & i2) == 16384) | (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(wj41Var)));
            Object objT2 = x340Var.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = new uhm1(z2, wj41Var, null, (byte) 1);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf2, x340Var, (vu30) objT2);
            x340Var.i0(1233390251);
            int i4 = i2 & 14;
            wj41Var.a(i2cVar, ycl1Var, x340Var, ((i2 >> 3) & 112) | i4 | 512);
            x340Var.r(false);
            nmn1.g(i2cVar, z3, ((Number) rwq.h(wj41Var.g, x340Var, 0).getValue()).intValue(), x340Var, ((i2 >> 12) & 112) | i4 | 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oo60(i2cVar, wj41Var, ycl1Var, z, z2, z3, i);
        }
    }

    public static final void b(i3k i3kVar, ycl1 ycl1Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, Function0 function3, String str, boolean z, boolean z2, boolean z3, tjz tjzVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1524693513);
        int i2 = i | (x340Var.i(i3kVar) ? 4 : 2) | (x340Var.i(ycl1Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(function2) ? 16384 : 8192) | 196608 | (x340Var.i(function3) ? 1048576 : 524288) | (x340Var.g(str) ? 8388608 : 4194304) | (x340Var.h(z) ? 67108864 : 33554432) | (x340Var.h(z2) ? 536870912 : 268435456);
        if (x340Var.Y(i2 & 1, ((306783379 & i2) == 306783378 && (((x340Var.h(z3) ? (char) 4 : (char) 2) | (x340Var.i(tjzVar) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            nyx.a(0, (wux) null, apo.r(26250710, new vii0(str, function1, function2, function3, i3kVar, tjzVar, function0, ycl1Var, z2, z, z3), x340Var), x340Var, 3072, 7);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afb(i3kVar, ycl1Var, function0, function1, function2, qim0Var2, function3, str, z, z2, z3, tjzVar, i);
        }
    }

    public static final sjz c(d3k d3kVar) {
        int iOrdinal = d3kVar.ordinal();
        if (iOrdinal == 0) {
            return sjz.a;
        }
        if (iOrdinal == 1) {
            return sjz.b;
        }
        if (iOrdinal == 2) {
            return sjz.c;
        }
        if (iOrdinal == 3) {
            return sjz.d;
        }
        if (iOrdinal == 4) {
            return sjz.e;
        }
        if (iOrdinal == 5) {
            return sjz.f;
        }
        eg.o();
        return null;
    }
}
