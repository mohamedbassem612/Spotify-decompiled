package p;

import android.net.Uri;
import android.util.Base64;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class m6p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(yg1 yg1Var, qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-410970759);
        int i2 = (x340Var.g(yg1Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            long j = u7h.b;
            cr31 cr31VarB = er31.b(8.0f);
            nim0 nim0Var = nim0.a;
            w3d1.a(uyn1.x(u291.r(dug.f(nim0Var, j, cr31VarB), 48.0f), 12.0f), (hw61) null, 0L, 0L, 0.0f, 0.0f, (qqb) null, apo.r(964143560, new af1(yg1Var, (byte) 2), x340Var), x340Var, 12582912, 126);
            String str = yg1Var.b;
            uwr uwrVar = cbx.a;
            uwo1.e(str, anm1.N("HeaderTitle", nim0Var), cbx.d(x340Var).d, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            b2 = 1;
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xf1(yg1Var, qim0Var, i, b2);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1493678884);
        if (b0kVar3.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 12.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarY);
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
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            zov0 zov0Var = cbx.b(b0kVar3).g;
            op71.g(b0kVar3, u291.v(nim0Var, 16.0f));
            String strO0 = cwl1.o0(b0kVar3, 2131960152);
            lee1 lee1Var = cbx.d(b0kVar3).h;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = svu0.T0;
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            uwo1.e(strO0, s161.b(wnb0Var, false, (iu30) objT), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2024);
            eox eoxVar = eox.c;
            long j = cbx.a(b0kVar2).b.b;
            zov0 zov0Var2 = cbx.b(b0kVar2).g;
            w0h1.a(eoxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, b0kVar2, eox.d | 48, 48);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 10);
        }
    }

    public static final void c(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1649485091);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = (b0kVar3.i(qim0Var2) ? 4 : 2) | i;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 3) != 2)) {
            qim0 qim0Var3 = i4 != 0 ? nim0.a : qim0Var2;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), new uvx((pgx) null, 3, (tvx) null, (p3v) null, 26), null, false, null, null, null, null, null, zwi.a, null, zwi.b, null, null, null, zwi.c, b0kVar2, 805306432, 196656, 30204);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0((byte) 21, i, i2, qim0Var2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(gwu0 gwu0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2016934572);
        int i2 = ((i & 6) == 0 ? (x340Var.i(gwu0Var) ? 4 : 2) | i : i) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = voo1.y(dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a), voo1.g);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            b(x340Var, 0);
            rqo1.g(0, 1, x340Var, null);
            svu0 svu0Var = svu0.S0;
            lqj0 lqj0VarB = kwu0.b(gwu0Var, 1, svu0Var);
            lqj0 lqj0VarB2 = kwu0.b(gwu0Var, 2, svu0Var);
            List listM = p7h.M(new mmr0[]{new mmr0(lwu0.c, kwu0.b(gwu0Var, 3, jwu0.a)), new mmr0(lwu0.b, lqj0VarB2), new mmr0(lwu0.a, lqj0VarB)});
            if (lqj0VarB2.a >= 5) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM) {
                    if (((lqj0) ((mmr0) obj).b).a != 0) {
                        arrayList.add(obj);
                    }
                }
                listM = arrayList;
            }
            List<mmr0> list = listM;
            ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
            for (mmr0 mmr0Var : list) {
                lwu0 lwu0Var = (lwu0) mmr0Var.a;
                lqj0 lqj0Var = (lqj0) mmr0Var.b;
                String strA = kwu0.a(lqj0Var.a);
                qim0 qim0Var3 = qim0Var2;
                long j = lqj0Var.b;
                arrayList2.add(new qwu0(strA, kwu0.a(Math.abs(j)), lwu0Var, j < 0 ? 2 : j > 0 ? 1 : 3));
                qim0Var2 = qim0Var3;
            }
            qim0Var = qim0Var2;
            l(arrayList2, x340Var, 0);
            e(x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var4 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0((Object) gwu0Var, (Object) qim0Var4, i, (byte) 12);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-194639301);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131960150);
            String strN0 = cwl1.n0(2131960149, new Object[]{strO0}, x340Var);
            int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
            x340Var.i0(1930201956);
            StringBuilder sb = new StringBuilder(16);
            ArrayList arrayListM = xvj1.m();
            new ArrayList();
            sb.append(strN0);
            if (iW0 >= 0) {
                x340Var.i0(-736691606);
                uwr uwrVar = cbx.a;
                arrayListM.add(new xe5(iW0, strO0.length() + iW0, 8, new zma1(cbx.a(x340Var).b.a, 0L, cbx.d(x340Var).n.a.c, (FontStyle) null, (FontSynthesis) null, cbx.d(x340Var).n.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65498), (String) null));
                x340Var.r(false);
            } else {
                x340Var.i0(-736391774);
                x340Var.r(false);
            }
            String string = sb.toString();
            ArrayList arrayList = new ArrayList(arrayListM.size());
            int size = arrayListM.size();
            for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
            }
            af5 af5Var = new af5(string, arrayList);
            x340Var.r(false);
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).m;
            long j = cbx.a(x340Var).b.b;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.d(af5Var, j, uyn1.B(qim0VarF, 16.0f, 0.0f, 16.0f, cbx.b(x340Var).b.b, 2), lee1Var, new a0e1(3), null, 0, false, null, 0, null, null, x340Var, 0, 0, 4064);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 11);
        }
    }

    public static final void f(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2001815195);
        h2c h2cVar = h2c.a;
        int i2 = (x340Var.i(h2cVar) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            eso1.e(Uri.parse(str), isl.a, h2cVar.a(u291.d(nim0.a, 1.0f), een.h), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224304, 0, 4032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zsd1(str, i, (byte) 25);
        }
    }

    public static final void g(Function0 function0, lsm0 lsm0Var, Function0 function1, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(792646022);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lsm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            zau0 zau0Var = (zau0) function0.invoke();
            qim0 qim0Var3 = nim0.a;
            if (zau0Var == null) {
                x340Var.i0(-12271610);
                x340Var.r(false);
            } else {
                x340Var.i0(-12271609);
                tob1 tob1VarB = qxy0.B(zau0Var, x340Var);
                r091 r091Var = (r091) tob1VarB.getValue();
                x340Var.i0(-1275304459);
                x340Var.r(false);
                boolean zH = ((i3 & 7168) == 2048) | x340Var.h(false) | x340Var.i(r091Var);
                Object objT = x340Var.T();
                if (zH || objT == m4cVar) {
                    objT = new hij1(iu30Var, r091Var, (byte) 12);
                    x340Var.s0(objT);
                }
                qxd0.i(r091Var, (iu30) objT, x340Var);
                boolean zI = x340Var.i(r091Var) | x340Var.i(lsm0Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new t6j1(r091Var, lsm0Var, (lnm) null, (byte) 10);
                    x340Var.s0(objT2);
                }
                qxd0.t(r091Var, x340Var, (vu30) objT2);
                boolean z = (i3 & 896) == 256;
                Object objT3 = x340Var.T();
                if (z || objT3 == m4cVar) {
                    objT3 = new izg1(function1, (byte) 12);
                    x340Var.s0(objT3);
                }
                iu30 iu30Var2 = (iu30) objT3;
                qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                boolean zI2 = x340Var.i(tob1VarB);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == m4cVar) {
                    objT4 = new eyg1(tob1VarB, (byte) 10);
                    x340Var.s0(objT4);
                }
                dm5.a(iu30Var2, qim0VarD, (iu30) objT4, x340Var, 0, 0);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71((byte) 19, i, (Object) function0, (Object) lsm0Var, (Object) function1, (Object) iu30Var, (Object) qim0Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public static final void h(float f, float f2, float f3, b0k b0kVar, int i, int i2) {
        float f4;
        int i3;
        boolean z;
        float f5;
        h311 h311VarV;
        float f6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(503272076);
        int i4 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.d(f2) ? 32 : 16);
        if ((i2 & 4) == 0) {
            f4 = f3;
            int i5 = x340Var.d(f4) ? 256 : 128;
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
                        f6 = 0.0f;
                    }
                    x340Var.s();
                    qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(x340Var).a.b.a();
                    cua cuaVar = cbx.b(x340Var).f;
                    t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                    f5 = f6;
                } else {
                    x340Var.b0();
                    int i6 = i2 & 4;
                }
                f6 = f4;
                x340Var.s();
                qim0 qim0VarB2 = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
                uwr uwrVar2 = cbx.a;
                long jA2 = cbx.a(x340Var).a.b.a();
                cua cuaVar2 = cbx.b(x340Var).f;
                t1c.a(cwl1.l0(dug.f(qim0VarB2, jA2, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                f5 = f6;
            } else {
                x340Var.b0();
                f5 = f4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ly00(f, f2, f5, i, i2, (byte) 1);
            }
        }
        f4 = f3;
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
                    f6 = 0.0f;
                } else {
                    f6 = f4;
                }
            } else if ((i2 & 4) != 0) {
                f6 = 0.0f;
            } else {
                f6 = f4;
            }
            x340Var.s();
            qim0 qim0VarB3 = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
            uwr uwrVar3 = cbx.a;
            long jA3 = cbx.a(x340Var).a.b.a();
            cua cuaVar3 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarB3, jA3, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
            f5 = f6;
        } else {
            x340Var.b0();
            f5 = f4;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ly00(f, f2, f5, i, i2, (byte) 1);
        }
    }

    public static final void i(x581 x581Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        x581 x581Var2;
        Function0 function2;
        Function0 function3;
        int i2;
        int i3;
        int i4;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-86740487);
        int i5 = (x340Var.g(x581Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | 3072;
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            v581 v581Var = v581.a;
            if (x581Var.equals(v581Var)) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new s581(x581Var, function0, function1, i, (byte) 0);
                    return;
                }
                return;
            }
            x581Var2 = x581Var;
            function2 = function0;
            function3 = function1;
            i2 = i;
            w581 w581Var = w581.a;
            if (x581Var2.equals(w581Var)) {
                i3 = -1753219967;
                i4 = 2131952933;
            } else {
                if (!(x581Var2 instanceof u581)) {
                    if (!x581Var2.equals(v581Var)) {
                        throw p3d1.k(x340Var, -1753221929, false);
                    }
                    x340Var.i0(1484988931);
                    x340Var.r(false);
                    h311 h311VarV2 = x340Var.v();
                    if (h311VarV2 != null) {
                        h311VarV2.d = new s581(x581Var2, function2, function3, i2, (byte) 1);
                        return;
                    }
                    return;
                }
                i3 = -1753215939;
                i4 = 2131952931;
            }
            String strK2 = x0d.k(x340Var, i3, i4, x340Var, false);
            String strK3 = null;
            if (x581Var2.equals(w581Var)) {
                strK = x0d.k(x340Var, 1485075824, 2131952932, x340Var, false);
            } else {
                x340Var.i0(1485167863);
                x340Var.r(false);
                strK = null;
            }
            if (x581Var2 instanceof u581) {
                strK3 = x0d.k(x340Var, 1485258042, 2131952934, x340Var, false);
            } else {
                x340Var.i0(1485340471);
                x340Var.r(false);
            }
            String str = strK3;
            qim0Var = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 12.0f);
            int i6 = i5 & 14;
            int i7 = i5 << 9;
            j(x581Var2, strK2, strK, str, function2, function3, qim0VarY, x340Var, i6 | (57344 & i7) | (i7 & 458752));
        } else {
            x581Var2 = x581Var;
            function2 = function0;
            function3 = function1;
            i2 = i;
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new gh61(i2, x581Var2, function2, function3, qim0Var2, (byte) 6);
        }
    }

    public static final void j(x581 x581Var, String str, String str2, String str3, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        xu30 xu30VarR;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1124722949);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(x581Var) : b0kVar3.i(x581Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 1048576 : 524288;
        }
        if (!b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        } else {
            if (x581Var.equals(v581.a)) {
                h311 h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new t581(x581Var, str, str2, str3, function0, function1, qim0Var, i, (byte) 0);
                    return;
                }
                return;
            }
            qim0 qim0VarN = anm1.N("show_generation_banner", u291.f(qim0Var, 1.0f));
            ogx ogxVar = ogx.e;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            uvx uvxVar = new uvx(0, ogxVar, 3, (vzq0) null, (zzq0) null, (tvx) null, er31.b(16.0f), 0, (p3v) null, 441);
            if (ihc1.y0(str)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function0);
            if (str2 == null) {
                b0kVar3.i0(1582344639);
                b0kVar3.r(false);
                xu30VarR = null;
            } else {
                b0kVar3.i0(1582344640);
                xu30VarR = apo.r(-1336525263, new iww0(str2, (byte) 25), b0kVar3);
                b0kVar3.r(false);
            }
            if (str3 == null) {
                b0kVar3.i0(1582565700);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(1582565701);
                j2iVarR = apo.r(-18978662, new t1(str3, function1, (byte) 7), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, null, false, null, null, gbxVar, null, null, null, null, xu30VarR, x581Var.equals(w581.a) ? phj.a : null, j2iVarR, null, apo.r(104446793, new iww0(str, (byte) 26), b0kVar3), b0kVar2, 64, 196608, 18364);
        }
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new t581(x581Var, str, str2, str3, function0, function1, qim0Var, i, (byte) 1);
        }
    }

    public static final void k(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(829971828);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = svu0.U0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, true, (iu30) objT);
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            uwo1.e(str, null, cbx.d(x340Var).a, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2026);
            uwo1.e(str2, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2018);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 26);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void l(ArrayList arrayList, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        byte b2;
        int i2;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        fra fraVar = een.Z;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1735860196);
        j06 j06Var = ((x340) b0kVar2).a;
        int i3 = i | (b0kVar2.g(arrayList) ? 4 : 2);
        if (b0kVar2.Y(i3 & 1, (i3 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(0.0f, cbx.b(b0kVar2).b.b, 1, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
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
            nko1.H(mbhVarA, b0kVar2, lljVar4);
            nko1.H(xos0VarM, b0kVar2, lljVar3);
            x0d.q(iHashCode, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE, b0kVar2, lljVar);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ2 = uyn1.z(12.0f, 0.0f, 2, qim0VarF2);
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarZ2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar4);
            nko1.H(xos0VarM2, b0kVar2, lljVar3);
            x0d.q(iHashCode2, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar);
            b0kVar2.i0(-1081393237);
            for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                qwu0 qwu0Var = (qwu0) it.next();
                String str = qwu0Var.a;
                int iOrdinal = qwu0Var.c.ordinal();
                if (iOrdinal == 0) {
                    i2 = 2131960151;
                } else if (iOrdinal == 1) {
                    i2 = 2131960147;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return;
                    }
                    i2 = 2131960146;
                }
                k(0, str, cwl1.o0(b0kVar2, i2), b0kVar2, new wnb0(1.0f, true));
            }
            b0kVar2.r(false);
            b0kVar2.r(true);
            String strO0 = cwl1.o0(b0kVar2, 2131960148);
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).j;
            long j = cbx.a(b0kVar2).b.b;
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            float f = cbx.b(b0kVar2).b.b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            b2 = 0;
            uwo1.e(strO0, uyn1.B(qim0VarF3, 16.0f, f, 0.0f, 8.0f, 4), lee1Var, j, new a0e1(5), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            b0kVar2 = b0kVar2;
            qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarF4);
            hzj.A.getClass();
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar4);
            nko1.H(xos0VarM3, b0kVar2, lljVar3);
            x0d.q(iHashCode3, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar);
            b0kVar2.i0(-1519821959);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                n((qwu0) it2.next(), new wnb0(1.0f, true), b0kVar2, 0);
            }
            us71.m(b0kVar2, false, true, true);
        } else {
            b2 = 0;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pwu0(arrayList, i, b2);
        }
    }

    public static final void m(String str, z0e1 z0e1Var, q061 q061Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-621584190);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(z0e1Var) ? 32 : 16) | (x340Var.e(q061Var.ordinal()) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            flb0 flb0VarR = f5p1.r(z, x340Var);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = yv91.a(new x0e1(q061Var, z0e1Var, (byte) 3));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            boolean z3 = i3 == 256;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = yv91.a(new fjc1(q061Var, (byte) 18));
                x340Var.s0(objT2);
            }
            mod.b(t4k.n.a(flb0VarR), apo.r(692098434, new bvd1(function0, str, tob1Var, (tob1) objT2, (byte) 2), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(str, z0e1Var, q061Var, z, function0, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void n(qwu0 qwu0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-384778743);
        int i3 = (x340Var.g(qwu0Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            lwu0 lwu0Var = qwu0Var.c;
            String str = qwu0Var.b;
            int i4 = qwu0Var.d;
            int iOrdinal = lwu0Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 2131960151;
            } else if (iOrdinal == 1) {
                i2 = 2131960147;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                i2 = 2131960146;
            }
            String strO0 = cwl1.o0(x340Var, i2);
            int iC = l1d.C(i4);
            if (iC == 0) {
                x340Var.i0(-405174571);
                strN0 = cwl1.n0(2131960154, new Object[]{strO0, str}, x340Var);
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(-405170923);
                strN0 = cwl1.n0(2131960153, new Object[]{strO0, str}, x340Var);
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, -405179194, false);
                }
                x340Var.i0(-405177721);
                strN0 = cwl1.n0(2131960155, new Object[]{strO0}, x340Var);
                x340Var.r(false);
            }
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new zqu0(strN0, (byte) 6);
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarA, cbx.b(x340Var).b.a, 0.0f, 0.0f, 0.0f, 14);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            o(i4, x340Var, 0);
            lee1 lee1Var = cbx.d(x340Var).d;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(nim0.a, 4.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hws0(qwu0Var, qim0Var, i, (byte) 17);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void o(int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        glx glxVar;
        long j;
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(-417811793, i, x340Var) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                glxVar = glx.c;
            } else if (iC == 1) {
                glxVar = elx.c;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                glxVar = null;
            }
            int iC2 = l1d.C(i);
            if (iC2 == 0) {
                x340Var.i0(-2085163145);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.f;
                x340Var.r(false);
            } else if (iC2 == 1) {
                x340Var.i0(-2085161257);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.d;
                x340Var.r(false);
            } else {
                if (iC2 != 2) {
                    throw p3d1.k(x340Var, -2085166862, false);
                }
                x340Var.i0(-2085164845);
                uwr uwrVar3 = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            }
            long j2 = j;
            nim0 nim0Var = nim0.a;
            if (glxVar == null) {
                x340Var.i0(-215452263);
                zov0 zov0Var = cbx.b(x340Var).g;
                ywx0.n(nim0Var, 24.0f, x340Var, false);
            } else {
                x340Var.i0(-215347855);
                zov0 zov0Var2 = cbx.b(x340Var).g;
                w0h1.a(glxVar, isl.a, u291.r(nim0Var, 24.0f), j2, 0L, false, x340Var, 56, 48);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 10, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    public static final void p(b6k1 b6k1Var, Function0 function0, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        tob1 tob1Var;
        dlv dlvVar;
        ?? r3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1639909801);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(b6k1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = z2 && z;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            tob1 tob1Var2 = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            qim0 qim0VarN = anm1.N("VerticalVideoUI", qim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            if (z3) {
                x340Var.i0(-1945130011);
                lsm0 lsm0Var = b6k1Var.b;
                boolean zI = x340Var.i(tob1Var2);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new aya1(tob1Var2, (byte) 29);
                    x340Var.s0(objT3);
                }
                Function0 function2 = (Function0) objT3;
                boolean zI2 = x340Var.i(ven0Var);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == m4cVar) {
                    objT4 = new i2g1(ven0Var, (byte) 14);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var = (iu30) objT4;
                int i3 = (i2 >> 3) & 14;
                tob1Var = tob1Var2;
                dlvVar = null;
                g(function1, lsm0Var, function2, iu30Var, null, x340Var, i3);
                r3 = 0;
                x340Var.r(false);
            } else {
                tob1Var = tob1Var2;
                dlvVar = null;
                r3 = 0;
                x340Var.i0(-1944876896);
                x340Var.r(false);
                tob1Var.setValue(Boolean.FALSE);
            }
            fq7.g(!((Boolean) tob1Var.getValue()).booleanValue(), (qim0) null, xay.e(2, irn1.o0(250, r3, dlvVar, 6)), xay.f(2, irn1.o0(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, r3, dlvVar, 6)), (String) null, apo.r(-1768502987, new g2j1(b6k1Var, (byte) 19), x340Var), x340Var, 196608, 18);
            x340Var = x340Var;
            x340Var.i0(-1943766011);
            x340Var.r((boolean) r3);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(b6k1Var, function0, z, z2, qim0Var, i, (byte) 12);
        }
    }

    public static final feh q(EsResponseWithReasons.ResponseWithReasons responseWithReasons) {
        return heh.a[responseWithReasons.n().ordinal()] == 1 ? new ceh() : new beh(responseWithReasons.o());
    }

    public static dg90 r(r6h1 r6h1Var) {
        return new dg90(r6h1Var, (byte) 27);
    }

    public static String s(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final go80 t(klm klmVar, cdp0 cdp0Var, ycp0 ycp0Var, ycp0 ycp0Var2, cdp0 cdp0Var2) {
        return klmVar.a("WorkoutCoachingBridgeDaemon", new odp0(cdp0Var, ycp0Var, ycp0Var2, cdp0Var2, (byte) 1));
    }

    public static final Object u(i3b i3bVar) {
        kha0 kha0Var = (kha0) i3bVar.b;
        bcr bcrVar = new bcr();
        bcrVar.a = kha0Var;
        bcrVar.b = bcrVar;
        d9n d9nVar = d9n.a;
        bcrVar.c = d9nVar;
        while (true) {
            Object obj = bcrVar.c;
            lnm lnmVar = bcrVar.b;
            if (lnmVar == null) {
                hm5.M(obj);
                return obj;
            }
            if (d9nVar.equals(obj)) {
                try {
                    kha0 kha0Var2 = bcrVar.a;
                    w0h1.o(3, kha0Var2);
                    kha0 kha0Var3 = new kha0(kha0Var2.d, lnmVar);
                    kha0Var3.c = bcrVar;
                    Object objInvokeSuspend = kha0Var3.invokeSuspend(rih1.a);
                    if (objInvokeSuspend != d9nVar) {
                        lnmVar.resumeWith(objInvokeSuspend);
                    }
                } catch (Throwable th) {
                    lnmVar.resumeWith(new m231(th));
                }
            } else {
                bcrVar.c = d9nVar;
                lnmVar.resumeWith(obj);
            }
        }
    }

    public static final int v(int i, d030 d030Var) {
        int iOrdinal = d030Var.L1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                d030 d030VarM = dm5.M(d030Var);
                if (d030VarM == null) {
                    hhg1.n("ActiveParent with no focused child");
                    return 0;
                }
                int iV = v(i, d030VarM);
                if (iV == 1) {
                    iV = 0;
                }
                if (iV != 0) {
                    return iV;
                }
                if (!d030Var.Q0) {
                    d030Var.Q0 = true;
                    try {
                        gz20 gz20VarJ1 = d030Var.J1();
                        dgd dgdVar = new dgd(i);
                        dz20 focusOwner = oap1.C(d030Var).getFocusOwner();
                        d030 d030VarH = focusOwner.h();
                        gz20VarJ1.k.invoke(dgdVar);
                        d030 d030VarH2 = focusOwner.h();
                        if (dgdVar.b) {
                            lz20 lz20Var = lz20.b;
                            d030Var.Q0 = false;
                            return 2;
                        }
                        if (d030VarH == d030VarH2 || d030VarH2 == null) {
                            d030Var.Q0 = false;
                            return 1;
                        }
                        if (lz20.d == lz20.c) {
                            d030Var.Q0 = false;
                            return 2;
                        }
                        d030Var.Q0 = false;
                        return 3;
                    } catch (Throwable th) {
                        d030Var.Q0 = false;
                        throw th;
                    }
                }
            } else {
                if (iOrdinal == 2) {
                    return 2;
                }
                if (iOrdinal != 3) {
                    eg.o();
                    return 0;
                }
            }
        }
        return 1;
    }

    public static final int w(int i, d030 d030Var) {
        if (!d030Var.R0) {
            d030Var.R0 = true;
            try {
                gz20 gz20VarJ1 = d030Var.J1();
                dgd dgdVar = new dgd(i);
                dz20 focusOwner = oap1.C(d030Var).getFocusOwner();
                d030 d030VarH = focusOwner.h();
                gz20VarJ1.j.invoke(dgdVar);
                d030 d030VarH2 = focusOwner.h();
                if (dgdVar.b) {
                    lz20 lz20Var = lz20.b;
                    d030Var.R0 = false;
                    return 2;
                }
                if (d030VarH != d030VarH2 && d030VarH2 != null) {
                    if (lz20.d == lz20.c) {
                        d030Var.R0 = false;
                        return 2;
                    }
                    d030Var.R0 = false;
                    return 3;
                }
                d030Var.R0 = false;
            } catch (Throwable th) {
                d030Var.R0 = false;
                throw th;
            }
        }
        return 1;
    }

    public static final int x(int i, d030 d030Var) {
        pim0 pim0Var;
        jdo0 jdo0Var;
        int iOrdinal = d030Var.L1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                d030 d030VarM = dm5.M(d030Var);
                if (d030VarM != null) {
                    return v(i, d030VarM);
                }
                hhg1.n("ActiveParent with no focused child");
                return 0;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    eg.o();
                    return 0;
                }
                if (!((pim0) d030Var).a.N0) {
                    qf80.c("visitAncestors called on an unattached node");
                }
                pim0 pim0Var2 = ((pim0) d030Var).a.e;
                hmb0 hmb0VarB = oap1.B(d030Var);
                loop0: while (true) {
                    pim0Var = null;
                    if (hmb0VarB == null) {
                        break;
                    }
                    if ((((pim0) hmb0VarB.e1.g).d & 1024) != 0) {
                        while (pim0Var2 != null) {
                            if ((pim0Var2.c & 1024) != 0) {
                                pim0 pim0VarS = pim0Var2;
                                bfn0 bfn0Var = null;
                                while (pim0VarS != null) {
                                    if (pim0VarS instanceof d030) {
                                        pim0Var = pim0VarS;
                                        break loop0;
                                    }
                                    if ((pim0VarS.c & 1024) != 0 && (pim0VarS instanceof l5t)) {
                                        int i2 = 0;
                                        for (pim0 pim0Var3 = ((l5t) pim0VarS).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                            if ((pim0Var3.c & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    pim0VarS = pim0Var3;
                                                } else {
                                                    if (bfn0Var == null) {
                                                        bfn0Var = new bfn0(0, new pim0[16]);
                                                    }
                                                    if (pim0VarS != null) {
                                                        bfn0Var.b(pim0VarS);
                                                        pim0VarS = null;
                                                    }
                                                    bfn0Var.b(pim0Var3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    pim0VarS = oap1.s(bfn0Var);
                                }
                            }
                            pim0Var2 = pim0Var2.e;
                        }
                    }
                    hmb0VarB = hmb0VarB.v();
                    pim0Var2 = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
                }
                d030 d030Var2 = (d030) pim0Var;
                if (d030Var2 != null) {
                    int iOrdinal2 = d030Var2.L1().ordinal();
                    if (iOrdinal2 == 0) {
                        return w(i, d030Var2);
                    }
                    if (iOrdinal2 == 1) {
                        return x(i, d030Var2);
                    }
                    if (iOrdinal2 == 2) {
                        return 2;
                    }
                    if (iOrdinal2 != 3) {
                        eg.o();
                        return 0;
                    }
                    int iX = x(i, d030Var2);
                    int i3 = iX != 1 ? iX : 0;
                    return i3 == 0 ? w(i, d030Var2) : i3;
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01bd A[PHI: r16
      0x01bd: PHI (r16v2 p.bfn0) = (r16v1 p.bfn0), (r16v1 p.bfn0), (r16v1 p.bfn0), (r16v4 p.bfn0) binds: [B:95:0x016c, B:97:0x0172, B:99:0x0176, B:116:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x025e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0265 A[ADDED_TO_REGION, LOOP:9: B:162:0x0265->B:169:0x0277, LOOP_START, PHI: r14
      0x0265: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:161:0x0263, B:169:0x0277] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x0267  */
    /* JADX WARN: Code duplicated, block: B:166:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x0274  */
    /* JADX WARN: Code duplicated, block: B:168:0x0276  */
    /* JADX WARN: Code duplicated, block: B:170:0x027d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0284  */
    /* JADX WARN: Code duplicated, block: B:177:0x028f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:214:0x0255 A[SYNTHETIC] */
    public static final boolean y(d030 d030Var) {
        bfn0 bfn0Var;
        byte b2;
        int i;
        d030 d030Var2;
        wz20 wz20Var;
        jdo0 jdo0Var;
        boolean z;
        jdo0 jdo0Var2;
        dz20 focusOwner = oap1.C(d030Var).getFocusOwner();
        d030 d030VarH = focusOwner.h();
        wz20 wz20VarL1 = d030Var.L1();
        if (d030VarH == d030Var) {
            d030Var.I1(wz20VarL1, wz20VarL1);
            return true;
        }
        if ((d030VarH == null || d030VarH.O0) && !d030Var.O0 && !oap1.C(d030Var).getFocusOwner().a.F()) {
            return false;
        }
        if (d030VarH != null) {
            bfn0Var = new bfn0(0, new d030[16]);
            if (!((pim0) d030VarH).a.N0) {
                qf80.c("visitAncestors called on an unattached node");
            }
            pim0 pim0Var = ((pim0) d030VarH).a.e;
            hmb0 hmb0VarB = oap1.B(d030VarH);
            while (hmb0VarB != null) {
                if ((((pim0) hmb0VarB.e1.g).d & 1024) != 0) {
                    while (pim0Var != null) {
                        if ((pim0Var.c & 1024) != 0) {
                            pim0 pim0VarS = pim0Var;
                            bfn0 bfn0Var2 = null;
                            while (pim0VarS != null) {
                                if (pim0VarS instanceof d030) {
                                    bfn0Var.b((d030) pim0VarS);
                                } else if ((pim0VarS.c & 1024) != 0 && (pim0VarS instanceof l5t)) {
                                    int i2 = 0;
                                    for (pim0 pim0Var2 = ((l5t) pim0VarS).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                        if ((pim0Var2.c & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                pim0VarS = pim0Var2;
                                            } else {
                                                if (bfn0Var2 == null) {
                                                    bfn0Var2 = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarS != null) {
                                                    bfn0Var2.b(pim0VarS);
                                                    pim0VarS = null;
                                                }
                                                bfn0Var2.b(pim0Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                pim0VarS = oap1.s(bfn0Var2);
                            }
                        }
                        pim0Var = pim0Var.e;
                    }
                }
                hmb0VarB = hmb0VarB.v();
                pim0Var = (hmb0VarB == null || (jdo0Var2 = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var2.f;
            }
        } else {
            bfn0Var = null;
        }
        Object[] objArr = new d030[16];
        Object[] objArr2 = new d030[16];
        if (!((pim0) d030Var).a.N0) {
            qf80.c("visitAncestors called on an unattached node");
        }
        pim0 pim0Var3 = ((pim0) d030Var).a.e;
        hmb0 hmb0VarB2 = oap1.B(d030Var);
        boolean z2 = true;
        int i3 = 0;
        int i4 = 0;
        while (hmb0VarB2 != null) {
            if ((((pim0) hmb0VarB2.e1.g).d & 1024) != 0) {
                while (pim0Var3 != null) {
                    if ((pim0Var3.c & 1024) != 0) {
                        pim0 pim0VarS2 = pim0Var3;
                        bfn0 bfn0Var3 = null;
                        while (pim0VarS2 != null) {
                            if (pim0VarS2 instanceof d030) {
                                d030 d030Var3 = (d030) pim0VarS2;
                                if (u890.j(bfn0Var != null ? Boolean.valueOf(bfn0Var.k(d030Var3)) : null, Boolean.TRUE)) {
                                    int i5 = i3 + 1;
                                    if (objArr.length < i5) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i5, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i3] = d030Var3;
                                    i3 = i5;
                                } else {
                                    focusOwner = focusOwner;
                                    int i6 = i4 + 1;
                                    if (objArr2.length < i6) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i6, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i4] = d030Var3;
                                    i4 = i6;
                                }
                                if (d030Var3 == d030VarH) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                focusOwner = focusOwner;
                                z = true;
                            }
                            if (z && (pim0VarS2.c & 1024) != 0 && (pim0VarS2 instanceof l5t)) {
                                int i7 = 0;
                                for (pim0 pim0Var4 = ((l5t) pim0VarS2).P0; pim0Var4 != null; pim0Var4 = pim0Var4.f) {
                                    if ((pim0Var4.c & 1024) != 0) {
                                        int i8 = i7 + 1;
                                        if (i8 == 1) {
                                            pim0VarS2 = pim0Var4;
                                            i8 = i8;
                                        } else {
                                            bfn0 bfn0Var4 = bfn0Var3 == null ? new bfn0(0, new pim0[16]) : bfn0Var3;
                                            if (pim0VarS2 != null) {
                                                bfn0Var4.b(pim0VarS2);
                                                pim0VarS2 = null;
                                            }
                                            bfn0Var4.b(pim0Var4);
                                            bfn0Var3 = bfn0Var4;
                                        }
                                        i7 = i8;
                                    }
                                }
                                if (i7 != 1) {
                                    pim0VarS2 = oap1.s(bfn0Var3);
                                }
                            } else {
                                pim0VarS2 = oap1.s(bfn0Var3);
                            }
                        }
                    }
                    pim0Var3 = pim0Var3.e;
                    focusOwner = focusOwner;
                }
            }
            dz20 dz20Var = focusOwner;
            hmb0VarB2 = hmb0VarB2.v();
            pim0Var3 = (hmb0VarB2 == null || (jdo0Var = hmb0VarB2.e1) == null) ? null : (gpd1) jdo0Var.f;
            focusOwner = dz20Var;
        }
        dz20 dz20Var2 = focusOwner;
        if (!z2 || d030VarH == null) {
            b2 = 0;
        } else {
            b2 = 0;
            if (!z(d030VarH, false)) {
                return false;
            }
        }
        p9p1.z(d030Var, new g030(d030Var, b2));
        int iOrdinal = d030Var.L1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                oap1.C(d030Var).getFocusOwner().k(d030Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    eg.o();
                    return false;
                }
                oap1.C(d030Var).getFocusOwner().k(d030Var);
            }
        }
        wz20 wz20Var2 = wz20.c;
        wz20 wz20Var3 = wz20.a;
        if (z2 && d030VarH != null) {
            d030VarH.I1(wz20Var3, wz20Var2);
        }
        wz20 wz20Var4 = wz20.b;
        if (bfn0Var != null) {
            int i9 = bfn0Var.c - 1;
            Object[] objArr5 = bfn0Var.a;
            if (i9 < objArr5.length) {
                while (i9 >= 0) {
                    d030 d030Var4 = (d030) objArr5[i9];
                    if (dz20Var2.h() == d030Var) {
                        d030Var4.I1(wz20Var4, wz20Var2);
                        i9--;
                    }
                }
                i = i4 - 1;
                if (i < objArr2.length) {
                    while (i >= 0) {
                        d030Var2 = (d030) objArr2[i];
                        if (dz20Var2.h() == d030Var) {
                            if (d030Var2 == d030VarH) {
                                wz20Var = wz20Var3;
                            } else {
                                wz20Var = wz20Var2;
                            }
                            d030Var2.I1(wz20Var, wz20Var4);
                            i--;
                        }
                    }
                    if (dz20Var2.h() == d030Var) {
                        d030Var.I1(wz20VarL1, wz20Var3);
                        if (dz20Var2.h() != d030Var) {
                            return true;
                        }
                    }
                } else if (dz20Var2.h() == d030Var) {
                    d030Var.I1(wz20VarL1, wz20Var3);
                    if (dz20Var2.h() != d030Var) {
                        return true;
                    }
                }
            } else {
                i = i4 - 1;
                if (i < objArr2.length) {
                    while (i >= 0) {
                        d030Var2 = (d030) objArr2[i];
                        if (dz20Var2.h() == d030Var) {
                            if (d030Var2 == d030VarH) {
                                wz20Var = wz20Var3;
                            } else {
                                wz20Var = wz20Var2;
                            }
                            d030Var2.I1(wz20Var, wz20Var4);
                            i--;
                        }
                    }
                    if (dz20Var2.h() == d030Var) {
                        d030Var.I1(wz20VarL1, wz20Var3);
                        if (dz20Var2.h() != d030Var) {
                            return true;
                        }
                    }
                } else if (dz20Var2.h() == d030Var) {
                    d030Var.I1(wz20VarL1, wz20Var3);
                    if (dz20Var2.h() != d030Var) {
                        return true;
                    }
                }
            }
        } else {
            i = i4 - 1;
            if (i < objArr2.length) {
                while (i >= 0) {
                    d030Var2 = (d030) objArr2[i];
                    if (dz20Var2.h() == d030Var) {
                        if (d030Var2 == d030VarH) {
                            wz20Var = wz20Var3;
                        } else {
                            wz20Var = wz20Var2;
                        }
                        d030Var2.I1(wz20Var, wz20Var4);
                        i--;
                    }
                }
                if (dz20Var2.h() == d030Var) {
                    d030Var.I1(wz20VarL1, wz20Var3);
                    if (dz20Var2.h() != d030Var) {
                        return true;
                    }
                }
            } else if (dz20Var2.h() == d030Var) {
                d030Var.I1(wz20VarL1, wz20Var3);
                if (dz20Var2.h() != d030Var) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean z(d030 d030Var, boolean z) {
        int iOrdinal = d030Var.L1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                d030 d030VarM = dm5.M(d030Var);
                if (!(d030VarM != null ? z(d030VarM, z) : true)) {
                    return false;
                }
                d030Var.I1(wz20.b, wz20.c);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                eg.o();
                return false;
            }
        }
        return true;
    }
}
