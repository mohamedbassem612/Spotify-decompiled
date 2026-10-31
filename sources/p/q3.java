package p;

import android.os.Bundle;
import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q3 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 11;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(UnmatchedItem unmatchedItem, Set set, boolean z, p410 p410Var, String str, Function0 function0, Function0 function1, vu30 vu30Var, int i) {
        super(2);
        this.c = unmatchedItem;
        this.d = set;
        this.f = z;
        this.g = p410Var;
        this.b = str;
        this.e = function0;
        this.h = function1;
        this.i = vu30Var;
    }

    private final Object a(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(uyn1.x(qim0VarF, 16.0f), 0.0f, 0.0f, 0.0f, ((vzq0) this.b).a(), 7);
            ven0 ven0Var = (ven0) this.c;
            ven0 ven0Var2 = (ven0) this.d;
            v1t0 v1t0Var = (v1t0) this.g;
            z1t0 z1t0Var = (z1t0) this.e;
            xk xkVar = (xk) this.h;
            swa0 swa0Var = (swa0) this.i;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            boolean z = this.f;
            String strK = z ? x0d.k(x340Var2, -939604000, 2131959747, x340Var2, false) : x0d.k(x340Var2, -939528763, 2131957057, x340Var2, false);
            lee1 lee1Var = cbx.d(x340Var2).d;
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = egs0.U0;
                x340Var2.s0(objT);
            }
            uwo1.e(strK, s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2040);
            String str = (String) ven0Var.getValue();
            boolean zI = x340Var2.i(ven0Var) | x340Var2.i(ven0Var2) | x340Var2.i(v1t0Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new mvn0((Object) v1t0Var, (Object) ven0Var, (Object) ven0Var2, (byte) 19);
                x340Var2.s0(objT2);
            }
            suo1.p(str, (iu30) objT2, uyn1.B(nim0Var, 0.0f, cbx.b(x340Var2).b.a, 0.0f, 0.0f, 13), x340Var2, 0);
            String strK2 = z ? x0d.k(x340Var2, -938938182, 2131959746, x340Var2, false) : x0d.k(x340Var2, -938856993, 2131957056, x340Var2, false);
            uwo1.e(strK2, uyn1.B(nim0Var, 0.0f, cbx.b(x340Var2).b.a, 0.0f, 0.0f, 13), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            yxa0 yxa0Var = z1t0Var.d;
            boolean zBooleanValue = ((Boolean) ven0Var2.getValue()).booleanValue();
            boolean zH = x340Var2.h(z) | x340Var2.i(xkVar) | x340Var2.i(v1t0Var) | x340Var2.i(ven0Var) | x340Var2.i(z1t0Var) | x340Var2.i(swa0Var);
            Object objT3 = x340Var2.T();
            if (zH || objT3 == m4cVar) {
                u1t0 u1t0Var = new u1t0(z, xkVar, v1t0Var, z1t0Var, swa0Var, ven0Var);
                x340Var2.s0(u1t0Var);
                objT3 = u1t0Var;
            }
            suo1.n(yxa0Var, zBooleanValue, (Function0) objT3, x340Var2, 0);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = (String) this.b;
        String str2 = (String) this.c;
        String str3 = (String) this.d;
        String str4 = (String) this.h;
        Function0 function0 = (Function0) this.e;
        Function0 function1 = (Function0) this.i;
        qim0 qim0Var = (qim0) this.g;
        lap1.e(str, str2, str3, str4, this.f, function0, function1, qim0Var, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        tob1 tob1Var = (tob1) this.b;
        m4c m4cVar = fkj0.X;
        n081 n081Var = (n081) this.c;
        String str = n081Var.a;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            tob1 tob1Var2 = (tob1) this.i;
            yz71 yz71Var = a081.a;
            boolean zBooleanValue = ((Boolean) tob1Var2.getValue()).booleanValue();
            qim0 qim0VarC = nim0.a;
            if (zBooleanValue) {
                x340Var2.i0(-1967948257);
                boolean zI = x340Var2.i(tob1Var);
                Object objT = x340Var2.T();
                if (zI || objT == m4cVar) {
                    objT = new lws0(tob1Var, (byte) 18);
                    x340Var2.s0(objT);
                }
                qim0VarC = i541.C(qim0VarC, (iu30) objT);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1967793133);
                x340Var2.r(false);
            }
            qim0 qim0Var = qim0VarC;
            float fU0 = ((wat) x340Var2.k(t4k.h)).U0();
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            boolean zD = x340Var2.d(fU0) | x340Var2.d(4.0f) | x340Var2.d(4.0f) | x340Var2.d(8.0f) | x340Var2.d(12.0f);
            Object objT2 = x340Var2.T();
            if (zD || objT2 == m4cVar) {
                uvx uvxVar = new uvx(1, ogx.e, 1, a081.a, (zzq0) null, new tvx(4.0f, 8.0f, 12.0f), er31.b(4.0f), 1, new p3v(fU0 * 48.0f), 16);
                x340Var2.s0(uvxVar);
                objT2 = uvxVar;
            }
            uvx uvxVar2 = (uvx) objT2;
            Function0 function0 = (Function0) this.e;
            boolean zG = x340Var2.g(str) | x340Var2.g(function0);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == m4cVar) {
                objT3 = a081.e(str, function0);
                x340Var2.s0(objT3);
            }
            gbx gbxVar = (gbx) objT3;
            Function0 function1 = (Function0) this.d;
            boolean zG2 = x340Var2.g(str) | x340Var2.g(function1);
            Object objT4 = x340Var2.T();
            j2i j2iVarR = null;
            if (zG2 || objT4 == m4cVar) {
                objT4 = function1 != null ? a081.e(str, function1) : null;
                x340Var2.s0(objT4);
            }
            gbx gbxVar2 = (gbx) objT4;
            xu30 xu30Var = (xu30) this.g;
            if (this.f) {
                x340Var2.i0(-1967302186);
                j2iVarR = apo.r(-1375692265, new zz71(n081Var, (byte) 0), x340Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1967230917);
                x340Var2.r(false);
            }
            jto1.b(qim0Var, uvxVar2, (max) null, false, (idn0) this.h, (ga80) null, gbxVar, gbxVar2, (xu30) null, apo.r(2089573024, new zz71(n081Var, (byte) 1), x340Var2), (xu30) null, j2iVarR, xu30Var, (xu30) null, (xu30) null, apo.r(677049509, new zz71(n081Var, (byte) 2), x340Var2), x340Var2, 805503040, 196608, 25868);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wzi1 wzi1Var = (wzi1) this.b;
        iuq iuqVar = (iuq) this.c;
        juq juqVar = (juq) this.d;
        kuq kuqVar = (kuq) this.e;
        jtl1 jtl1Var = (jtl1) this.h;
        qim0 qim0Var = (qim0) this.g;
        iu30 iu30Var = (iu30) this.i;
        wyo1.g(wzi1Var, iuqVar, juqVar, kuqVar, jtl1Var, this.f, qim0Var, iu30Var, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        jax haxVar;
        int i;
        int i2;
        boolean z;
        qim0 qim0VarF;
        u85 u85Var;
        String string;
        boolean z2;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        boolean z3 = this.f;
        qim0 qim0VarZ = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.c;
        Object obj8 = this.b;
        Object obj9 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                tro1.a((String) obj8, (String) obj7, this.f, (String) obj9, (qim0) obj3, (Function0) obj4, (j2i) obj6, (j2i) obj5, (b0k) obj, czo1.p(14155777));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    String str = (String) obj8;
                    String str2 = (String) obj7;
                    String str3 = (String) obj9;
                    String str4 = (String) obj3;
                    c4f c4fVar = (c4f) obj6;
                    Function0 function0 = (Function0) obj4;
                    Function0 function1 = (Function0) obj5;
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
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
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var2).k, cbx.a(x340Var2).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    uwo1.e(str2, (qim0) null, kk0.p(qim0VarZ, 8.0f, x340Var2, x340Var2).h, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    op71.g(x340Var2, u291.h(qim0VarZ, 12.0f));
                    fqo1.n(0, str3, str4, x340Var2, (qim0) null);
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    String strG = ydh.g(12.0f, 2131953716, x340Var2, x340Var2, qim0VarZ);
                    qim0 qim0VarF2 = u291.f(qim0VarZ, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    if (c4fVar.b == 2) {
                        x340Var2.i0(-657099952);
                        fqo1.a(0, function0, x340Var2, (qim0) null);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-656992320);
                        x340Var2.r(false);
                    }
                    op71.g(x340Var2, new wnb0(1.0f, true));
                    boolean zG = x340Var2.g(function1);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new pj8(function1, (byte) 27);
                        x340Var2.s0(objT);
                    }
                    Function0 function2 = (Function0) objT;
                    if (ihc1.y0(strG)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar = new gbx(new y50(strG), function2);
                    idx idxVar = new idx(6);
                    gdx gdxVarS = yla.s(x340Var2);
                    if (z3) {
                        x340Var2.i0(-656660434);
                        x340Var2.r(false);
                        haxVar = jax.a;
                    } else {
                        x340Var2.i0(-656601472);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131953717));
                        x340Var2.r(false);
                    }
                    foo1.c(gbxVar, idxVar, (qim0) null, haxVar, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-631809821, new j3b(strG, (byte) 18), x340Var2), x340Var2, 0, 48, 1996);
                    x340Var2.r(true);
                    x340Var2.i0(-851804516);
                    x340Var2.r(false);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                n6f n6fVar = (r6f) obj;
                tv80 tv80Var = (tv80) obj2;
                String str5 = (String) obj8;
                uff uffVar = (uff) obj9;
                fpf fpfVar = uffVar.q;
                ven0 ven0Var = (ven0) obj3;
                iu30 iu30Var = (iu30) obj7;
                if (n6fVar.equals(e6f.a)) {
                    ((s3f) ven0Var.getValue()).b(rdf.a, iu30Var);
                } else if (n6fVar instanceof n6f) {
                    ((s3f) ven0Var.getValue()).b(new xdf(n6fVar.a), iu30Var);
                } else if (n6fVar instanceof h6f) {
                    if (z3) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(fpfVar.b());
                        if (linkedHashMap.remove(str5) != null) {
                            fpfVar.c(linkedHashMap);
                        }
                    }
                    ((s3f) ven0Var.getValue()).b(new vdf(((h6f) n6fVar).a), iu30Var);
                } else if (n6fVar instanceof i6f) {
                    ((s3f) ven0Var.getValue()).b(new wdf(((i6f) n6fVar).a), iu30Var);
                } else if (n6fVar instanceof g6f) {
                    if (z3) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fpfVar.b());
                        if (linkedHashMap2.remove(str5) != null) {
                            fpfVar.c(linkedHashMap2);
                        }
                    }
                    g6f g6fVar = (g6f) n6fVar;
                    ((s3f) ven0Var.getValue()).b(new udf(g6fVar.a, g6fVar.b), iu30Var);
                } else if (n6fVar instanceof y5f) {
                    ((s3f) ven0Var.getValue()).b(new mdf(tv80Var != null ? tv80Var.a : null), iu30Var);
                } else if (n6fVar instanceof c6f) {
                    ((s3f) ven0Var.getValue()).b(new ndf(tv80Var != null ? tv80Var.a : null, 0), iu30Var);
                } else if (n6fVar instanceof a6f) {
                    ((s3f) ven0Var.getValue()).b(new ndf(tv80Var != null ? tv80Var.a : null, 2), iu30Var);
                } else if (n6fVar instanceof z5f) {
                    ((s3f) ven0Var.getValue()).b(new ndf(tv80Var != null ? tv80Var.a : null, 3), iu30Var);
                } else if (n6fVar instanceof b6f) {
                    if (((b6f) n6fVar).a) {
                        qf4 qf4Var = uffVar.j.a;
                        if (qf4Var.h() && qf4Var.p()) {
                            fn31.T(uffVar.k0, (o8n) null, 0, new hff((fth0) obj4, uffVar, tv80Var, (lnm) null, (byte) 0), 3);
                        } else {
                            ((ven0) obj6).setValue(true);
                        }
                    } else {
                        ((ven0) obj5).setValue(Boolean.TRUE);
                    }
                } else if (n6fVar instanceof o6f) {
                    iu30Var.invoke(new f3f(new mpl(((o6f) n6fVar).a, false), uffVar.i0.b()));
                } else if (n6fVar instanceof x5f) {
                    ((s3f) ven0Var.getValue()).b(new idf(((x5f) n6fVar).a), iu30Var);
                } else if (!n6fVar.equals(t5f.a) && !n6fVar.equals(u5f.a) && !(n6fVar instanceof v5f) && !(n6fVar instanceof q6f) && !n6fVar.equals(p6f.a) && !(n6fVar instanceof f6f) && !n6fVar.equals(w5f.a) && !(n6fVar instanceof d6f) && !(n6fVar instanceof l6f) && !(n6fVar instanceof m6f) && !(n6fVar instanceof k6f) && !(n6fVar instanceof j6f)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                yon1.d((y7e1) obj8, this.f, (ova) obj7, (c380) obj9, (iu30) obj6, (qim0) obj3, (fnv) obj5, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                vqv vqvVar = (vqv) obj8;
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ven0 ven0Var2 = (ven0) obj3;
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    u380 u380VarC = mqo1.C((Set) ((ven0) obj5).getValue());
                    s061 s061Var = vqvVar.b;
                    boolean zI = x340Var4.i(s061Var);
                    Object objT2 = x340Var4.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new y0u(0, s061Var, s061.class, "enterSelectionMode", "enterSelectionMode()V", 0, (byte) 4);
                        x340Var4.s0(objT2);
                    }
                    htv htvVar = (htv) obj7;
                    Function0 function3 = (Function0) obj4;
                    Function0 function4 = (nla0) objT2;
                    c380 c380Var = (c380) obj9;
                    boolean zG2 = x340Var4.g(ven0Var2);
                    Object objT3 = x340Var4.T();
                    if (zG2 || objT3 == m4cVar) {
                        objT3 = new d7v(ven0Var2, (byte) 5);
                        x340Var4.s0(objT3);
                    }
                    vqvVar.a(this.f, htvVar, function3, function4, u380VarC, c380Var, (iu30) objT3, (iu30) obj6, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj5;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0Var = (qim0) obj3;
                    xtb0 xtb0Var = (xtb0) obj8;
                    vzq0 vzq0Var = (vzq0) obj7;
                    g36 g36Var = (g36) obj9;
                    nl3 nl3Var = (nl3) obj4;
                    iq20 iq20Var = (iq20) obj6;
                    boolean zG3 = x340Var6.g(iu30Var2);
                    Object objT4 = x340Var6.T();
                    if (zG3 || objT4 == fkj0.X) {
                        objT4 = new hws(iu30Var2, (byte) 21);
                        x340Var6.s0(objT4);
                    }
                    ujo1.d(qim0Var, xtb0Var, vzq0Var, false, g36Var, nl3Var, iq20Var, this.f, (hxq0) null, (iu30) objT4, x340Var6, 0, 256);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarL = bmq0.L(u291.f((qim0) obj3, 1.0f), k1o1.q(x340Var8), (g6o0) null);
                    Function0 function5 = (Function0) obj4;
                    l5y l5yVar = (l5y) obj8;
                    suo suoVar = (suo) obj7;
                    iu30 iu30Var3 = (iu30) obj9;
                    iu30 iu30Var4 = (iu30) obj6;
                    muo muoVar = (muo) obj5;
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var8, 0);
                    int iHashCode3 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM3 = x340Var8.m();
                    qim0 qim0VarE3 = zr7.E(x340Var8, qim0VarL);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(mbhVarA2, x340Var8, y580.O0);
                    nko1.H(xos0VarM3, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE3, x340Var8, y580.Y);
                    if (z3) {
                        x340Var8.i0(1031977166);
                        i = 0;
                        x340Var8.r(false);
                        i2 = 1;
                    } else {
                        i = 0;
                        x340Var8.i0(1031978268);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar4 = cbx.b(x340Var8).b;
                        i2 = 1;
                        qim0VarZ = uyn1.z(0.0f, 12.0f, 1, qim0VarZ);
                        x340Var8.r(false);
                    }
                    rwq0.i(i, z3 ? function5 : null, x340Var8, qim0VarZ, z3);
                    rqo1.g(i, i2, x340Var8, (qim0) null);
                    boolean zI2 = x340Var8.i(suoVar) | x340Var8.g(l5yVar) | x340Var8.g(iu30Var3) | x340Var8.g(iu30Var4);
                    Object objT5 = x340Var8.T();
                    if (zI2 || objT5 == fkj0.X) {
                        objT5 = new qfx(suoVar, l5yVar, iu30Var3, iu30Var4);
                        x340Var8.s0(objT5);
                    }
                    rwq0.f(l5yVar, (vu30) objT5, muoVar, suoVar, (qim0) null, x340Var8, 0);
                    if (l5yVar.a || !(l5yVar.b instanceof j5y)) {
                        x340Var8.i0(1927157723);
                        rwq0.g(0, x340Var8, (qim0) null, z3);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(1927220188);
                        x340Var8.r(false);
                    }
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                rwq0.c((l5y) obj8, (iu30) obj7, (otu) obj9, (Function0) obj4, (qim0) obj3, (muo) obj6, (iu30) obj5, this.f, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                c921.c((j3v) obj8, (kly0) obj7, (iac0) obj9, (dgy) obj3, this.f, (ksw) obj4, (cgy) obj6, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qim0 qim0VarD = u291.d((qim0) obj3, 1.0f);
                    nt70 nt70Var = (nt70) obj7;
                    ven0 ven0Var3 = (ven0) obj9;
                    Function0 function6 = (Function0) obj4;
                    iu30 iu30Var5 = (iu30) obj6;
                    wat watVar = (wat) obj5;
                    String str6 = (String) obj8;
                    mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var10, 0);
                    int iHashCode4 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM4 = x340Var10.m();
                    qim0 qim0VarE4 = zr7.E(x340Var10, qim0VarD);
                    hzj.A.getClass();
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
                    nko1.H(mbhVarA3, x340Var10, y580.O0);
                    nko1.H(xos0VarM4, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE4, x340Var10, y580.Y);
                    qim0 qim0VarF3 = u291.f(qim0VarZ, 1.0f);
                    boolean z4 = nt70Var.q;
                    float f = ((p3v) ven0Var3.getValue()).a;
                    j2i j2iVarR = apo.r(1766469258, new bp50(nt70Var, iu30Var5, function6, (byte) 3), x340Var10);
                    boolean z5 = this.f;
                    gho1.c(z4, z5, f, j2iVarR, apo.r(-97747573, new ey(nt70Var, watVar, str6, ven0Var3, z5), x340Var10), qim0VarF3, x340Var10, 224256);
                    l4o1.e(u291.f(qim0VarZ, 1.0f), 0.75f, 1.0f, apo.r(384638785, new hv50(nt70Var), x340Var10), x340Var10, 3510, 0);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                hdn0 hdn0Var = (hdn0) obj5;
                xta0 xta0Var = (xta0) obj9;
                Function0 function7 = (Function0) obj4;
                m4c m4cVar2 = fkj0.X;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c6e1 c6e1Var = nqf.a;
                    kua0 kua0Var = new kua0(3, (Boolean) null, 0, 4, 118);
                    boolean zG4 = x340Var12.g(function7);
                    Object objT6 = x340Var12.T();
                    if (zG4 || objT6 == m4cVar2) {
                        objT6 = new uy5(function7, (byte) 3);
                        x340Var12.s0(objT6);
                    }
                    yta0 yta0Var = (yta0) objT6;
                    qim0 qim0VarP = vby0.p(qim0VarZ, (lz20) obj7);
                    boolean zI3 = x340Var12.i(xta0Var);
                    Object objT7 = x340Var12.T();
                    if (zI3 || objT7 == m4cVar2) {
                        objT7 = new hu90(xta0Var, (byte) 14);
                        x340Var12.s0(objT7);
                    }
                    qim0 qim0VarN = anm1.N("KeyboardAccessory.TextInput", ern1.x(qim0VarP, (iu30) objT7));
                    y7e1 y7e1Var = (y7e1) obj3;
                    String str7 = (String) obj8;
                    vu30 vu30Var = (vu30) obj6;
                    boolean zI4 = x340Var12.i(hdn0Var);
                    Object objT8 = x340Var12.T();
                    if (zI4 || objT8 == m4cVar2) {
                        objT8 = new yoe(hdn0Var, (byte) 3);
                        x340Var12.s0(objT8);
                    }
                    pwo1.a(y7e1Var, qim0VarN, (max) null, str7, rqf.b, (lee1) null, vu30Var, kua0Var, yta0Var, (mqf) null, c6e1Var, (vu30) objT8, this.f, (dk80) null, x340Var12, 0, 0, 8740);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                r4o1.u((UnmatchedItem) obj7, (Set) obj9, this.f, (p410) obj3, (String) obj8, (Function0) obj4, (Function0) obj6, (vu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                d9y0.g((String) obj8, (String) obj7, (String) obj9, (Function0) obj4, (qim0) obj3, this.f, (String) obj6, (c380) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                nb51.g((List) obj8, (Set) obj7, (Integer) obj9, this.f, (iu30) obj6, (iu30) obj5, (qim0) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                bzn1.f((vu30) obj8, (Function0) obj4, (qim0) obj3, this.f, (vu30) obj7, (ngr0) obj9, (ygr0) obj6, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                boolean zY2 = x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2);
                j06 j06Var2 = x340Var14.a;
                if (!zY2) {
                    x340Var14.b0();
                    return rih1Var;
                }
                khr0 khr0Var = (khr0) obj8;
                bz11 bz11Var = (bz11) obj7;
                xpw xpwVar = (xpw) obj9;
                Bundle bundle = (Bundle) obj3;
                bpb1 bpb1Var = (bpb1) obj4;
                p40 p40Var = (p40) obj6;
                idd1 idd1Var = (idd1) obj5;
                era eraVar = een.P0;
                mbh mbhVarA4 = jbh.a(f36Var, eraVar, x340Var14, 0);
                int iHashCode5 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM5 = x340Var14.m();
                qim0 qim0VarE5 = zr7.E(x340Var14, qim0VarZ);
                hzj.A.getClass();
                if (j06Var2 == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(n4kVar);
                } else {
                    x340Var14.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA4, x340Var14, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM5, x340Var14, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode5);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var14, lljVar7);
                nko1.F(x340Var14);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE5, x340Var14, lljVar8);
                if (khr0Var.j.k0()) {
                    x340Var14.i0(-621431247);
                    uwr uwrVar3 = cbx.a;
                    qim0VarF = dug.f(qim0VarZ, cbx.a(x340Var14).a.d, d4o1.a);
                    z = false;
                    x340Var14.r(false);
                } else {
                    z = false;
                    x340Var14.i0(-621324638);
                    x340Var14.r(false);
                    qim0VarF = qim0VarZ;
                }
                u85 u85Var2 = (erl1) x340Var14.k(szf0.b);
                if (u85Var2 == null) {
                    x340Var14.i0(-241884180);
                    WeakHashMap weakHashMap = osl1.x;
                    u85Var = lhc.g(x340Var14).g;
                    x340Var14.r(z);
                } else {
                    x340Var14.i0(-241885792);
                    x340Var14.r(z);
                    u85Var = u85Var2;
                }
                qim0 qim0VarThen = qim0VarF.then(too1.y(qim0VarZ, new bgc0(u85Var, 16)));
                mbh mbhVarA5 = jbh.a(f36Var, eraVar, x340Var14, 0);
                int iHashCode6 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM6 = x340Var14.m();
                qim0 qim0VarE6 = zr7.E(x340Var14, qim0VarThen);
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(n4kVar);
                } else {
                    x340Var14.v0();
                }
                nko1.H(mbhVarA5, x340Var14, lljVar5);
                nko1.H(xos0VarM6, x340Var14, lljVar6);
                x0d.q(iHashCode6, x340Var14, lljVar7, x340Var14);
                nko1.H(qim0VarE6, x340Var14, lljVar8);
                if (bundle == null || (string = bundle.getString("query")) == null) {
                    string = khr0Var.d;
                }
                otw.c(xpwVar, new m251(string, z3), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                ue20 ue20Var = (ue20) rwq.h(bpb1Var, x340Var14, 0).getValue();
                if (ue20Var instanceof te20) {
                    x340Var14.i0(507424956);
                    otw.c((uh91) idd1Var.getValue(), fqo1.J((te20) ue20Var), (qim0) null, (ipb1) null, x340Var14, 8, 12);
                    x340Var14.r(false);
                } else {
                    if (!(ue20Var instanceof re20) && !u890.j(ue20Var, se20.a)) {
                        throw p3d1.k(x340Var14, 507420727, false);
                    }
                    x340Var14.i0(507434066);
                    otw.c(p40Var, fqo1.I(ue20Var), (qim0) null, (ipb1) null, x340Var14, 72, 12);
                    x340Var14.r(false);
                }
                x340Var14.r(true);
                if (bz11Var != 0) {
                    x340Var14.i0(-619875264);
                    od51 od51Var = (od51) b2p1.C(khr0Var.o.i, x340Var14).getValue();
                    if (od51Var == null) {
                        x340Var14.i0(-619766331);
                        z2 = false;
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-619766330);
                        lw41 lw41Var = od51Var.a;
                        if (lw41Var instanceof lw41) {
                            x340Var14.i0(407037324);
                            bz11Var.a(lw41Var, od51Var.e, od51Var.f, od51Var.h, new wnb0(1.0f, true), x340Var14, 0);
                            z2 = false;
                            x340Var14.r(false);
                        } else {
                            z2 = false;
                            x340Var14.i0(407442866);
                            x340Var14.r(false);
                        }
                        x340Var14.r(z2);
                    }
                    x340Var14.r(z2);
                } else {
                    x340Var14.i0(-619175656);
                    x340Var14.r(false);
                }
                x340Var14.r(true);
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                zqo1.h((lis0) obj8, this.f, (iu30) obj7, (Function0) obj4, (vu30) obj9, (Function0) obj6, (Function0) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                return a(obj, obj2);
            case 18:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                String str8 = (String) obj7;
                o8w0 o8w0Var = (o8w0) obj9;
                String str9 = (String) obj8;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    qim0 qim0VarF4 = u291.f(qim0VarZ, 1.0f);
                    boolean zG5 = x340Var16.g(str9) | x340Var16.i(o8w0Var) | x340Var16.g(str8) | x340Var16.g(iu30Var6);
                    Object objT9 = x340Var16.T();
                    if (zG5 || objT9 == m4cVar3) {
                        objT9 = new vvu0(str9, o8w0Var, str8, iu30Var6, (byte) 3);
                        x340Var16.s0(objT9);
                    }
                    qim0 qim0VarB = s161.b(qim0VarF4, true, (iu30) objT9);
                    uwr uwrVar4 = cbx.a;
                    avw0 avw0Var = cbx.b(x340Var16).c;
                    long jA = cbx.a(x340Var16).a.b.a();
                    cua cuaVar = cbx.b(x340Var16).f;
                    qim0 qim0VarE7 = d1u.E(1.0f, jA, qim0VarB, er31.b(8.0f));
                    cvx cvxVar5 = cbx.b(x340Var16).b;
                    zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
                    boolean zG6 = x340Var16.g(iu30Var6);
                    Object objT10 = x340Var16.T();
                    if (zG6 || objT10 == m4cVar3) {
                        objT10 = new smt0(iu30Var6, (byte) 28);
                        x340Var16.s0(objT10);
                    }
                    cwl1.b(qim0VarE7, (tl3) null, (hw61) null, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT10), (gbx) null, apo.r(336467415, new hh1(this.f, (e9w0) obj4, (ArrayList) obj6, (o8w0) obj9, (s8w0) obj5, (byte) 9), x340Var16), x340Var16, 0, 48, 1518);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                kyo1.l((gm50) obj3, this.f, (String) obj8, (ycm) obj6, (String) obj7, (String) obj9, (Function0) obj4, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                return d(obj, obj2);
            case 21:
                return e(obj, obj2);
            case 22:
                return f(obj, obj2);
            default:
                ((Number) obj2).intValue();
                mod.e((cce) obj8, (dbp) obj7, (vy71) obj9, this.f, (z0i) obj6, (z0i) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(String str, String str2, String str3, String str4, c4f c4fVar, String str5, Function0 function0, Function0 function1, boolean z) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.g = str4;
        this.h = c4fVar;
        this.e = function0;
        this.i = function1;
        this.f = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(String str, String str2, String str3, String str4, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.h = str4;
        this.f = z;
        this.e = function0;
        this.i = function1;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(String str, String str2, String str3, Function0 function0, qim0 qim0Var, boolean z, String str4, c380 c380Var, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = function0;
        this.g = qim0Var;
        this.f = z;
        this.h = str4;
        this.i = c380Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(String str, String str2, boolean z, String str3, qim0 qim0Var, Function0 function0, j2i j2iVar, j2i j2iVar2, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.f = z;
        this.d = str3;
        this.g = qim0Var;
        this.e = function0;
        this.h = j2iVar;
        this.i = j2iVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(String str, o8w0 o8w0Var, String str2, iu30 iu30Var, boolean z, e9w0 e9w0Var, ArrayList arrayList, s8w0 s8w0Var) {
        super(2);
        this.b = str;
        this.d = o8w0Var;
        this.c = str2;
        this.g = iu30Var;
        this.f = z;
        this.e = e9w0Var;
        this.h = arrayList;
        this.i = s8w0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(List list, Set set, Integer num, boolean z, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.b = list;
        this.c = set;
        this.d = num;
        this.f = z;
        this.h = iu30Var;
        this.i = iu30Var2;
        this.g = qim0Var;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Function0 function0, lz20 lz20Var, xta0 xta0Var, y7e1 y7e1Var, String str, j2i j2iVar, hdn0 hdn0Var, boolean z) {
        super(2);
        this.e = function0;
        this.c = lz20Var;
        this.d = xta0Var;
        this.g = y7e1Var;
        this.b = str;
        this.h = j2iVar;
        this.i = hdn0Var;
        this.f = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(cce cceVar, dbp dbpVar, vy71 vy71Var, boolean z, z0i z0iVar, z0i z0iVar2, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.b = cceVar;
        this.c = dbpVar;
        this.d = vy71Var;
        this.f = z;
        this.h = z0iVar;
        this.i = z0iVar2;
        this.e = function0;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(j3v j3vVar, kly0 kly0Var, iac0 iac0Var, dgy dgyVar, boolean z, ksw kswVar, cgy cgyVar, iu30 iu30Var, int i) {
        super(2);
        this.b = j3vVar;
        this.c = kly0Var;
        this.d = iac0Var;
        this.g = dgyVar;
        this.f = z;
        this.e = kswVar;
        this.h = cgyVar;
        this.i = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(vqv vqvVar, boolean z, htv htvVar, Function0 function0, c380 c380Var, ven0 ven0Var, iu30 iu30Var, ven0 ven0Var2) {
        super(2);
        this.b = vqvVar;
        this.f = z;
        this.c = htvVar;
        this.e = function0;
        this.d = c380Var;
        this.g = ven0Var;
        this.h = iu30Var;
        this.i = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(l5y l5yVar, iu30 iu30Var, otu otuVar, Function0 function0, qim0 qim0Var, muo muoVar, iu30 iu30Var2, boolean z, int i) {
        super(2);
        this.b = l5yVar;
        this.c = iu30Var;
        this.d = otuVar;
        this.e = function0;
        this.g = qim0Var;
        this.h = muoVar;
        this.i = iu30Var2;
        this.f = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(iu30 iu30Var, boolean z, uff uffVar, String str, ven0 ven0Var, fth0 fth0Var, ven0 ven0Var2, ven0 ven0Var3) {
        super(2);
        this.c = iu30Var;
        this.f = z;
        this.d = uffVar;
        this.b = str;
        this.g = ven0Var;
        this.e = fth0Var;
        this.h = ven0Var2;
        this.i = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(vu30 vu30Var, Function0 function0, qim0 qim0Var, boolean z, vu30 vu30Var2, ngr0 ngr0Var, ygr0 ygr0Var, Function0 function1, int i) {
        super(2);
        this.b = vu30Var;
        this.e = function0;
        this.g = qim0Var;
        this.f = z;
        this.c = vu30Var2;
        this.d = ngr0Var;
        this.h = ygr0Var;
        this.i = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(gm50 gm50Var, boolean z, String str, ycm ycmVar, String str2, String str3, Function0 function0, Function0 function1, int i) {
        super(2);
        this.g = gm50Var;
        this.f = z;
        this.b = str;
        this.h = ycmVar;
        this.c = str2;
        this.d = str3;
        this.e = function0;
        this.i = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(qim0 qim0Var, nt70 nt70Var, boolean z, ven0 ven0Var, Function0 function0, iu30 iu30Var, wat watVar, String str) {
        super(2);
        this.g = qim0Var;
        this.c = nt70Var;
        this.f = z;
        this.d = ven0Var;
        this.e = function0;
        this.h = iu30Var;
        this.i = watVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(qim0 qim0Var, xtb0 xtb0Var, vzq0 vzq0Var, g36 g36Var, nl3 nl3Var, iq20 iq20Var, boolean z, iu30 iu30Var) {
        super(2);
        this.g = qim0Var;
        this.b = xtb0Var;
        this.c = vzq0Var;
        this.d = g36Var;
        this.e = nl3Var;
        this.h = iq20Var;
        this.f = z;
        this.i = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(qim0 qim0Var, boolean z, Function0 function0, l5y l5yVar, suo suoVar, iu30 iu30Var, iu30 iu30Var2, muo muoVar) {
        super(2);
        this.g = qim0Var;
        this.f = z;
        this.e = function0;
        this.b = l5yVar;
        this.c = suoVar;
        this.d = iu30Var;
        this.h = iu30Var2;
        this.i = muoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(vzq0 vzq0Var, boolean z, ven0 ven0Var, ven0 ven0Var2, v1t0 v1t0Var, z1t0 z1t0Var, xk xkVar, swa0 swa0Var) {
        super(2);
        this.b = vzq0Var;
        this.f = z;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.g = v1t0Var;
        this.e = z1t0Var;
        this.h = xkVar;
        this.i = swa0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(khr0 khr0Var, bz11 bz11Var, xpw xpwVar, Bundle bundle, boolean z, bpb1 bpb1Var, p40 p40Var, idd1 idd1Var) {
        super(2);
        this.b = khr0Var;
        this.c = bz11Var;
        this.d = xpwVar;
        this.g = bundle;
        this.f = z;
        this.e = bpb1Var;
        this.h = p40Var;
        this.i = idd1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(lis0 lis0Var, boolean z, iu30 iu30Var, Function0 function0, vu30 vu30Var, Function0 function1, Function0 function2, qim0 qim0Var, int i) {
        super(2);
        this.b = lis0Var;
        this.f = z;
        this.c = iu30Var;
        this.e = function0;
        this.d = vu30Var;
        this.h = function1;
        this.i = function2;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(tob1 tob1Var, n081 n081Var, Function0 function0, Function0 function1, xu30 xu30Var, boolean z, idn0 idn0Var, tob1 tob1Var2) {
        super(2);
        this.b = tob1Var;
        this.c = n081Var;
        this.e = function0;
        this.d = function1;
        this.g = xu30Var;
        this.f = z;
        this.h = idn0Var;
        this.i = tob1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(y7e1 y7e1Var, boolean z, ova ovaVar, c380 c380Var, iu30 iu30Var, qim0 qim0Var, fnv fnvVar, Function0 function0, int i) {
        super(2);
        this.b = y7e1Var;
        this.f = z;
        this.c = ovaVar;
        this.d = c380Var;
        this.h = iu30Var;
        this.g = qim0Var;
        this.i = fnvVar;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(wzi1 wzi1Var, iuq iuqVar, juq juqVar, kuq kuqVar, jtl1 jtl1Var, boolean z, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = wzi1Var;
        this.c = iuqVar;
        this.d = juqVar;
        this.e = kuqVar;
        this.h = jtl1Var;
        this.f = z;
        this.g = qim0Var;
        this.i = iu30Var;
    }
}
