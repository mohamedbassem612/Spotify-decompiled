package p;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i6r extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6r(maa maaVar, byte b) {
        super(5);
        this.a = b;
        this.b = maaVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        zzq0 zzq0VarC;
        boolean z;
        qom0 qom0Var;
        iu30 iu30Var;
        zom0 zom0Var = (zom0) obj2;
        iu30 iu30Var2 = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        uwl uwlVar = this.b;
        b0k b0kVar = (x340) ((b0k) obj4);
        uwlVar.N0 = ((cir0) b0kVar.k(k2r0.a)).c();
        int i = (iIntValue & 112) ^ 48;
        int i2 = (iIntValue & 896) ^ 384;
        boolean z2 = ((i > 32 && b0kVar.i(zom0Var)) || (iIntValue & 48) == 32) | ((i2 > 256 && b0kVar.g(iu30Var2)) || (iIntValue & 384) == 256);
        Object objT = b0kVar.T();
        if (z2 || objT == m4cVar) {
            objT = new nxr(zom0Var, iu30Var2, (byte) 14);
            b0kVar.s0(objT);
        }
        q3p1.b(0, 1, (Function0) objT, b0kVar, false);
        qom0 qom0Var2 = zom0Var.c;
        Object objT2 = b0kVar.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q((Object) null);
            b0kVar.s0(objT2);
        }
        ven0 ven0Var = (ven0) objT2;
        boolean zI = b0kVar.i(ven0Var) | b0kVar.i(qom0Var2);
        Object objT3 = b0kVar.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new eum(qom0Var2, ven0Var, (lnm) null, (byte) 23);
            b0kVar.s0(objT3);
        }
        qxd0.t(qom0Var2, b0kVar, (vu30) objT3);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
        mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar, 0);
        int iHashCode = Long.hashCode(((x340) b0kVar).T);
        xos0 xos0VarM = b0kVar.m();
        qim0 qim0VarE = zr7.E(b0kVar, qim0VarZ);
        hzj.A.getClass();
        if (((x340) b0kVar).a == null) {
            tgp1.p();
            throw null;
        }
        b0kVar.m0();
        if (((x340) b0kVar).S) {
            b0kVar.l(hmb0.t1);
        } else {
            b0kVar.v0();
        }
        nko1.H(mbhVarA, b0kVar, y580.O0);
        nko1.H(xos0VarM, b0kVar, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), b0kVar, y580.R0);
        nko1.F(b0kVar);
        nko1.H(qim0VarE, b0kVar, y580.Y);
        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
        Boolean bool = (Boolean) ven0Var.getValue();
        qim0 qim0VarH = kx40.h(1.0f, qim0VarF2, bool != null ? bool.booleanValue() : false);
        cvx cvxVar2 = cbx.b(b0kVar).b;
        d36 d36Var = new d36(8.0f, true, new um5(false));
        boolean z3 = qom0Var2 instanceof oom0;
        if (z3 && ((oom0) qom0Var2).a) {
            b0kVar.i0(1155707977);
            b0kVar.r(false);
            zzq0VarC = uyn1.h(3, 0.0f, 0.0f);
            z = false;
        } else {
            b0kVar.i0(1155755593);
            WeakHashMap weakHashMap = osl1.x;
            zzq0VarC = hqq0.C(lhc.g(b0kVar).g, b0kVar);
            z = false;
            b0kVar.r(false);
        }
        boolean zI2 = (((i <= 32 || !b0kVar.i(zom0Var)) && (iIntValue & 48) != 32) ? z : true) | ((i2 > 256 && b0kVar.g(iu30Var2)) || (iIntValue & 384) == 256) | b0kVar.i(qom0Var2) | b0kVar.i(uwlVar);
        Object objT4 = b0kVar.T();
        if (zI2 || objT4 == m4cVar) {
            objT4 = new ggh(qom0Var2, zom0Var, iu30Var2, uwlVar, (byte) 17);
            qom0Var = qom0Var2;
            iu30Var = iu30Var2;
            b0kVar.s0(objT4);
        } else {
            iu30Var = iu30Var2;
            qom0Var = qom0Var2;
        }
        ujo1.d(qim0VarH, (xtb0) null, zzq0VarC, false, d36Var, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT4, b0kVar, 0, 490);
        b0k b0kVar2 = b0kVar;
        if (z3 && ((oom0) qom0Var).a) {
            b0kVar2.i0(1162402117);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 12.0f));
            jdx jdxVar = jdx.c;
            qim0 qim0VarN = anm1.N("move_to_folder_full_tree_move_here_button", new tq60(een.R0));
            String strO0 = cwl1.o0(b0kVar2, 2131964103);
            boolean z4 = (i2 > 256 && b0kVar2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT5 = b0kVar2.T();
            if (z4 || objT5 == m4cVar) {
                objT5 = new hbs(iu30Var, (byte) 1);
                b0kVar2.s0(objT5);
            }
            Function0 function0 = (Function0) objT5;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            foo1.c(new gbx(new y50(strO0), function0), jdxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, p2j.h, b0kVar2, 0, 48, 2040);
            b0kVar2 = b0kVar2;
            WeakHashMap weakHashMap2 = osl1.x;
            op71.g(b0kVar2, too1.y(nim0Var, new bgc0(lhc.g(b0kVar2).g, 32)));
            b0kVar2.r(false);
        } else {
            b0kVar2.i0(1163152658);
            b0kVar2.r(false);
        }
        b0kVar2.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        x2t0 x2t0Var = (x2t0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        res resVar = this.b;
        if ((iIntValue & 48) == 0) {
            i = ((iIntValue & 64) == 0 ? x340Var.g(x2t0Var) : x340Var.i(x2t0Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            x340Var2.b0();
        } else if (x2t0Var instanceof w2t0) {
            x340Var2.i0(-1029476773);
            x340Var2.r(false);
        } else {
            if (!(x2t0Var instanceof v2t0)) {
                throw p3d1.k(x340Var2, -1029477480, false);
            }
            x340Var2.i0(-1029475037);
            v2t0 v2t0Var = (v2t0) x2t0Var;
            ArrayList arrayList = v2t0Var.a;
            a3t0 a3t0Var = v2t0Var.b;
            xpw xpwVar = a3t0Var == a3t0.a ? (xpw) ((idd1) resVar.g).getValue() : (xpw) ((idd1) resVar.h).getValue();
            lqr lqrVar = (lqr) resVar.d;
            boolean z = v2t0Var.c;
            boolean z2 = v2t0Var.d;
            int i2 = i & 896;
            boolean z3 = i2 == 256;
            Object objT = x340Var2.T();
            if (z3 || objT == m4cVar) {
                objT = new hbs(iu30Var, (byte) 4);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z4 = i2 == 256;
            Object objT2 = x340Var2.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new hbs(iu30Var, (byte) 5);
                x340Var2.s0(objT2);
            }
            two1.j(arrayList, a3t0Var, xpwVar, lqrVar, z, z2, function0, (Function0) objT2, (qim0) null, x340Var2, 0);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        float f;
        long j;
        cr31 cr31Var;
        j2i j2iVarR;
        l6t0 l6t0Var = (l6t0) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = l6t0Var.a;
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(l6t0Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var2).a.b.c();
            cr31 cr31VarA = z ? er31.a : er31.a(0);
            wat watVar = (wat) x340Var2.k(t4k.h);
            x340Var2.i0(2085917812);
            float fY = watVar.y(cbx.b(x340Var2).a.d);
            x340Var2.r(false);
            x340Var2.i0(2085920599);
            float fY2 = watVar.y(cbx.b(x340Var2).a.c);
            x340Var2.r(false);
            cua cuaVar = cbx.b(x340Var2).f;
            cr31 cr31VarB = er31.b(6.0f);
            qim0 qim0VarN = anm1.N("PlaceholderRowElementTestTag", u291.d(nim0.a, 1.0f));
            if (((evm1) this.b.c).f()) {
                x340Var2.i0(239486009);
                zov0 zov0Var = cbx.b(x340Var2).g;
                x340Var2.r(false);
                f = 48.0f;
            } else {
                x340Var2.i0(239570329);
                zov0 zov0Var2 = cbx.b(x340Var2).g;
                x340Var2.r(false);
                f = 64.0f;
            }
            cvx cvxVar = cbx.b(x340Var2).b;
            zzq0 zzq0Var = new zzq0(12.0f, 0.0f, 12.0f, 0.0f);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            uvx uvxVar = new uvx(1, (pgx) null, 3, zzq0Var, (zzq0) null, new tvx(2.0f, 12.0f, 8.0f), (hw61) null, 0, new p3v(f), 210);
            if (z) {
                j = jC;
                cr31Var = cr31VarB;
                x340Var2.i0(240796782);
                x340Var2.r(false);
                j2iVarR = null;
            } else {
                x340Var2.i0(240544969);
                s7j s7jVar = new s7j(fY2, jC, cr31VarB, (byte) 2);
                j = jC;
                cr31Var = cr31VarB;
                j2iVarR = apo.r(-1189665399, s7jVar, x340Var2);
                x340Var2.r(false);
            }
            jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-1949420207, new r7j(cr31VarA, j, (byte) 1), x340Var2), (xu30) null, j2iVarR, (xu30) null, (xu30) null, (xu30) null, apo.r(-571508906, new s7j(fY, j, cr31Var, (byte) 3), x340Var2), x340Var2, 805306438, 196608, 30204);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        ams amsVar = this.b;
        jls jlsVar = (lls) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if (jlsVar instanceof kls) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1841602033);
            amsVar.f((qim0) null, x340Var2, 0);
            x340Var2.r(false);
        } else {
            if (!(jlsVar instanceof jls)) {
                throw p3d1.k(x340Var, 1841601151, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(1255136568);
            jls jlsVar2 = jlsVar;
            amsVar.e(jlsVar2.a, jlsVar2.d, jlsVar2.b, iu30Var, (qim0) null, x340Var3, (iIntValue << 3) & 7168);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        fms fmsVar = (fms) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        List list = fmsVar.b;
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        tm tmVar = this.b;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        ak3 ak3Var = fmsVar.a;
        int i = (iIntValue & 896) ^ 384;
        boolean z2 = true;
        boolean zI = ((i > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var3.i(fmsVar);
        Object objT = x340Var3.T();
        if (zI || objT == m4cVar) {
            objT = new hms(iu30Var, fmsVar, (byte) 0);
            x340Var3.s0(objT);
        }
        s8p1.a(ak3Var, (Function0) objT, x340Var, 0);
        x340Var3.i0(190209077);
        List listD1 = o7h.d1(list, 3);
        int size = listD1.size();
        int i2 = 0;
        while (i2 < size) {
            otw.c((nm1) tmVar.c, new s941((dk3) listD1.get(i2)), (qim0) null, (ipb1) null, x340Var, 0, 12);
            i2++;
            listD1 = listD1;
            size = size;
            z2 = true;
        }
        x340Var3.r(false);
        if (fmsVar.c) {
            x340Var3.i0(1601719809);
            int size2 = list.size();
            boolean zI2 = x340Var3.i(fmsVar) | ((i > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256);
            Object objT2 = x340Var3.T();
            if (zI2 || objT2 == m4cVar) {
                z = true;
                objT2 = new hms(iu30Var, fmsVar, (byte) 1);
                x340Var3.s0(objT2);
            } else {
                z = true;
            }
            s8p1.d(size2, 0, (Function0) objT2, x340Var);
            x340Var3.r(false);
        } else {
            z = true;
            x340Var3.i0(1601872608);
            x340Var3.r(false);
        }
        x340Var3.r(z);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xms xmsVar = (xms) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        d36 d36Var = new d36(4.0f, true, new um5(false));
        zms zmsVar = this.b;
        mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        x340Var3.i0(-789220928);
        List list = xmsVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wms wmsVar = (wms) list.get(i);
            otw.c(zmsVar.a, new ems(wmsVar.a, wmsVar.b), (qim0) null, (ipb1) null, x340Var, 0, 12);
        }
        x340Var3.r(false);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        e451 e451Var = (e451) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(e451Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            z351.a((i & 896) | 3072, e451Var.a, cwl1.o0(x340Var2, this.b.a ? 2131957316 : 2131957315), x340Var2, iu30Var, anm1.N("search_header_element_test_tag", nim0.a));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rw91 rw91Var = (rw91) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        ven0 ven0VarJ = f4p1.j(new xr0(this.b.c.b, (byte) 11), (Object) null, (iac0) null, x340Var, 48, 14);
        x340 x340Var2 = x340Var;
        Configuration configuration = (Configuration) x340Var2.k(AndroidCompositionLocals_androidKt.a);
        boolean zG = x340Var2.g((ltl1) ven0VarJ.getValue()) | x340Var2.d(configuration.fontScale);
        Object objT = x340Var2.T();
        if (zG || objT == m4cVar) {
            ltl1 ltl1Var = (ltl1) ven0VarJ.getValue();
            float f = configuration.fontScale;
            boolean zJ = u890.j(ltl1Var, ltl1.b);
            objT = unb0.b;
            unb0 unb0Var = unb0.a;
            if (!zJ ? !u890.j(ltl1Var, ltl1.c) ? !u890.j(ltl1Var, ltl1.d) || f >= 3.0f : f >= 2.5f : f >= 2.0f) {
                objT = unb0Var;
            }
            x340Var2.s0(objT);
        }
        unb0 unb0Var2 = (unb0) objT;
        String str = rw91Var.a;
        boolean z = rw91Var.b;
        qim0 qim0VarN = anm1.N("snooze_recommendation_header", u291.f(nim0.a, 1.0f));
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new hbs(iu30Var, (byte) 6);
            x340Var2.s0(objT2);
        }
        d1u.s(str, z, qim0VarN, unb0Var2, (Function0) objT2, x340Var2, 0);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gia1 gia1Var = (gia1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        int i = (iIntValue & 112) ^ 48;
        boolean z = (i > 32 && x340Var.g(gia1Var)) || (iIntValue & 48) == 32;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new vas(gia1Var, (byte) 17);
            x340Var2.s0(objT);
        }
        qim0 qim0VarB = s161.b(nim0.a, true, (iu30) objT);
        boolean z2 = ((((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256) | ((i > 32 && x340Var2.g(gia1Var)) || (iIntValue & 48) == 32);
        Object objT2 = x340Var2.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new nxr(iu30Var, gia1Var, (byte) 23);
            x340Var2.s0(objT2);
        }
        jto1.b(qim0VarB, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT2), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, gia1Var.a ? fkj.a : null, (xu30) null, (xu30) null, apo.r(779531871, new b1s(this.b, gia1Var), x340Var2), x340Var2, 0, 196608, 28606);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iia1 iia1Var = (iia1) obj2;
        int iIntValue = ((Number) obj5).intValue();
        Object obj6 = fkj0.X;
        x340 x340Var = (b0k) obj4;
        cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
        boolean zG = x340Var.g(cir0Var);
        br0 br0Var = this.b;
        Object objT = x340Var.T();
        if (zG || objT == obj6) {
            fvq fvqVar = (fvq) br0Var.c;
            xrs xrsVar = new xrs(cir0Var, (byte) 0);
            fvqVar.getClass();
            objT = new vrs(xrsVar);
            x340Var.s0(objT);
        }
        vrs vrsVar = (vrs) objT;
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        zzq0 zzq0Var = new zzq0(4.0f, 4.0f, 4.0f, 4.0f);
        WeakHashMap weakHashMap = osl1.x;
        hdh hdhVarN = lnn1.n(zzq0Var, hqq0.C(lhc.g(x340Var).g, x340Var));
        cvx cvxVar2 = cbx.b(x340Var).b;
        boolean z = true;
        d36 d36Var = new d36(4.0f, true, new um5(false));
        if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var.g(iia1Var)) && (iIntValue & 48) != 32) {
            z = false;
        }
        boolean zI = x340Var.i(vrsVar) | z;
        Object objT2 = x340Var.T();
        if (zI || objT2 == obj6) {
            objT2 = new wrs(iia1Var, vrsVar, (byte) 0);
            x340Var.s0(objT2);
        }
        s3o1.d(qim0VarF, (xtb0) null, hdhVarN, d36Var, (nl3) null, (iq20) null, false, (h3h1) null, (iu30) objT2, x340Var, 0, 490);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        rwk1 rwk1Var = (rwk1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if (rwk1Var instanceof owk1) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1743816097);
            x340Var2.r(false);
        } else {
            if (!(rwk1Var instanceof nwk1)) {
                throw p3d1.k(x340Var, 1026082577, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(1743876082);
            int i = iIntValue >> 3;
            wm5.p((nwk1) rwk1Var, iu30Var, apo.r(-1730098157, new g1o(this.b, rwk1Var, (byte) 27), x340Var3), u291.f(u291.z(nim0.a, (fra) null, 3), 1.0f), x340Var3, (i & 14) | 384 | (i & 112));
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        rix rixVar;
        Object next;
        c9 c9VarS;
        smc0 arrayList;
        Object obj7;
        z6x arrayList2;
        Object obj8;
        List list;
        String string;
        ztm1 ztm1Var = (ztm1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj4;
        boolean zG = x340Var.g(ztm1Var);
        y0t y0tVar = this.b;
        Object objT = x340Var.T();
        rix rixVar2 = qix.a;
        if (zG || objT == m4cVar) {
            List list2 = ztm1Var.a;
            List list3 = ztm1Var.b;
            boolean z = ztm1Var.f;
            List list4 = list2;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj9 : list4) {
                if (obj9 instanceof vod1) {
                    arrayList3.add(obj9);
                }
            }
            obj6 = null;
            if (arrayList3.isEmpty()) {
                List list5 = list3;
                ArrayList arrayList4 = new ArrayList(q7h.U(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    arrayList4.add((nix) y0tVar.e((otl) it.next()));
                }
                c9 c9VarF = mqo1.F(arrayList4);
                if (list2.isEmpty()) {
                    rixVar = rixVar2;
                } else {
                    nix nixVar = (nix) y0tVar.e((otl) o7h.q0(list2));
                    List listK0 = o7h.k0(list2, 1);
                    ArrayList arrayList5 = new ArrayList(listK0.size());
                    int size = listK0.size();
                    for (int i = 0; i < size; i++) {
                        arrayList5.add((oix) y0tVar.e((otl) listK0.get(i)));
                    }
                    rixVar = new rix(nixVar, mqo1.F(arrayList5));
                }
                objT = new tix(c9VarF, rixVar, z, 44);
            } else {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj10 : list3) {
                    if (obj10 instanceof d6c0) {
                        arrayList6.add(obj10);
                    }
                }
                we20 we20Var = y0tVar.a;
                Iterator it2 = list4.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(((otl) next) instanceof d6c0));
                otl otlVar = (otl) next;
                nix nixVarG = y0tVar.g((vod1) o7h.q0(arrayList3), arrayList6);
                c9 c9VarS2 = mqo1.s(new nix[]{nixVarG});
                if (otlVar == null || (c9VarS = mqo1.s(new oix[]{new oix(otlVar.getId(), we20Var.b(otlVar), 8, we20Var.a(otlVar))})) == null) {
                    c9VarS = fg91.b;
                }
                objT = new tix(c9VarS2, new rix(nixVarG, c9VarS), false, 44);
            }
            x340Var.s0(objT);
        } else {
            obj6 = null;
        }
        tix tixVar = (tix) objT;
        boolean zG2 = x340Var.g(tixVar);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == m4cVar) {
            six sixVar = tixVar.b;
            List list6 = tixVar.a;
            if (sixVar instanceof rix) {
                int size2 = list6.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        obj7 = obj6;
                        break;
                    }
                    obj7 = list6.get(i2);
                    if (u890.j(((nix) obj7).a, ((rix) sixVar).a.a)) {
                        break;
                    }
                    i2++;
                }
                nix nixVar2 = (nix) obj7;
                smc0 smc0VarN = k4p1.n();
                rix rixVar3 = (rix) sixVar;
                List list7 = rixVar3.b;
                smc0VarN.add(rixVar3.a.a);
                if (!list7.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList(list7.size());
                    int size3 = list7.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        arrayList7.add(((oix) list7.get(i3)).a);
                    }
                    smc0VarN.addAll(arrayList7);
                    if (nixVar2 != null) {
                        List list8 = nixVar2.c;
                        Iterator it3 = list7.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj11 : list8) {
                                    oix oixVar = (oix) obj11;
                                    List list9 = list7;
                                    if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                                        Iterator it4 = list9.iterator();
                                        do {
                                            if (it4.hasNext()) {
                                            }
                                        } while (!u890.j(((oix) it4.next()).a, oixVar.a));
                                    }
                                    arrayList8.add(obj11);
                                }
                                arrayList2 = new ArrayList(arrayList8.size());
                                int size4 = arrayList8.size();
                                for (int i4 = 0; i4 < size4; i4++) {
                                    arrayList2.add(((oix) arrayList8.get(i4)).a);
                                }
                                break;
                            }
                            oix oixVar2 = (oix) it3.next();
                            int size5 = list8.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size5) {
                                    obj8 = obj6;
                                    break;
                                }
                                obj8 = list8.get(i5);
                                List list10 = list8;
                                if (u890.j(((oix) obj8).a, oixVar2.a)) {
                                    break;
                                }
                                i5++;
                                list8 = list10;
                            }
                            oix oixVar3 = (oix) obj8;
                            if (oixVar3 == null || (list8 = oixVar3.d) == null) {
                                arrayList2 = z6x.a;
                                break;
                            }
                        }
                        smc0VarN.addAll((Collection) arrayList2);
                    }
                } else if (nixVar2 != null && (list = nixVar2.c) != null) {
                    ArrayList arrayList9 = new ArrayList(list.size());
                    int size6 = list.size();
                    for (int i6 = 0; i6 < size6; i6++) {
                        arrayList9.add(((oix) list.get(i6)).a);
                    }
                    smc0VarN.addAll(arrayList9);
                }
                arrayList = k4p1.k(smc0VarN);
            } else {
                if (!sixVar.equals(rixVar2)) {
                    eg.o();
                    return obj6;
                }
                arrayList = new ArrayList(list6.size());
                int size7 = list6.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    arrayList.add(((nix) list6.get(i7)).a);
                }
            }
            objT2 = arrayList;
            x340Var.s0(objT2);
        }
        List list11 = (List) objT2;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var.T();
        if (z2 || objT3 == m4cVar) {
            objT3 = new hws(iu30Var, (byte) 5);
            x340Var.s0(objT3);
        }
        iu30 iu30Var2 = (iu30) objT3;
        qim0 qim0VarX = uyn1.x(u291.f(nim0.a, 1.0f), dsa0.m(x340Var, 2131165905));
        String strY0 = o7h.y0(tixVar.a, "_", (String) null, (String) null, tsm1.d, 30);
        six sixVar2 = tixVar.b;
        if (sixVar2.equals(rixVar2)) {
            string = "_none";
        } else {
            if (!(sixVar2 instanceof rix)) {
                eg.o();
                return obj6;
            }
            rix rixVar4 = (rix) sixVar2;
            nix nixVar3 = rixVar4.a;
            String str = nixVar3.a;
            String strY1 = o7h.y0(nixVar3.c, "_", (String) null, (String) null, tsm1.e, 30);
            String strY2 = o7h.y0(rixVar4.b, "_", (String) null, (String) null, tsm1.f, 30);
            StringBuilder sbN = gvg.n("_primary_filter_selected_", str, "_secondary_filter_in_primary_filter_", strY1, "_secondary_filters_selected_");
            sbN.append(strY2);
            string = sbN.toString();
        }
        pro1.e(tixVar, iu30Var2, anm1.N("your_library_filter_row_element_" + strY0 + string + (tixVar.d ? "_configurable" : "_non_configurable"), qim0VarX), (vzq0) null, apo.r(969832767, new e6j(list11, y0tVar, (byte) 20), x340Var), x340Var, 196608, 24);
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        float f;
        ovm1 ovm1Var = (ovm1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        h1t h1tVar = this.b;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(ovm1Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var2);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = h1tVar.a.a(h1tVar.b, (r6h1) h1tVar.h.getValue(), new bzm(ven0VarS, (byte) 28));
                x340Var2.s0(objT);
            }
            me10 me10Var = (me10) objT;
            boolean z = h1tVar.e;
            int i2 = (i >> 3) & 14;
            String str = pvm1.a;
            String strO0 = cwl1.o0(x340Var2, z ? 2131957259 : 2131957256);
            ke10 ke10Var = new ke10(1, 32, strO0, x0d.k(x340Var2, 1779202262, 2131957252, x340Var2, false), cwl1.o0(x340Var2, 2131957248), cwl1.o0(x340Var2, z ? 2131957258 : 2131957257));
            int iOrdinal = h1tVar.c.E().ordinal();
            if (iOrdinal == 0) {
                f = 24.0f;
            } else if (iOrdinal == 1) {
                f = 8.0f;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                f = 0.0f;
            }
            pvm1.a(ovm1Var, me10Var, ke10Var, f, h1tVar.e, iu30Var, x340Var2, i2 | ((i << 9) & 458752));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        gxm1 gxm1Var = (gxm1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        Object obj6 = fkj0.X;
        x1t x1tVar = this.b;
        if ((iIntValue & 48) == 0) {
            i = ((iIntValue & 64) == 0 ? x340Var.g(gxm1Var) : x340Var.i(gxm1Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            tbr0 tbr0Var = x1tVar.d;
            boolean zG = x340Var2.g(tbr0Var);
            Object objT = x340Var2.T();
            if (zG || objT == obj6) {
                objT = new bzr(tbr0Var, (rvq) ((jly0) ((byp) x1tVar.a.a.c).e).get());
                x340Var2.s0(objT);
            }
            bzr bzrVar = (bzr) objT;
            boolean zG2 = x340Var2.g(tbr0Var);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == obj6) {
                if (x1tVar.e) {
                    byp bypVar = (byp) x1tVar.b.a.c;
                    euz euzVar = (euz) ((jly0) bypVar.d).get();
                    objT2 = new azr(euzVar, tbr0Var);
                } else {
                    objT2 = null;
                }
                x340Var2.s0(objT2);
            }
            azr azrVar = (azr) objT2;
            if (gxm1Var instanceof fxm1) {
                x340Var2.i0(495512073);
                ixm1.a(x340Var2, 0);
                x340Var2.r(false);
            } else {
                if (!(gxm1Var instanceof exm1)) {
                    throw p3d1.k(x340Var2, 495511115, false);
                }
                x340Var2.i0(495513992);
                exm1 exm1Var = (exm1) gxm1Var;
                List list = exm1Var.a;
                boolean z = exm1Var.b;
                boolean z2 = (i & 896) == 256;
                Object objT3 = x340Var2.T();
                if (z2 || objT3 == obj6) {
                    objT3 = new hbs(iu30Var, (byte) 14);
                    x340Var2.s0(objT3);
                }
                ixm1.c(list, z, bzrVar, azrVar, (Function0) objT3, x340Var2, 0);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new hbs(iu30Var, (byte) 16);
            x340Var2.s0(objT);
        }
        fn31.b((Function0) objT, apo.r(-1070981095, new v0j(iu30Var, (byte) 22), x340Var2), (qim0) null, apo.r(-1306254633, new v0j(iu30Var, (byte) 23), x340Var2), yii.c, apo.r(-1659164940, new v8t(this.b, (byte) 0), x340Var2), (hw61) null, 0L, 0L, 0L, 0L, (i3u) null, x340Var2, 1772592, 16276);
        return rih1.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long jA;
        llt lltVar = (llt) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = lltVar.c.length() > 0;
        ven0 ven0VarH = rwq.h(lltVar.e, x340Var, 0);
        ven0 ven0VarH2 = rwq.h(lltVar.f.b, x340Var, 0);
        u7h u7hVar = lltVar.d;
        if (u7hVar == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1601792639);
            uwr uwrVar = cbx.a;
            jA = cbx.a(x340Var2).a.a.a();
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1601790748);
            x340Var3.r(false);
            jA = u7hVar.a;
        }
        uwr uwrVar2 = cbx.a;
        mic0 mic0VarS = v9c.s(p7h.M(new u7h[]{new u7h(jA), new u7h(cbx.a(x340Var).a.c)}), 0.0f, Float.POSITIVE_INFINITY, 8);
        x340 x340Var4 = x340Var;
        wat watVar = (wat) x340Var4.k(t4k.h);
        Integer num = ((olt) ven0VarH2.getValue()).e;
        zr7.a(lltVar, z, ((olt) ven0VarH2.getValue()).c, num != null ? watVar.M0(num.intValue()) : 88.0f, ((Number) ven0VarH.getValue()).floatValue(), mic0VarS, (hlt) ((idd1) this.b.g).getValue(), x340Var4, ((iIntValue >> 3) & 14) | 2097152);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        boolean z2;
        int i;
        Rect rect;
        a04 a04Var;
        o95 o95Var;
        int i2;
        bnl bnlVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b = this.a;
        float f = 8.0f;
        nim0 nim0Var = nim0.a;
        boolean z3 = true;
        rih1 rih1Var = rih1.a;
        bmt bmtVar = this.b;
        switch (b) {
            case 0:
                h6r h6rVar = (h6r) obj2;
                iu30 iu30Var = (iu30) obj3;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                Date date = h6rVar.b;
                x340 x340Var = (b0k) obj4;
                boolean zG = x340Var.g(date);
                j6r j6rVar = (j6r) bmtVar;
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = date != null ? j6rVar.a.a.format(date) : "";
                    x340Var.s0(objT);
                }
                String str = (String) objT;
                String strO0 = cwl1.o0(x340Var, 2131958098);
                boolean z4 = h6rVar.c;
                qim0 qim0VarN = nim0.a;
                if (z4) {
                    x340Var.i0(-306973556);
                    String strO1 = cwl1.o0(x340Var, 2131958097);
                    pm31 pm31Var = new pm31(0);
                    if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
                        z3 = false;
                    }
                    Object objT2 = x340Var.T();
                    if (z3 || objT2 == m4cVar) {
                        objT2 = new qzn(iu30Var, (byte) 16);
                        x340Var.s0(objT2);
                    }
                    qim0VarN = anm1.N("date-of-birth-element", bin.x(qim0VarN, false, strO1, pm31Var, (idn0) null, (Function0) objT2, 9));
                } else {
                    x340Var.i0(-307017762);
                }
                x340Var.r(false);
                yxo1.a(strO0, str, qim0VarN, z4, x340Var, 0, 0);
                return rih1Var;
            case 1:
                v9r v9rVar = (v9r) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                umf0 umf0Var = (umf0) bmtVar;
                if ((((iIntValue2 & 896) ^ 384) <= 256 || !x340Var2.g(iu30Var2)) && (iIntValue2 & 384) != 256) {
                    z3 = false;
                }
                x340 x340Var3 = x340Var2;
                boolean zI = x340Var3.i(umf0Var) | z3;
                Object objT3 = x340Var3.T();
                if (zI || objT3 == fkj0.X) {
                    objT3 = new sqm(iu30Var2, umf0Var, (byte) 19);
                    x340Var3.s0(objT3);
                }
                foo1.c(new gbx(z50.c, (Function0) objT3), new idx(19), anm1.N("allboarding_notification_permission_decline_button", nim0Var), (max) null, yla.r(x340Var3), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-462698181, new i4o(v9rVar, (byte) 8), x340Var3), x340Var3, 0, 48, 2008);
                return rih1Var;
            case 2:
                bmr bmrVar = (bmr) bmtVar;
                hsf hsfVar = (hsf) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                vba0 vba0Var = hsfVar.a;
                if (vba0Var instanceof sba0) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(-486102374);
                    String strO2 = cwl1.o0(x340Var5, 2131956890);
                    boolean zI2 = x340Var5.i(hsfVar) | ((((iIntValue3 & 896) ^ 384) > 256 && x340Var5.g(iu30Var3)) || (iIntValue3 & 384) == 256);
                    Object objT4 = x340Var5.T();
                    if (zI2 || objT4 == m4cVar2) {
                        z2 = false;
                        objT4 = new amr(iu30Var3, hsfVar, (byte) 0);
                        x340Var5.s0(objT4);
                    } else {
                        z2 = false;
                    }
                    bmrVar.e(48, strO2, (Function0) objT4, x340Var5, true);
                    x340Var5.r(z2);
                } else if (vba0Var instanceof uba0) {
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(-485824490);
                    String strO3 = cwl1.o0(x340Var6, 2131956893);
                    boolean zI3 = ((((iIntValue3 & 896) ^ 384) > 256 && x340Var6.g(iu30Var3)) || (iIntValue3 & 384) == 256) | x340Var6.i(hsfVar);
                    Object objT5 = x340Var6.T();
                    if (zI3 || objT5 == m4cVar2) {
                        objT5 = new amr(iu30Var3, hsfVar, (byte) 1);
                        x340Var6.s0(objT5);
                    }
                    bmrVar.e(48, strO3, (Function0) objT5, x340Var6, true);
                    x340Var6.r(false);
                } else {
                    boolean z5 = true;
                    if (vba0Var instanceof qba0) {
                        x340 x340Var7 = x340Var4;
                        x340Var7.i0(1924000639);
                        String strO4 = cwl1.o0(x340Var7, 2131956889);
                        if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var7.g(iu30Var3)) && (iIntValue3 & 384) != 256) {
                            z5 = false;
                        }
                        boolean zI4 = x340Var7.i(hsfVar) | z5;
                        Object objT6 = x340Var7.T();
                        if (zI4 || objT6 == m4cVar2) {
                            objT6 = new amr(iu30Var3, hsfVar, (byte) 2);
                            x340Var7.s0(objT6);
                        }
                        bmrVar.e(48, strO4, (Function0) objT6, x340Var7, true);
                        x340Var7.r(false);
                    } else if (vba0Var instanceof tba0) {
                        x340 x340Var8 = x340Var4;
                        x340Var8.i0(1924010756);
                        String strO5 = cwl1.o0(x340Var8, 2131956892);
                        uwr uwrVar = cbx.a;
                        u7h u7hVar = new u7h(cbx.a(x340Var8).c.c);
                        if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var8.g(iu30Var3)) && (iIntValue3 & 384) != 256) {
                            z5 = false;
                        }
                        boolean zI5 = x340Var8.i(hsfVar) | z5;
                        Object objT7 = x340Var8.T();
                        if (zI5 || objT7 == m4cVar2) {
                            objT7 = new amr(iu30Var3, hsfVar, (byte) 3);
                            x340Var8.s0(objT7);
                        }
                        ywo1.c(strO5, u7hVar, (Function0) objT7, x340Var8, 0, 0);
                        x340Var8.r(false);
                    } else {
                        if (!vba0Var.equals(rba0.a)) {
                            throw p3d1.k(x340Var4, 1923981998, false);
                        }
                        x340 x340Var9 = x340Var4;
                        x340Var9.i0(1924026012);
                        if (((no4) bmrVar.f.a.get()).l()) {
                            x340Var9.i0(-484698632);
                            String strO6 = cwl1.o0(x340Var9, 2131956891);
                            if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var9.g(iu30Var3)) && (iIntValue3 & 384) != 256) {
                                z5 = false;
                            }
                            Object objT8 = x340Var9.T();
                            if (z5 || objT8 == m4cVar2) {
                                objT8 = new qzn(iu30Var3, (byte) 19);
                                x340Var9.s0(objT8);
                            }
                            ywo1.c(strO6, (u7h) null, (Function0) objT8, x340Var9, 0, 2);
                            z = false;
                            x340Var9.r(false);
                        } else {
                            x340Var9.i0(-484472456);
                            String strO7 = cwl1.o0(x340Var9, 2131956891);
                            if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var9.g(iu30Var3)) && (iIntValue3 & 384) != 256) {
                                z5 = false;
                            }
                            Object objT9 = x340Var9.T();
                            if (z5 || objT9 == m4cVar2) {
                                objT9 = new qzn(iu30Var3, (byte) 20);
                                x340Var9.s0(objT9);
                            }
                            bmrVar.e(48, strO7, (Function0) objT9, x340Var9, false);
                            z = false;
                            x340Var9.r(false);
                        }
                        x340Var9.r(z);
                    }
                }
                return rih1Var;
            case 3:
                g3l g3lVar = (g3l) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                aor aorVar = (aor) bmtVar;
                boolean z6 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var10.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                x340 x340Var11 = x340Var10;
                Object objT10 = x340Var11.T();
                if (z6 || objT10 == fkj0.X) {
                    objT10 = new qzn(iu30Var4, (byte) 21);
                    x340Var11.s0(objT10);
                }
                aorVar.e(g3lVar, (Function0) objT10, x340Var11, 8 | ((iIntValue4 >> 3) & 14));
                return rih1Var;
            case 4:
                bnl bnlVar2 = (bnl) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                ((Number) obj5).intValue();
                spr sprVar = (spr) bmtVar;
                int i9 = bnlVar2.e;
                x340 x340Var12 = (b0k) obj4;
                Object objT11 = x340Var12.T();
                m4c m4cVar3 = fkj0.X;
                if (objT11 == m4cVar3) {
                    objT11 = v8r.q((Object) null);
                    x340Var12.s0(objT11);
                }
                ven0 ven0Var = (ven0) objT11;
                Object objT12 = x340Var12.T();
                if (objT12 == m4cVar3) {
                    objT12 = new zen0(Boolean.FALSE);
                    x340Var12.s0(objT12);
                }
                zen0 zen0Var = (zen0) objT12;
                Object objT13 = x340Var12.T();
                if (objT13 == m4cVar3) {
                    objT13 = c97.b(-0.5f);
                    x340Var12.s0(objT13);
                }
                o95 o95Var2 = (o95) objT13;
                Object objT14 = x340Var12.T();
                if (objT14 == m4cVar3) {
                    objT14 = v8r.q(ur80.e);
                    x340Var12.s0(objT14);
                }
                ven0 ven0Var2 = (ven0) objT14;
                tob1 tob1VarA = w191.a(z4p1.e(bnlVar2.b), irn1.o0(300, 0, (dlv) null, 6), "background color animation", x340Var12, 384, 8);
                tob1 tob1VarA2 = w191.a(z4p1.e(bnlVar2.c), irn1.o0(300, 0, (dlv) null, 6), "border color animation", x340Var12, 384, 8);
                View view = ((wnr) sprVar.i.getValue()).b;
                if (view == null) {
                    rect = null;
                    i = 1;
                } else if (!view.isAttachedToWindow() || view.getWidth() <= 0 || view.getHeight() <= 0) {
                    i = 1;
                    rect = null;
                } else {
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    int i10 = iArr[0];
                    i = 1;
                    rect = new Rect(i10, iArr[1], view.getWidth() + i10, view.getHeight() + iArr[1]);
                }
                ur80 ur80Var = (ur80) ven0Var2.getValue();
                hrr0 hrr0Var = zen0Var.c;
                hrr0 hrr0Var2 = zen0Var.d;
                int i11 = ((Boolean) hrr0Var.getValue()).booleanValue() != ((Boolean) hrr0Var2.getValue()).booleanValue() ? i : 0;
                if (rect == null || rect.width() <= 0 || rect.height() <= 0) {
                    a04Var = new a04(false, 0, (Rect) null);
                } else {
                    if (ur80Var.d() <= 0 || ur80Var.b() <= 0) {
                        i3 = i;
                        i4 = 0;
                    } else {
                        i4 = i;
                        i3 = i4;
                    }
                    if (i9 != i3 || i4 == 0) {
                        a04Var = new a04(false, 0, rect);
                    } else {
                        int iB = rect.bottom - (ur80Var.b() + ur80Var.b);
                        if (iB < 0) {
                            iB = 0;
                        }
                        if (i11 == 0) {
                            iB = 0;
                        }
                        a04Var = new a04(true, iB, rect);
                    }
                }
                ah91 ah91Var = bnlVar2.a;
                boolean zI6 = x340Var12.i(bnlVar2) | x340Var12.i(ven0Var2) | x340Var12.i(ven0Var) | x340Var12.i(zen0Var);
                Object objT15 = x340Var12.T();
                if (zI6 || objT15 == m4cVar3) {
                    objT15 = new sr1((Object) bnlVar2, (Object) zen0Var, ven0Var2, ven0Var, (lnm) null, (byte) 10);
                    x340Var12.s0(objT15);
                }
                qxd0.t(ah91Var, x340Var12, (vu30) objT15);
                Object value = hrr0Var2.getValue();
                Boolean boolValueOf = Boolean.valueOf(bnlVar2.d);
                boolean zI7 = x340Var12.i(zen0Var) | x340Var12.i(bnlVar2) | x340Var12.i(o95Var2);
                Object objT16 = x340Var12.T();
                if (zI7 || objT16 == m4cVar3) {
                    objT16 = new hxn(zen0Var, bnlVar2, o95Var2, (lnm) null, (byte) 9);
                    o95Var = o95Var2;
                    x340Var12.s0(objT16);
                } else {
                    o95Var = o95Var2;
                }
                qxd0.s(value, boolValueOf, (vu30) objT16, x340Var12);
                if (((Boolean) zen0Var.c.getValue()).booleanValue() || ((Boolean) hrr0Var2.getValue()).booleanValue()) {
                    x340Var12.i0(313657433);
                    boolean zI8 = x340Var12.i(ven0Var2);
                    Object objT17 = x340Var12.T();
                    if (zI8 || objT17 == m4cVar3) {
                        objT17 = new bzm(ven0Var2, (byte) 22);
                        x340Var12.s0(objT17);
                    }
                    iu30 iu30Var6 = (iu30) objT17;
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var12).b;
                    kiv kivVar = t4k.h;
                    int iI0 = ((wat) x340Var12.k(kivVar)).i0(4.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    u85 u85Var = lhc.g(x340Var12).g;
                    int i12 = u85Var.e().b;
                    int i13 = u85Var.e().d;
                    boolean zE = x340Var12.e(iI0) | x340Var12.e(i12) | x340Var12.e(i13) | x340Var12.e(l1d.C(i9));
                    int i14 = a04Var.c;
                    boolean zE2 = zE | x340Var12.e(i14) | x340Var12.g(iu30Var6);
                    Object objT18 = x340Var12.T();
                    if (zE2 || objT18 == m4cVar3) {
                        i2 = i14;
                        objT18 = new cnl(i2, i9, iI0, i12, i13, iu30Var6);
                        x340Var12.s0(objT18);
                    } else {
                        i2 = i14;
                    }
                    bnlVar = bnlVar2;
                    sy4.a((cnl) objT18, (Function0) null, new nfv0(20, false, false, false), apo.r(44500296, new rpr(ven0Var, sprVar, a04Var.a, a04Var.b, zen0Var, i2, ven0Var2, bnlVar2, o95Var, iu30Var5, tob1VarA, tob1VarA2), x340Var12), x340Var12, 3072, 2);
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(318325971);
                    x340Var12.r(false);
                    bnlVar = bnlVar2;
                }
                boolean zI9 = x340Var12.i(sprVar) | x340Var12.i(bnlVar) | x340Var12.i(ven0Var);
                Object objT19 = x340Var12.T();
                if (zI9 || objT19 == m4cVar3) {
                    objT19 = new m3n(sprVar, bnlVar, ven0Var, (byte) 8);
                    x340Var12.s0(objT19);
                }
                qxd0.i(rih1Var, (iu30) objT19, x340Var12);
                return rih1Var;
            case 5:
                mpy mpyVar = (mpy) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                boolean z7 = mpyVar.a.f && !mpyVar.f;
                qim0 qim0VarN2 = anm1.N("EntityRowElementTestTag", u291.f(nim0Var, 1.0f));
                wpx wpxVar = wpx.c;
                boolean z8 = (((iIntValue5 & 896) ^ 384) > 256 && x340Var13.g(iu30Var7)) || (iIntValue5 & 384) == 256;
                x340 x340Var14 = x340Var13;
                Object objT20 = x340Var14.T();
                if (z8 || objT20 == fkj0.X) {
                    objT20 = new qzn(iu30Var7, (byte) 22);
                    x340Var14.s0(objT20);
                }
                puo1.c(qim0VarN2, new n9d1(1, (Function0) objT20, wpxVar), (n9d1) null, z7, apo.r(1783098445, new won(mpyVar, iu30Var7, (pt) bmtVar, (byte) 8), x340Var14), x340Var14, 24582, 4);
                return rih1Var;
            case 6:
                ic20 ic20Var = (ic20) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                if ((iIntValue6 & 48) == 0) {
                    i5 = iIntValue6 | ((iIntValue6 & 64) == 0 ? x340Var15.g(ic20Var) : x340Var15.i(ic20Var) ? 32 : 16);
                } else {
                    i5 = iIntValue6;
                }
                if ((iIntValue6 & 384) == 0) {
                    i5 |= x340Var15.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    int i15 = i5 & 896;
                    boolean z9 = i15 == 256;
                    Object objT21 = x340Var16.T();
                    if (z9 || objT21 == m4cVar4) {
                        objT21 = new mwr(iu30Var8, (byte) 12);
                        x340Var16.s0(objT21);
                    }
                    iu30 iu30Var9 = (iu30) objT21;
                    z3 = i15 == 256;
                    Object objT22 = x340Var16.T();
                    if (z3 || objT22 == m4cVar4) {
                        objT22 = new mwr(iu30Var8, (byte) 13);
                        x340Var16.s0(objT22);
                    }
                    m1p1.g(ic20Var, iu30Var9, (iu30) objT22, ((azr) bmtVar).b, x340Var16, (i5 >> 3) & 14);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 7:
                ee20 ee20Var = (ee20) obj2;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if ((iIntValue7 & 48) == 0) {
                    iIntValue7 |= x340Var17.g(ee20Var) ? 32 : 16;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue7 & 1, (iIntValue7 & 1041) != 1040)) {
                    boolean zBooleanValue = ((Boolean) x340Var18.k(ixm1.a)).booleanValue();
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    bzr bzrVar = (bzr) bmtVar;
                    mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var18, 6);
                    int iHashCode = Long.hashCode(x340Var18.T);
                    xos0 xos0VarM = x340Var18.m();
                    qim0 qim0VarE = zr7.E(x340Var18, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var18.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var18.m0();
                    if (x340Var18.S) {
                        x340Var18.l(hmb0.t1);
                    } else {
                        x340Var18.v0();
                    }
                    nko1.H(mbhVarA, x340Var18, y580.O0);
                    nko1.H(xos0VarM, x340Var18, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var18, y580.R0);
                    nko1.F(x340Var18);
                    nko1.H(qim0VarE, x340Var18, y580.Y);
                    String str2 = ee20Var.a.a;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var18).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var18, 0, 0, 2042);
                    k5p1.d(u291.f(nim0Var, 1.0f), new d36(8.0f, true, new um5(false)), new d36(16.0f, true, new um5(false)), (pl3) null, 0, 0, apo.r(-1112729817, new o3(ee20Var, bzrVar, zBooleanValue, (byte) 12), x340Var18), x340Var18, 1573302, 56);
                    x340Var18.r(true);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 8:
                v130 v130Var = (v130) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                tzr tzrVar = (tzr) bmtVar;
                if ((iIntValue8 & 48) == 0) {
                    i6 = iIntValue8 | ((iIntValue8 & 64) == 0 ? x340Var19.g(v130Var) : x340Var19.i(v130Var) ? 32 : 16);
                } else {
                    i6 = iIntValue8;
                }
                if ((iIntValue8 & 384) == 0) {
                    i6 |= x340Var19.i(iu30Var10) ? 256 : 128;
                }
                x340 x340Var20 = x340Var19;
                if (!x340Var20.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    x340Var20.b0();
                    return rih1Var;
                }
                ven0 ven0VarS = v8r.s(iu30Var10, x340Var20);
                Object objT23 = x340Var20.T();
                if (objT23 == fkj0.X) {
                    objT23 = tzrVar.a.a(tzrVar.b, (r6h1) tzrVar.f.getValue(), new bzm(ven0VarS, (byte) 24));
                    x340Var20.s0(objT23);
                }
                me10 me10Var = (me10) objT23;
                String str3 = v130Var.a;
                ke10 ke10Var = new ke10(2, 36, str3, (String) null, cwl1.o0(x340Var20, 2131957248), cwl1.n0(2131957249, new Object[]{str3}, x340Var20));
                int iOrdinal = tzrVar.c.E().ordinal();
                if (iOrdinal == 0) {
                    f = 24.0f;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    f = 0.0f;
                }
                w130.a(v130Var, me10Var, ke10Var, f, iu30Var10, x340Var20, ((i6 >> 3) & 14) | (57344 & (i6 << 6)));
                return rih1Var;
            case 9:
                og60 og60Var = (og60) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((iIntValue9 & 48) == 0) {
                    i7 = iIntValue9 | (x340Var21.g(og60Var) ? 32 : 16);
                } else {
                    i7 = iIntValue9;
                }
                if ((iIntValue9 & 384) == 0) {
                    i7 |= x340Var21.i(iu30Var11) ? 256 : 128;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(i7 & 1, (i7 & 1169) != 1168)) {
                    int i16 = i7 >> 3;
                    fqo1.k(og60Var, iu30Var11, (ltm1) ((ldo) bmtVar).c, u291.f(nim0Var, 1.0f), x340Var22, (i16 & 112) | (i16 & 14) | 3072);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 10:
                jfj0 jfj0Var = (jfj0) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                r8s r8sVar = (r8s) bmtVar;
                boolean z10 = (((iIntValue10 & 896) ^ 384) > 256 && x340Var23.g(iu30Var12)) || (iIntValue10 & 384) == 256;
                x340 x340Var24 = x340Var23;
                Object objT24 = x340Var24.T();
                if (z10 || objT24 == fkj0.X) {
                    objT24 = new qzn(iu30Var12, (byte) 25);
                    x340Var24.s0(objT24);
                }
                q3p1.b(0, 1, (Function0) objT24, x340Var24, false);
                mod.b(oi7.a.a((gw70) r8sVar.c), apo.r(1554157657, new won(r8sVar, iu30Var12, jfj0Var, (byte) 12), x340Var24), x340Var24, 56);
                return rih1Var;
            case 11:
                gom0 gom0Var = (gom0) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                int iIntValue11 = ((Number) obj5).intValue();
                x340 x340Var25 = (b0k) obj4;
                ((z72) bmtVar).Z = ((cir0) x340Var25.k(k2r0.a)).c();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                d36 d36Var = new d36(8.0f, true, new um5(false));
                zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
                WeakHashMap weakHashMap2 = osl1.x;
                hdh hdhVarN = lnn1.n(zzq0Var, hqq0.C(lhc.g(x340Var25).g, x340Var25));
                boolean z11 = (((iIntValue11 & 896) ^ 384) > 256 && x340Var25.g(iu30Var13)) || (iIntValue11 & 384) == 256;
                if ((((iIntValue11 & 112) ^ 48) <= 32 || !x340Var25.g(gom0Var)) && (iIntValue11 & 48) != 32) {
                    z3 = false;
                }
                boolean z12 = z11 | z3;
                Object objT25 = x340Var25.T();
                if (z12 || objT25 == fkj0.X) {
                    objT25 = new y0o(gom0Var, iu30Var13, (byte) 24);
                    x340Var25.s0(objT25);
                }
                ujo1.d(qim0VarF2, (xtb0) null, hdhVarN, false, d36Var, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT25, x340Var25, 0, 490);
                return rih1Var;
            case 12:
                return a(obj, obj2, obj3, obj4, obj5);
            case 13:
                ggq0 ggq0Var = (ggq0) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                if ((iIntValue12 & 48) == 0) {
                    i8 = iIntValue12 | (x340Var26.g(ggq0Var) ? 32 : 16);
                } else {
                    i8 = iIntValue12;
                }
                if ((iIntValue12 & 384) == 0) {
                    i8 |= x340Var26.i(iu30Var14) ? 256 : 128;
                }
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(i8 & 1, (i8 & 1169) != 1168)) {
                    u7n0.l(ggq0Var.b, ggq0Var.c, ggq0Var.d, ((evm1) ((umf0) bmtVar).d).f(), iu30Var14, u291.f(nim0Var, 1.0f), x340Var27, ((i8 << 6) & 57344) | 196608);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 14:
                return d(obj, obj2, obj3, obj4, obj5);
            case 15:
                return e(obj, obj2, obj3, obj4, obj5);
            case 16:
                return f(obj, obj2, obj3, obj4, obj5);
            case 17:
                return g(obj, obj2, obj3, obj4, obj5);
            case 18:
                return h(obj, obj2, obj3, obj4, obj5);
            case 19:
                return i(obj, obj2, obj3, obj4, obj5);
            case 20:
                return j(obj, obj2, obj3, obj4, obj5);
            case 21:
                return k(obj, obj2, obj3, obj4, obj5);
            case 22:
                return m(obj, obj2, obj3, obj4, obj5);
            case 23:
                return n(obj, obj2, obj3, obj4, obj5);
            case 24:
                return o(obj, obj2, obj3, obj4, obj5);
            case 25:
                return p(obj, obj2, obj3, obj4, obj5);
            case 26:
                return q(obj, obj2, obj3, obj4, obj5);
            case 27:
                return r(obj, obj2, obj3, obj4, obj5);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return s(obj, obj2, obj3, obj4, obj5);
            default:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(bmtVar.b), apo.r(-560560030, new o1t((iu30) obj3, (wlt) obj2, (byte) 6), b0kVar), b0kVar, 56);
                return rih1Var;
        }
    }
}
