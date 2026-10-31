package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vz31 {
    public static final long a = fc11.G(35);
    public static final /* synthetic */ int b = 0;

    public static final void a(int i, long j, String str, b0k b0kVar, qim0 qim0Var, lee1 lee1Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1632929178);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(lee1Var) ? 32 : 16) | (b0kVar3.f(j) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            yae1 yae1VarQ = d5p1.q(0, b0kVar3, 1);
            long j2 = lee1Var.a.b;
            fc11.o(j2);
            lee1 lee1VarA = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, fc11.Y(TextUnit.c(j2) * 0.85714287f, 1095216660480L & j2), (u8e1) null, (wdt0) null, (shc0) null, 0, 16646143);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            w2g0.c(u291.f(qim0Var3, 1.0f), (tl3) null, apo.r(1747681136, new nhg(str, lee1VarA, j, yae1VarQ, (byte) 5), b0kVar3), b0kVar2, 3072, 6);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new o3a(str, lee1Var, j, qim0Var2, i);
        }
    }

    public static final void b(n041 n041Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1127129528);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(213.75f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(n041Var) : x340Var.i(n041Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            w2g0.c(qim0Var, (tl3) null, apo.r(-1058478926, new rt11(n041Var, j2iVar, (byte) 9), x340Var), x340Var, ((i2 >> 6) & 14) | 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(n041Var, qim0Var, j2iVar, false, i, (byte) 3);
        }
    }

    public static final void c(String str, n041 n041Var, lee1 lee1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-761865757);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(n041Var) ? 32 : 16) | (b0kVar2.g(lee1Var) ? 256 : 128) | 3072;
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(h36.g, fraVar, b0kVar2, 54);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            jw31 jw31VarA2 = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, b0kVar2, 48);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0Var3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            wsx wsxVar = wsx.c;
            long jA = n041Var.a();
            zov0 zov0Var = cbx.b(b0kVar2).g;
            w0h1.a(wsxVar, isl.a, u291.r(qim0Var3, 16.0f), jA, 0L, false, b0kVar2, wsx.d | 48, 48);
            b0kVar2 = b0kVar2;
            jch0.c(cwl1.o0(b0kVar2, 2131961382).toUpperCase(Locale.ROOT), (qim0) null, lee1.a(lee1Var, n041Var.a(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (iu30) null, 0, false, 1, 0, (x9h) null, (m0e1) null, b0kVar2, 1572864, 954);
            b0kVar2.r(true);
            jch0.c(str, (qim0) null, lee1.a(lee1Var, n041Var.a(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (iu30) null, 0, false, 1, 0, (x9h) null, (m0e1) null, b0kVar2, (i2 & 14) | 1572864, 954);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(i, str, n041Var, lee1Var, qim0Var2, (byte) 20);
        }
    }
}
