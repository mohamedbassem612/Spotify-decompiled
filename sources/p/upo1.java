package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.concertcampaignview.v1.CtaType;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class upo1 {
    public static final pl10 a;
    public static final pl10[] b;
    public static b180 c;

    static {
        pl10 pl10Var = new pl10("moduleinstall", 7L);
        a = pl10Var;
        b = new pl10[]{pl10Var};
    }

    public static final boolean A(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1772545495);
        boolean zB = xoi1.b((Context) x340Var.k(AndroidCompositionLocals_androidKt.b));
        af afVarA = ef.c(x340Var).a();
        boolean z = true;
        if (zB) {
            x340Var.i0(720687737);
            switch (afVarA.ordinal()) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    z = false;
                    break;
            }
            x340Var.r(false);
        } else {
            x340Var.i0(720331733);
            boolean z2 = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            int iOrdinal = afVarA.ordinal();
            z = (iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 8) && !z2;
            x340Var.r(false);
        }
        x340Var.r(false);
        return z;
    }

    public static final boolean B(hwt hwtVar) {
        if (hwtVar != null) {
            return (!hwtVar.d || hwtVar.e || hwtVar.a) ? false : true;
        }
        return true;
    }

    public static final long C(boolean z, b0k b0kVar) {
        long j;
        x340 x340Var = (x340) b0kVar;
        if (z) {
            x340Var.i0(1413731289);
            uwr uwrVar = cbx.a;
            j = cbx.a(x340Var).b.c;
        } else {
            x340Var.i0(1413732529);
            uwr uwrVar2 = cbx.a;
            j = cbx.a(x340Var).b.a;
        }
        x340Var.r(false);
        return j;
    }

    public static final br00 D(nbw0 nbw0Var) {
        aj90 aj90Var = nbw0Var.o;
        int i = aj90Var.a;
        int iC = l1d.C(aj90Var.b);
        int i2 = 1;
        if (iC != 0 && iC != 1) {
            i2 = 2;
            if (iC != 2) {
                i2 = 3;
                if (iC != 3) {
                    i2 = 4;
                    if (iC != 4) {
                        eg.o();
                        return null;
                    }
                }
            }
        }
        return new br00(i, i2, (l1d) null);
    }

    public static final enc E(mey0 mey0Var, hob1 hob1Var, tqw tqwVar, boolean z, Long l, boolean z2) {
        String str;
        String str2;
        String str3 = mey0Var.d;
        String str4 = mey0Var.f;
        String str5 = hob1Var.L;
        if (str5 != null || hob1Var.N) {
            if (str5 == null) {
                str = str4 == null ? str3 : str4;
            } else {
                str = str5;
            }
            return new enc(str, hob1Var.c, hob1Var.b, tqwVar != null ? n3o1.y(tqwVar) : null, z, z2, l, hob1Var.N);
        }
        String str6 = hob1Var.M;
        if (str6 == null) {
            str2 = str4 == null ? str3 : str4;
        } else {
            str2 = str6;
        }
        return new enc(str2, mey0Var.c, tqwVar != null ? n3o1.y(tqwVar) : null, z, z2, l, 132);
    }

    public static final k4m F(int i) {
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC == 1) {
                return k4m.b;
            }
            if (iC == 2) {
                return k4m.a;
            }
            if (iC != 3) {
                eg.o();
                return null;
            }
        }
        return k4m.d;
    }

    public static er00 G(q8i0 q8i0Var, nbw0 nbw0Var, yo60 yo60Var, xkk1 xkk1Var, String str, r4p1 r4p1Var, hwt hwtVar, boolean z, int i) {
        String str2;
        xkk1 xkk1Var2 = (i & 4) != 0 ? null : xkk1Var;
        boolean z2 = (i & 64) != 0;
        boolean z3 = (i & 128) != 0 ? false : z;
        int i2 = yo60Var.i;
        if (q8i0Var.equals(l8i0.a)) {
            String strL = o2p1.l(xkk1Var2, nbw0Var.g);
            String str3 = nbw0Var.c;
            br00 br00VarD = D(nbw0Var);
            String str4 = nbw0Var.b;
            String str5 = nbw0Var.d;
            Set set = s4b1.f;
            return new cr00(F(i2), hwtVar == null || (hwtVar.d && !hwtVar.e), new ar00(str3, str, br00VarD, str4, !uic.h(str5, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6})), strL, r4p1Var);
        }
        if (!q8i0Var.equals(m8i0.a)) {
            eg.o();
            return null;
        }
        String str6 = "";
        if (!z3 && (str2 = yo60Var.e) != null) {
            str6 = str2;
        }
        return new dr00(z2, F(i2), B(hwtVar), o2p1.k(xkk1Var2, vp70.d, str6));
    }

    public static final odi0 H(ndi0 ndi0Var, sdi0 sdi0Var, vun vunVar) {
        qdi0 pdi0Var;
        String str = ndi0Var.l;
        String str2 = ndi0Var.i;
        String str3 = ndi0Var.g;
        String str4 = ndi0Var.a;
        x360 x360Var = ndi0Var.b;
        hwt hwtVar = sdi0Var != null ? sdi0Var.a : null;
        String str5 = ndi0Var.e;
        if (ihc1.y0(str3) || hwtVar == null || !hwtVar.d) {
            pdi0Var = !ihc1.y0(str5) ? new pdi0(str5, str) : null;
        } else {
            pdi0Var = new qdi0(str3, str, str5);
        }
        String str6 = ndi0Var.f;
        hdi0 gdi0Var = null;
        String str7 = ndi0Var.j;
        hwt hwtVar2 = sdi0Var != null ? sdi0Var.a : null;
        String str8 = ndi0Var.k;
        if (!ihc1.y0(str2)) {
            gdi0Var = new hdi0(str2, hwtVar2 != null && hwtVar2.d);
        } else if (!ihc1.y0(str8)) {
            gdi0Var = new gdi0(str8);
        }
        return new odi0(str4, x360Var, str6, str, str, pdi0Var, str7, gdi0Var, new wcm(ndi0Var.c, (String) null, (String) null, tcm.a, (Function0) null, z7i0.f, false, (String) null, (String) null, 982), ((vd4) vunVar.b).a());
    }

    public static final float I(boolean z) {
        return (yoi1.p(250, 100, CtaType.BUY_TICKETS_FIELD_NUMBER) / 100.0f) - (z ? 1.0f : 0.0f);
    }

    public static String J(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strP;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strP = "null";
            } else {
                try {
                    strP = obj.toString();
                } catch (Exception e) {
                    String strF = f4i1.f(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strF), (Throwable) e);
                    strP = cy30.p("<", strF, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strP;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean K(String str) {
        return str == null || str.isEmpty();
    }

    public static final void a(long j, long j2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(56856700);
        int i2 = i | (x340Var.e(2131963225) ? 4 : 2) | (x340Var.e(2131232673) ? 32 : 16) | (x340Var.d(8.0f) ? 256 : 128) | (x340Var.d(3.0f) ? 2048 : 1024) | (x340Var.f(j) ? 16384 : 8192) | (x340Var.f(j2) ? 131072 : 65536) | (x340Var.i(qim0Var) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0VarF = dug.f(lrn1.x(eqr0.D(0.0f, 3.0f, 1, qim0Var), 1.0f), j, er31.d(8.0f, 8.0f, 0.0f, 0.0f, 12));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 4.0f, 4.0f, 6.0f, 4.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            jmr0 jmr0VarN = i3o1.n(2131232673, x340Var, (i2 >> 3) & 14);
            int i3 = (i2 >> 6) & 7168;
            nl70.c(jmr0VarN, (String) null, (qim0) null, j2, x340Var, 56 | i3, 4);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0.a, 2.0f));
            uwo1.e(cwl1.o0(x340Var, 2131963225), null, cbx.d(x340Var).n, j2, null, null, 2, false, new cjc0(1), 0, null, x340Var, i3, 0, 1714);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ts51(j, j2, qim0Var, i, (byte) 1);
        }
    }

    public static final void b(dtf dtfVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        boolean z;
        tkf tkfVar = dtfVar.a;
        List list = dtfVar.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1047224084);
        int i2 = i | (x340Var2.i(dtfVar) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            tkf tkfVar2 = (tkf) o7h.C0(list);
            String str = tkfVar2 != null ? tkfVar2.a : null;
            int size = list.size();
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new gob(iu30Var, (byte) 22);
                x340Var2.s0(objT2);
            }
            ioo1.b(xtb0VarA, str, size, (Function0) objT2, x340Var2, 0);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            if (tkfVar == null) {
                x340Var2.i0(-841516896);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-841516895);
                boolean zI = x340Var2.i(ven0Var) | x340Var2.i(tkfVar);
                Object objT3 = x340Var2.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new ame(tkfVar, ven0Var, (byte) 3);
                    x340Var2.s0(objT3);
                }
                yto1.m(tkfVar, (Function0) objT3, null, x340Var2, 0);
                x340Var2.r(false);
            }
            c380 c380VarA = mqo1.A(list);
            boolean z3 = tkfVar != null;
            boolean z4 = dtfVar.c;
            boolean zI2 = (i3 == 32) | x340Var2.i(ven0Var);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new t0f(iu30Var, ven0Var, (byte) 0);
                x340Var2.s0(objT4);
            }
            vu30 vu30Var = (vu30) objT4;
            boolean z5 = i3 == 32;
            Object objT5 = x340Var2.T();
            if (z5 || objT5 == m4cVar) {
                objT5 = new c5a(iu30Var, (byte) 16);
                x340Var2.s0(objT5);
            }
            d(c380VarA, z3, z4, xtb0VarA, vu30Var, (iu30) objT5, dtfVar.d, new wnb0(1.0f, true), x340Var2, 0);
            x340Var = x340Var2;
            x340Var.r(true);
            ydx0 ydx0Var = (ydx0) ven0Var.getValue();
            if (ydx0Var == null) {
                x340Var.i0(791177918);
                x340Var.r(false);
            } else {
                x340Var.i0(791177919);
                boolean z6 = i3 == 32;
                Object objT6 = x340Var.T();
                if (z6 || objT6 == m4cVar) {
                    z = true;
                    objT6 = new v5a(iu30Var, (lnm) null, (byte) 1);
                    x340Var.s0(objT6);
                } else {
                    z = true;
                }
                qxd0.t(ydx0Var, x340Var, (vu30) objT6);
                String str2 = ydx0Var.a;
                String str3 = ydx0Var.b;
                if (i3 != 32) {
                    z = false;
                }
                boolean zI3 = x340Var.i(ven0Var) | z;
                Object objT7 = x340Var.T();
                if (zI3 || objT7 == m4cVar) {
                    objT7 = new wq9(iu30Var, ven0Var, (byte) 3);
                    x340Var.s0(objT7);
                }
                Function0 function0 = (Function0) objT7;
                boolean zI4 = x340Var.i(ven0Var);
                Object objT8 = x340Var.T();
                if (zI4 || objT8 == m4cVar) {
                    objT8 = new bp9(ven0Var, (byte) 22);
                    x340Var.s0(objT8);
                }
                qxy0.g(str2, str3, function0, (Function0) objT8, (qim0) null, x340Var, 0);
                x340Var = x340Var;
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(dtfVar, iu30Var, qim0Var2, i, (byte) 9);
        }
    }

    public static final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1269466963);
        if (x340Var.Y(i & 1, i != 0)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            rqo1.g(0, 0, x340Var, anm1.N("chat_message_divider", nim0Var));
            cvx cvxVar2 = cbx.b(x340Var).b;
            x0d.s(nim0Var, 16.0f, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 9, i, false);
        }
    }

    public static final void d(c380 c380Var, boolean z, boolean z2, xtb0 xtb0Var, vu30 vu30Var, iu30 iu30Var, int i, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        f36 d36Var;
        float f;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1339016800);
        int i3 = (b0kVar3.i(qim0Var) ? 8388608 : 4194304) | i2 | (b0kVar3.i(c380Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.h(z2) ? 256 : 128) | (b0kVar3.i(xtb0Var) ? 2048 : 1024) | (b0kVar3.i(vu30Var) ? 16384 : 8192) | (b0kVar3.i(iu30Var) ? 131072 : 65536) | (b0kVar3.e(i) ? 1048576 : 524288);
        if (b0kVar3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            if (z2) {
                b0kVar3.i0(1695056131);
                b0kVar3.r(false);
                d36Var = h36.c;
            } else {
                b0kVar3.i0(1695056969);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                d36Var = new d36(16.0f, true, new um5(false));
                b0kVar3.r(false);
            }
            float fM0 = ((wat) b0kVar3.k(t4k.h)).M0(i);
            if (z) {
                b0kVar3.i0(1695066568);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f = 8.0f;
            } else {
                b0kVar3.i0(1695067876);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f = 16.0f;
            }
            zzq0 zzq0VarJ = uyn1.j(0.0f, f, 0.0f, fM0, 5);
            qim0 qim0VarB = uyn1.B(u291.f(qim0Var, 1.0f), cbx.b(b0kVar3).e.b, 0.0f, 0.0f, 0.0f, 10);
            boolean zI = ((i3 & 896) == 256) | b0kVar3.i(c380Var) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                gh1 gh1Var = new gh1(z2, c380Var, vu30Var, iu30Var, (byte) 5);
                b0kVar3.s0(gh1Var);
                objT = gh1Var;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarB, xtb0Var, zzq0VarJ, false, d36Var, null, null, false, null, (iu30) objT, b0kVar2, (i3 >> 6) & 112, 488);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bw1(c380Var, z, z2, xtb0Var, vu30Var, iu30Var, i, qim0Var, i2);
        }
    }

    public static final void e(String str, long j, gbx gbxVar, boolean z, String str2, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        jax jaxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-688359919);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(gbxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            ogx ogxVar = ogx.e;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(8.0f);
            if (z) {
                b0kVar3.i0(-88901851);
                b0kVar3.r(false);
                jaxVar = jax.a;
            } else {
                b0kVar3.i0(-88900097);
                jax haxVar = new hax(cwl1.o0(b0kVar3, 2131960793));
                b0kVar3.r(false);
                jaxVar = haxVar;
            }
            b0kVar2 = b0kVar3;
            cwl1.b(qim0Var, (tl3) null, cr31VarB, ogxVar, zzq0Var, jaxVar, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-1115688248, new mg61(j2iVar, str2, str, j, (byte) 0), b0kVar3), b0kVar2, ((i2 >> 15) & 14) | ((i2 << 21) & 1879048192), 48, 1474);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ng61(str, j, gbxVar, z, str2, qim0Var, j2iVar, i, (byte) 0);
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-541997616);
        int i2 = i | 6 | (b0kVar3.i(function0) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            uvx uvxVar = new uvx(1, (pgx) null, 3, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
            String strO0 = cwl1.o0(b0kVar3, 2131952230);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f).then(qim0Var3), uvxVar, null, false, null, null, gbxVar, null, null, xgi.b, null, null, null, null, null, xgi.c, b0kVar2, 805306432, 196608, 32188);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var2, function0, i, (byte) 19);
        }
    }

    public static final void g(j001 j001Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1735862915);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(j001Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            String str = j001Var.c;
            xu30 xu30VarR = null;
            if (str == null || str.length() <= 0) {
                str = null;
            }
            List list = j001Var.e;
            if (list.contains(ell.d)) {
                i3 = 1;
            } else if (!list.contains(ell.b)) {
                i3 = 0;
            }
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = gkz0.Z0;
                x340Var.s0(objT);
            }
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("reaction_sheet_header_row", s161.b(qim0Var2, true, (iu30) objT));
            if (str == null && i3 == 0) {
                x340Var.i0(1687564841);
                x340Var.r(false);
            } else {
                x340Var.i0(1686802861);
                xu30VarR = apo.r(168951705, new qvh(i3, str, (byte) 4), x340Var);
                x340Var.r(false);
            }
            h(apo.r(1559718190, new k001(j001Var, (byte) 0), x340Var), apo.r(-1788082163, new k001(j001Var, (byte) 1), x340Var), xu30VarR, qim0VarN, x340Var, 54);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l001(j001Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void h(j2i j2iVar, j2i j2iVar2, xu30 xu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1417078012);
        if ((i & 384) == 0) {
            i2 = (b0kVar3.i(xu30Var) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (b0kVar3.i(qim0Var) ? 2048 : 1024);
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(uyn1.y(qim0Var, 16.0f, 8.0f), uvx.b((uvx) b0kVar3.k(vvx.a), 3, (tvx) null, (p3v) null, 27), null, false, null, null, null, null, null, j2iVar, null, xu30Var, null, null, null, j2iVar2, b0kVar2, 805306432, ((i3 >> 3) & 112) | 196608, 30204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new a8m(i, j2iVar, j2iVar2, xu30Var, qim0Var, (byte) 2);
        }
    }

    public static final void i(cp0 cp0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        cp0 cp0Var2;
        qim0 qim0Var2;
        boolean z;
        j2i j2iVarR;
        Object obj;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1917735229);
        j06 j06Var = x340Var2.a;
        int i2 = (i & 6) == 0 ? i | (x340Var2.g(cp0Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(u291.f(qim0Var3, 1.0f), k1o1.q(x340Var2), (g6o0) null);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarL);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarH = l6o1.H(qim0Var3, l6o1.C(0, 0, 1, x340Var2), false, 14);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarH);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            String str = cp0Var.a;
            Uri uri = str != null ? Uri.parse(str) : null;
            if (uri == null) {
                x340Var2.i0(-534732154);
                z = false;
                x340Var2.r(false);
                j2iVarR = null;
            } else {
                z = false;
                x340Var2.i0(-534732153);
                j2iVarR = apo.r(-268637001, new k0c0(uri, (byte) 0), x340Var2);
                x340Var2.r(false);
            }
            boolean z3 = z;
            tvx tvxVar = null;
            jto1.b(null, null, null, false, null, null, null, null, null, j2iVarR, null, dvi.a, null, null, null, dvi.b, x340Var2, 0, 196656, 30207);
            x340Var = x340Var2;
            rqo1.g(z3 ? 1 : 0, 1, x340Var, null);
            x340Var.r(true);
            qim0 qim0VarH2 = l6o1.H(u291.f(qim0Var3, 1.0f), l6o1.C(z3 ? 1 : 0, z3 ? 1 : 0, 1, x340Var), z3, 14);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarH2);
            WeakHashMap weakHashMap = osl1.x;
            int i4 = 32;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarZ);
            mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var, z3 ? 1 : 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarP);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            x340Var.i0(67518003);
            cp0Var2 = cp0Var;
            for (ap0 ap0Var : cp0Var2.b) {
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    obj = objT;
                    hyb0 hyb0Var = hyb0.g;
                    x340Var.s0(hyb0Var);
                    obj = hyb0Var;
                }
                obj = objT;
                qim0 qim0VarB = s161.b(qim0Var3, true, (iu30) obj);
                uvx uvxVarB = uvx.b((uvx) x340Var.k(vvx.a), 2, tvxVar, tvxVar, 27);
                boolean z4 = ((i3 & 112) == i4 ? true : z3 ? 1 : 0) | (x340Var.g(ap0Var) ? 1 : 0);
                Object objT2 = x340Var.T();
                if (z4 != 0 || objT2 == m4cVar) {
                    objT2 = new x680(iu30Var, ap0Var, (byte) 26);
                    x340Var.s0(objT2);
                }
                x340 x340Var3 = x340Var;
                jto1.b(qim0VarB, uvxVarB, null, false, null, null, new gbx(z50.c, (Function0) objT2), null, null, null, null, null, null, null, null, apo.r(108550331, new yy80(ap0Var, (byte) 26), x340Var), x340Var3, 64, 196608, 32700);
                x340Var = x340Var3;
                tvxVar = tvxVar;
                i4 = i4;
            }
            us71.m(x340Var, z3, true, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            cp0Var2 = cp0Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60((byte) 21, i, cp0Var2, qim0Var2, iu30Var);
        }
    }

    public static final void j(float f, int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1391546170);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && x340Var.d(f)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            float f2 = Float.NaN;
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                i3 &= -113;
                f = Float.NaN;
            }
            x340Var.s();
            if (!A(x340Var)) {
                f2 = 235.0f;
            } else if (!p3v.c(f, 0.0f)) {
                f2 = f;
            }
            w2g0.c(u291.i(qim0Var, 192.0f, f2), (tl3) null, j2iVar, x340Var, (i3 << 3) & 7168, 6);
        } else {
            x340Var.b0();
        }
        float f3 = f;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h57(qim0Var, f3, j2iVar, i, i2);
        }
    }

    public static final void k(j001 j001Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        l001 l001Var;
        boolean z = j001Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-213341653);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(j001Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0Var = nim0.a;
            if (!z && j001Var.b == null && j001Var.c == null && j001Var.d == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    l001Var = new l001(j001Var, qim0Var, i, (byte) 1);
                }
            } else {
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                if (z) {
                    x340Var.i0(-311538301);
                    o(null, x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-311502217);
                    g(j001Var, null, x340Var, i3 & 14);
                    x340Var.r(false);
                }
                rqo1.g(0, 1, x340Var, null);
                x340Var.r(true);
            }
            h311VarV.d = l001Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            l001Var = new l001(j001Var, qim0Var, i, (byte) 2);
            h311VarV.d = l001Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x0124  */
    /* JADX WARN: Code duplicated, block: B:105:0x0127  */
    /* JADX WARN: Code duplicated, block: B:108:0x0188  */
    /* JADX WARN: Code duplicated, block: B:110:0x0191  */
    /* JADX WARN: Code duplicated, block: B:111:0x0195  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:117:0x0210  */
    /* JADX WARN: Code duplicated, block: B:118:0x0214  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:123:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02de  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    public static final void l(String str, long j, gbx gbxVar, boolean z, boolean z2, qim0 qim0Var, boolean z3, String str2, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        String str3;
        qim0 qim0Var3;
        boolean z6;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        boolean z7;
        String str4;
        long j2;
        qim0 qim0Var6;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z8;
        n4k n4kVar;
        Object objT;
        String str5;
        int i9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-229566330);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(gbxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.h(z2) ? 16384 : 8192;
        }
        int i10 = i2 & 32;
        if (i10 == 0) {
            if ((196608 & i) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 131072 : 65536;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (x340Var.h(false)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            i5 = i2 & 128;
            if (i5 != 0) {
                i3 |= 12582912;
                z4 = z3;
            } else {
                z4 = z3;
                if ((i & 12582912) == 0) {
                    if (x340Var.h(z4)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i3 |= i6;
                }
            }
            i7 = i2 & 256;
            if (i7 != 0) {
                if ((i & 100663296) == 0) {
                    if (x340Var.g(str2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i3 |= i8;
                }
                if ((i & 805306368) == 0) {
                    if (x340Var.i(j2iVar)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i3 |= i9;
                }
                if ((i3 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (x340Var.Y(i3 & 1, z5)) {
                    qim0Var4 = nim0.a;
                    if (i10 != 0) {
                        qim0Var5 = qim0Var4;
                    } else {
                        qim0Var5 = qim0Var2;
                    }
                    if (i5 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i7 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var).f;
                    cua cuaVar2 = cbx.b(x340Var).f;
                    avw0 avw0Var = cbx.b(x340Var).c;
                    avw0 avw0Var2 = cbx.b(x340Var).c;
                    x340Var.i0(-1569888015);
                    x340Var.r(false);
                    j2 = u7h.j;
                    x340Var.i0(-1569884847);
                    x340Var.r(false);
                    x340Var.i0(-1569881999);
                    x340Var.r(false);
                    qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
                    qim0Var6 = qim0Var5;
                    mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarF);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z8 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z8) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var, lljVar3);
                    nko1.F(x340Var);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    x340Var.i0(933991155);
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ec61.N0;
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarA = s161.a(qim0Var4, (iu30) objT);
                    x340Var.r(false);
                    a(j2, j2, qim0VarA, x340Var, 0);
                    qim0 qim0VarThen = u291.f(uyn1.x(d1u.E(6.0f, j2, qim0Var4, er31.b(16.0f)), 6.0f), 1.0f).then(qim0Var4);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    if (z2) {
                        x340Var.i0(-1347031719);
                        str5 = str4;
                        e(str, j, gbxVar, z, str5, anm1.N("SessionModifierCompactContent", pqo.h(u291.f(qim0Var4, 1.0f), z7)), apo.r(-1655649229, new rv71(j2iVar, (byte) 24), x340Var), x340Var, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & (i3 >> 12)));
                        x340Var.r(false);
                    } else {
                        str5 = str4;
                        x340Var.i0(-1346670476);
                        m(str, j, gbxVar, z, str5, anm1.N("SessionModifierContent", pqo.h(u291.f(qim0Var4, 1.0f), z7)), apo.r(-2141379211, new rv71(j2iVar, (byte) 25), x340Var), x340Var, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & (i3 >> 12)));
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    x340Var.r(true);
                    z6 = z7;
                    str3 = str5;
                    qim0Var3 = qim0Var6;
                } else {
                    x340Var.b0();
                    str3 = str2;
                    qim0Var3 = qim0Var2;
                    z6 = z4;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new og61(str, j, gbxVar, z, z2, qim0Var3, z6, str3, j2iVar, i, i2);
                }
            }
            i3 |= 100663296;
            if ((i & 805306368) == 0) {
                if (x340Var.i(j2iVar)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            if ((i3 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var.Y(i3 & 1, z5)) {
                qim0Var4 = nim0.a;
                if (i10 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                if (i5 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i7 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                uwr uwrVar2 = cbx.a;
                cua cuaVar3 = cbx.b(x340Var).f;
                cua cuaVar4 = cbx.b(x340Var).f;
                avw0 avw0Var3 = cbx.b(x340Var).c;
                avw0 avw0Var4 = cbx.b(x340Var).c;
                x340Var.i0(-1569888015);
                x340Var.r(false);
                j2 = u7h.j;
                x340Var.i0(-1569884847);
                x340Var.r(false);
                x340Var.i0(-1569881999);
                x340Var.r(false);
                qim0 qim0VarF2 = u291.f(qim0Var5, 1.0f);
                qim0Var6 = qim0Var5;
                mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF2);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z8 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z8) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var, lljVar7);
                nko1.F(x340Var);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar8);
                x340Var.i0(933991155);
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ec61.N0;
                    x340Var.s0(objT);
                }
                qim0 qim0VarA2 = s161.a(qim0Var4, (iu30) objT);
                x340Var.r(false);
                a(j2, j2, qim0VarA2, x340Var, 0);
                qim0 qim0VarThen2 = u291.f(uyn1.x(d1u.E(6.0f, j2, qim0Var4, er31.b(16.0f)), 6.0f), 1.0f).then(qim0Var4);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarThen2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar5);
                nko1.H(xos0VarM3, x340Var, lljVar6);
                x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar8);
                if (z2) {
                    x340Var.i0(-1347031719);
                    str5 = str4;
                    e(str, j, gbxVar, z, str5, anm1.N("SessionModifierCompactContent", pqo.h(u291.f(qim0Var4, 1.0f), z7)), apo.r(-1655649229, new rv71(j2iVar, (byte) 24), x340Var), x340Var, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & (i3 >> 12)));
                    x340Var.r(false);
                } else {
                    str5 = str4;
                    x340Var.i0(-1346670476);
                    m(str, j, gbxVar, z, str5, anm1.N("SessionModifierContent", pqo.h(u291.f(qim0Var4, 1.0f), z7)), apo.r(-2141379211, new rv71(j2iVar, (byte) 25), x340Var), x340Var, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & (i3 >> 12)));
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(true);
                z6 = z7;
                str3 = str5;
                qim0Var3 = qim0Var6;
            } else {
                x340Var.b0();
                str3 = str2;
                qim0Var3 = qim0Var2;
                z6 = z4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new og61(str, j, gbxVar, z, z2, qim0Var3, z6, str3, j2iVar, i, i2);
            }
        }
        i3 |= 196608;
        qim0Var2 = qim0Var;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (x340Var.h(false)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 12582912;
            z4 = z3;
        } else {
            z4 = z3;
            if ((i & 12582912) == 0) {
                if (x340Var.h(z4)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            }
        }
        i7 = i2 & 256;
        if (i7 != 0) {
            if ((i & 100663296) == 0) {
                if (x340Var.g(str2)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i3 |= i8;
            }
            if ((i & 805306368) == 0) {
                if (x340Var.i(j2iVar)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            if ((i3 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var.Y(i3 & 1, z5)) {
                qim0Var4 = nim0.a;
                if (i10 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                if (i5 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i7 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                uwr uwrVar3 = cbx.a;
                cua cuaVar5 = cbx.b(x340Var).f;
                cua cuaVar6 = cbx.b(x340Var).f;
                avw0 avw0Var5 = cbx.b(x340Var).c;
                avw0 avw0Var6 = cbx.b(x340Var).c;
                x340Var.i0(-1569888015);
                x340Var.r(false);
                j2 = u7h.j;
                x340Var.i0(-1569884847);
                x340Var.r(false);
                x340Var.i0(-1569881999);
                x340Var.r(false);
                qim0 qim0VarF3 = u291.f(qim0Var5, 1.0f);
                qim0Var6 = qim0Var5;
                mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF3);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z8 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z8) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar9 = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar9);
                llj lljVar10 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                llj lljVar11 = y580.R0;
                nko1.H(numValueOf3, x340Var, lljVar11);
                nko1.F(x340Var);
                llj lljVar12 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar12);
                x340Var.i0(933991155);
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ec61.N0;
                    x340Var.s0(objT);
                }
                qim0 qim0VarA3 = s161.a(qim0Var4, (iu30) objT);
                x340Var.r(false);
                a(j2, j2, qim0VarA3, x340Var, 0);
                qim0 qim0VarThen3 = u291.f(uyn1.x(d1u.E(6.0f, j2, qim0Var4, er31.b(16.0f)), 6.0f), 1.0f).then(qim0Var4);
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarThen3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar9);
                nko1.H(xos0VarM4, x340Var, lljVar10);
                x0d.q(iHashCode4, x340Var, lljVar11, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar12);
                if (z2) {
                    x340Var.i0(-1347031719);
                    str5 = str4;
                    e(str, j, gbxVar, z, str5, anm1.N("SessionModifierCompactContent", pqo.h(u291.f(qim0Var4, 1.0f), z7)), apo.r(-1655649229, new rv71(j2iVar, (byte) 24), x340Var), x340Var, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & (i3 >> 12)));
                    x340Var.r(false);
                } else {
                    str5 = str4;
                    x340Var.i0(-1346670476);
                    m(str, j, gbxVar, z, str5, anm1.N("SessionModifierContent", pqo.h(u291.f(qim0Var4, 1.0f), z7)), apo.r(-2141379211, new rv71(j2iVar, (byte) 25), x340Var), x340Var, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & (i3 >> 12)));
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(true);
                z6 = z7;
                str3 = str5;
                qim0Var3 = qim0Var6;
            } else {
                x340Var.b0();
                str3 = str2;
                qim0Var3 = qim0Var2;
                z6 = z4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new og61(str, j, gbxVar, z, z2, qim0Var3, z6, str3, j2iVar, i, i2);
            }
        }
        i3 |= 100663296;
        if ((i & 805306368) == 0) {
            if (x340Var.i(j2iVar)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i3 |= i9;
        }
        if ((i3 & 306783379) != 306783378) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (x340Var.Y(i3 & 1, z5)) {
            qim0Var4 = nim0.a;
            if (i10 != 0) {
                qim0Var5 = qim0Var4;
            } else {
                qim0Var5 = qim0Var2;
            }
            if (i5 != 0) {
                z7 = false;
            } else {
                z7 = z4;
            }
            if (i7 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            uwr uwrVar4 = cbx.a;
            cua cuaVar7 = cbx.b(x340Var).f;
            cua cuaVar8 = cbx.b(x340Var).f;
            avw0 avw0Var7 = cbx.b(x340Var).c;
            avw0 avw0Var8 = cbx.b(x340Var).c;
            x340Var.i0(-1569888015);
            x340Var.r(false);
            j2 = u7h.j;
            x340Var.i0(-1569884847);
            x340Var.r(false);
            x340Var.i0(-1569881999);
            x340Var.r(false);
            qim0 qim0VarF4 = u291.f(qim0Var5, 1.0f);
            qim0Var6 = qim0Var5;
            mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarF4);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z8 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z8) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar13 = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar13);
            llj lljVar14 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar14);
            Integer numValueOf4 = Integer.valueOf(iHashCode);
            llj lljVar15 = y580.R0;
            nko1.H(numValueOf4, x340Var, lljVar15);
            nko1.F(x340Var);
            llj lljVar16 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar16);
            x340Var.i0(933991155);
            objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ec61.N0;
                x340Var.s0(objT);
            }
            qim0 qim0VarA4 = s161.a(qim0Var4, (iu30) objT);
            x340Var.r(false);
            a(j2, j2, qim0VarA4, x340Var, 0);
            qim0 qim0VarThen4 = u291.f(uyn1.x(d1u.E(6.0f, j2, qim0Var4, er31.b(16.0f)), 6.0f), 1.0f).then(qim0Var4);
            gfh0 gfh0VarC4 = t1c.c(een.d, false);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarThen4);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC4, x340Var, lljVar13);
            nko1.H(xos0VarM5, x340Var, lljVar14);
            x0d.q(iHashCode5, x340Var, lljVar15, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar16);
            if (z2) {
                x340Var.i0(-1347031719);
                str5 = str4;
                e(str, j, gbxVar, z, str5, anm1.N("SessionModifierCompactContent", pqo.h(u291.f(qim0Var4, 1.0f), z7)), apo.r(-1655649229, new rv71(j2iVar, (byte) 24), x340Var), x340Var, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & (i3 >> 12)));
                x340Var.r(false);
            } else {
                str5 = str4;
                x340Var.i0(-1346670476);
                m(str, j, gbxVar, z, str5, anm1.N("SessionModifierContent", pqo.h(u291.f(qim0Var4, 1.0f), z7)), apo.r(-2141379211, new rv71(j2iVar, (byte) 25), x340Var), x340Var, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & (i3 >> 12)));
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            z6 = z7;
            str3 = str5;
            qim0Var3 = qim0Var6;
        } else {
            x340Var.b0();
            str3 = str2;
            qim0Var3 = qim0Var2;
            z6 = z4;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new og61(str, j, gbxVar, z, z2, qim0Var3, z6, str3, j2iVar, i, i2);
        }
    }

    public static final void m(String str, long j, gbx gbxVar, boolean z, String str2, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        jax jaxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1271813782);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(gbxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            ogx ogxVar = ogx.e;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(8.0f);
            if (z) {
                b0kVar3.i0(1852651454);
                b0kVar3.r(false);
                jaxVar = jax.a;
            } else {
                b0kVar3.i0(1852653208);
                jax haxVar = new hax(cwl1.o0(b0kVar3, 2131960793));
                b0kVar3.r(false);
                jaxVar = haxVar;
            }
            b0kVar2 = b0kVar3;
            cwl1.b(qim0Var, (tl3) null, cr31VarB, ogxVar, zzq0Var, jaxVar, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-190382957, new mg61(j2iVar, str2, str, j, (byte) 1), b0kVar3), b0kVar2, ((i2 >> 15) & 14) | ((i2 << 21) & 1879048192), 48, 1474);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ng61(str, j, gbxVar, z, str2, qim0Var, j2iVar, i, (byte) 1);
        }
    }

    public static final void n(float f, int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-910516309);
        int i3 = (x340Var.i(qim0Var) ? 4 : 2) | i | (((i2 & 2) == 0 && x340Var.d(f)) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            } else if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            x340Var.s();
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0Var2 = qim0Var;
            t1c.a(cwl1.l0(dug.f(uyn1.B(qim0Var2, 0.0f, f2, 0.0f, 0.0f, 13), cbx.a(x340Var).a.b.a(), cr31VarB), 0L, cr31VarB, 13), x340Var, 0);
            f = f2;
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ewb(qim0Var2, f, i, i2);
        }
    }

    public static final void o(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(804707750);
        int i2 = i | 6;
        byte b2 = 10;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            float fY = y(cbx.d(x340Var).g, x340Var);
            float fY2 = y(cbx.d(x340Var).j, x340Var);
            qim0 qim0Var2 = nim0.a;
            h(apo.r(1926160411, new ac8(3, (byte) 25), x340Var), apo.r(-1403244068, new yy2((byte) 9, fY), x340Var), apo.r(-437681251, new yy2((byte) 10, fY2), x340Var), anm1.N("reaction_sheet_header_shimmer_row", qim0Var2), x340Var, 438);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, b2);
        }
    }

    public static final void p(List list, lzn0 lzn0Var, ryf ryfVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1542559536);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(list) : x340Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lzn0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ryfVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Activity activity = (Activity) x340Var.k(mce0.a);
            cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
            boolean zG = x340Var.g(activity) | x340Var.g(cir0Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new rwb(cir0Var, new ny51(activity, lzn0Var, ryfVar, (byte) 27));
                x340Var.s0(objT);
            }
            rwb rwbVar = (rwb) objT;
            boolean zG2 = x340Var.g(lzn0Var) | x340Var.g(ryfVar) | x340Var.g(activity) | x340Var.g(rwbVar);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new l8d1(lzn0Var, ryfVar, activity, rwbVar);
                x340Var.s0(objT2);
            }
            l8d1 l8d1Var = (l8d1) objT2;
            boolean zG3 = x340Var.g(l8d1Var);
            Object objT3 = x340Var.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = new veb0(l8d1Var);
                x340Var.s0(objT3);
            }
            veb0 veb0Var = (veb0) objT3;
            boolean zG4 = x340Var.g(l8d1Var);
            Object objT4 = x340Var.T();
            if (zG4 || objT4 == m4cVar) {
                objT4 = new vf91(l8d1Var);
                x340Var.s0(objT4);
            }
            vf91 vf91Var = (vf91) objT4;
            boolean zG5 = x340Var.g(l8d1Var);
            Object objT5 = x340Var.T();
            if (zG5 || objT5 == m4cVar) {
                objT5 = new d0z(l8d1Var);
                x340Var.s0(objT5);
            }
            d0z d0zVar = (d0z) objT5;
            boolean zG6 = x340Var.g(l8d1Var);
            Object objT6 = x340Var.T();
            if (zG6 || objT6 == m4cVar) {
                objT6 = new vnc1(l8d1Var);
                x340Var.s0(objT6);
            }
            vnc1 vnc1Var = (vnc1) objT6;
            boolean zG7 = x340Var.g(l8d1Var);
            Object objT7 = x340Var.T();
            if (zG7 || objT7 == m4cVar) {
                objT7 = new zja(l8d1Var);
                x340Var.s0(objT7);
            }
            zja zjaVar = (zja) objT7;
            boolean zG8 = x340Var.g(l8d1Var);
            Object objT8 = x340Var.T();
            if (zG8 || objT8 == m4cVar) {
                objT8 = new kb80(l8d1Var);
                x340Var.s0(objT8);
            }
            kb80 kb80Var = (kb80) objT8;
            boolean zG9 = x340Var.g(l8d1Var);
            Object objT9 = x340Var.T();
            if (zG9 || objT9 == m4cVar) {
                objT9 = new b5a(l8d1Var);
                x340Var.s0(objT9);
            }
            b5a b5aVar = (b5a) objT9;
            boolean zG10 = x340Var.g(l8d1Var);
            Object objT10 = x340Var.T();
            if (zG10 || objT10 == m4cVar) {
                objT10 = new g7t0(l8d1Var);
                x340Var.s0(objT10);
            }
            g7t0 g7t0Var = (g7t0) objT10;
            boolean zG11 = x340Var.g(l8d1Var);
            Object objT11 = x340Var.T();
            if (zG11 || objT11 == m4cVar) {
                objT11 = new e02(l8d1Var);
                x340Var.s0(objT11);
            }
            int i3 = i2;
            uj51 uj51Var = new uj51(list);
            j2i j2iVarR = apo.r(-1517675973, new e1c(zjaVar, veb0Var, vf91Var, vnc1Var, b5aVar, kb80Var, g7t0Var, (e02) objT11, d0zVar, (byte) 6), x340Var);
            boolean zI = x340Var.i(l8d1Var);
            Object objT12 = x340Var.T();
            if (zI || objT12 == m4cVar) {
                objT12 = new l5b1(l8d1Var, (byte) 26);
                x340Var.s0(objT12);
            }
            mgo1.f(uj51Var, j2iVarR, qim0Var, (iu30) objT12, x340Var, 48 | ((i3 >> 3) & 896));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, list, lzn0Var, ryfVar, qim0Var, (byte) 1);
        }
    }

    public static final void q(Function0 function0, iu30 iu30Var, w9i1 w9i1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(452477691);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(w9i1Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            two1.p(function0, qim0Var3, null, null, false, false, apo.r(-1776822297, new bvd1(w9i1Var, (ven0) objT, context, iu30Var, (byte) 19), x340Var), x340Var, (i2 & 14) | 1572912, 60);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, function0, iu30Var, w9i1Var, qim0Var2, (byte) 20);
        }
    }

    public static obw0 r(mey0 mey0Var, hob1 hob1Var, int i, r6h1 r6h1Var, int i2) {
        mmr0 mmr0Var;
        mmr0 mmr0Var2;
        int i3 = (i2 & 8) != 0 ? 2 : 5;
        String str = mey0Var.d;
        int i4 = i3;
        String str2 = mey0Var.c;
        boolean z = hob1Var.A;
        if (hob1Var.B) {
            mmr0Var2 = new mmr0(r6h1Var, 0);
        } else {
            if (z) {
                mmr0Var = new mmr0(r6h1Var, Integer.valueOf(i));
            } else {
                Integer numValueOf = Integer.valueOf(i);
                String str3 = mey0Var.b;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-preview-section";
                x6h1VarI.f = "3.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str3;
                x6h1VarI.c = numValueOf;
                x6h1VarI.e = null;
                x6h1VarI.d = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1VarA);
                mmr0Var = new mmr0(new r6h1(arrayList, r6h1Var.b), 0);
            }
            mmr0Var2 = mmr0Var;
        }
        r6h1 r6h1Var3 = (r6h1) mmr0Var2.a;
        int iIntValue = ((Number) mmr0Var2.b).intValue();
        if (hob1Var.h instanceof dr00) {
            return new dsj1(new rsk0(2, Integer.valueOf(iIntValue), str2, r6h1Var3, (byte) 2));
        }
        return new yz7(new rsk0(i4, Integer.valueOf(iIntValue), (i4 == 5 || (z && rwq.l(str2, str))) ? str : str2, r6h1Var3, (byte) 0));
    }

    public static final String s() {
        ZoneId m231Var;
        try {
            m231Var = ZoneId.systemDefault();
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) == null) {
            return m231Var.toString();
        }
        n57.e("Error while acquiring ZoneId.systemDefault(). Defaulting to America/New_York.");
        return "America/New_York";
    }

    public static w7h1 t(obw0 obw0Var, hob1 hob1Var, c700 c700Var, String str, int i) {
        if ((i & 4) != 0) {
            str = hob1Var.d;
        }
        return s110.k(obw0Var, hob1Var, c700Var, str, (i & 8) != 0);
    }

    public static final go80 u(klm klmVar, obp0 obp0Var, obp0 obp0Var2, obp0 obp0Var3, obp0 obp0Var4, obp0 obp0Var5, ibp0 ibp0Var) {
        return klmVar.a("AccessoryLoggerDaemon", new dy7(obp0Var, obp0Var2, obp0Var3, obp0Var4, obp0Var5, ibp0Var, (byte) 14));
    }

    public static final boolean v(t810 t810Var, String str) {
        Set set;
        ijo ijoVar = t810Var.d;
        return (ijoVar == null || (set = ijoVar.a) == null || !set.contains(str)) ? false : true;
    }

    public static final float w(b0k b0kVar, int i) {
        return ((wat) ((x340) b0kVar).k(t4k.h)).M0(i);
    }

    public static final sfx x(vfx vfxVar) {
        return new sfx(vfxVar, (byte) 3);
    }

    public static final float y(lee1 lee1Var, b0k b0kVar) {
        wat watVar = (wat) ((x340) b0kVar).k(t4k.h);
        long j = lee1Var.b.c;
        TextUnit textUnit = new TextUnit(j);
        if (!TextUnit.e(j)) {
            textUnit = null;
        }
        return watVar.y(textUnit != null ? textUnit.a : lee1Var.a.b);
    }

    public static final boolean z(x340 x340Var) {
        return (xoi1.b((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)) || (((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2)) ? false : true;
    }
}
