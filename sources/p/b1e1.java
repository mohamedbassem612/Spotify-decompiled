package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b1e1 extends hab0 implements zu30 {
    public final /* synthetic */ c380 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1e1(c380 c380Var, boolean z, int i, iu30 iu30Var, String str, ven0 ven0Var) {
        super(4);
        this.a = c380Var;
        this.b = z;
        this.c = i;
        this.d = iu30Var;
        this.e = str;
        this.f = ven0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        float f;
        boolean z;
        long j;
        iu30 iu30Var;
        float f2;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        c380 c380Var = this.a;
        oce1 oce1Var = (oce1) c380Var.get(iIntValue);
        String str = oce1Var.d;
        String str2 = oce1Var.c;
        x340 x340Var = (b0k) obj3;
        boolean zG = x340Var.g(str) | x340Var.h(this.b);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = v8r.q((Object) null);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        oce1 oce1Var2 = (oce1) o7h.t0(iIntValue + 1, c380Var);
        d261 d261Var = c1e1.a;
        boolean zContains = ((Set) this.f.getValue()).contains(Integer.valueOf(iIntValue));
        if ((oce1Var2 != null ? oce1Var2.c : null) != null) {
            x340Var.i0(-792956795);
            x340Var.r(false);
            f = 0.0f;
        } else {
            x340Var.i0(-792955669);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            x340Var.r(false);
            f = 2.0f;
        }
        float f3 = f;
        tob1 tob1VarA = w191.a(zContains ? z4p1.e(this.c) : u7h.j, irn1.o0(300, 0, (dlv) null, 6), (String) null, x340Var, 0, 12);
        x340 x340Var2 = x340Var;
        tob1 tob1VarA2 = w191.a(zContains ? u7h.b(u7h.b, 0.2f, 0.0f, 0.0f, 0.0f, 14) : u7h.j, irn1.o0(300, 0, (dlv) null, 6), (String) null, x340Var2, 0, 12);
        nim0 nim0Var = nim0.a;
        if (str2 != null) {
            x340Var2.i0(1188750144);
            if (iIntValue > 0) {
                x340Var2.i0(-792935412);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f2 = 10.0f;
            } else {
                x340Var2.i0(-792932379);
                x340Var2.r(false);
                f2 = 0.0f;
            }
            uwr uwrVar3 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            uwo1.e(uap1.e(oce1Var.a).concat(str2.length() > 0 ? " · ".concat(str2) : ""), uyn1.B(nim0Var, 0.0f, f2, 0.0f, 4.0f, 5), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            x340Var2 = x340Var2;
            x340Var2.r(false);
        } else {
            x340Var2.i0(1189610239);
            x340Var2.r(false);
        }
        qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, f3, 7);
        long j2 = ((u7h) tob1VarA.getValue()).a;
        uwr uwrVar4 = cbx.a;
        cua cuaVar = cbx.b(x340Var2).f;
        qim0 qim0VarF = dug.f(qim0VarB, j2, er31.b(4.0f));
        long j3 = ((u7h) tob1VarA2.getValue()).a;
        cua cuaVar2 = cbx.b(x340Var2).f;
        qim0 qim0VarF2 = dug.f(qim0VarF, j3, er31.b(4.0f));
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            objT2 = ktd.n(x340Var2);
        }
        idn0 idn0Var = (idn0) objT2;
        iu30 iu30Var2 = this.d;
        int i = (iIntValue2 & 112) ^ 48;
        boolean zG2 = x340Var2.g(iu30Var2) | ((i > 32 && x340Var2.e(iIntValue)) || (iIntValue2 & 48) == 32);
        Object objT3 = x340Var2.T();
        if (zG2 || objT3 == m4cVar) {
            objT3 = new ck0(iu30Var2, iIntValue, (byte) 23);
            x340Var2.s0(objT3);
        }
        qim0 qim0VarV = bin.v(qim0VarF2, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT3, 28);
        boolean zI = x340Var2.i(tob1VarA) | ((i > 32 && x340Var2.e(iIntValue)) || (iIntValue2 & 48) == 32) | x340Var2.h(zContains);
        String str3 = this.e;
        boolean zG3 = zI | x340Var2.g(str3);
        Object objT4 = x340Var2.T();
        if (zG3 || objT4 == m4cVar) {
            objT4 = new tb60(iIntValue, zContains, str3, tob1VarA);
            x340Var2.s0(objT4);
        }
        qim0 qim0VarB2 = s161.b(qim0VarV, false, (iu30) objT4);
        gfh0 gfh0VarC = t1c.c(een.d, false);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarB2);
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
        nko1.H(gfh0VarC, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        cvx cvxVar5 = cbx.b(x340Var2).b;
        qim0 qim0VarZ = uyn1.z(6.0f, 0.0f, 2, nim0Var);
        y9e1 y9e1Var = (y9e1) ven0Var.getValue();
        Object objT5 = x340Var2.T();
        if (objT5 == m4cVar) {
            objT5 = orc1.Q0;
            x340Var2.s0(objT5);
        }
        Function0 function0 = (Function0) objT5;
        boolean zG4 = x340Var2.g(iu30Var2) | ((i > 32 && x340Var2.e(iIntValue)) || (iIntValue2 & 48) == 32);
        Object objT6 = x340Var2.T();
        if (zG4 || objT6 == m4cVar) {
            objT6 = new z0e(iu30Var2, iIntValue, (byte) 7);
            x340Var2.s0(objT6);
        }
        boolean z2 = this.b;
        qim0 qim0VarC = fae1.C(qim0VarZ, y9e1Var, z2, function0, true, (iu30) objT6);
        String str4 = oce1Var.d;
        lee1 lee1Var = cbx.d(x340Var2).h;
        if (zContains) {
            x340Var2.i0(-1208790771);
            j = cbx.a(x340Var2).b.a;
            z = false;
        } else {
            z = false;
            x340Var2.i0(-1208789776);
            j = cbx.a(x340Var2).b.b;
        }
        x340Var2.r(z);
        if (z2) {
            x340Var2.i0(1182319702);
            boolean zI2 = x340Var2.i(ven0Var);
            Object objT7 = x340Var2.T();
            if (zI2 || objT7 == m4cVar) {
                objT7 = new ry71(ven0Var, (byte) 15);
                x340Var2.s0(objT7);
            }
            x340Var2.r(false);
            iu30Var = (iu30) objT7;
        } else {
            x340Var2.i0(1182391467);
            x340Var2.r(false);
            iu30Var = null;
        }
        x340 x340Var3 = x340Var2;
        uwo1.e(str4, qim0VarC, lee1Var, j, (a0e1) null, iu30Var, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2000);
        x340Var3.r(true);
        if (iIntValue == p7h.L(c380Var)) {
            x340Var3.i0(1192090022);
            uwo1.e("", (qim0) null, cbx.d(x340Var3).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 6, 0, 2042);
            x340Var3.r(false);
        } else {
            x340Var3.i0(1192175551);
            x340Var3.r(false);
        }
        return rih1.a;
    }
}
