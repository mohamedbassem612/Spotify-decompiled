package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class ha71 {
    public static final int[] a = new int[0];
    public static b180 b;

    public static o8n A(saa0 saa0Var, o8n o8nVar) {
        return flo1.l(saa0Var, o8nVar);
    }

    public static boolean B(wy4 wy4Var) {
        return wy4Var.a();
    }

    public static final void C(dtw dtwVar, int i) {
        xhk1.d(dtwVar.w, new arh(i, (byte) 1));
    }

    public static final Observable D(dma1 dma1Var, bma1 bma1Var) {
        return yoi1.i(((ima1) dma1Var).q(bma1Var), o6x.a).map(new n381(dma1Var, bma1Var, (byte) 28)).distinctUntilChanged().startWith(Observable.fromCallable(new e71(dma1Var, bma1Var, (byte) 21)));
    }

    public static final Set E(g061 g061Var) {
        List<f061> list = g061Var.a;
        ArrayList arrayList = new ArrayList();
        for (f061 f061Var : list) {
            r7h.W(o7h.l1(new tr80(f061Var.a, f061Var.b, 1)), arrayList);
        }
        return o7h.p1(arrayList);
    }

    public static final void a(String str, long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-363532107);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.Z, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            uwr uwrVar = cbx.a;
            int i3 = (i2 << 6) & 7168;
            uwo1.e("•", (qim0) null, cbx.d(x340Var).j, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 | 6, 0, 2034);
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 & 14) | i3, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new icc(str, j, i, (byte) 0);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1805345537);
        if (b0kVar3.Y(i & 1, i != 0)) {
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(nim0.a, 1.0f), new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, jmi.a, (xu30) null, jmi.b, (xu30) null, (xu30) null, (xu30) null, jmi.c, b0kVar2, 805306432, 196656, 30204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 10);
        }
    }

    public static final void c(qvf0 qvf0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1948819600);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(qvf0Var) : x340Var.i(qvf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            p811 p811Var = new p811();
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            p811Var.a = objT;
            if (((Boolean) ((ven0) objT).getValue()).booleanValue()) {
                x340Var.i0(2083473554);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new uef0(iu30Var, (byte) 19);
                    x340Var.s0(objT2);
                }
                Function0 function0 = (Function0) objT2;
                String strO0 = cwl1.o0(x340Var, 2131952329);
                String strO1 = cwl1.o0(x340Var, 2131952326);
                String strO2 = cwl1.o0(x340Var, 2131952328);
                dt90 dt90Var = new dt90(qvf0Var, iu30Var, p811Var, (byte) 16);
                z50 z50Var = z50.c;
                zgx zgxVar = new zgx(strO2, new gbx(z50Var, dt90Var));
                String strO3 = cwl1.o0(x340Var, 2131952327);
                boolean z2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(qvf0Var))) | (i3 == 32);
                Object objT3 = x340Var.T();
                if (z2 || objT3 == m4cVar) {
                    objT3 = new bsc0(qvf0Var, iu30Var, (byte) 22);
                    x340Var.s0(objT3);
                }
                mqo1.d(function0, (i3u) null, (hux) null, strO0, strO1, zgxVar, new zgx(strO3, new gbx(z50Var, (Function0) objT3)), x340Var, 2359296, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(2084519122);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(qvf0Var, iu30Var, i, (byte) 3);
        }
    }

    public static final void d(b9n0 b9n0Var, Function0 function0, Function0 function1, qim0 qim0Var, Function0 function2, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4m m4mVar;
        m4c m4cVar = fkj0.X;
        y2u0 y2u0Var = b9n0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-962033303);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(b9n0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(function2) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            y8n0 y8n0Var = b9n0Var.a;
            boolean z = y8n0Var instanceof y8n0;
            qim0 qim0Var3 = nim0.a;
            if (z) {
                x340Var.i0(382919629);
                y8n0 y8n0Var2 = y8n0Var;
                int iOrdinal = y8n0Var2.i.ordinal();
                if (iOrdinal != 0) {
                    m4mVar = iOrdinal != 1 ? m4m.c : m4m.b;
                } else {
                    m4mVar = m4m.a;
                }
                boolean zA = y2u0Var.a(m4mVar);
                qim0 qim0VarH = pqo.h(qim0Var3, !y8n0Var2.e || zA);
                uvx uvxVar = new uvx(0, (pgx) null, 0, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, 2, (p3v) null, 383);
                j2i j2iVar = y2u0Var.c ? y2j.a : null;
                boolean z2 = (i3 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new kek0(function0, (byte) 7);
                    x340Var.s0(objT);
                }
                z50 z50Var = z50.c;
                gbx gbxVar = new gbx(z50Var, (Function0) objT);
                boolean z3 = (i3 & 896) == 256;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new kek0(function1, (byte) 8);
                    x340Var.s0(objT2);
                }
                qim0Var2 = qim0Var3;
                jto1.b(qim0VarH, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, new gbx(z50Var, (Function0) objT2), (xu30) null, apo.r(1816668200, new n8k0(zA, b9n0Var, y8n0Var, (byte) 1), x340Var), j2iVar, apo.r(-1558012375, new f9n0(y8n0Var, (byte) 0), x340Var), apo.r(-1435108438, new oa5(function2, (byte) 13), x340Var), (xu30) null, (xu30) null, apo.r(-1066396627, new f9n0(y8n0Var, (byte) 1), x340Var), x340Var, 805306432, 197040, 24892);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                qim0Var2 = qim0Var3;
                x340Var.i0(384266455);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0((Object) b9n0Var, function0, (cv30) function1, qim0Var2, function2, i, (byte) 8);
        }
    }

    public static final void e(irq0 irq0Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        Object ntf0Var;
        iu30 iu30Var3;
        boolean z;
        qim0 qim0Var3;
        int i3;
        k6a1 k6a1Var;
        irq0 irq0Var2;
        ven0 ven0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-158760427);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(irq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(function1) ? 16384 : 8192;
        }
        int i4 = i2 | 196608;
        if (b0kVar3.Y(i4 & 1, (74899 & i4) != 74898)) {
            Object[] objArr = new Object[0];
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = wso0.X0;
                b0kVar3.s0(objT);
            }
            ven0 ven0VarV = k5p1.v(objArr, c8e1.d, (Function0) objT, b0kVar3, 384);
            String str = ((c8e1) ven0VarV.getValue()).a.b;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = pzm.i(b0kVar3);
            }
            lz20 lz20Var = (lz20) objT2;
            k6a1 k6a1Var2 = (k6a1) b0kVar3.k(t4k.q);
            vng vngVar = (vng) b0kVar3.k(t4k.e);
            String strN0 = cwl1.n0(2131955441, new Object[]{Integer.valueOf(irq0Var.a)}, b0kVar3);
            boolean zI = b0kVar3.i(lz20Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new fx1(lz20Var, (lnm) null, (byte) 8);
                b0kVar3.s0(objT3);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var4);
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
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            c8e1 c8e1Var = (c8e1) ven0VarV.getValue();
            qim0 qim0VarP = vby0.p(u291.r(qim0Var4, 1.0f), lz20Var);
            boolean z2 = (i4 & 7168) == 2048;
            Object objT4 = b0kVar3.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new hii0(function0, (byte) 5);
                b0kVar3.s0(objT4);
            }
            qim0 qim0VarG = cev0.G(qim0VarP, (iu30) objT4);
            boolean zG = b0kVar3.g(strN0);
            Object objT5 = b0kVar3.T();
            if (zG || objT5 == m4cVar) {
                objT5 = new atp0(strN0, (byte) 3);
                b0kVar3.s0(objT5);
            }
            qim0 qim0VarB = s161.b(qim0VarG, false, (iu30) objT5);
            kua0 kua0Var = new kua0(0, (Boolean) null, 3, 7, 115);
            String str2 = str;
            int i5 = i4 & 14;
            int i6 = 57344 & i4;
            boolean zG2 = b0kVar3.g(str2) | (i5 == 4) | (i6 == 16384) | b0kVar3.i(k6a1Var2);
            Object objT6 = b0kVar3.T();
            if (zG2 || objT6 == m4cVar) {
                iu30Var3 = null;
                z = false;
                qim0Var3 = qim0Var4;
                i3 = i5;
                ntf0Var = new ntf0((byte) 21, irq0Var, function1, k6a1Var2, str2);
                k6a1Var = k6a1Var2;
                str2 = str2;
                b0kVar3.s0(ntf0Var);
            } else {
                k6a1Var = k6a1Var2;
                qim0Var3 = qim0Var4;
                ntf0Var = objT6;
                iu30Var3 = null;
                z = false;
                i3 = i5;
            }
            bua0 bua0Var = new bua0((iu30) ntf0Var, iu30Var3, iu30Var3, 62);
            long j = u7h.j;
            n6a1 n6a1Var = new n6a1(j);
            lee1 lee1Var = new lee1(j, fc11.G(1), (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777212);
            boolean zG3 = b0kVar3.g(str2) | (i3 == 4 ? true : z) | b0kVar3.i(ven0VarV) | ((i4 & 112) == 32 ? true : z) | ((i4 & 896) == 256 ? true : z) | (i6 == 16384 ? true : z);
            Object objT7 = b0kVar3.T();
            if (zG3 || objT7 == m4cVar) {
                irq0Var2 = irq0Var;
                j96 j96Var = new j96(irq0Var2, str2, iu30Var, iu30Var2, function1, ven0VarV);
                ven0Var = ven0VarV;
                b0kVar3.s0(j96Var);
                objT7 = j96Var;
            } else {
                ven0Var = ven0VarV;
                irq0Var2 = irq0Var;
            }
            xea.d(c8e1Var, (iu30) objT7, qim0VarB, false, lee1Var, kua0Var, bua0Var, false, 0, 0, (elk1) null, (iu30) null, n6a1Var, (xu30) null, b0kVar3, 0, 0, 48920);
            b0kVar2 = b0kVar3;
            boolean z3 = irq0Var2.c;
            mod.b(t4k.n.a(flb0.a), apo.r(-920441073, new hrq0(irq0Var2, vngVar, str2, ven0Var, iu30Var, iu30Var2, function1, lz20Var, k6a1Var, z3 ? 56.0f : 44.0f, z3 ? 68.0f : 53.0f), b0kVar2), b0kVar2, 56);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((Object) irq0Var, iu30Var, (Object) iu30Var2, (Object) function0, (Object) function1, (Object) qim0Var2, i, (byte) 9);
        }
    }

    public static final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-196365186);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131952073);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.e, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1714);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 11);
        }
    }

    public static final void g(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1201502568);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            qim0 qim0VarA = h2c.a.a(nim0Var, een.h);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(z ? znx.c : xtx.c, isl.a, u291.r(qim0VarA, 24.0f), 0L, 0L, false, x340Var, 56, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k750((byte) 12, i, z);
        }
    }

    public static final void h(y8n0 y8n0Var, b0k b0kVar, int i) {
        k4m k4mVar = y8n0Var.i;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1454308474);
        int i2 = 2;
        int i3 = (x340Var.i(y8n0Var) ? 4 : 2) | i;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            int iOrdinal = k4mVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                x340Var.i0(1687002687);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                int iOrdinal2 = k4mVar.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 1;
                } else if (iOrdinal2 != 1) {
                    i2 = 0;
                }
                if (i2 == 0) {
                    throw null;
                }
                kqn1.d(i2, 0, 0, x340Var, qim0VarB);
                x340Var.r(false);
            } else {
                x340Var.i0(1687197956);
                x340Var.r(false);
            }
            uwo1.e(o7h.y0(y8n0Var.f, ", ", (String) null, (String) null, (iu30) null, 62), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1726);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fhk0(y8n0Var, i, (byte) 12);
        }
    }

    public static final void i(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-134560914);
        int i2 = (x340Var.g(str) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            eso1.e(Uri.parse(str == null ? "" : str), isl.a, h2c.a.a(u291.f(nim0.a, 1.0f), een.h), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224304, 0, 4032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tej0(str, i, (byte) 9);
        }
    }

    public static final void j(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1524389541);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwo1.e(str, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, i2 & 14, 0, 1726);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tej0(str, i, (byte) 10);
        }
    }

    public static final void k(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(104370818);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            wro1.h(new gbx(z50.c, function0), ldx.c, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, y2j.b, x340Var, 0, 6, 988);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public static final void l(p3v p3vVar, float f, float f2, b0k b0kVar, int i, int i2) {
        float f3;
        int i3;
        boolean z;
        float f4;
        h311 h311VarV;
        float f5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(937371425);
        int i4 = i | (x340Var.g(p3vVar) ? 4 : 2) | (x340Var.d(f) ? 32 : 16);
        if ((i2 & 4) == 0) {
            f3 = f2;
            int i5 = x340Var.d(f3) ? 256 : 128;
            i3 = i4 | i5;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if ((i2 & 4) != 0) {
                        f5 = 0.0f;
                    }
                    x340Var.s();
                    qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, p3vVar.a), f), 0.0f, f5, 0.0f, 0.0f, 13);
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(x340Var).a.b.a();
                    cua cuaVar = cbx.b(x340Var).f;
                    t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                    f4 = f5;
                } else {
                    x340Var.b0();
                    int i6 = i2 & 4;
                }
                f5 = f3;
                x340Var.s();
                qim0 qim0VarB2 = uyn1.B(u291.h(u291.v(nim0.a, p3vVar.a), f), 0.0f, f5, 0.0f, 0.0f, 13);
                uwr uwrVar2 = cbx.a;
                long jA2 = cbx.a(x340Var).a.b.a();
                cua cuaVar2 = cbx.b(x340Var).f;
                t1c.a(cwl1.l0(dug.f(qim0VarB2, jA2, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                f4 = f5;
            } else {
                x340Var.b0();
                f4 = f3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xky(p3vVar, f, f4, i, i2, (byte) 0);
            }
        }
        f3 = f2;
        i3 = i4 | i5;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    f5 = 0.0f;
                } else {
                    f5 = f3;
                }
            } else if ((i2 & 4) != 0) {
                f5 = 0.0f;
            } else {
                f5 = f3;
            }
            x340Var.s();
            qim0 qim0VarB3 = uyn1.B(u291.h(u291.v(nim0.a, p3vVar.a), f), 0.0f, f5, 0.0f, 0.0f, 13);
            uwr uwrVar3 = cbx.a;
            long jA3 = cbx.a(x340Var).a.b.a();
            cua cuaVar3 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarB3, jA3, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
            f4 = f5;
        } else {
            x340Var.b0();
            f4 = f3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xky(p3vVar, f, f4, i, i2, (byte) 0);
        }
    }

    public static final void m(xdg1 xdg1Var, iu30 iu30Var, xv81 xv81Var, et90 et90Var, qj0 qj0Var, zhy zhyVar, u710 u710Var, ldo ldoVar, boolean z, b0k b0kVar, int i) {
        h311 h311VarV;
        beg1 beg1Var;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-245514111);
        int i2 = i | (b0kVar2.i(xdg1Var) ? 4 : 2) | (b0kVar2.i(iu30Var) ? 32 : 16) | (b0kVar2.i(xv81Var) ? 256 : 128) | (b0kVar2.i(et90Var) ? 2048 : 1024) | (b0kVar2.i(qj0Var) ? 16384 : 8192) | (b0kVar2.i(zhyVar) ? 131072 : 65536) | (b0kVar2.i(u710Var) ? 1048576 : 524288) | (b0kVar2.i(ldoVar) ? 8388608 : 4194304) | (b0kVar2.h(z) ? 67108864 : 33554432);
        if (b0kVar2.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean zJ = u890.j(xdg1Var.c, g5e0.a);
            nim0 nim0Var = nim0.a;
            if (zJ) {
                b0kVar2.i0(218831629);
                b6p1.g(oep0.a, uyn1.z(24.0f, 0.0f, 2, u291.d(nim0Var, 1.0f)), 0.0f, 0.0f, (dqz0) null, b0kVar2, 0);
                b0kVar2.r(false);
                h311VarV = b0kVar2.v();
                if (h311VarV == null) {
                    return;
                } else {
                    beg1Var = new beg1(xdg1Var, iu30Var, xv81Var, et90Var, qj0Var, zhyVar, u710Var, ldoVar, z, i, (byte) 0);
                }
            } else {
                b0kVar2.i0(218973857);
                b0kVar2.r(false);
                Set setE = E(xdg1Var.b);
                Set setU = u(xdg1Var.a, setE);
                xtb0 xtb0VarA = aub0.a(0, b0kVar2, 3);
                float fX0 = ((wat) b0kVar2.k(t4k.h)).X0(48.0f);
                zzq0 zzq0VarH = uyn1.h(2, 24.0f, 0.0f);
                qim0 qim0VarF = fdg1.F(anm1.N("selection-lazy-column", u291.d(nim0Var, 1.0f)), fX0, xtb0VarA.c(), xtb0VarA.d());
                boolean zI = b0kVar2.i(xdg1Var) | b0kVar2.i(xv81Var) | b0kVar2.g(setE) | b0kVar2.g(setU) | ((i2 & 112) == 32) | b0kVar2.i(et90Var) | b0kVar2.i(zhyVar) | b0kVar2.i(qj0Var) | b0kVar2.i(ldoVar) | ((i2 & 234881024) == 67108864) | b0kVar2.i(u710Var);
                Object objT = b0kVar2.T();
                if (zI || objT == fkj0.X) {
                    axm0 axm0Var = new axm0(xdg1Var, xv81Var, setE, setU, iu30Var, et90Var, zhyVar, qj0Var, ldoVar, z, u710Var, (byte) 4);
                    b0kVar2.s0(axm0Var);
                    objT = axm0Var;
                }
                b0kVar2 = b0kVar2;
                ujo1.d(qim0VarF, xtb0VarA, zzq0VarH, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, b0kVar2, 0, 504);
            }
            h311VarV.d = beg1Var;
        }
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            beg1Var = new beg1(xdg1Var, iu30Var, xv81Var, et90Var, qj0Var, zhyVar, u710Var, ldoVar, z, i, (byte) 1);
            h311VarV.d = beg1Var;
        }
    }

    public static final boolean n(int i, List list, Set set) {
        String str;
        if ((list.get(i) instanceof gx31) && set.size() < 4) {
            Iterator it = set.iterator();
            int length = 0;
            while (it.hasNext()) {
                Object obj = list.get(((Number) it.next()).intValue());
                gx31 gx31Var = obj instanceof gx31 ? (gx31) obj : null;
                length += (gx31Var == null || (str = gx31Var.c) == null) ? 0 : str.length();
            }
            if (((gx31) list.get(i)).c.length() + length < 300) {
                return true;
            }
        }
        return false;
    }

    public static final jhl p(tac0 tac0Var, x8c0 x8c0Var) {
        return new jhl(tac0Var, x8c0Var);
    }

    public static final w4b1 q(awl1 awl1Var, String str, vks0 vks0Var) {
        return ila0.y(awl1Var.b.h, "enqueueUniquePeriodic_".concat(str), awl1Var.d.a, new uc9(awl1Var, str, vks0Var, (byte) 13));
    }

    public static final Integer r(int i, List list, Set set) {
        int i2 = i - 1;
        while (i2 >= 0 && !(list.get(i2) instanceof gx31)) {
            i2--;
        }
        if (i2 < 0 || set.contains(Integer.valueOf(i2))) {
            return null;
        }
        return Integer.valueOf(i2);
    }

    public static final Integer s(int i, List list, Set set) {
        do {
            i++;
            if (i >= list.size()) {
                break;
            }
        } while (!(list.get(i) instanceof gx31));
        if (i >= list.size() || set.contains(Integer.valueOf(i))) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static List t(g670 g670Var, List list, int[] iArr) {
        h670 h670Var;
        int[] iArr2;
        List listT;
        int[] iArr3;
        ArrayList arrayList = null;
        int i = 0;
        while (i < list.size()) {
            y570 y570Var = (y570) list.get(i);
            if (g670Var.a(y570Var)) {
                int length = iArr.length;
                if (length == 0) {
                    iArr3 = new int[]{i};
                } else {
                    int[] iArr4 = new int[length + 1];
                    System.arraycopy(iArr, 0, iArr4, 0, length);
                    iArr4[length] = i;
                    iArr3 = iArr4;
                }
                h670Var = new h670(y570Var, iArr3);
            } else {
                h670Var = null;
            }
            List listS = y570Var.s();
            if (listS.isEmpty()) {
                listT = Collections.EMPTY_LIST;
            } else {
                int length2 = iArr.length;
                if (length2 == 0) {
                    iArr2 = new int[]{i};
                } else {
                    int[] iArr5 = new int[length2 + 1];
                    System.arraycopy(iArr, 0, iArr5, 0, length2);
                    iArr5[length2] = i;
                    iArr2 = iArr5;
                }
                listT = t(g670Var, listS, iArr2);
            }
            boolean zIsEmpty = listT.isEmpty();
            if (h670Var != null || !zIsEmpty) {
                if (arrayList == null) {
                    boolean z = i == list.size() - 1;
                    if (z && h670Var != null && zIsEmpty) {
                        return Collections.singletonList(h670Var);
                    }
                    if (z && h670Var == null) {
                        return listT;
                    }
                    arrayList = new ArrayList();
                }
                if (h670Var != null) {
                    arrayList.add(h670Var);
                }
                if (!zIsEmpty) {
                    arrayList.addAll(listT);
                }
            }
            i++;
        }
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }

    public static final Set u(List list, Set set) {
        if (set.isEmpty() || y(list, set)) {
            return w7x.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set set2 = set;
        Integer numR = r(((Number) o7h.I0(set2)).intValue(), list, set);
        if (numR != null) {
            int iIntValue = numR.intValue();
            if (n(iIntValue, list, set)) {
                linkedHashSet.add(Integer.valueOf(iIntValue));
            }
        }
        Integer numS = s(((Number) o7h.F0(set2)).intValue(), list, set);
        if (numS != null) {
            int iIntValue2 = numS.intValue();
            if (n(iIntValue2, list, set)) {
                linkedHashSet.add(Integer.valueOf(iIntValue2));
            }
        }
        return linkedHashSet;
    }

    public static Object v(saa0 saa0Var, Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, saa0Var);
    }

    public static m8n w(saa0 saa0Var, n8n n8nVar) {
        return ilo1.u(saa0Var, n8nVar);
    }

    public static final void x(m7v m7vVar) {
        if (((pim0) m7vVar).a.N0) {
            oap1.w(m7vVar, 1).u1();
        }
    }

    public static final boolean y(List list, Set set) {
        if (set.size() >= 4) {
            return true;
        }
        if (set.isEmpty()) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set set2 = set;
        Integer numR = r(((Number) o7h.I0(set2)).intValue(), list, set);
        if (numR != null) {
            int iIntValue = numR.intValue();
            if (n(iIntValue, list, set)) {
                linkedHashSet.add(Integer.valueOf(iIntValue));
            }
        }
        Integer numS = s(((Number) o7h.F0(set2)).intValue(), list, set);
        if (numS != null) {
            int iIntValue2 = numS.intValue();
            if (n(iIntValue2, list, set)) {
                linkedHashSet.add(Integer.valueOf(iIntValue2));
            }
        }
        return linkedHashSet.isEmpty();
    }

    public static o8n z(saa0 saa0Var, n8n n8nVar) {
        return ilo1.z(saa0Var, n8nVar);
    }
}
