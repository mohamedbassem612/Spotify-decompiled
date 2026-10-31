package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rk6 {
    public static final long a = z4p1.g(4283190353L);
    public static final FontWeight b = new FontWeight(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
    public static final FontWeight c = new FontWeight(CtaType.SEE_ALL_SHOWS_FIELD_NUMBER);

    public static final void a(cj6 cj6Var, boolean z, qim0 qim0Var, tob1 tob1Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-224823664);
        int i2 = (x340Var.g(cj6Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128) | (x340Var.g(tob1Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = x340Var.k(t4k.n) == flb0.b;
            List listSingletonList = cj6Var.a;
            if (listSingletonList.isEmpty()) {
                listSingletonList = Collections.singletonList(new u7h(u7h.j));
            }
            List listN0 = listSingletonList;
            boolean zG = x340Var.g(listN0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                if (listN0.size() == 1) {
                    listN0 = o7h.N0(listN0, listN0);
                }
                objT = v9c.s(listN0, 0.0f, 0.0f, 14);
                x340Var.s0(objT);
            }
            Brush brush = (Brush) objT;
            boolean z3 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new jj81(z);
                x340Var.s0(objT2);
            }
            qim0 qim0VarQ = i1p1.q(qim0Var, (hw61) objT2);
            boolean zG2 = ((i2 & 7168) == 2048) | x340Var.g(brush);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new fk6(tob1Var, brush, (byte) 1);
                x340Var.s0(objT3);
            }
            w2g0.c(exd0.r(qim0VarQ, (iu30) objT3), (tl3) null, apo.r(-786633498, new mk6(cj6Var, z, z2, (byte) 0), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(cj6Var, z, qim0Var, tob1Var, i, (byte) 3);
        }
    }

    public static final void b(boolean z, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1173160962);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new aw1((byte) 4, z);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = j9k1.x(nim0.a, (xu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ok6((byte) 0, i, j2iVar, z);
        }
    }

    public static final void c(int i, long j, String str, b0k b0kVar, iu30 iu30Var) {
        h311 h311VarV;
        pk6 pk6Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(31835494);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (str.length() == 0) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    pk6Var = new pk6(str, j, iu30Var, i, (byte) 0);
                }
            } else {
                long jS = ((wat) x340Var.k(t4k.h)).s(((p3v) iu30Var.invoke(Float.valueOf(6.0f))).a);
                float f = ((p3v) iu30Var.invoke(Float.valueOf(8.0f))).a;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = vi6.e(j, u291.h(nim0Var, f));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, y580.Y);
                uwr uwrVar = cbx.a;
                lee1 lee1VarA = lee1.a(cbx.d(x340Var).e, 0L, jS, FontWeight.t, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, fc11.Y(0.0f, 8589934592L), (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 4, jS, (u8e1) null, (wdt0) null, new shc0(17, 0, phc0.b), 0, 15531897);
                long j2 = u7h.f;
                cjc0 cjc0Var = new cjc0(1);
                yfu yfuVar = ajx.a;
                Object obj = yfuVar.b;
                FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).e;
                qim0 qim0VarZ = uyn1.z(((p3v) iu30Var.invoke(Float.valueOf(2.0f))).a, 0.0f, 2, nim0Var);
                boolean z = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new ip0(iu30Var, (byte) 2);
                    x340Var.s0(objT);
                }
                gxo1.c(str, j9k1.x(qim0VarZ, (xu30) objT), lee1VarA, j2, new a0e1(3), 2, false, cjc0Var, null, 150.0f, fontWeight, null, x340Var, (i2 & 14) | 199680, 0, 2368);
                x340Var.r(true);
            }
            h311VarV.d = pk6Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            pk6Var = new pk6(str, j, iu30Var, i, (byte) 1);
            h311VarV.d = pk6Var;
        }
    }

    public static final void d(cj6 cj6Var, long j, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, b0k b0kVar, int i) {
        b0k b0kVar2;
        h311 h311VarV;
        qk6 qk6Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(578576836);
        int i2 = i | (b0kVar3.g(cj6Var) ? 4 : 2) | (b0kVar3.f(j) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | (b0kVar3.i(iu30Var2) ? 2048 : 1024) | (b0kVar3.i(iu30Var3) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            yj41 yj41Var = cj6Var.b;
            boolean zG = b0kVar3.g(yj41Var.a);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new yk4(yj41Var.a);
                b0kVar3.s0(objT);
            }
            yk4 yk4Var = (yk4) objT;
            float width = yj41Var.a.getWidth();
            float height = yj41Var.a.getHeight();
            if (width <= 0.0f || height <= 0.0f) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    qk6Var = new qk6(cj6Var, j, iu30Var, iu30Var2, iu30Var3, i, (byte) 0);
                }
            } else {
                float fMin = Math.min(20.0f / width, 120.18f / height);
                float f = width * fMin;
                f2b f2bVar = new f2b(j, 5);
                b0kVar2 = b0kVar3;
                eso1.f(yk4Var, isl.a, u291.h(u291.v(eqr0.C(nim0.a, ((p3v) iu30Var.invoke(Float.valueOf(f))).a, ((p3v) iu30Var3.invoke(Float.valueOf(12.0f))).a), ((p3v) iu30Var2.invoke(Float.valueOf(f))).a), ((p3v) iu30Var3.invoke(Float.valueOf(height * fMin))).a), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, f2bVar, b0kVar2, 1797168, 128);
            }
            h311VarV.d = qk6Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            qk6Var = new qk6(cj6Var, j, iu30Var, iu30Var2, iu30Var3, i, (byte) 1);
            h311VarV.d = qk6Var;
        }
    }

    public static final void e(String str, long j, FontWeight fontWeight, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-195080380);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.f(j) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            long jS = ((wat) b0kVar3.k(t4k.h)).s(((p3v) iu30Var.invoke(Float.valueOf(7.0f))).a);
            uwr uwrVar = cbx.a;
            lee1 lee1VarA = lee1.a(cbx.d(b0kVar3).e, 0L, jS, FontWeight.t, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, fc11.Y(-0.01f, 8589934592L), (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, jS, (u8e1) null, (wdt0) null, (shc0) null, 0, 16646009);
            cjc0 cjc0Var = new cjc0(1);
            Object obj = ajx.a.b;
            b0kVar2 = b0kVar3;
            gxo1.c(str, null, lee1VarA, j, null, 2, false, cjc0Var, null, 150.0f, fontWeight, null, b0kVar2, 196608 | (i2 & 14) | ((i2 << 6) & 7168), 6, 2386);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6(str, j, fontWeight, iu30Var, i, (byte) 2);
        }
    }
}
