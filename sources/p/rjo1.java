package p;

import android.app.NotificationManager;
import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.stream_reporting_attribution.proto.StreamReportingAttributionOuterClass;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rjo1 {
    public static b180 a;

    public static final void a(sb81 sb81Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1599861153);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(sb81Var) ? 4 : 2) | i;
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
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new rqa(iu30Var, sb81Var, (byte) 27);
                x340Var.s0(objT);
            }
            foo1.g(new gbx(z50.c, (Function0) objT), null, null, null, null, null, null, apo.r(-591058895, new cka(sb81Var, (byte) 24), x340Var), x340Var, 12582912, 126);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b((byte) 14, i, sb81Var, iu30Var, qim0Var);
        }
    }

    public static final void b(gsh1 gsh1Var, iu30 iu30Var, qim0 qim0Var, dlg1 dlg1Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(763490372);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(gsh1Var) : x340Var.i(gsh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? x340Var.g(dlg1Var) : x340Var.i(dlg1Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 8190;
            x340Var.i0(-1510750488);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new y7e1((String) null, 3);
                x340Var.s0(objT);
            }
            y7e1 y7e1Var = (y7e1) objT;
            boolean z = (((i3 & 112) ^ 48) > 32 && x340Var.g(iu30Var)) || (i3 & 48) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new qy5(y7e1Var, iu30Var, (lnm) null, (byte) 13);
                x340Var.s0(objT2);
            }
            qxd0.t(y7e1Var, x340Var, (vu30) objT2);
            boolean z2 = ((((i3 & 7168) ^ 3072) > 2048 && x340Var.g(dlg1Var)) || (i3 & 3072) == 2048) | ((((i3 & 14) ^ 6) > 4 && x340Var.i(gsh1Var)) || (i3 & 6) == 4);
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new kwb1(gsh1Var, dlg1Var, (lnm) null, (byte) 21);
                x340Var.s0(objT3);
            }
            qxd0.t(gsh1Var, x340Var, (vu30) objT3);
            boolean zEquals = gsh1Var.equals(esh1.a);
            j2i j2iVarR = apo.r(-1700180331, new hoh1(iu30Var, gsh1Var.equals(dsh1.a), y7e1Var, (byte) 1), x340Var);
            j2i j2iVarR2 = apo.r(-1295794033, new n8k0(zEquals, dlg1Var, y7e1Var, (byte) 18), x340Var);
            int i5 = ((i4 >> 6) & 14) | 24624;
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, j2iVarR, null, null, j2iVarR2, x340Var, i5, 12);
            x340Var.r(false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, gsh1Var, iu30Var, qim0Var2, dlg1Var, (byte) 15);
        }
    }

    public static final void c(a8x a8xVar, Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1436959331);
        int i2 = (x340Var.g(a8xVar) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        byte b = 0;
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            function1 = function0;
            ila0.c((scx) null, apo.r(1319636317, new x7x(a8xVar, b), x340Var), apo.r(2081517628, new x7x(a8xVar, b2), x340Var), apo.r(-1451568357, new y7x(function0, a8xVar), x340Var), (vu30) null, function1, x340Var, ((i2 << 12) & 458752) | 3504, 17);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y7x(a8xVar, function1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    public static final void d(smh0 smh0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        smh0 smh0Var2;
        iu30 iu30Var2;
        era eraVar;
        ?? r9;
        qim0 qim0Var;
        String str;
        ?? r1;
        boolean z;
        String strN0;
        String str2;
        qim0 qim0VarB;
        Object obj;
        era eraVar2;
        int i3 = smh0Var.c;
        boolean z2 = smh0Var.a;
        rmh0 rmh0Var = smh0Var.f;
        era eraVar3 = een.R0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1105749271);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(smh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            List list = smh0Var.e;
            rmh0 rmh0Var2 = rmh0.d;
            if (rmh0Var == rmh0Var2 && !smh0Var.b) {
                x340Var.i0(1022812845);
                if (i3 > 1) {
                    x340Var.i0(1022851223);
                    m(i3, 0, x340Var, null, z2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1023014190);
                    sbl.r((qim0) null, x340Var, 0);
                    x340Var.r(false);
                }
                x340Var.r(false);
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xmh0(smh0Var, iu30Var, i, (byte) 0);
                    return;
                }
                return;
            }
            x340Var.i0(1023070393);
            x340Var.r(false);
            if (rmh0Var == rmh0Var2 && list.isEmpty()) {
                x340Var.i0(1023172073);
                sok.i((qim0) null, x340Var, 0);
                x340Var.r(false);
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new xmh0(smh0Var, iu30Var, i, (byte) 1);
                    return;
                }
                return;
            }
            x340Var.i0(1023218201);
            x340Var.r(false);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            Object obj2 = objT;
            if (objT == m4cVar) {
                hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                x340Var.s0(hrr0VarQ);
                obj2 = hrr0VarQ;
            }
            ven0 ven0Var = (ven0) obj2;
            boolean zI = x340Var.i(smh0Var) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            Object obj3 = objT2;
            if (zI || objT2 == m4cVar) {
                hyg0 hyg0Var = new hyg0(smh0Var, ven0Var, (lnm) null, (byte) 1);
                x340Var.s0(hyg0Var);
                obj3 = hyg0Var;
            }
            qxd0.t(rmh0Var, x340Var, (vu30) obj3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            era eraVar4 = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar4, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            if (list.size() <= 1 || (z2 && rmh0Var != rmh0Var2)) {
                eraVar = eraVar3;
                rmh0Var2 = rmh0Var2;
                r9 = 0;
                x340Var.i0(1663099203);
                x340Var.r(false);
            } else {
                x340Var.i0(1662863758);
                int size = list.size();
                int iS = s(list);
                if (z2) {
                    eraVar = eraVar3;
                    eraVar2 = eraVar;
                } else {
                    eraVar2 = eraVar4;
                    eraVar = eraVar3;
                }
                tq60 tq60Var = new tq60(eraVar2);
                r9 = 0;
                k(size, iS, 0, x340Var, tq60Var);
                x340Var.r(false);
            }
            jw31 jw31VarA = ew31.a(new d36(cbx.b(x340Var).b.a, true, new um5((boolean) r9)), een.N0, x340Var, (int) r9);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (rmh0Var == rmh0.a) {
                x340Var.i0(-888310981);
                zov0 zov0Var = cbx.b(x340Var).g;
                qim0 qim0VarR = u291.r(qim0Var2, 24.0f);
                boolean zI2 = ((i4 & 112) == 32) | x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    iu30Var2 = iu30Var;
                    wq9 wq9Var = new wq9(iu30Var2, ven0Var, (byte) 23);
                    x340Var.s0(wq9Var);
                    obj = wq9Var;
                } else {
                    iu30Var2 = iu30Var;
                    obj = objT3;
                }
                qim0 qim0VarX = bin.x(qim0VarR, false, null, null, null, (Function0) obj, 15);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                str = null;
                qim0Var = qim0Var2;
                r1 = 0;
                z = true;
                w0h1.a(gux.c, new jsl(cwl1.o0(x340Var, 2131958445)), (qim0) null, cbx.a(x340Var).b.a, 0L, false, x340Var, gux.d, 52);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                iu30Var2 = iu30Var;
                qim0Var = qim0Var2;
                str = null;
                r1 = 0;
                z = true;
                x340Var.i0(-887784353);
                x340Var.r(false);
            }
            int i5 = i4 & 14;
            x340Var.i0(-79473352);
            if (list.isEmpty()) {
                x340Var.r((boolean) r1);
                smh0Var2 = smh0Var;
                str2 = str;
            } else {
                int size2 = list.size();
                String strU = cwl1.U(s(list), size2, new Object[]{Integer.valueOf(size2)}, x340Var);
                if (z2) {
                    x340Var.i0(-1063404775);
                    strN0 = cwl1.n0(2131961341, new Object[]{strU}, x340Var);
                    x340Var.r((boolean) r1);
                    smh0Var2 = smh0Var;
                } else {
                    x340Var.i0(-1063316704);
                    smh0Var2 = smh0Var;
                    strN0 = cwl1.n0(2131961340, new Object[]{smh0Var2.d, strU}, x340Var);
                    x340Var.r((boolean) r1);
                }
                str2 = strN0;
                x340Var.r((boolean) r1);
            }
            if (rmh0Var == rmh0Var2) {
                x340Var.i0(-887611063);
                int i6 = i4 & 112;
                int i7 = (x340Var.g(str2) ? 1 : 0) | (i6 == 32 ? z : r1);
                Object objT4 = x340Var.T();
                Object obj4 = objT4;
                if (i7 != 0 || objT4 == m4cVar) {
                    mr3 mr3Var = new mr3(str2, iu30Var2, (byte) 4);
                    x340Var.s0(mr3Var);
                    obj4 = mr3Var;
                }
                qim0 qim0VarB2 = s161.b(qim0Var, z, (iu30) obj4);
                ?? r13 = i6 == 32 ? z : r1;
                Object objT5 = x340Var.T();
                Object obj5 = objT5;
                if (r13 != 0 || objT5 == m4cVar) {
                    ni6 ni6Var = new ni6(iu30Var2, (byte) 3);
                    x340Var.s0(ni6Var);
                    obj5 = ni6Var;
                }
                qim0VarB = f8d1.b(qim0VarB2, rih1.a, (PointerInputEventHandler) obj5);
                x340Var.r((boolean) r1);
            } else {
                x340Var.i0(-886260703);
                x340Var.r((boolean) r1);
                qim0VarB = qim0Var;
            }
            if (list.size() == z) {
                x340Var.i0(-886196471);
                l(smh0Var2, qim0VarB, x340Var, i5);
                x340Var.r((boolean) r1);
            } else {
                x340Var.i0(-886135959);
                f(smh0Var2, u291.h(qim0Var, 192.0f).then(qim0VarB), x340Var, i5);
                x340Var.r((boolean) r1);
            }
            x340Var.r(z);
            int i8 = i4 & 112;
            i(rmh0Var, iu30Var2, new tq60(eraVar), x340Var, i8);
            x340Var.r(z);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1026484671);
                int i9 = (x340Var.i(ven0Var) ? 1 : 0) | (i8 == 32 ? z : r1);
                Object objT6 = x340Var.T();
                Object obj6 = objT6;
                if (i9 != 0 || objT6 == m4cVar) {
                    wq9 wq9Var2 = new wq9(iu30Var2, ven0Var, (byte) 24);
                    x340Var.s0(wq9Var2);
                    obj6 = wq9Var2;
                }
                Function0 function0 = (Function0) obj6;
                int i10 = (x340Var.i(ven0Var) ? 1 : 0) | (i8 == 32 ? z : r1);
                Object objT7 = x340Var.T();
                Object obj7 = objT7;
                if (i10 != 0 || objT7 == m4cVar) {
                    wq9 wq9Var3 = new wq9(iu30Var2, ven0Var, (byte) 25);
                    x340Var.s0(wq9Var3);
                    obj7 = wq9Var3;
                }
                g(function0, (Function0) obj7, x340Var, r1);
                x340Var.r((boolean) r1);
            } else {
                x340Var.i0(1026786425);
                x340Var.r((boolean) r1);
            }
        } else {
            smh0Var2 = smh0Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new xmh0(smh0Var2, iu30Var2, i, (byte) 2);
        }
    }

    public static final void e(smh0 smh0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-984635923);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(smh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 >> 3;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            d(smh0Var, iu30Var, x340Var, (i4 & 112) | (i3 & 14));
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0((Object) smh0Var, (Object) iu30Var, qim0Var2, i, (byte) 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(smh0 smh0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        byte b;
        qim0 qim0Var2;
        h2c h2cVar;
        rmh0 rmh0Var;
        qim0 qim0Var3;
        vu30 vu30Var = y580.Y;
        vu30 vu30Var2 = y580.R0;
        vu30 vu30Var3 = y580.N0;
        vu30 vu30Var4 = y580.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-392128613);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(smh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        boolean z = true;
        boolean z2 = false;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            hw61 hw61VarB = er31.b(16.0f);
            long j = cbx.a(x340Var).a.d;
            gfh0 gfh0VarC = t1c.c(een.g, false);
            long j2 = j;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            Function0 function0 = hmb0.t1;
            if (z3) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, vu30Var4);
            nko1.H(xos0VarM, x340Var, vu30Var3);
            nko1.H(Integer.valueOf(iHashCode), x340Var, vu30Var2);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var);
            List list = smh0Var.e;
            rmh0 rmh0Var2 = smh0Var.f;
            List listD1 = o7h.d1(list, 3);
            int iL = p7h.L(listD1);
            x340Var.i0(1729239358);
            ud31 it = new wd31(listD1).iterator();
            int i3 = 0;
            while (true) {
                ListIterator listIterator = (ListIterator) it.b;
                if (!listIterator.hasPrevious()) {
                    boolean z4 = z2;
                    x340Var.r(z4);
                    x340Var.r(z);
                    b = z4;
                    break;
                }
                Object objPrevious = listIterator.previous();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                qmh0 qmh0Var = (qmh0) objPrevious;
                int i5 = iL - i3;
                float f = i5;
                qim0 qim0Var4 = nim0.a;
                long j3 = j2;
                qim0 qim0VarE2 = d1u.E(1.0f, j3, i1p1.q(u291.r(uyn1.B(qim0Var4, 28.0f * f, 0.0f, 0.0f, 0.0f, 14), 192.0f - (14.0f * f)), hw61VarB), hw61VarB);
                gfh0 gfh0VarC2 = t1c.c(een.d, z2);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarE2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, vu30Var4);
                nko1.H(xos0VarM2, x340Var, vu30Var3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, vu30Var2);
                nko1.F(x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var);
                x340 x340Var2 = x340Var;
                hw61 hw61Var = hw61VarB;
                Function0 function1 = function0;
                rmh0 rmh0Var3 = rmh0Var2;
                vu30 vu30Var5 = vu30Var;
                eso1.e(Uri.parse(qmh0Var.b), isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var2, 3120, 0, 3508);
                x340Var = x340Var2;
                h2c h2cVar2 = h2c.a;
                rmh0 rmh0Var4 = rmh0.d;
                if (rmh0Var3 != rmh0Var4) {
                    x340Var.i0(-403630420);
                    qim0Var2 = qim0Var4;
                    t1c.a(dug.f(h2cVar2.b(qim0Var2), u7h.b(u7h.b, 0.4f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), x340Var, 0);
                    x340Var.r(false);
                } else {
                    qim0Var2 = qim0Var4;
                    x340Var.i0(-403496841);
                    x340Var.r(false);
                }
                if (i5 == 0 && (rmh0Var3 == rmh0.a || rmh0Var3 == rmh0.c)) {
                    x340Var.i0(-403348940);
                    h2cVar = h2cVar2;
                    rmh0Var = rmh0Var4;
                    qim0Var3 = qim0Var2;
                    xto1.e(h2cVar2.a(qim0Var2, een.h), 4, 0L, 0L, x340Var, 48, 12);
                    x340Var.r(false);
                } else {
                    h2cVar = h2cVar2;
                    rmh0Var = rmh0Var4;
                    qim0Var3 = qim0Var2;
                    x340Var.i0(-403192297);
                    x340Var.r(false);
                }
                if (i5 == 0 && qmh0Var.c == 2 && rmh0Var3 == rmh0Var) {
                    x340Var.i0(-403037855);
                    q3p1.j(0, qmh0Var.g, x340Var, h2cVar.b(qim0Var3));
                    x340Var.r(false);
                } else {
                    x340Var.i0(-402893705);
                    x340Var.r(false);
                }
                x340Var.r(true);
                hw61VarB = hw61Var;
                rmh0Var2 = rmh0Var3;
                z = true;
                z2 = false;
                vu30Var3 = vu30Var3;
                vu30Var4 = vu30Var4;
                vu30Var2 = vu30Var2;
                i3 = i4;
                j2 = j3;
                function0 = function1;
                vu30Var = vu30Var5;
            }
        } else {
            b = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zmh0(smh0Var, qim0Var, i, b);
        }
    }

    public static final void g(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1149824106);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958446);
            String strO1 = cwl1.o0(x340Var, 2131958449);
            String strO2 = cwl1.o0(x340Var, 2131958448);
            String strO3 = cwl1.o0(x340Var, 2131958447);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            mqo1.d(function1, null, null, strO2, strO3, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function1)), x340Var, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 29);
        }
    }

    public static final void h(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1454775561);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(iu30Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ebg0(iu30Var, (byte) 28);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0Var, false, null, null, null, (Function0) objT, 15);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            cnx cnxVar = cnx.c;
            long j = cbx.a(x340Var).b.d;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(cnxVar, isl.a, u291.r(nim0.a, 12.0f), j, 0L, false, x340Var, cnx.d | 48, 48);
            uwo1.e(cwl1.o0(x340Var, 2131958401), null, cbx.d(x340Var).m, cbx.a(x340Var).b.d, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            uwo1.e(cwl1.o0(x340Var, 2131958452), null, cbx.d(x340Var).n, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var, i, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    public static final void i(rmh0 rmh0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-215563518);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(rmh0Var.ordinal()) ? 4 : 2) | i;
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
            int iOrdinal = rmh0Var.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(-998103360);
                j((i2 >> 3) & 112, cwl1.o0(x340Var, 2131958433), x340Var, qim0Var);
                x340Var.r(false);
            } else if (iOrdinal == 1) {
                x340Var.i0(-998099136);
                j((i2 >> 3) & 112, cwl1.o0(x340Var, 2131958451), x340Var, qim0Var);
                x340Var.r(false);
            } else if (iOrdinal == 2) {
                x340Var.i0(-998103360);
                j((i2 >> 3) & 112, cwl1.o0(x340Var, 2131958433), x340Var, qim0Var);
                x340Var.r(false);
            } else if (iOrdinal == 3) {
                x340Var.i0(-998095258);
                x340Var.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw p3d1.k(x340Var, -998105602, false);
                }
                x340Var.i0(-998094167);
                h((i2 >> 3) & 126, x340Var, iu30Var, qim0Var);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0((Object) rmh0Var, (Object) iu30Var, (Object) qim0Var, i, (byte) 17);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-516659061);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0Var, cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i2 & 126, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var, i, (byte) 11);
        }
    }

    public static final void k(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1295605985);
        if ((i3 & 6) == 0) {
            i4 = (x340Var.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qnx qnxVar = qnx.c;
            long j = cbx.a(x340Var).b.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(qnxVar, isl.a, u291.r(nim0.a, 12.0f), j, 0L, false, x340Var, qnx.d | 48, 48);
            uwo1.e(cwl1.U(i2, i, new Object[]{Integer.valueOf(i)}, x340Var), null, cbx.d(x340Var).n, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wt00(i, i2, i3, qim0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v30 */
    public static final void l(smh0 smh0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        byte b;
        qm90 qm90Var;
        boolean z;
        ?? r7;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1091709575);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(smh0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            long j = cbx.a(x340Var).a.d;
            List list = smh0Var.e;
            rmh0 rmh0Var = smh0Var.f;
            qmh0 qmh0Var = (qmh0) o7h.q0(list);
            String str = qmh0Var.b;
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q(0);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG2 = x340Var.g(str);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = v8r.q(0);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Uri uri = Uri.parse(str);
            boolean zI = x340Var.i(ven0Var) | x340Var.i(ven0Var2);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new xs3(ven0Var, ven0Var2, (byte) 12);
                x340Var.s0(objT3);
            }
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT3, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 126974);
            int i3 = qmh0Var.d;
            Integer numValueOf = Integer.valueOf(i3);
            if (i3 <= 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : ((Number) ven0Var.getValue()).intValue();
            int i4 = qmh0Var.e;
            Integer numValueOf2 = Integer.valueOf(i4);
            if (i4 <= 0) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : ((Number) ven0Var2.getValue()).intValue();
            boolean zE = x340Var.e(iIntValue) | x340Var.e(iIntValue2);
            Object objT4 = x340Var.T();
            if (zE || objT4 == m4cVar) {
                if (iIntValue <= 0 || iIntValue2 <= 0) {
                    qm90Var = new qm90(192.0f, 192.0f);
                } else if (iIntValue2 > iIntValue) {
                    qm90Var = new qm90(192.0f, 256.0f);
                } else {
                    qm90Var = iIntValue > iIntValue2 ? new qm90(256.0f, 192.0f) : new qm90(192.0f, 192.0f);
                }
                objT4 = qm90Var;
                x340Var.s0(objT4);
            }
            qm90 qm90Var2 = (qm90) objT4;
            qim0 qim0VarE = d1u.E(1.0f, j, i1p1.q(u291.s(qim0Var, qm90Var2.a, qm90Var2.b), cr31VarB), cr31VarB);
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
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            eso1.h(ni7VarA, isl.a, h2cVar.b(nim0Var), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, x340Var, 199728, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER);
            x340Var = x340Var;
            rmh0 rmh0Var2 = rmh0.d;
            if (rmh0Var != rmh0Var2) {
                x340Var.i0(-1735050236);
                z = false;
                t1c.a(dug.f(h2cVar.b(nim0Var), u7h.b(u7h.b, 0.4f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), x340Var, 0);
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(-1734947409);
                x340Var.r(false);
            }
            if (rmh0Var == rmh0.a || rmh0Var == rmh0.c) {
                x340Var.i0(-1734851712);
                xto1.e(h2cVar.a(nim0Var, een.h), 4, 0L, 0L, x340Var, 48, 12);
                r7 = 0;
                x340Var.r(false);
            } else {
                x340Var.i0(-1734714289);
                x340Var.r(z);
                r7 = z;
            }
            if (qmh0Var.c == 2 && rmh0Var == rmh0Var2) {
                x340Var.i0(-1734622746);
                q3p1.j(r7, qmh0Var.g, x340Var, h2cVar.b(nim0Var));
                x340Var.r((boolean) r7);
            } else {
                x340Var.i0(-1734521841);
                x340Var.r((boolean) r7);
            }
            b = 1;
            x340Var.r(true);
        } else {
            b = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zmh0(smh0Var, qim0Var, i, b);
        }
    }

    public static final void m(int i, int i2, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1037276262);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            long jC = cbx.a(x340Var).a.b.c();
            long j = cbx.a(x340Var).a.d;
            int i4 = i <= 3 ? i : 3;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            int i5 = ((add) x340Var.k(ade0.c)).s() ? 2131820755 : 2131820754;
            if (z) {
                eraVar = een.R0;
            }
            int i6 = i4;
            k(i, i5, i3 & 14, x340Var, new tq60(eraVar));
            gra graVar = een.g;
            qim0 qim0VarH = u291.h(qim0Var3, 192.0f);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
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
            x340Var.i0(-599550865);
            for (int i7 = i6 - 1; -1 < i7; i7--) {
                float f = i7;
                qim0 qim0VarR = u291.r(uyn1.B(qim0Var3, 28.0f * f, 0.0f, 0.0f, 0.0f, 14), 192.0f - (14.0f * f));
                uwr uwrVar2 = cbx.a;
                t1c.a(cwl1.l0(d1u.E(1.0f, j, dug.f(dug.f(qim0VarR, cbx.a(x340Var).a.c, cr31VarB), jC, cr31VarB), cr31VarB), jC, cr31VarB, 12), x340Var, 0);
            }
            us71.m(x340Var, false, true, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kx9(i, z, qim0Var2, i2);
        }
    }

    public static boolean n(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static String o(id01 id01Var) {
        return "ereader_selection_menu_color_".concat(id01Var.name().toLowerCase(Locale.ROOT));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    public static final p0d0 p(PlayerState playerState, bmm bmmVar) {
        n0d0 l0d0Var;
        cob1 cob1Var;
        spq0 spq0VarTrack = playerState.track();
        String str = (String) spq0VarTrack.i(bx8.k).h();
        String str2 = (String) spq0VarTrack.i(bx8.j).h();
        String strH = null;
        String strZ0 = str2 != null ? ihc1.Z0(str2, ":") : null;
        String strContextUri = playerState.contextUri();
        boolean zR = r(playerState, bmmVar);
        xxu0 xxu0VarC = oxu0.a.c(strContextUri == null ? "" : strContextUri);
        xxu0 xxu0Var = xxu0VarC instanceof xxu0 ? xxu0VarC : null;
        if (xxu0Var != null) {
            String str3 = xxu0Var.a;
            try {
                Set set = s4b1.f;
                y6b1 y6b1Var = bmmVar.a;
                strH = uic.x(y6b1Var != null ? y6b1Var.toString() : null).h();
            } catch (UnsupportedOperationException unused) {
            }
            if (str3.equals(strH) && str != null) {
                l0d0Var = new n0d0(str);
            } else if (zR || strZ0 == null) {
                l0d0Var = m0d0.a;
            } else {
                l0d0Var = new l0d0(strZ0);
            }
        } else if (zR) {
            l0d0Var = m0d0.a;
        } else {
            l0d0Var = m0d0.a;
        }
        boolean z = playerState.isPlaying() && !playerState.isPaused();
        boolean zC = spq0VarTrack.c();
        if (zR && z && zC) {
            cob1Var = cob1.c;
        } else {
            cob1Var = (zR && zC) ? cob1.b : cob1.a;
        }
        return new p0d0(cob1Var, new bmm(strContextUri), l0d0Var);
    }

    public static final long q(String str) {
        return z4p1.e(Color.parseColor(str));
    }

    public static final boolean r(PlayerState playerState, bmm bmmVar) {
        y6b1 y6b1Var = bmmVar.a;
        spq0 spq0VarTrack = playerState.track();
        if (!bmmVar.equals(new bmm(playerState.contextUri()))) {
            return false;
        }
        Set set = s4b1.f;
        if (!uic.h(y6b1Var != null ? y6b1Var.toString() : null, new blc0[]{blc0.M3, blc0.ed})) {
            return true;
        }
        ContextTrack contextTrack = (ContextTrack) spq0VarTrack.h();
        return u890.j(contextTrack != null ? l4o1.a0(contextTrack, "pointer.uri") : null, y6b1Var != null ? y6b1Var.toString() : null);
    }

    public static final int s(List list) {
        boolean z;
        List list2 = list;
        boolean z2 = list2 instanceof Collection;
        boolean z3 = true;
        if (!z2 || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((qmh0) it.next()).c == 1) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (!z2 || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    z3 = false;
                    break;
                }
            } while (((qmh0) it2.next()).c != 2);
        } else {
            z3 = false;
            break;
        }
        if (z && z3) {
            return 2131820755;
        }
        return z3 ? 2131820756 : 2131820754;
    }

    public static final StreamReportingAttributionOuterClass.StreamReportingAttribution t(iu30 iu30Var) {
        String str = (String) iu30Var.invoke("provenance_id");
        String str2 = (String) iu30Var.invoke("page_id");
        String str3 = (String) iu30Var.invoke("root_specification_id");
        String str4 = (String) iu30Var.invoke("leaf_specification_id");
        if (str == null && str2 == null && str3 == null && str4 == null) {
            return null;
        }
        bec1 bec1VarN = StreamReportingAttributionOuterClass.StreamReportingAttribution.n();
        if (str != null) {
            bec1VarN.getClass();
            bec1VarN.r(str);
        }
        if (str2 != null) {
            bec1VarN.getClass();
            bec1VarN.q(str2);
        }
        if (str3 != null) {
            bec1VarN.getClass();
            bec1VarN.s(str3);
        }
        if (str4 != null) {
            bec1VarN.getClass();
            bec1VarN.n(str4);
        }
        return bec1VarN.build();
    }

    public static final nl6 u(vl6 vl6Var, yqg yqgVar) {
        int iOrdinal = vl6Var.ordinal();
        if (iOrdinal == 0) {
            return new ml6(yqgVar.b());
        }
        if (iOrdinal == 1) {
            return ll6.a;
        }
        if (iOrdinal == 2) {
            return jl6.a;
        }
        if (iOrdinal == 3) {
            return kl6.a;
        }
        eg.o();
        return null;
    }

    public static final wl6 v(pl6 pl6Var) {
        tl6 tl6Var;
        String str = pl6Var.b;
        String str2 = pl6Var.c;
        String str3 = pl6Var.d;
        boolean z = pl6Var.e;
        boolean z2 = pl6Var.f;
        boolean z3 = pl6Var.g;
        boolean z4 = pl6Var.h;
        boolean z5 = pl6Var.i;
        boolean z6 = pl6Var.j;
        hl6 hl6Var = pl6Var.m;
        if (hl6Var != null) {
            tl6Var = new tl6(hl6Var.a, hl6Var.b, hl6Var.c, hl6Var.d, pl6Var.n, hl6Var.e);
        } else {
            tl6Var = null;
        }
        return new wl6(str, str2, str3, z, z2, z3, z4, z5, z6, tl6Var);
    }

    public static final apd w(baz0 baz0Var, boolean z) {
        String str = baz0Var.c;
        nwc lwcVar = str != null ? new lwc(str) : null;
        xj61 xj61Var = new xj61();
        if (baz0Var.f) {
            xj61Var.add(en81.c);
        }
        if (baz0Var.g) {
            xj61Var.add(en81.b);
        }
        if (baz0Var.h) {
            xj61Var.add(en81.d);
        }
        xj61 xj61VarJ = cwl1.j(xj61Var);
        String str2 = baz0Var.e;
        if (str2 == null) {
            str2 = "";
        }
        mwc mwcVar = new mwc(str2, xj61VarJ);
        String str3 = baz0Var.d;
        String str4 = baz0Var.a;
        return new apd(lwcVar, mwcVar, str3 != null ? new gvc(12, str3, str4) : new dvc(str4, 2), z ? o80.a : new m80(str4, baz0Var.b), z ? y6x0.T0 : null, (Float) null, 208);
    }

    public static String x(n5o1 n5o1Var) {
        StringBuilder sb = new StringBuilder(n5o1Var.e());
        for (int i = 0; i < n5o1Var.e(); i++) {
            byte b = n5o1Var.b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case grn1.d /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
