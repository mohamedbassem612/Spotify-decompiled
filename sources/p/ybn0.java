package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ybn0 {
    public static final long a = z4p1.g(3003121663L);
    public static final /* synthetic */ int b = 0;

    public static final void a(int i, long j, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-662534292);
        int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            long j2 = j / 1000;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX = uyn1.x(dug.f(i1p1.q(qim0Var, er31.b(4.0f)), cbx.a(x340Var).a.c, d4o1.a), 4.0f);
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            wkt0.a(zkt0.a, u291.r(nim0.a, 12.0f), isl.a, cbx.a(x340Var).b.a, false, x340Var, 390, 16);
            uwo1.e(cwl1.n0(2131962258, new Object[]{sap1.r(j2 * 1000)}, x340Var), (qim0) null, lee1.a(cbx.d(x340Var).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777151), 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 1572864, 0, 1722);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e82(j, qim0Var, i, (byte) 5);
        }
    }

    public static final void b(String str, String str2, String str3, u7h u7hVar, cbn0 cbn0Var, Function0 function0, Function0 function1, vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str4;
        String str5;
        u7h u7hVar2;
        cbn0 cbn0Var2;
        Function0 function2;
        Function0 function3;
        vu30 vu30Var3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(402771058);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= x340Var.g(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i2 |= x340Var.g(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            u7hVar2 = u7hVar;
            i2 |= x340Var.g(u7hVar2) ? 2048 : 1024;
        } else {
            u7hVar2 = u7hVar;
        }
        if ((i & 24576) == 0) {
            cbn0Var2 = cbn0Var;
            i2 |= x340Var.g(cbn0Var2) ? 16384 : 8192;
        } else {
            cbn0Var2 = cbn0Var;
        }
        if ((196608 & i) == 0) {
            function2 = function0;
            i2 |= x340Var.i(function2) ? 131072 : 65536;
        } else {
            function2 = function0;
        }
        if ((1572864 & i) == 0) {
            function3 = function1;
            i2 |= x340Var.i(function3) ? 1048576 : 524288;
        } else {
            function3 = function1;
        }
        if ((12582912 & i) == 0) {
            vu30Var3 = vu30Var;
            i2 |= x340Var.i(vu30Var3) ? 8388608 : 4194304;
        } else {
            vu30Var3 = vu30Var;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= x340Var.i(vu30Var2) ? 536870912 : 268435456;
        }
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && ((((x340Var.h(z) ? (char) 4 : (char) 2) | (x340Var.h(z2) ? ' ' : (char) 16)) | 384) & 147) == 146) ? false : true)) {
            gfx.b(18, apo.r(-170097123, new l3b(u7hVar2, cbn0Var2, vu30Var3, str, function3, z, z2, function2, j2iVar, vu30Var2, str4, str5), x340Var), x340Var, 54);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xbn0(str, str2, str3, u7hVar, cbn0Var, function0, function1, vu30Var, j2iVar, vu30Var2, z, z2, qim0Var2, i);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2048048771);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gbx gbxVar = new gbx(z50.c, function0);
            ldx ldxVar = ldx.c;
            qim0 qim0Var3 = nim0.a;
            wro1.h(gbxVar, ldxVar, anm1.N("MusicVideoStickerShareCard.MuteButton", qim0Var3), (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1141116934, new k750((byte) 13, z), x340Var), x340Var, 48, 6, 1016);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function0, qim0Var2, i, (byte) 15);
        }
    }

    public static final void d(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1716249086);
        int i4 = (x340Var.g(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.g(qim0Var2) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).k;
            long j = cbx.a(x340Var).a.c;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cua cuaVar = cbx.b(x340Var).f;
            w6d1.d(str, qim0Var4, (u7h) null, lee1Var, j, 16.0f, 8.0f, 16.0f, (djc0) null, 0, x340Var, i3 & 126, 772);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zmh((byte) 1, i, i2, str, qim0Var3);
        }
    }

    public static final void e(Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(253201990);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(b0kVar3, 2131962259);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, ((vex) zex.a.e).d, d4o1.a);
            cvx cvxVar = cbx.b(b0kVar3).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, false, new g21(een.N0, (byte) 28)), een.Q0, b0kVar3, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            uwo1.e(cwl1.o0(b0kVar3, 2131962252), (qim0) null, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
            b0kVar2 = b0kVar3;
            cua cuaVar = cbx.b(b0kVar2).f;
            d(0, 0, strO0, b0kVar2, anm1.N("MusicVideoStickerShareCard.RetryButton", bin.x(i1p1.q(nim0Var, er31.b(16.0f)), false, (String) null, new pm31(0), (idn0) null, function0, 11)));
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 13);
        }
    }

    public static final void f(int i, String str, b0k b0kVar, boolean z) {
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(512377640);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            bby bbyVarE = xay.e(3, (ni20) null);
            uwr uwrVar = cbx.a;
            z2 = z;
            fq7.g(z2, qim0VarD, bbyVarE, xay.f(2, irn1.o0(jfv.t(cbx.c(x340Var).b.b, ngv.d), 0, (dlv) null, 6)), (String) null, apo.r(-1068396032, new qdg0(str, (byte) 12), x340Var), x340Var, (i2 & 14) | 197040, 16);
        } else {
            z2 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mv8(str, i, z2);
        }
    }
}
