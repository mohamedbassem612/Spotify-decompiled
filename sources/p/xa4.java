package p;

import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.view.ViewParent;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class xa4 {
    public static final z9 a = new z9((byte) 9);
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static b180 c;
    public static b180 d;

    public static c380 A(String str, lpu lpuVar, c380 c380Var) {
        if (!lpuVar.a) {
            return s(3, c380Var);
        }
        dp20 dp20Var = new dp20(new iys0((hux) null, 0L, u7h.k, str, (String) null, false, !lpuVar.b, true, (String) null, 1255), "dj");
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (!((zs80) obj).a.equalsIgnoreCase("dj")) {
                arrayList.add(obj);
            }
        }
        return mqo1.A(o7h.N0(s(2, arrayList), Collections.singletonList(dp20Var)));
    }

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1915040947);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).n;
            long jA = cbx.a(x340Var).a.b.a();
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0Var3 = nim0.a;
            uwo1.e(str, uyn1.y(dug.f(qim0Var3, jA, cr31VarB), 4.0f, 2.0f), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2040);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 20);
        }
    }

    public static final void b(String str, String str2, boolean z, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-806545775);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.h(z) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar3.i(gbxVar) ? SemanticState.Modal : SemanticState.ReadOnly) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (str2 == null) {
                b0kVar3.i0(-1757899056);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(-1757899055);
                j2iVarR = apo.r(-2040367551, new p3(str2, (byte) 27), b0kVar3);
                b0kVar3.r(false);
            }
            j2i j2iVar = j2iVarR;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), (uvx) null, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, (xu30) null, (xu30) null, j2iVar, apo.r(-430819656, new aw1((byte) 7, z), b0kVar3), (xu30) null, (xu30) null, apo.r(277689813, new p3(str, (byte) 28), b0kVar3), b0kVar2, (i2 << 9) & 3670016, 196992, 26558);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oa9(str, str2, z, gbxVar, qim0Var2, i, (byte) 1);
        }
    }

    public static final void c(jat jatVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        qim0 qim0Var4;
        qim0 qim0VarK;
        m4c m4cVar = fkj0.X;
        String str = jatVar.b;
        int i3 = jatVar.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(125608527);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(jatVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        boolean z = false;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            d36 d36Var = new d36(8.0f, true, new um5(z));
            fra fraVar = een.N0;
            x340Var.i0(450734921);
            x340Var.i0(450725627);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var5, jA, cr31VarB);
            if (jatVar.g) {
                qim0VarF = qim0VarF.then(d1u.E(1.0f, cbx.a(x340Var).c.c, qim0Var5, er31.b(8.0f)));
            }
            x340Var.r(false);
            qim0 qim0VarF2 = u291.f(uyn1.x(qim0VarF, 16.0f), 1.0f);
            if (i3 != 2) {
                boolean z2 = ((i4 & 14) == 4) | ((i4 & 896) == 256);
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new f2t(iu30Var, jatVar, (byte) 6);
                    x340Var.s0(objT);
                }
                qim0Var3 = qim0Var5;
                qim0VarF2 = qim0VarF2.then(bin.x(qim0Var5, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15));
            } else {
                qim0Var3 = qim0Var5;
            }
            x340Var.r(false);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
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
            qim0 qim0Var6 = qim0Var3;
            uwo1.e(jatVar.a, i3 == 2 ? d9y0.k(qim0Var3, 0.3f) : qim0Var3, cbx.d(x340Var).d, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            if (str.length() > 0) {
                x340Var.i0(69032440);
                a(0, str, x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(69062231);
                x340Var.r(false);
            }
            kk0.s(1.0f, true, x340Var);
            String str2 = jatVar.c;
            lee1 lee1Var = cbx.d(x340Var).j;
            if (i3 == 2) {
                qim0Var4 = qim0Var6;
                qim0VarK = d9y0.k(qim0Var4, 0.3f);
            } else {
                qim0Var4 = qim0Var6;
                qim0VarK = qim0Var4;
            }
            uwo1.e(str2, qim0VarK, lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(jatVar, qim0Var2, iu30Var, i, (byte) 2);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1951145362);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            cnx cnxVar = cnx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131964192));
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0Var = nim0.a;
            w0h1.a(cnxVar, jslVar, u291.r(qim0Var, 16.0f), cbx.a(x340Var).b.d, 0L, false, x340Var, cnx.d, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 11);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(267220873);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            nyx.a(2, (wux) null, apo.r(1367003804, new ie1(function0, z), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj8(z, function0, qim0Var2, i, (byte) 9);
        }
    }

    public static final void f(c380 c380Var, xtb0 xtb0Var, pre1 pre1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1780015679);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(xtb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(pre1Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        boolean z = false;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarN = anm1.N("timeline_list", qim0Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarN);
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, cbx.b(b0kVar3).b.b, 7);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            d36 d36Var = new d36(16.0f, true, new um5(z));
            boolean zI = b0kVar3.i(c380Var) | b0kVar3.i(pre1Var) | ((i2 & 7168) == 2048);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new rsc1(c380Var, pre1Var, iu30Var, (byte) 9);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarZ, xtb0Var, zzq0VarJ, false, d36Var, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, b0kVar2, i2 & ContentType.LONG_FORM_ON_DEMAND, 488);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71((byte) 10, i, c380Var, xtb0Var, pre1Var, iu30Var, qim0Var);
        }
    }

    public static final void g(c380 c380Var, xtb0 xtb0Var, pre1 pre1Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var3 = iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1774977572);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xtb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(pre1Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var3) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = v8r.q("");
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG = x340Var.g(c380Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                objT2 = yv91.a(new o8e1(xtb0Var, iu30Var, ven0Var, (byte) 3));
                x340Var.s0(objT2);
            }
            tob1 tob1Var = (tob1) objT2;
            boolean zG2 = x340Var.g(c380Var);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == obj) {
                objT3 = Boolean.valueOf(o7h.C0(c380Var) instanceof rae0);
                x340Var.s0(objT3);
            }
            boolean zBooleanValue = ((Boolean) objT3).booleanValue();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            int i4 = i3 >> 3;
            f(c380Var, xtb0Var, pre1Var, iu30Var3, u291.d(nim0Var, 1.0f), x340Var, (i3 & 1022) | (i4 & 7168));
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            String str = (String) tob1Var.getValue();
            mta mtaVar = cbx.b(x340Var).d;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            float fM0 = 48.0f;
            if (str.length() == 0) {
                x340Var.i0(1645026597);
            } else {
                x340Var.i0(1645059209);
                fM0 = 48.0f + ((wat) x340Var.k(t4k.h)).M0((int) (yae1.a(yae1VarQ, str, lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32)) + 24.0f + 8.0f;
            }
            x340Var.r(false);
            float f = fM0;
            qim0 qim0VarN = anm1.N("fast_scroller", h2c.a.a(nim0Var, een.i));
            boolean z = !zBooleanValue;
            j2i j2iVarR = apo.r(-1084981154, new lpk(tob1Var, (byte) 8), x340Var);
            int i5 = 57344 & i3;
            boolean z2 = i5 == 16384;
            Object objT4 = x340Var.T();
            if (z2 || objT4 == obj) {
                objT4 = new pwc1(iu30Var3, (byte) 17);
                x340Var.s0(objT4);
            }
            iro1.c(xtb0Var, qim0VarN, z, 0.0f, f, 0, 0L, 0, j2iVarR, (Function0) objT4, x340Var, (i4 & 14) | 805306368);
            x340Var.r(true);
            boolean zI = x340Var.i(xtb0Var) | (i5 == 16384);
            Object objT5 = x340Var.T();
            if (zI || objT5 == obj) {
                iu30Var3 = iu30Var2;
                objT5 = new mqv(xtb0Var, iu30Var3, (lnm) null, (byte) 4);
                x340Var.s0(objT5);
            } else {
                iu30Var3 = iu30Var2;
            }
            qxd0.t(xtb0Var, x340Var, (vu30) objT5);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71((byte) 11, i, c380Var, xtb0Var, pre1Var, iu30Var, iu30Var3);
        }
    }

    public static final void h(tse1 tse1Var, pre1 pre1Var, iu30 iu30Var, b0k b0kVar, int i) {
        ArrayList arrayList = tse1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1113522884);
        int i2 = (x340Var.i(tse1Var) ? 4 : 2) | i | (x340Var.i(pre1Var) ? 32 : 16) | (x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            String strO0 = cwl1.o0(x340Var, 2131960809);
            boolean zG = x340Var.g(arrayList) | x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new cmd1(tse1Var, strO0, (byte) 15);
                x340Var.s0(objT);
            }
            g(mqo1.A(arrayList), xtb0VarA, pre1Var, (iu30) objT, iu30Var, x340Var, ((i2 << 3) & 896) | ((i2 << 6) & 57344));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(tse1Var, pre1Var, iu30Var, i, (byte) 11);
        }
    }

    public static final int i(byte[] bArr) {
        byte b2;
        int i;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if (b3 != 10 && b3 != 13) {
                    if (b3 >= 0 && b3 < 32) {
                        return -1;
                    }
                    if (127 <= b3 && b3 < 160) {
                        return -1;
                    }
                }
                if (b3 == 65533) {
                    return -1;
                }
                i3 += b3 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 >= length || (b2 = bArr[i2]) < 0) {
                        break;
                    }
                    i2++;
                    i5 = i4 + 1;
                    if (i4 == 64) {
                        return i3;
                    }
                    if (b2 != 10 && b2 != 13) {
                        if (b2 >= 0 && b2 < 32) {
                            return -1;
                        }
                        if (127 <= b2 && b2 < 160) {
                            return -1;
                        }
                    }
                    if (b2 == 65533) {
                        return -1;
                    }
                    i3 += b2 < 65536 ? 1 : 2;
                }
            } else if ((b3 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length <= i6) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                byte b4 = bArr[i6];
                if ((b4 & 192) != 128) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                int i7 = (b3 << 6) ^ (b4 ^ 3968);
                if (i7 < 128) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                int i8 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if (i7 != 10 && i7 != 13) {
                    if (i7 >= 0 && i7 < 32) {
                        return -1;
                    }
                    if (127 <= i7 && i7 < 160) {
                        return -1;
                    }
                }
                if (i7 == 65533) {
                    return -1;
                }
                i3 += i7 < 65536 ? 1 : 2;
                i2 += 2;
                i4 = i8;
            } else if ((b3 >> 4) == -2) {
                int i9 = i2 + 2;
                if (length <= i9) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                byte b5 = bArr[i2 + 1];
                if ((b5 & 192) != 128) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                byte b6 = bArr[i9];
                if ((b6 & 192) != 128) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                int i10 = (b3 << 12) ^ ((b6 ^ (-123008)) ^ (b5 << 6));
                if (i10 < 2048) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i10 && i10 < 57344) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                i = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if (i10 != 10 && i10 != 13) {
                    if (i10 >= 0 && i10 < 32) {
                        return -1;
                    }
                    if (127 <= i10 && i10 < 160) {
                        return -1;
                    }
                }
                if (i10 == 65533) {
                    return -1;
                }
                i3 += i10 < 65536 ? 1 : 2;
                i2 += 3;
                i4 = i;
            } else {
                if ((b3 >> 3) != -2) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                int i11 = i2 + 3;
                if (length <= i11) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                byte b7 = bArr[i2 + 1];
                if ((b7 & 192) != 128) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                byte b8 = bArr[i2 + 2];
                if ((b8 & 192) != 128) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                byte b9 = bArr[i11];
                if ((b9 & 192) != 128) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                int i12 = (b3 << 18) ^ (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12));
                if (i12 > 1114111) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i12 && i12 < 57344) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                if (i12 < 65536) {
                    if (i4 == 64) {
                        break;
                    }
                    return -1;
                }
                i = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if (i12 != 10 && i12 != 13) {
                    if (i12 >= 0 && i12 < 32) {
                        return -1;
                    }
                    if (127 <= i12 && i12 < 160) {
                        return -1;
                    }
                }
                if (i12 == 65533) {
                    return -1;
                }
                i3 += i12 < 65536 ? 1 : 2;
                i2 += 4;
                i4 = i;
            }
        }
        return i3;
    }

    public static final boolean j(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        bhn0.i("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void m(long j, String str) {
        if (j >= 0) {
            return;
        }
        hhg1.n(str);
    }

    public static final void n(rhc rhcVar, nac nacVar, int i) {
        nacVar.write(rhcVar.a, 0, i);
    }

    public static final String o(List list) {
        StringBuilder sb = new StringBuilder(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            sb.append((String) list.get(i));
            i++;
            if (i < list.size()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static final float p(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final bby q() {
        return xay.e(2, irn1.o0(ContentFeedType.OTHER, 0, (dlv) null, 6));
    }

    public static final ln00 r() {
        return xay.f(2, irn1.o0(ContentFeedType.OTHER, 0, (dlv) null, 6));
    }

    public static final c380 s(int i, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zs80 zs80Var = (zs80) it.next();
            iys0 iys0Var = (iys0) o7h.s0(zs80Var.c);
            dp20 dp20Var = iys0Var != null ? new dp20(iys0Var, zs80Var.a) : null;
            if (dp20Var != null) {
                arrayList.add(dp20Var);
            }
        }
        return mqo1.A(o7h.d1(arrayList, i));
    }

    public static lik1 t() {
        return bc2.b;
    }

    public static sk30 u(il00 il00Var, SQLiteDatabase sQLiteDatabase) {
        sk30 sk30Var = (sk30) il00Var.b;
        if (sk30Var != null && sk30Var.a.equals(sQLiteDatabase)) {
            return sk30Var;
        }
        sk30 sk30Var2 = new sk30(sQLiteDatabase);
        il00Var.b = sk30Var2;
        return sk30Var2;
    }

    public static boolean v(double d2, int i, int i2) {
        return d2 >= ((double) i) && d2 < ((double) i2);
    }

    public static tdl0 w() {
        return new tdl0((byte) 25);
    }

    public static final void x(float[] fArr, float[] fArr2) {
        float fP = p(0, 0, fArr2, fArr);
        float fP2 = p(0, 1, fArr2, fArr);
        float fP3 = p(0, 2, fArr2, fArr);
        float fP4 = p(0, 3, fArr2, fArr);
        float fP5 = p(1, 0, fArr2, fArr);
        float fP6 = p(1, 1, fArr2, fArr);
        float fP7 = p(1, 2, fArr2, fArr);
        float fP8 = p(1, 3, fArr2, fArr);
        float fP9 = p(2, 0, fArr2, fArr);
        float fP10 = p(2, 1, fArr2, fArr);
        float fP11 = p(2, 2, fArr2, fArr);
        float fP12 = p(2, 3, fArr2, fArr);
        float fP13 = p(3, 0, fArr2, fArr);
        float fP14 = p(3, 1, fArr2, fArr);
        float fP15 = p(3, 2, fArr2, fArr);
        float fP16 = p(3, 3, fArr2, fArr);
        fArr[0] = fP;
        fArr[1] = fP2;
        fArr[2] = fP3;
        fArr[3] = fP4;
        fArr[4] = fP5;
        fArr[5] = fP6;
        fArr[6] = fP7;
        fArr[7] = fP8;
        fArr[8] = fP9;
        fArr[9] = fP10;
        fArr[10] = fP11;
        fArr[11] = fP12;
        fArr[12] = fP13;
        fArr[13] = fP14;
        fArr[14] = fP15;
        fArr[15] = fP16;
    }

    public static final void y(float[] fArr, float f, float f2, float[] fArr2) {
        kch0.e(fArr2);
        kch0.k(f, f2, fArr2);
        x(fArr, fArr2);
    }

    public static final max z(yo2 yo2Var, Function0 function0, x340 x340Var) {
        m4c m4cVar = fkj0.X;
        x8c0 lifecycle = ((iac0) x340Var.k(jfe0.a)).getLifecycle();
        boolean zG = x340Var.g(yo2Var);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = rqt0.u(new uji1(((fq2) yo2Var).s, (byte) 6));
            x340Var.s0(objT);
        }
        ven0 ven0VarG = rwq.g((mr20) objT, Boolean.FALSE, (o8n) null, x340Var, 48, 2);
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = false;
            x340Var.s0(objT2);
        }
        Object obj = objT2;
        Boolean bool = (Boolean) ven0VarG.getValue();
        bool.getClass();
        boolean zI = x340Var.i(lifecycle) | x340Var.g(function0);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new vxg1(lifecycle, function0, (lnm) null, (byte) 23);
            x340Var.s0(objT3);
        }
        if (!((Boolean) yto.o(obj, lifecycle, bool, (vu30) objT3, x340Var, 6).getValue()).booleanValue()) {
            x340Var.i0(338678713);
            x340Var.r(false);
            return jax.a;
        }
        x340Var.i0(338550745);
        hax haxVar = new hax(cwl1.o0(x340Var, 2131956735));
        x340Var.r(false);
        return haxVar;
    }
}
