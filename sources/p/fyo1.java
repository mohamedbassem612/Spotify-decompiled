package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fyo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(vzq0 vzq0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-764260769);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vzq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarH = l6o1.H(dug.f(uyn1.w(qim0VarD, lnn1.n(vzq0Var, new zzq0(16.0f, 16.0f, 16.0f, 16.0f))), cbx.a(x340Var).a.c, d4o1.a), es41VarC, false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            String strO0 = cwl1.o0(x340Var, 2131953845);
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.a, 7);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = tzf.b;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0VarB, false, (iu30) objT), cbx.d(x340Var).e, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            uwo1.e(cwl1.o0(x340Var, 2131953842), uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.a, 7), cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            gfx.g(8, apo.r(1541548610, new sm(iu30Var, (byte) 17), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(vzq0Var, iu30Var, i, (byte) 25);
        }
    }

    public static final void b(qzf qzfVar, vzq0 vzq0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2062714887);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qzfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            a(vzq0Var, iu30Var, x340Var, (i2 >> 3) & 126);
            if (qzfVar.a) {
                x340Var.i0(-2052614288);
                boolean z = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new frf(iu30Var, (byte) 5);
                    x340Var.s0(objT);
                }
                q3p1.b(0, 1, (Function0) objT, x340Var, false);
                c(iu30Var, x340Var, (i2 >> 6) & 14);
                x340Var.r(false);
            } else {
                x340Var.i0(-2052480709);
                x340Var.r(false);
            }
            if (qzfVar.c) {
                x340Var.i0(-2052437123);
                int i3 = i2 & 896;
                boolean z2 = i3 == 256;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new frf(iu30Var, (byte) 6);
                    x340Var.s0(objT2);
                }
                Function0 function0 = (Function0) objT2;
                boolean z3 = i3 == 256;
                Object objT3 = x340Var.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new frf(iu30Var, (byte) 7);
                    x340Var.s0(objT3);
                }
                d(function0, (Function0) objT3, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-2052223781);
                x340Var.r(false);
            }
            if (qzfVar.b) {
                x340Var.i0(-2052191231);
                f(null, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-2052166245);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(qzfVar, vzq0Var, iu30Var, i, (byte) 22);
        }
    }

    public static final void c(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1261809510);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, u7h.b(cbx.a(x340Var).a.a.a(), 0.8f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new frf(iu30Var, (byte) 8);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            gfx.g(8, apo.r(-1991804647, new sm(iu30Var, (byte) 20), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 3, i, iu30Var, false);
        }
    }

    public static final void d(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-947791626);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ukf(function0, (byte) 10);
                x340Var.s0(objT);
            }
            anm1.a((Function0) objT, (i3u) null, apo.r(-688299201, new n4d(function1, function0, (byte) 4), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x02f8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(lbt0 lbt0Var, iu30 iu30Var, wpv0 wpv0Var, xfx xfxVar, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        qim0 qim0VarN;
        lbt0 lbt0Var2;
        Object next;
        int i4;
        String str;
        m4c m4cVar = fkj0.X;
        nk nkVar = lbt0Var.b;
        ArrayList arrayList = nkVar.f;
        im imVar = nkVar.h;
        oh4 oh4Var = wpv0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-876598649);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(lbt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(wpv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xfxVar) ? 2048 : 1024;
        }
        int i5 = i & 24576;
        nim0 nim0Var = nim0.a;
        if (i5 == 0) {
            i2 |= x340Var.i(nim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 131072 : 65536;
        }
        int i6 = i2;
        if (x340Var.Y(i6 & 1, (i6 & 74899) != 74898)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            String strO0 = cwl1.o0(x340Var, oh4Var.t() ? 2131959775 : 2131959776);
            c10 c10Var = (c10) lbt0Var.c.get(t80.a);
            if (c10Var != null && (str = c10Var.b) != null) {
                if (ihc1.y0(str)) {
                    str = null;
                }
                if (str != null) {
                    strO0 = str;
                }
            }
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            Object obj = objT;
            if (zG || objT == m4cVar) {
                ehd ehdVar = new ehd(strO0, iu30Var);
                x340Var.s0(ehdVar);
                obj = ehdVar;
            }
            ehd ehdVar2 = (ehd) obj;
            Object objT2 = x340Var.T();
            Object obj2 = objT2;
            if (objT2 == m4cVar) {
                jpm1 jpm1Var = new jpm1(iu30Var);
                x340Var.s0(jpm1Var);
                obj2 = jpm1Var;
            }
            jpm1 jpm1Var2 = (jpm1) obj2;
            Object objT3 = x340Var.T();
            Object obj3 = objT3;
            if (objT3 == m4cVar) {
                evm0 evm0Var = new evm0(xfxVar, wpv0Var, iu30Var);
                x340Var.s0(evm0Var);
                obj3 = evm0Var;
            }
            evm0 evm0Var2 = (evm0) obj3;
            Object objT4 = x340Var.T();
            Object obj4 = objT4;
            if (objT4 == m4cVar) {
                d99 d99Var = new d99(wpv0Var, iu30Var);
                x340Var.s0(d99Var);
                obj4 = d99Var;
            }
            d99 d99Var2 = (d99) obj4;
            Object objT5 = x340Var.T();
            Object obj5 = objT5;
            if (objT5 == m4cVar) {
                yas0 yas0Var = new yas0(iu30Var);
                x340Var.s0(yas0Var);
                obj5 = yas0Var;
            }
            yas0 yas0Var2 = (yas0) obj5;
            Object objT6 = x340Var.T();
            Object obj6 = objT6;
            if (objT6 == m4cVar) {
                xnc1 xnc1Var = new xnc1();
                x340Var.s0(xnc1Var);
                obj6 = xnc1Var;
            }
            xnc1 xnc1Var2 = (xnc1) obj6;
            Object objT7 = x340Var.T();
            Object obj7 = objT7;
            if (objT7 == m4cVar) {
                owr0 owr0Var = new owr0(iu30Var);
                x340Var.s0(owr0Var);
                obj7 = owr0Var;
            }
            owr0 owr0Var2 = (owr0) obj7;
            Object objT8 = x340Var.T();
            Object obj8 = objT8;
            if (objT8 == m4cVar) {
                lvm0 lvm0Var = new lvm0(iu30Var);
                x340Var.s0(lvm0Var);
                obj8 = lvm0Var;
            }
            lvm0 lvm0Var2 = (lvm0) obj8;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            if (lbt0Var.i) {
                x340Var.i0(-1347755734);
                qim0 qim0VarN2 = anm1.N("plan-overview-page", uyn1.z(16.0f, 0.0f, 2, d1u.E(1.0f, u7h.g, uyn1.w(l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var), false, 14), vzq0Var), d4o1.a)));
                x340Var.r(false);
                qim0VarN = qim0VarN2;
                i3 = 0;
            } else {
                i3 = 0;
                x340Var.i0(-1347512291);
                qim0VarN = anm1.N("plan-overview-page", uyn1.z(16.0f, 0.0f, 2, uyn1.w(l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var), false, 14), vzq0Var)));
                x340Var.r(false);
            }
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, i3);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i7 = (i6 << 3) & 112;
            boolean z = i3;
            otw.c(xnc1Var2, lbt0Var, (qim0) null, (ipb1) null, x340Var, i7, 12);
            if (!oh4Var.E() || lbt0Var.j == null) {
                x340Var.i0(-1187914811);
                x340Var.r(z);
            } else {
                x340Var.i0(-1187995535);
                otw.c(lvm0Var2, lbt0Var, (qim0) null, (ipb1) null, x340Var, i7, 12);
                x340Var.r(z);
            }
            if (!oh4Var.h() || oh4Var.t() || lbt0Var.f.isEmpty()) {
                x340Var.i0(-1187730299);
                x340Var.r(z);
            } else {
                x340Var.i0(-1187820633);
                otw.c(jpm1Var2, lbt0Var, (qim0) null, (ipb1) null, x340Var, i7, 12);
                x340Var.r(z);
            }
            int i8 = lbt0Var.a.f;
            if (i8 == 4 || i8 == 3) {
                x340Var.i0(-1187612995);
                otw.c(evm0Var2, lbt0Var, (qim0) null, (ipb1) null, x340Var, i7, 12);
                x340Var.r(z);
            } else {
                x340Var.i0(-1187543803);
                x340Var.r(z);
            }
            if (imVar.e) {
                x340Var.i0(-1187126171);
                x340Var.r(z);
            } else {
                x340Var.i0(-1187487507);
                if (arrayList.isEmpty()) {
                    x340Var.i0(-1187442309);
                    otw.c(yas0Var2, lbt0Var, (qim0) null, (ipb1) null, x340Var, i7, 12);
                    x340Var.r(z);
                } else {
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((gji0) next).a);
                    gji0 gji0Var = (gji0) next;
                    if (gji0Var == null || (i4 = gji0Var.e) == 0) {
                        i4 = 1;
                    }
                    if (i4 == 2) {
                        x340Var.i0(-1187442309);
                        otw.c(yas0Var2, lbt0Var, (qim0) null, (ipb1) null, x340Var, i7, 12);
                        x340Var.r(z);
                    } else {
                        x340Var.i0(-1187371195);
                        x340Var.r(z);
                    }
                }
                if (imVar.k) {
                    x340Var.i0(-1187310249);
                    otw.c(owr0Var2, lbt0Var, (qim0) null, (ipb1) null, x340Var, i7, 12);
                    x340Var.r(z);
                } else {
                    x340Var.i0(-1187235291);
                    x340Var.r(z);
                }
                otw.c(d99Var2, lbt0Var, (qim0) null, (ipb1) null, x340Var, i7, 12);
                x340Var.r(z);
            }
            if (imVar.a) {
                x340Var.i0(-1187047400);
                lbt0Var2 = lbt0Var;
                otw.c(ehdVar2, lbt0Var2, (qim0) null, (ipb1) null, x340Var, i7, 12);
                x340Var.r(z);
            } else {
                lbt0Var2 = lbt0Var;
                x340Var.i0(-1186973403);
                x340Var.r(z);
            }
            vy71 vy71VarF = dem0.f(z ? 1 : 0, 3, x340Var, (iu30) null, z);
            Object objT9 = x340Var.T();
            Object obj9 = objT9;
            if (objT9 == m4cVar) {
                c9n c9nVarM = qxd0.M(o6x.a, x340Var);
                x340Var.s0(c9nVarM);
                obj9 = c9nVarM;
            }
            c9n c9nVar = (c9n) obj9;
            if (lbt0Var2.g) {
                x340Var.i0(-1186787310);
                l4o1.h(c9nVar, vy71VarF, lbt0Var2, iu30Var, null, x340Var, (i6 << 6) & 8064);
                x340Var = x340Var;
                x340Var.r(z);
            } else if (lbt0Var2.h) {
                x340Var.i0(-1186650228);
                y3o1.e(c9nVar, vy71VarF, lbt0Var2, iu30Var, null, x340Var, (i6 << 6) & 8064);
                x340Var = x340Var;
                x340Var.r(z);
            } else {
                x340Var.i0(-1186564699);
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ibt0(lbt0Var, iu30Var, wpv0Var, xfxVar, vzq0Var, i, (byte) 1);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2112294688);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, u7h.b(cbx.a(x340Var).a.a.a(), 0.8f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = nyf.d;
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 14);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            xto1.e(h2c.a.a(qim0Var2, graVar), 3, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var2, i, (byte) 22);
        }
    }

    public static final void g(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-583363375);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(1 & i2, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(new mmr0(1, 1));
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            Uri uri = Uri.parse(str);
            wsx wsxVar = wsx.c;
            long j = u7h.j;
            int i3 = wsx.d | 3072;
            fwx fwxVarG = hso1.G(wsxVar, 0L, j, x340Var, i3, 22);
            fwx fwxVarG2 = hso1.G(wsxVar, 0L, j, x340Var, i3, 22);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new bzm(ven0Var, (byte) 11);
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new vj0(function0, (byte) 27);
                x340Var.s0(objT3);
            }
            eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, fwxVarG, fwxVarG2, false, false, (j6m) null, iu30Var, (iu30) objT3, (iu30) null, 0L, x340Var, 2359296, 384, 118686), isl.a, qim0VarF, (p3v) null, (zvx) null, new ecx(((Number) ((mmr0) ven0Var.getValue()).a).intValue(), ((Number) ((mmr0) ven0Var.getValue()).b).intValue()), mif1.S0, (tl3) null, (ColorFilter) null, x340Var, 1575984, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var, i, (byte) 8);
        }
    }

    public static final void h(zui1 zui1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        zui1 zui1Var2 = zui1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1962858418);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(zui1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new uyh1(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0Var, false, null, null, null, (Function0) objT, 15);
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            dmx dmxVar = dmx.c;
            nim0 nim0Var = nim0.a;
            w0h1.a(dmxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var, dmx.d | 48, 56);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            zui1Var2 = zui1Var;
            String str = zui1Var2.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            uwo1.e(zui1Var2.b, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(zui1Var2, iu30Var, qim0Var, i, (byte) 29);
        }
    }

    public static final Set i(ui8 ui8Var) {
        return f46.S0(new Object[]{ui8Var.e(), ui8Var.d()});
    }

    public static final boolean j(yg8 yg8Var) {
        return yg8Var == yg8.t || yg8Var == yg8.X || yg8Var == yg8.Y;
    }

    public static od70 k(String str, List list) {
        bg11 bg11VarP;
        if (list == null) {
            w280 w280Var = b380.b;
            bg11VarP = bg11.e;
        } else {
            bg11VarP = list instanceof b380 ? (b380) list : b380.p(o7h.o0(list));
        }
        return new od70(str, bg11VarP);
    }

    public static final int l() {
        return ped1.a;
    }

    public static final AccessoryContentSize m(AccessoryContentSize accessoryContentSize, float f) {
        int i;
        if (f < 1.0f) {
            i = 1;
        } else if (f < 1.15f) {
            i = 2;
        } else if (f < 1.3f) {
            i = 3;
        } else if (f < 1.5f) {
            i = 4;
        } else if (f < 1.8f) {
            i = 5;
        } else {
            i = f < 2.0f ? 6 : 7;
        }
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            case 1:
                return accessoryContentSize;
            case 2:
            case 3:
                return AccessoryContentSize.SMALL;
            case 4:
                return AccessoryContentSize.XSMALL;
            default:
                eg.o();
            case 5:
            case 6:
                return null;
        }
    }

    public static final go80 n(klm klmVar, sbp0 sbp0Var, ubp0 ubp0Var) {
        return klmVar.a("ExternalAccessoryLoggingDaemon", new rap0(sbp0Var, ubp0Var, (byte) 17));
    }

    public static boolean o(luk lukVar) {
        return new bc4(true, lukVar).a();
    }

    public static final int p(int i, int i2, String str) {
        return (int) gyo1.Q(i, 1L, i2, str);
    }

    public static final String q() {
        String property;
        int i = ped1.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        return property == null ? "DefaultDispatcher" : property;
    }

    public static final boolean r(String str, boolean z) {
        String property;
        int i = ped1.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        return property != null ? Boolean.parseBoolean(property) : z;
    }

    public static int s(int i, int i2, String str) {
        return (int) gyo1.Q(i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    public static long t(long j, String str) {
        return gyo1.Q(j, 1L, Long.MAX_VALUE, str);
    }

    public static final qxc0 u(cxc0 cxc0Var) {
        kby kbyVar = cxc0Var.f;
        String str = kbyVar.b;
        ben benVar = kbyVar.d;
        boolean z = kbyVar.h;
        x4i1 x4i1Var = kbyVar.e;
        pxc0 pxc0Var = x4i1Var != null ? new pxc0(x4i1Var.a, x4i1Var.c) : null;
        long j = cxc0Var.d;
        boolean z2 = kbyVar.D;
        boolean z3 = kbyVar.j;
        String str2 = kbyVar.p;
        wls0 wls0Var = kbyVar.v;
        x4i1 x4i1Var2 = kbyVar.u;
        pxc0 pxc0Var2 = x4i1Var2 != null ? new pxc0(x4i1Var2.a, x4i1Var2.c) : null;
        String str3 = kbyVar.c;
        if (str3 == null) {
            str3 = "";
        }
        x7i1 x7i1Var = kbyVar.w;
        List list = kbyVar.z;
        boolean z4 = kbyVar.C;
        boolean z5 = kbyVar.o;
        boolean z6 = kbyVar.E;
        Map map = kbyVar.q;
        List list2 = kbyVar.r;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            gby gbyVar = (gby) it.next();
            Iterator it2 = it;
            boolean z7 = gbyVar.c;
            String str4 = gbyVar.a;
            String str5 = gbyVar.b;
            arrayList.add(z7 ? new z2d0(str4, str5, false) : new a3d0(str4, str5));
            it = it2;
            benVar = benVar;
            str3 = str3;
        }
        ben benVar2 = benVar;
        String str6 = str3;
        List list3 = kbyVar.F;
        r2q0 r2q0Var = kbyVar.n;
        return new qxc0(str, benVar2, pxc0Var, str6, str2, z, kbyVar.A, z3, wls0Var, x7i1Var, map, arrayList, list3, list, cxc0Var.j, kbyVar.t, z5, j, cxc0Var.g, cxc0Var.h, r2q0Var, pxc0Var2, cxc0Var.e, z2, z4, z6);
    }

    public static final s1g v(mr20 mr20Var, Function0 function0) {
        return new s1g(new fu20(mr20Var, new wo2(function0, (lnm) null, (byte) 1), (byte) 1), (byte) 12);
    }
}
