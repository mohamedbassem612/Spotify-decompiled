package p;

import android.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.protobuf.StringValue;
import com.spotify.identity.proto.v3.Identity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class bro1 {
    public static b180 a;

    public static final void a(ohm0 ohm0Var, pzn pznVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-765703985);
        int i2 = i | (x340Var2.g(ohm0Var) ? 4 : 2) | (x340Var2.g(pznVar) ? 32 : 16) | (x340Var2.g(qim0Var) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024);
        if (!x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var = x340Var2;
            x340Var.b0();
        } else if (ohm0Var.equals(wgm0.a)) {
            x340Var = x340Var2;
            x340Var.i0(-515320429);
            x340Var.r(false);
        } else {
            x340Var2.i0(-515920093);
            qim0 qim0VarF = u291.f(uyn1.z(0.0f, 4.0f, 1, anm1.N("CreatorButtonRow", qim0Var)), 1.0f);
            vzq0.a.getClass();
            tzq0 tzq0Var = uzq0.b;
            boolean z = (i2 & 7168) == 2048;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new qzn(iu30Var, (byte) 0);
                x340Var2.s0(objT);
            }
            cwl1.b(qim0VarF, (tl3) null, d4o1.a, (pgx) null, tzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, apo.r(1212758497, new e6j(pznVar, ohm0Var, (byte) 16), x340Var2), x340Var2, 24960, 48, 1514);
            x340Var = x340Var2;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(ohm0Var, pznVar, qim0Var, iu30Var, i, (byte) 10);
        }
    }

    public static final void b(ohm0 ohm0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2036187827);
        int i2 = (x340Var.g(ohm0Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (ohm0Var instanceof vgm0) {
                x340Var.i0(-1728579505);
                vgm0 vgm0Var = (vgm0) ohm0Var;
                c380 c380Var = vgm0Var.a;
                if (c380Var.size() == 1) {
                    x340Var.i0(-2046330038);
                    h((bgm0) o7h.q0(c380Var), x340Var, 48);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2046256196);
                    f(vgm0Var, x340Var, i2 & 126);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(-1728574249);
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(ohm0Var, qim0Var, i, (byte) 28);
        }
    }

    public static final void c(hcx hcxVar, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1882602714);
        int i2 = (x340Var.e(hcxVar.ordinal()) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            float fA = hcxVar.a(x340Var);
            boolean zD = x340Var.d(fA);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                objT = new j37((byte) 3, fA);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(gfh0Var, x340Var, y580.O0);
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
            h311VarV.d = new g6w(hcxVar, qim0Var, j2iVar, i, (byte) 9);
        }
    }

    public static final void d(c380 c380Var, af10 af10Var, qim0 qim0Var, int i, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1185412489);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(c380Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(af10Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            qim0Var2 = qim0Var;
            i3 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                td10 td10Var = ((bgm0) it.next()).b;
                if (td10Var != null) {
                    arrayList.add(td10Var);
                }
            }
            List listD1 = o7h.d1(arrayList, 3);
            if (listD1.isEmpty()) {
                listD1 = null;
            }
            se10 se10Var = listD1 != null ? new se10(14, listD1, (List) null) : null;
            if (se10Var != null) {
                x340Var.i0(1402706636);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = rwn.h;
                    x340Var.s0(objT);
                }
                iu30 iu30Var = (iu30) objT;
                boolean zI = x340Var.i(af10Var) | x340Var.i(se10Var) | ((i3 & 7168) == 2048);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new gu2((Object) af10Var, (Object) se10Var, i, (byte) 13);
                    x340Var.s0(objT2);
                }
                dm5.a(iu30Var, qim0Var2, (iu30) objT2, x340Var, ((i3 >> 3) & 112) | 6, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1403426425);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(c380Var, af10Var, qim0Var, i, i2, (byte) 6);
        }
    }

    public static final void e(ohm0 ohm0Var, af10 af10Var, qim0 qim0Var, b0k b0kVar, int i) {
        h311 h311VarV;
        rzn rznVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1943453900);
        int i2 = (x340Var.g(ohm0Var) ? 4 : 2) | i | (x340Var.i(af10Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (ohm0Var instanceof vgm0) {
                vgm0 vgm0Var = (vgm0) ohm0Var;
                c380 c380Var = vgm0Var.a;
                int i3 = vgm0Var.c;
                if (c380Var.isEmpty()) {
                    x340Var.i0(-1275433266);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1275501497);
                    d(c380Var, af10Var, qim0Var, i3, x340Var, i2 & 1008);
                    x340Var.r(false);
                }
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    rznVar = new rzn(ohm0Var, af10Var, qim0Var, i, (byte) 1);
                }
            }
            h311VarV.d = rznVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            rznVar = new rzn(ohm0Var, af10Var, qim0Var, i, (byte) 0);
            h311VarV.d = rznVar;
        }
    }

    public static final void f(vgm0 vgm0Var, b0k b0kVar, int i) {
        int i2;
        String strU;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(408658006);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vgm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.g(nim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = vgm0Var.a;
                x340Var.s0(objT);
            }
            c380 c380Var = (c380) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = vgm0Var.b;
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            if (c380Var.size() <= 3) {
                x340Var.i0(-1901394540);
                x340Var.r(false);
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(((bgm0) it.next()).a);
                }
                strU = (String) iu30Var.invoke(arrayList);
            } else {
                x340Var.i0(-1901326588);
                List listD1 = o7h.d1(c380Var, 2);
                ArrayList arrayList2 = new ArrayList(q7h.U(listD1, 10));
                Iterator it2 = listD1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((bgm0) it2.next()).a);
                }
                int size = c380Var.size() - 2;
                strU = cwl1.U(2131820647, size, new Object[]{iu30Var.invoke(arrayList2), Integer.valueOf(size)}, x340Var);
                x340Var.r(false);
            }
            uwr uwrVar = cbx.a;
            uwo1.e(strU, nim0Var, cbx.d(x340Var).k, cbx.a(x340Var).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var, i2 & 112, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0(vgm0Var, i);
        }
    }

    public static final void g(igi0 igi0Var, iu30 iu30Var, j2i j2iVar, int i, float f, int i2, float f2, int i3, qim0 qim0Var, int i4, boolean z, j2i j2iVar2, b0k b0kVar, int i5, int i6) {
        qim0 qim0Var2;
        int i7;
        int i8;
        int i9;
        b0k b0kVar2;
        qim0 qim0Var3;
        int i10;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(252869895);
        int i11 = i5 | (b0kVar3.i(igi0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.e(i) ? 2048 : 1024) | (b0kVar3.d(f) ? 16384 : 8192) | (b0kVar3.e(i2) ? 131072 : 65536) | (b0kVar3.d(f2) ? 1048576 : 524288) | (b0kVar3.e(i3) ? 8388608 : 4194304);
        int i12 = i6 & 256;
        if (i12 != 0) {
            i7 = i11 | 100663296;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i7 = i11 | (b0kVar3.i(qim0Var2) ? 67108864 : 33554432);
        }
        int i13 = i6 & 512;
        if (i13 != 0) {
            i9 = i7 | 805306368;
            i8 = i4;
        } else {
            i8 = i4;
            i9 = i7 | (b0kVar3.e(i8) ? 536870912 : 268435456);
        }
        int i14 = i9;
        if (b0kVar3.Y(i14 & 1, ((i14 & 306783379) == 306783378 && (('0' | (b0kVar3.h(z) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            qim0 qim0Var4 = i12 != 0 ? nim0.a : qim0Var2;
            int i15 = i13 != 0 ? 0 : i8;
            b0kVar3.f0(-1805148838, igi0Var.a);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, b0kVar3);
            }
            hdn0 hdn0Var = (hdn0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, b0kVar3);
            }
            b0kVar2 = b0kVar3;
            nyx.a(2, (wux) null, apo.r(-244379833, new ghi0(z, hdn0Var, f2, (hdn0) objT2, iu30Var, igi0Var, i, qim0Var4, i15, j2iVar, f, i3, i2, j2iVar2), b0kVar3), b0kVar2, 3078, 6);
            b0kVar2.r(false);
            i10 = i15;
            qim0Var3 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            i10 = i8;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hhi0(igi0Var, iu30Var, j2iVar, i, f, i2, f2, i3, qim0Var3, i10, z, j2iVar2, i5, i6);
        }
    }

    public static final void h(bgm0 bgm0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1266273513);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(bgm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.g(nim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2;
            String str = bgm0Var.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, nim0Var, cbx.d(x340Var).k, cbx.a(x340Var).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var, i4 & 112, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0(bgm0Var, i);
        }
    }

    public static final void i(bxc1 bxc1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-245220552);
        int i2 = i | (x340Var.i(bxc1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0VarX = bin.x(d1u.E(1.0f, cbx.a(x340Var).a.b.a(), dug.f(i1p1.q(qim0Var, cr31VarB), cbx.a(x340Var).a.b.a(), d4o1.a), cr31VarB), false, null, null, null, function0, 15);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX2);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(bxc1Var.b, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
            uwo1.e(bxc1Var.c, u291.f(nim0.a, 1.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(2), 2, null, x340Var, 805306368, 0, 1200);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(bxc1Var, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final int j(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final af5 k(String str, String str2, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-129632231);
        ye5 ye5Var = new ye5();
        ye5Var.g(str);
        if (str2 == null || ihc1.y0(str2)) {
            x340Var.i0(243352666);
            x340Var.r(false);
        } else {
            x340Var.i0(243247917);
            ye5Var.g(" • ");
            uwr uwrVar = cbx.a;
            int iO = ye5Var.o(new zma1(cbx.a(x340Var).b.c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g(str2);
                ye5Var.k(iO);
                x340Var.r(false);
            } catch (Throwable th) {
                ye5Var.k(iO);
                throw th;
            }
        }
        af5 af5VarP = ye5Var.p();
        x340Var.r(false);
        return af5VarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(co70 co70Var, String str, String str2, onm onmVar) {
        yei1 yei1Var;
        String value;
        String value2;
        if (onmVar instanceof yei1) {
            yei1Var = (yei1) onmVar;
            int i = yei1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yei1Var.b = i - Integer.MIN_VALUE;
            } else {
                yei1Var = new yei1(onmVar);
            }
        } else {
            yei1Var = new yei1(onmVar);
        }
        Object objB = yei1Var.a;
        int i2 = yei1Var.b;
        String str3 = null;
        if (i2 == 0) {
            hm5.M(objB);
            yei1Var.b = 1;
            objB = co70Var.b(str, str2, yei1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        Identity.UserProfile userProfile = (Identity.UserProfile) objB;
        StringValue stringValueV = userProfile.v();
        if (stringValueV != null && (value = stringValueV.getValue()) != null) {
            if (value.length() <= 0) {
                value = null;
            }
            if (value != null) {
                StringValue stringValueU = userProfile.u();
                if (stringValueU != null && (value2 = stringValueU.getValue()) != null && value2.length() > 0) {
                    str3 = value2;
                }
                return new tv21(value, str3);
            }
        }
        return null;
    }

    public static final int n(boolean z, boolean z2) {
        if (z && z2) {
            return 2131952227;
        }
        if (z) {
            return 2131952229;
        }
        return z2 ? 2131952220 : 2131952226;
    }

    public static boolean o(j55 j55Var) {
        return j55Var.d();
    }

    public static final int p(boolean z, boolean z2, boolean z3) {
        if (z) {
            return 1;
        }
        if (z2) {
            return 2;
        }
        return z3 ? 1 : 3;
    }

    public static final long q(Integer num) {
        return num != null ? z4p1.e(Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(num.intValue())}, 1)))) : u7h.k;
    }

    public String m() {
        return "";
    }
}
