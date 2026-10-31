package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.libraryimportservice.tmm.ItemAlternative;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c9y extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9y(r4k0 r4k0Var, vzq0 vzq0Var, s5k0 s5k0Var, iu30 iu30Var) {
        super(3);
        this.a = (byte) 14;
        this.c = r4k0Var;
        this.b = vzq0Var;
        this.d = s5k0Var;
        this.e = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        r4k0 r4k0Var = (r4k0) this.c;
        gub1 gub1Var = (gub1) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.e;
        vzq0 vzq0Var = (vzq0) this.b;
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(gub1Var) : x340Var.i(gub1Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zEquals = gub1Var.equals(ztb1.a);
            nim0 nim0Var = nim0.a;
            if (zEquals) {
                x340Var2.i0(1192330045);
                r4k0Var.c(uyn1.w(u291.d(nim0Var, 1.0f), vzq0Var), x340Var2, 0);
                x340Var2.r(false);
            } else if (gub1Var.equals(aub1.a)) {
                x340Var2.i0(1192456246);
                r4k0Var.h(mqo1.A(((s5k0) this.d).a), vzq0Var, iu30Var, (qim0) null, x340Var2, 0);
                x340Var2.r(false);
            } else {
                if (!gub1Var.equals(wtb1.a)) {
                    throw p3d1.k(x340Var2, 1701029387, false);
                }
                x340Var2.i0(1192681771);
                qim0 qim0VarW = uyn1.w(u291.d(nim0Var, 1.0f), vzq0Var);
                boolean zG = x340Var2.g(iu30Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new stj0(iu30Var, (byte) 7);
                    x340Var2.s0(objT);
                }
                r4k0Var.b(0, (Function0) objT, x340Var2, qim0VarW);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        dmk0 dmk0Var = (dmk0) this.b;
        dnk0 dnk0Var = dmk0Var.b;
        ven0 ven0Var = (ven0) this.e;
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(null);
            x340Var.s0(objT);
        }
        ven0 ven0Var2 = (ven0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(null);
            x340Var.s0(objT2);
        }
        ven0 ven0Var3 = (ven0) objT2;
        dnk0 dnk0Var2 = dnk0Var instanceof dnk0 ? dnk0Var : null;
        if (dnk0Var2 != null) {
            ven0Var2.setValue(dnk0Var2.b);
            ven0Var3.setValue(dnk0Var2.d);
        }
        int i = dmk0Var.a;
        String str = (String) ven0Var2.getValue();
        String str2 = (String) ven0Var3.getValue();
        fcf0 fcf0Var = (fcf0) this.c;
        kbf0 kbf0Var = (kbf0) this.d;
        boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
        boolean zI = x340Var.i(ven0Var);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new abh0(ven0Var, (byte) 15);
            x340Var.s0(objT3);
        }
        x3p1.f(i, dnk0Var, str, str2, fcf0Var, kbf0Var, zBooleanValue, (iu30) objT3, x340Var, 0);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        gl8 gl8Var = (gl8) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(gl8Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            x340Var2.b0();
        } else if (((Boolean) ((Function0) this.b).invoke()).booleanValue()) {
            x340Var2.i0(435113662);
            x340Var2.r(false);
        } else {
            x340Var2.i0(435011796);
            r4o1.q(gl8Var, (ViewGroup) this.c, (vu30) this.d, (iu30) this.e, x340Var2, iIntValue & 14);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        ((toj0) ((rzo0) this.b).c).a((gfq0) obj, (th61) this.c, (ods) this.d, (qim0) null, (mr20) this.e, (b0k) obj2, ((Number) obj3).intValue() & 14, 8);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        kd41 kd41Var = (kd41) this.b;
        kwq0 kwq0Var = (kwq0) this.c;
        UUID uuid = kwq0Var.a;
        kd41Var.c(uuid, apo.r(-1465520940, new jyo0((j2i) this.d, kwq0Var, (byte) 15), x340Var), x340Var, 48);
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(kwq0Var) | x340Var2.i(kd41Var);
        bw91 bw91Var = (bw91) this.e;
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            objT = new mvn0(bw91Var, kwq0Var, kd41Var, (byte) 11);
            x340Var2.s0(objT);
        }
        qxd0.i(uuid, (iu30) objT, x340Var2);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        gyo1.A((lbt0) this.b, (iu30) this.c, (wpv0) this.d, (xfx) this.e, (vzq0) obj, (b0k) obj2, (((Number) obj3).intValue() << 15) & 458752);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x023e  */
    /* JADX WARN: Code duplicated, block: B:27:0x024f  */
    /* JADX WARN: Code duplicated, block: B:29:0x025f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0276  */
    /* JADX WARN: Code duplicated, block: B:36:0x02bc  */
    private final Object i(Object obj, Object obj2, Object obj3) {
        m4c m4cVar;
        m4c m4cVar2;
        qim0 qim0VarB;
        String str;
        boolean zG;
        Object objT;
        boolean z;
        Function0 function0;
        Object objT2;
        boolean zF;
        Object objT3;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar3 = fkj0.X;
        kct0 kct0Var = (kct0) this.b;
        long jC = xxq0.c(kct0Var.a);
        uwr uwrVar = cbx.a;
        long jA = cbx.a(x340Var).a.a.a();
        cr31 cr31VarB = er31.b(8.0f);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarB2 = uyn1.B(uyn1.z(16.0f, 0.0f, 2, u291.f(dug.f(nim0Var, jA, cr31VarB), 1.0f)), 0.0f, 16.0f, 0.0f, 12.0f, 5);
        iu30 iu30Var = (iu30) this.c;
        ven0 ven0Var = (ven0) this.d;
        Function0 function1 = (Function0) this.e;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z2 = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z2) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
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
        jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
        int iHashCode2 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM2 = x340Var3.m();
        qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(jw31VarA, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        x340Var3.i0(-1451427975);
        x340Var3.r(false);
        uwo1.e(kct0Var.b, (qim0) null, cbx.d(x340Var).k, jC, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
        op71.g(x340Var, new wnb0(1.0f, true));
        fux fuxVar = fux.c;
        qim0 qim0VarB3 = uyn1.B(u291.r(nim0Var, 16.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
        boolean zI = x340Var3.i(ven0Var) | x340Var3.g(function1);
        Object objT4 = x340Var3.T();
        if (!zI) {
            m4cVar = m4cVar3;
            if (objT4 == m4cVar) {
            }
            m4cVar2 = m4cVar;
            w0h1.a(fuxVar, isl.a, bin.x(qim0VarB3, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15), 0L, 0L, false, x340Var, fux.d | 48, 56);
            x340Var3.r(true);
            uwo1.e(kct0Var.c, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            uwo1.e(kct0Var.d, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            qim0VarB = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            str = kct0Var.e;
            zG = x340Var3.g(iu30Var) | x340Var3.g(kct0Var);
            objT = x340Var3.T();
            if (!zG || objT == m4cVar2) {
                z = true;
                objT = new x7j(iu30Var, kct0Var, (byte) 1);
                x340Var3.s0(objT);
            } else {
                z = true;
            }
            function0 = (Function0) objT;
            if (!ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            gbx gbxVar = new gbx(new y50(str), function0);
            objT2 = x340Var3.T();
            if (objT2 == m4cVar2) {
                objT2 = cps0.a1;
                x340Var3.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            zF = x340Var3.f(jC);
            objT3 = x340Var3.T();
            if (zF || objT3 == m4cVar2) {
                objT3 = new q9j0((byte) 6, jC);
                x340Var3.s0(objT3);
            }
            foo1.c(gbxVar, new hdx(0, vu30Var, (vu30) objT3, (vu30) null, (hw61) null, 25), qim0VarB, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1051746734, new t1t0((Object) kct0Var, (byte) 5), x340Var), x340Var, 0, 48, 2008);
            x340Var3.r(z);
            return rih1.a;
        }
        m4cVar = m4cVar3;
        objT4 = new swi0(ven0Var, function1, (byte) 7);
        x340Var3.s0(objT4);
        m4cVar2 = m4cVar;
        w0h1.a(fuxVar, isl.a, bin.x(qim0VarB3, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15), 0L, 0L, false, x340Var, fux.d | 48, 56);
        x340Var3.r(true);
        uwo1.e(kct0Var.c, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        uwo1.e(kct0Var.d, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        qim0VarB = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
        str = kct0Var.e;
        zG = x340Var3.g(iu30Var) | x340Var3.g(kct0Var);
        objT = x340Var3.T();
        if (zG) {
            z = true;
            objT = new x7j(iu30Var, kct0Var, (byte) 1);
            x340Var3.s0(objT);
        } else {
            z = true;
            objT = new x7j(iu30Var, kct0Var, (byte) 1);
            x340Var3.s0(objT);
        }
        function0 = (Function0) objT;
        if (!ihc1.y0(str)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar2 = new gbx(new y50(str), function0);
        objT2 = x340Var3.T();
        if (objT2 == m4cVar2) {
            objT2 = cps0.a1;
            x340Var3.s0(objT2);
        }
        vu30 vu30Var2 = (vu30) objT2;
        zF = x340Var3.f(jC);
        objT3 = x340Var3.T();
        if (zF) {
            objT3 = new q9j0((byte) 6, jC);
            x340Var3.s0(objT3);
        } else {
            objT3 = new q9j0((byte) 6, jC);
            x340Var3.s0(objT3);
        }
        foo1.c(gbxVar2, new hdx(0, vu30Var2, (vu30) objT3, (vu30) null, (hw61) null, 25), qim0VarB, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1051746734, new t1t0((Object) kct0Var, (byte) 5), x340Var), x340Var, 0, 48, 2008);
        x340Var3.r(z);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        o3x0 o3x0Var = (o3x0) this.e;
        iu30 iu30Var = (iu30) this.d;
        m4c m4cVar = fkj0.X;
        z6x0 z6x0Var = (z6x0) this.b;
        x340 x340Var = (b0k) obj2;
        boolean zG = x340Var.g(z6x0Var);
        Context context = (Context) this.c;
        boolean zG2 = zG | x340Var.g(context);
        Object objT = x340Var.T();
        if (zG2 || objT == m4cVar) {
            objT = ot11.M(z6x0Var, context);
            x340Var.s0(objT);
        }
        r9x r9xVar = (r9x) objT;
        boolean zG3 = x340Var.g(iu30Var) | x340Var.i(o3x0Var);
        Object objT2 = x340Var.T();
        if (zG3 || objT2 == m4cVar) {
            objT2 = new hzu0(iu30Var, o3x0Var, (byte) 25);
            x340Var.s0(objT2);
        }
        ulo1.a(r9xVar, (iu30) objT2, (qim0) null, x340Var, 0);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        umx0 umx0Var = (umx0) this.b;
        String str = umx0Var.c;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            Set set = s4b1.f;
            set0 set0Var = null;
            if (uic.g(str, blc0.de)) {
                x340Var2.i0(-287012384);
                hjv0 hjv0Var = (hjv0) ((idd1) this.c).getValue();
                wiv0 wiv0Var = new wiv0(str, umx0Var.d, umx0Var.i, null);
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = ilx0.t;
                    x340Var2.s0(objT);
                }
                hon1.e(hjv0Var, wiv0Var, (iu30) objT, x340Var2, 392);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-286593543);
                String str2 = umx0Var.m;
                if (str2 != null && !ihc1.y0(str2) && umx0Var.t) {
                    set0Var = new set0(umx0Var.m, true, "", "", (Function0) null, false, false, (Function0) null, (String) null, (String) null, false, 2032);
                }
                if (set0Var == null) {
                    x340Var2.i0(-286593544);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-286593543);
                    hon1.d((hft0) ((idd1) this.d).getValue(), set0Var, (iu30) this.e, x340Var2, 0);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object m(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        e0z0 e0z0Var = (i0z0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(e0z0Var) : x340Var.i(e0z0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            x340Var2.b0();
        } else if (e0z0Var.equals(h0z0.a)) {
            x340Var2.i0(892623634);
            ((vu30) this.b).invoke(x340Var2, 0);
            x340Var2.r(false);
        } else if (e0z0Var.equals(g0z0.a)) {
            x340Var2.i0(892625139);
            ((vu30) this.c).invoke(x340Var2, 0);
            x340Var2.r(false);
        } else if (e0z0Var.equals(f0z0.a)) {
            x340Var2.i0(892626576);
            ((vu30) this.d).invoke(x340Var2, 0);
            x340Var2.r(false);
        } else {
            if (!(e0z0Var instanceof e0z0)) {
                throw p3d1.k(x340Var2, 892621999, false);
            }
            x340Var2.i0(892628069);
            ((j2i) this.e).invoke(e0z0Var.a, x340Var2, 0);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object n(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        qim0 qim0VarD = u291.d(nim0.a, 1.0f);
        fiz0 fiz0Var = (fiz0) this.b;
        amq amqVar = (amq) this.c;
        iu30 iu30Var = (iu30) this.d;
        bmq bmqVar = (bmq) this.e;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        int iOrdinal = fiz0Var.X.ordinal();
        if (iOrdinal == 0) {
            x340Var3.i0(1359823140);
            Object objT = x340Var3.T();
            if (objT == m4cVar) {
                j9z0 j9z0Var = new j9z0(iu30Var, (byte) 4);
                ojq ojqVar = (ojq) amqVar.a.c;
                v5n v5nVar = (v5n) ((jiz0) ojqVar.b).j.get();
                c8o.l(v5nVar);
                r990 r990Var = new r990(j9z0Var, v5nVar, (zja1) ojqVar.f.get(), (sip) ojqVar.h.get(), (sfn0) ojqVar.t.get(), (rgn0) ojqVar.d.get());
                x340Var3.s0(r990Var);
                objT = r990Var;
            }
            r990 r990Var2 = (r990) objT;
            List<b0e> list = fiz0Var.h;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (b0e b0eVar : list) {
                arrayList.add(new k990(b0eVar.a, b0eVar.b, b0eVar.c, b0eVar.d));
            }
            j990 j990Var = new j990(vzq0Var, fiz0Var.b, fiz0Var.d, arrayList, fiz0Var.Z);
            otw.c(r990Var2, j990Var, (qim0) null, wpb1.C("IntroElement", r990Var2, j990Var, x340Var, 6, 8), x340Var, 0, 4);
            x340Var3.r(false);
        } else {
            if (iOrdinal != 1) {
                throw p3d1.k(x340Var3, -510325048, false);
            }
            x340Var3.i0(1360992677);
            fit0 fit0Var = new fit0(vzq0Var, fiz0Var.a, fiz0Var.c, fiz0Var.e, fiz0Var.f);
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                ojq ojqVar2 = (ojq) bmqVar.a.c;
                objT2 = new nit0(fit0Var, (cmq) ojqVar2.Y.get(), (dmq) ojqVar2.Z.get(), (emq) ojqVar2.h1.get());
                x340Var3.s0(objT2);
            }
            nit0 nit0Var = (nit0) objT2;
            otw.c(nit0Var, fit0Var, (qim0) null, wpb1.C("PlayElement", nit0Var, fit0Var, x340Var, 6, 8), x340Var, 0, 4);
            x340Var3.r(false);
        }
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        qim0 qim0Var = (qim0) this.b;
        String str = (String) this.c;
        x340 x340Var = (b0k) obj2;
        boolean zG = x340Var.g(str);
        j06 j06Var = x340Var.a;
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = new q4z0(str, (byte) 8);
            x340Var.s0(objT);
        }
        qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
        gbx gbxVar = (gbx) this.d;
        hux huxVar = (hux) this.e;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw null;
        }
        x340Var.m0();
        boolean z = x340Var.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340Var.l(n4kVar);
        } else {
            x340Var.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(gfh0VarC, x340Var, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var, lljVar4);
        uwr uwrVar = cbx.a;
        mta mtaVar = cbx.b(x340Var).d;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = dug.f(u291.r(nim0Var, 32.0f), u7h.b(cbx.a(x340Var).a.c, 0.3f, 0.0f, 0.0f, 0.0f, 14), er31.a);
        boolean zI = x340Var.i(gbxVar);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new n70(gbxVar, (byte) 4);
            x340Var.s0(objT2);
        }
        qim0 qim0VarX = bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15);
        gfh0 gfh0VarC2 = t1c.c(een.h, false);
        int iHashCode2 = Long.hashCode(x340Var.T);
        xos0 xos0VarM2 = x340Var.m();
        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(n4kVar);
        } else {
            x340Var.v0();
        }
        nko1.H(gfh0VarC2, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        zov0 zov0Var = cbx.b(x340Var).g;
        w0h1.a(huxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var, 56, 56);
        x340Var.r(true);
        x340Var.r(true);
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ney0 ney0Var = (ney0) this.d;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            ((hyy0) this.b).d((agc0) this.c, ney0Var.k, ney0Var.f, ney0Var.h, mqo1.A(ney0Var.d), ney0Var.j, (iu30) this.e, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        ew20 ew20Var = (ew20) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        ArrayList arrayList = (ArrayList) this.b;
        Set set = (Set) this.c;
        iu30 iu30Var = (iu30) this.d;
        lex lexVar = (lex) this.e;
        int i = 0;
        for (Object obj4 : sc11.b) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            sc11 sc11Var = (sc11) obj4;
            String str = (String) arrayList.get(i);
            boolean zContains = set.contains(sc11Var);
            x340 x340Var2 = x340Var;
            boolean zG = x340Var2.g(iu30Var) | x340Var2.e(sc11Var.ordinal());
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new zkz0(iu30Var, sc11Var, (byte) 16);
                x340Var2.s0(objT);
            }
            z1p1.e(str, zContains, (Function0) objT, lexVar, anm1.N("reflection_adjective_" + sc11Var.name(), ew20Var.a(1.0f, nim0.a, true)), x340Var2, 0);
            i = i2;
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        x340 x340Var;
        long j;
        acr0 acr0Var;
        boolean z2;
        long jX;
        dlk1 dlk1Var;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z3 = true;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                otw.b((z9y) obj5, (u9y) obj7, new joa0(((d9y) obj4).a.c), uyn1.B(u291.d(nim0Var, 1.0f), 0.0f, (((i2c) obj).c() * 0.25f) - ((vzq0) obj6).d(), 0.0f, 0.0f, 13), (b0k) obj2, 48, 0);
                return rih1Var;
            case 1:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                uwo1.e((String) obj6, anm1.N("error_page_title", nim0Var), cbx.d(x340Var2).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
                cvx cvxVar = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.h(nim0Var, 16.0f));
                lee1 lee1Var = cbx.d(x340Var2).g;
                diz dizVar = (diz) obj5;
                boolean z4 = dizVar.e;
                String str = dizVar.c;
                if (z4) {
                    x340Var = x340Var2;
                    x340Var.i0(-1428310691);
                    j = cbx.a(x340Var2).b.b;
                    z = false;
                } else {
                    z = false;
                    x340Var = x340Var2;
                    x340Var.i0(-1428309507);
                    j = ((u7h) x340Var.k(qgx.a)).a;
                }
                x340Var.r(z);
                uwo1.e((String) obj7, anm1.N("error_page_subtitle", nim0Var), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2016);
                if (!((hf2) obj4).b || str == null || ihc1.y0(str)) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(-1327496404);
                    x340Var3.r(false);
                } else {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(-1327737615);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    op71.g(x340Var2, u291.h(nim0Var, 16.0f));
                    uwo1.e("Debug: ".concat(str), (qim0) null, cbx.d(x340Var2).j, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2026);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 2:
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var5.g(vzq0Var) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    era eraVar = een.Q0;
                    qim0 qim0VarD = u291.d((qim0) obj6, 1.0f);
                    kiv kivVar = t4k.n;
                    qim0 qim0VarB = uyn1.B(qim0VarD, uyn1.n(vzq0Var, (flb0) x340Var6.k(kivVar)), 0.0f, uyn1.m(vzq0Var, (flb0) x340Var6.k(kivVar)), 0.0f, 10);
                    pm10 pm10Var = (pm10) obj5;
                    jkr0 jkr0Var = (jkr0) obj7;
                    h0y h0yVar = (h0y) obj4;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var6, 48);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    qim0 qim0VarB2 = uyn1.B(anm1.N("FEATURE_FLOW_PAGER", new wnb0(1.0f, true)), 0.0f, vzq0Var.d(), 0.0f, 0.0f, 13);
                    boolean zI = x340Var6.i(pm10Var);
                    Object objT = x340Var6.T();
                    if (zI || objT == m4cVar) {
                        objT = new gi00(pm10Var, (byte) 9);
                        x340Var6.s0(objT);
                    }
                    w0h1.c(jkr0Var, s161.b(qim0VarB2, false, (iu30) objT), (vzq0) null, (gdr0) null, 0, 0.0f, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(798082545, new wh(pm10Var, h0yVar, (byte) 10), x340Var6), x340Var6, 0, 16380);
                    int size = pm10Var.c.size();
                    nim0 nim0Var2 = nim0.a;
                    if (size > 1) {
                        x340Var6.i0(15796756);
                        qim0 qim0VarN = anm1.N("PAGE_INDICATOR", uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7));
                        Object objT2 = x340Var6.T();
                        if (objT2 == m4cVar) {
                            objT2 = xc10.Q0;
                            x340Var6.s0(objT2);
                        }
                        cpn1.e(jkr0Var, s161.b(qim0VarN, false, (iu30) objT2), x340Var6, 28080);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(16141104);
                        x340Var6.r(false);
                    }
                    op71.g(x340Var6, u291.h(nim0Var2, vzq0Var.a()));
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                Context context = (Context) obj4;
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var = (iu30) obj6;
                x340 x340Var7 = (b0k) obj2;
                ven0 ven0Var = (ven0) obj5;
                boolean zG = x340Var7.g(iu30Var) | x340Var7.i(ven0Var);
                Object objT3 = x340Var7.T();
                if (zG || objT3 == m4cVar2) {
                    objT3 = new wq9(iu30Var, ven0Var, (byte) 18);
                    x340Var7.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                String str2 = ((wv10) obj7).i;
                boolean zI2 = x340Var7.i(context);
                Object objT4 = x340Var7.T();
                if (zI2 || objT4 == m4cVar2) {
                    objT4 = new ork(context, (byte) 3);
                    x340Var7.s0(objT4);
                }
                hw10.a(0, str2, function0, x340Var7, (iu30) objT4, null);
                return rih1Var;
            case 4:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var8).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarY = too1.y(qim0VarZ, lhc.g(x340Var8).e);
                String str3 = (String) obj6;
                String str4 = (String) obj5;
                scx scxVar = (scx) obj7;
                String str5 = (String) obj4;
                mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var8, 0);
                x340 x340Var9 = x340Var8;
                int iHashCode2 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM2 = x340Var9.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarY);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
                if (x340Var10.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(mbhVarA2, x340Var8, y580.O0);
                nko1.H(xos0VarM2, x340Var8, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                nko1.F(x340Var8);
                nko1.H(qim0VarE2, x340Var8, y580.Y);
                uwo1.e(str3, u291.f(nim0Var, 1.0f), cbx.d(x340Var8).e, cbx.a(x340Var8).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2016);
                cvx cvxVar4 = cbx.b(x340Var8).b;
                op71.g(x340Var8, u291.h(nim0Var, 12.0f));
                uwo1.e(str4, u291.f(nim0Var, 1.0f), cbx.d(x340Var8).g, cbx.a(x340Var8).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2016);
                cvx cvxVar5 = cbx.b(x340Var8).b;
                op71.g(x340Var8, u291.h(nim0Var, 16.0f));
                boolean zI3 = x340Var10.i(scxVar);
                Object objT5 = x340Var10.T();
                if (zI3 || objT5 == fkj0.X) {
                    objT5 = new rqc(scxVar, (byte) 3);
                    x340Var10.s0(objT5);
                }
                foo1.c(new gbx(z50.c, (Function0) objT5), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1856822545, new ps00(str5, (byte) 23), x340Var8), x340Var8, 0, 48, 2044);
                ydh.l(nim0Var, cbx.b(x340Var8).b.e, x340Var8, x340Var10, true);
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                qim0 qim0VarB3 = uyn1.B(nim0.a, cbx.b(x340Var11).b.a, 0.0f, 0.0f, 0.0f, 14);
                c380 c380Var = (c380) obj6;
                vn60 vn60Var = (vn60) obj5;
                iu30 iu30Var2 = (iu30) obj7;
                un60 un60Var = (un60) obj4;
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var11, 0);
                x340 x340Var12 = x340Var11;
                int iHashCode3 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM3 = x340Var12.m();
                qim0 qim0VarE3 = zr7.E(x340Var11, qim0VarB3);
                hzj.A.getClass();
                x340 x340Var13 = x340Var11;
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(jw31VarA, x340Var11, y580.O0);
                nko1.H(xos0VarM3, x340Var11, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var11, y580.R0);
                nko1.F(x340Var11);
                nko1.H(qim0VarE3, x340Var11, y580.Y);
                x340Var13.i0(-1013607569);
                int i = 0;
                for (Object obj8 : c380Var) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    vn60 vn60Var2 = (vn60) obj8;
                    boolean zJ = u890.j(vn60Var != null ? vn60Var.b : null, vn60Var2.b);
                    gfx.b(zJ ? 4 : 1, apo.r(-484362475, new d30(zJ, iu30Var2, vn60Var2, i, un60Var), x340Var11), x340Var11, 48);
                    i = i2;
                }
                x340Var13.r(false);
                x340Var13.r(true);
                return rih1Var;
            case 6:
                String str6 = (String) obj;
                x340 x340Var14 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                ven0 ven0Var2 = (ven0) obj7;
                b6r0 b6r0Var = (b6r0) obj5;
                m4c m4cVar3 = fkj0.X;
                ven0 ven0Var3 = (ven0) obj6;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var14.g(str6) ? 4 : 2;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zG2 = x340Var15.g((th61) ven0Var3.getValue()) | ((iIntValue2 & 14) == 4);
                    o860 o860Var = (o860) obj4;
                    Object objT6 = x340Var15.T();
                    if (zG2 || objT6 == m4cVar3) {
                        t8r0 t8r0Var = (t8r0) o860Var.b;
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                        Object value = ven0Var3.getValue();
                        value.getClass();
                        th61 th61Var = (th61) value;
                        Set set = s4b1.f;
                        s4b1 s4b1VarX = uic.x(intent.getDataString());
                        Iterator it = ((Set) t8r0Var.a).iterator();
                        do {
                            if (it.hasNext()) {
                                acr0Var = (acr0) it.next();
                            } else {
                                bhn0.t("Collection contains no element matching the predicate.");
                            }
                            return null;
                        } while (!acr0Var.a().contains(s4b1VarX.c));
                        ebr0 ebr0Var = (ebr0) ((mly0) t8r0Var.b).get(acr0Var.b());
                        if (ebr0Var == null) {
                            bhn0.B(acr0Var.b(), "No page provider found for page type: ");
                            return null;
                        }
                        objT6 = new lzh(ebr0Var, acr0Var.c(intent, s4b1VarX, th61Var));
                        x340Var15.s0(objT6);
                    }
                    lzh lzhVar = (lzh) objT6;
                    ebr0 ebr0Var2 = lzhVar.a;
                    Parcelable parcelable = lzhVar.b;
                    ecr0 ecr0VarE = b6r0Var.e((xnn0) x340Var15.k(aon0.a));
                    phi0 phi0Var = b6r0Var.l;
                    ezc ezcVar = b6r0Var.m;
                    Function0 function1 = b6r0Var.e;
                    boolean zI4 = x340Var15.i(ven0Var2);
                    Object objT7 = x340Var15.T();
                    if (zI4 || objT7 == m4cVar3) {
                        objT7 = new xd2(ven0Var2, (byte) 11);
                        x340Var15.s0(objT7);
                    }
                    fc11.d(ebr0Var2, parcelable, ecr0VarE, phi0Var, ezcVar, function1, (qim0) null, (vu30) objT7, x340Var15, 1572864);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 7:
                vzq0 vzq0Var2 = (vzq0) obj;
                x340 x340Var16 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                gt70 gt70Var = (gt70) obj4;
                m4c m4cVar4 = fkj0.X;
                iu30 iu30Var3 = (iu30) obj7;
                zs70 zs70Var = (zs70) obj5;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var16.g(vzq0Var2) ? 4 : 2;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    jkr0 jkr0Var2 = (jkr0) obj6;
                    c9 c9VarF = mqo1.F(zs70Var.b);
                    boolean z5 = zs70Var.g;
                    qim0 qim0VarN2 = anm1.N("main_content", u291.d(nim0Var, 1.0f));
                    boolean zG3 = x340Var17.g(iu30Var3);
                    Object objT8 = x340Var17.T();
                    if (zG3 || objT8 == m4cVar4) {
                        objT8 = new u460(iu30Var3, (byte) 16);
                        x340Var17.s0(objT8);
                    }
                    Function0 function2 = (Function0) objT8;
                    boolean zI5 = x340Var17.i(gt70Var);
                    Object objT9 = x340Var17.T();
                    if (zI5 || objT9 == m4cVar4) {
                        objT9 = new zi50(gt70Var, (byte) 24);
                        x340Var17.s0(objT9);
                    }
                    ljo1.h(vzq0Var2, jkr0Var2, c9VarF, z5, qim0VarN2, function2, (iu30) objT9, x340Var17, (iIntValue3 & 14) | 24576);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 8:
                iu30 iu30Var4 = (iu30) obj4;
                x340 x340Var18 = (b0k) obj2;
                ((Number) obj3).intValue();
                gbj0 gbj0Var = (gbj0) obj6;
                Button button = gbj0Var.g;
                if (button == null) {
                    x340 x340Var19 = x340Var18;
                    x340Var19.i0(-1864338259);
                    z2 = false;
                    x340Var19.r(false);
                } else {
                    z2 = false;
                    x340 x340Var20 = x340Var18;
                    x340Var20.i0(-1864338258);
                    ((af80) obj5).d(button, (MessageTemplate) obj7, "messaging_inlinecard_primary_button", iu30Var4, x340Var20, Button.$stable | 384);
                    x340Var20.r(false);
                }
                Button button2 = gbj0Var.h;
                if (button2 == null) {
                    x340 x340Var21 = x340Var18;
                    x340Var21.i0(-1864171541);
                    x340Var21.r(z2);
                } else {
                    x340 x340Var22 = x340Var18;
                    x340Var22.i0(-1864171540);
                    ((af80) obj5).d(button2, (MessageTemplate) obj7, "messaging_inlinecard_secondary_button", iu30Var4, x340Var22, Button.$stable | 384);
                    x340Var22.r(z2);
                }
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                c380 c380Var2 = (c380) obj6;
                iu30 iu30Var5 = (iu30) obj5;
                x340 x340Var23 = (b0k) obj2;
                iu30 iu30Var6 = (iu30) obj7;
                boolean zG4 = x340Var23.g(iu30Var5) | x340Var23.g(iu30Var6);
                Object objT10 = x340Var23.T();
                if (zG4 || objT10 == fkj0.X) {
                    objT10 = new t430(iu30Var5, iu30Var6, (byte) 1);
                    x340Var23.s0(objT10);
                }
                ltn1.l(c380Var2, (vu30) objT10, (hfp) obj4, (qim0) null, x340Var23, 0);
                return rih1Var;
            case 10:
                vzq0 vzq0Var3 = (vzq0) obj;
                x340 x340Var24 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                iu30 iu30Var7 = (iu30) obj6;
                lye0 lye0Var = (lye0) obj5;
                zzy zzyVar = lye0Var.c;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var24.g(vzq0Var3) ? 4 : 2;
                }
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    boolean zG5 = x340Var25.g(iu30Var7);
                    Object objT11 = x340Var25.T();
                    if (zG5 || objT11 == fkj0.X) {
                        objT11 = new ijd0(iu30Var7, (byte) 22);
                        x340Var25.s0(objT11);
                    }
                    q3p1.b(0, 1, (Function0) objT11, x340Var25, false);
                    Integer num = lye0Var.e;
                    boolean z6 = zzyVar instanceof yzy;
                    if (!(zzyVar instanceof xzy) || num == null) {
                        x340Var25.i0(-606760801);
                        jX = j1e1.x(zzyVar);
                        x340Var25.r(false);
                    } else {
                        x340Var25.i0(-606830892);
                        x340Var25.r(false);
                        jX = z4p1.e(num.intValue() | (-16777216));
                    }
                    j1e1.f(null, jX, x340Var25, 0, 1);
                    ujo1.c((es41) obj7, uyn1.B(nim0.a, 0.0f, vzq0Var3.d(), 0.0f, 0.0f, 13), apo.r(1910336706, new ey(vzq0Var3, lye0Var, iu30Var7, z6, (na9) obj4, (byte) 27), x340Var25), x340Var25, 384);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var26 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                fli0 fli0Var = (fli0) obj6;
                x340 x340Var27 = x340Var26;
                boolean zY = x340Var27.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16);
                j06 j06Var = x340Var27.a;
                if (zY) {
                    qim0 qim0VarZ2 = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    Float fValueOf = Float.valueOf(0.0f);
                    int i3 = fli0Var.g;
                    String str7 = fli0Var.b;
                    mmr0 mmr0Var = new mmr0(fValueOf, new u7h(u7h.b(z4p1.e(i3), 1.0f, 0.0f, 0.0f, 0.0f, 14)));
                    Float fValueOf2 = Float.valueOf(1.0f);
                    uwr uwrVar4 = cbx.a;
                    qim0 qim0VarE4 = dug.e(qim0VarZ2, v9c.t(new mmr0[]{mmr0Var, new mmr0(fValueOf2, new u7h(cbx.a(x340Var27).a.c))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
                    bx bxVar = (bx) obj5;
                    d850 d850Var = bxVar.g;
                    ba50 ba50Var = (ba50) obj7;
                    ob9 ob9Var = (ob9) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode4 = Long.hashCode(x340Var27.T);
                    xos0 xos0VarM4 = x340Var27.m();
                    qim0 qim0VarE5 = zr7.E(x340Var27, qim0VarE4);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var27.m0();
                    if (x340Var27.S) {
                        x340Var27.l(n4kVar);
                    } else {
                        x340Var27.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var27, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM4, x340Var27, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode4);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var27, lljVar3);
                    nko1.F(x340Var27);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE5, x340Var27, lljVar4);
                    mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var27, 0);
                    int iHashCode5 = Long.hashCode(x340Var27.T);
                    xos0 xos0VarM5 = x340Var27.m();
                    qim0 qim0VarE6 = zr7.E(x340Var27, nim0Var);
                    x340Var27.m0();
                    if (x340Var27.S) {
                        x340Var27.l(n4kVar);
                    } else {
                        x340Var27.v0();
                    }
                    nko1.H(mbhVarA3, x340Var27, lljVar);
                    nko1.H(xos0VarM5, x340Var27, lljVar2);
                    x0d.q(iHashCode5, x340Var27, lljVar3, x340Var27);
                    nko1.H(qim0VarE6, x340Var27, lljVar4);
                    wat watVar = (wat) x340Var27.k(t4k.h);
                    Context context2 = (Context) x340Var27.k(AndroidCompositionLocals_androidKt.b);
                    Object objT12 = x340Var27.T();
                    if (objT12 == fkj0.X) {
                        objT12 = ktd.k(watVar.M0(h4o1.n(context2.getResources())), x340Var27);
                    }
                    op71.g(x340Var27, u291.f(u291.h(nim0Var, 56.0f + ((p3v) objT12).a), 1.0f));
                    if (d850Var instanceof c850) {
                        x340Var27.i0(1080935628);
                        otw.c(ba50Var, new z950(((c850) d850Var).a, bxVar.a, str7), (qim0) null, (ipb1) null, x340Var27, 6, 12);
                        cvx cvxVar6 = cbx.b(x340Var27).b;
                        op71.g(x340Var27, u291.f(u291.h(nim0Var, 16.0f), 1.0f));
                        x340Var27.r(false);
                    } else {
                        x340Var27.i0(1081399791);
                        x340Var27.r(false);
                    }
                    otw.c(ob9Var, new mb9(fli0Var.d, str7, str7), (qim0) null, (ipb1) null, x340Var27, 6, 12);
                    x340Var27.r(true);
                    x340Var27.r(true);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var28 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                iu30 iu30Var8 = (iu30) obj4;
                m4c m4cVar5 = fkj0.X;
                iu30 iu30Var9 = (iu30) obj7;
                bbh0 bbh0Var = (bbh0) obj6;
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    bbh0 bbh0Var2 = (bbh0) obj6;
                    boolean z7 = ((bbh0) obj5) == bbh0Var2;
                    boolean zG6 = x340Var29.g(iu30Var9) | x340Var29.e(bbh0Var.ordinal());
                    Object objT13 = x340Var29.T();
                    if (zG6 || objT13 == m4cVar5) {
                        objT13 = new eah0(iu30Var9, bbh0Var, (byte) 1);
                        x340Var29.s0(objT13);
                    }
                    Function0 function3 = (Function0) objT13;
                    boolean zG7 = x340Var29.g(iu30Var8) | x340Var29.e(bbh0Var.ordinal());
                    Object objT14 = x340Var29.T();
                    if (zG7 || objT14 == m4cVar5) {
                        objT14 = new eah0(iu30Var8, bbh0Var, (byte) 2);
                        x340Var29.s0(objT14);
                    }
                    o4o1.g(bbh0Var2, z7, function3, (Function0) objT14, x340Var29, 0);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var30 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    r4o1.c((String) obj6, (ItemAlternative) obj5, (String) obj7, (p410) obj4, x340Var31, 0);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                zgk0 zgk0Var = (zgk0) obj6;
                vzq0 vzq0Var4 = (vzq0) obj;
                x340 x340Var32 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= x340Var32.g(vzq0Var4) ? 4 : 2;
                }
                x340 x340Var33 = x340Var32;
                if (x340Var33.Y(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    dub1 dub1Var = zgk0Var.e;
                    if (u890.j(dub1Var, ytb1.a) || u890.j(dub1Var, cub1.a)) {
                        dlk1Var = dlk1.a;
                    } else if (u890.j(dub1Var, xtb1.a) || u890.j(dub1Var, utb1.a)) {
                        dlk1Var = dlk1.b;
                    } else {
                        if (!u890.j(dub1Var, vtb1.a) && !u890.j(dub1Var, bub1.a)) {
                            eg.o();
                            return null;
                        }
                        dlk1Var = dlk1.c;
                    }
                    eth.a(dlk1Var, (qim0) null, irn1.o0(2000, 0, (dlv) null, 6), "status-crossfade", apo.r(-1615847704, new jb1((pek0) obj5, vzq0Var4, zgk0Var, (iu30) obj7, (hdn0) obj4, (byte) 21), x340Var33), x340Var33, 28032, 2);
                } else {
                    x340Var33.b0();
                }
                return rih1Var;
            case 16:
                return d(obj, obj2, obj3);
            case 17:
                return e(obj, obj2, obj3);
            case 18:
                return f(obj, obj2, obj3);
            case 19:
                return g(obj, obj2, obj3);
            case 20:
                return h(obj, obj2, obj3);
            case 21:
                return i(obj, obj2, obj3);
            case 22:
                return j(obj, obj2, obj3);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return k(obj, obj2, obj3);
            case 24:
                return m(obj, obj2, obj3);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return n(obj, obj2, obj3);
            case 26:
                return o(obj, obj2, obj3);
            case 27:
                return p(obj, obj2, obj3);
            case 28:
                return q(obj, obj2, obj3);
            default:
                iu30 iu30Var10 = (iu30) obj7;
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                Function0 function4 = (Function0) obj4;
                de21 de21Var = (de21) obj6;
                pe21 pe21Var = de21Var.a;
                x340 x340Var34 = (b0k) obj2;
                x340Var34.i0(1386318471);
                Object objT15 = x340Var34.T();
                m4c m4cVar6 = fkj0.X;
                if (objT15 == m4cVar6) {
                    objT15 = kaa0.h(0L, x340Var34);
                }
                ven0 ven0Var4 = (ven0) objT15;
                Object objT16 = x340Var34.T();
                if (objT16 == m4cVar6) {
                    objT16 = p3d1.n(0L, x340Var34);
                }
                ven0 ven0Var5 = (ven0) objT16;
                Object objT17 = x340Var34.T();
                if (objT17 == m4cVar6) {
                    objT17 = qxd0.M(o6x.a, x340Var34);
                    x340Var34.s0(objT17);
                }
                c9n c9nVar = (c9n) objT17;
                Object objT18 = x340Var34.T();
                if (objT18 == m4cVar6) {
                    objT18 = new xs3(ven0Var4, ven0Var5, (byte) 17);
                    x340Var34.s0(objT18);
                }
                qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT18);
                if (!((Boolean) yv91.a(new zkz0(de21Var.b, pe21Var, (byte) 29)).getValue()).booleanValue() && ((Boolean) pe21Var.n.getValue()).booleanValue()) {
                    z3 = false;
                }
                o9p1 o9p1Var = (o9p1) obj5;
                boolean zI6 = x340Var34.i(c9nVar) | x340Var34.g(de21Var) | x340Var34.g(iu30Var10);
                Object objT19 = x340Var34.T();
                if (zI6 || objT19 == m4cVar6) {
                    objT19 = new tjf0(c9nVar, iu30Var10, de21Var, ven0Var4, ven0Var5, (byte) 16);
                    x340Var34.s0(objT19);
                }
                iu30 iu30Var11 = (iu30) objT19;
                boolean zG8 = x340Var34.g(de21Var) | x340Var34.g(function4);
                Object objT20 = x340Var34.T();
                if (zG8 || objT20 == m4cVar6) {
                    objT20 = new zkz0(de21Var, function4, (byte) 28);
                    x340Var34.s0(objT20);
                }
                Function0 function5 = (Function0) objT20;
                boolean zG9 = x340Var34.g(de21Var);
                Object objT21 = x340Var34.T();
                if (zG9 || objT21 == m4cVar6) {
                    objT21 = new ps11(de21Var, (byte) 11);
                    x340Var34.s0(objT21);
                }
                qim0 qim0VarI = zr7.i(qim0VarX, new j6v((byte) 0, (Object) pe21Var, (Object) function5, (Object) o9p1Var, (Object) iu30Var11, objT21, z3));
                x340Var34.r(false);
                return qim0VarI;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9y(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9y(lbt0 lbt0Var, iu30 iu30Var, wpv0 wpv0Var, xfx xfxVar) {
        super(3);
        this.a = (byte) 20;
        this.b = lbt0Var;
        this.c = iu30Var;
        this.d = wpv0Var;
        this.e = xfxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9y(kct0 kct0Var, iu30 iu30Var, ven0 ven0Var, Function0 function0) {
        super(3);
        this.a = (byte) 21;
        this.b = kct0Var;
        this.c = iu30Var;
        this.d = ven0Var;
        this.e = function0;
    }
}
