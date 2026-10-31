package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b7f1 extends hab0 implements hu30 {
    public final /* synthetic */ iyd X;
    public final /* synthetic */ tob1 Y;
    public final /* synthetic */ rk41 a;
    public final /* synthetic */ c7f1 b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ hdn0 g;
    public final /* synthetic */ hdn0 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ s6f1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7f1(rk41 rk41Var, c7f1 c7f1Var, c380 c380Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, hdn0 hdn0Var, hdn0 hdn0Var2, float f, s6f1 s6f1Var, iyd iydVar, ven0 ven0Var4) {
        super(10);
        this.a = rk41Var;
        this.b = c7f1Var;
        this.c = c380Var;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
        this.g = hdn0Var;
        this.h = hdn0Var2;
        this.i = f;
        this.t = s6f1Var;
        this.X = iydVar;
        this.Y = ven0Var4;
    }

    public final Object f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        int i;
        c7f1 c7f1Var;
        rk41 rk41Var;
        qim0 qim0VarB;
        ven0 ven0Var;
        float f = ((p3v) obj).a;
        float f2 = ((p3v) obj2).a;
        float f3 = ((p3v) obj3).a;
        float f4 = ((p3v) obj4).a;
        float f5 = ((p3v) obj5).a;
        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
        float f6 = ((p3v) obj7).a;
        float f7 = ((p3v) obj8).a;
        x340 x340Var = (b0k) obj9;
        int iIntValue = ((Number) obj10).intValue();
        m4c m4cVar = fkj0.X;
        c7f1 c7f1Var2 = this.b;
        boolean z = c7f1Var2.b;
        if ((iIntValue & 6) == 0) {
            i = (x340Var.d(f) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.d(f2) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.d(f3) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= x340Var.d(f4) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= x340Var.d(f5) ? 16384 : 8192;
        }
        if ((196608 & iIntValue) == 0) {
            i |= x340Var.h(zBooleanValue) ? 131072 : 65536;
        }
        if ((1572864 & iIntValue) == 0) {
            i |= x340Var.d(f6) ? 1048576 : 524288;
        }
        if ((iIntValue & 12582912) == 0) {
            i |= x340Var.d(f7) ? 8388608 : 4194304;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (38347923 & i) != 38347922)) {
            rk41 rk41Var2 = this.a;
            boolean zI = x340Var2.i(rk41Var2) | x340Var2.i(c7f1Var2);
            c380 c380Var = this.c;
            boolean zI2 = zI | x340Var2.i(c380Var);
            ven0 ven0Var2 = this.d;
            boolean zG = zI2 | x340Var2.g(ven0Var2);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new dbp0(rk41Var2, c7f1Var2, this.c, this.e, this.f, this.g, this.h, ven0Var2, (byte) 8);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zI3 = x340Var2.i(c7f1Var2) | x340Var2.g(function0) | x340Var2.i(rk41Var2);
            Object objT2 = x340Var2.T();
            if (zI3 || objT2 == m4cVar) {
                objT2 = new e971(c7f1Var2, rk41Var2, function0, this.e, (byte) 16);
                c7f1Var = c7f1Var2;
                rk41Var = rk41Var2;
                x340Var2.s0(objT2);
            } else {
                c7f1Var = c7f1Var2;
                rk41Var = rk41Var2;
            }
            iu30 iu30Var = (iu30) objT2;
            err0 err0Var = this.g;
            err0 err0Var2 = err0Var;
            String str = ((r6f1) c380Var.get(err0Var2.s())).h;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            if (!z && str.length() > 0) {
                x340Var2.i0(955982727);
                boolean zG2 = x340Var2.g(str) | x340Var2.g(iu30Var);
                Object objT3 = x340Var2.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new mr3(str, iu30Var, (byte) 7);
                    x340Var2.s0(objT3);
                }
                qim0VarB = s161.a(qim0Var, (iu30) objT3);
                x340Var2.r(false);
            } else if (z) {
                x340Var2.i0(955995074);
                x340Var2.r(false);
                qim0VarB = qim0Var;
            } else {
                x340Var2.i0(955992220);
                x340Var2.r(false);
                qim0VarB = s161.b(qim0Var, true, iu30Var);
            }
            qim0 qim0VarThen = qim0VarD.then(qim0VarB);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 54);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
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
            qim0 qim0VarZ = uyn1.z(this.i, 0.0f, 2, ab80.o(qim0Var, f6, x340Var2, qim0Var, 1.0f));
            ven0 ven0Var3 = this.f;
            boolean z2 = zBooleanValue && !((Boolean) ven0Var3.getValue()).booleanValue();
            float f8 = (zBooleanValue && ((Boolean) ven0Var3.getValue()).booleanValue()) ? f4 : f3;
            int iS = err0Var2.s();
            int iS2 = this.h.s();
            boolean z3 = rk41Var.a;
            boolean z4 = c7f1Var.b;
            boolean z5 = c7f1Var.a.e;
            rk41 rk41Var3 = rk41Var;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            s6f1 s6f1Var = this.t;
            iyd iydVar = this.X;
            c380 c380Var2 = this.c;
            smo1.a(c380Var2, f, iS, iS2, z3, z4, z5, function0, qim0VarF, apo.r(1269198234, new bi6(f8, s6f1Var, z2, iydVar, this.Y, f4), x340Var2), x340Var2, ((i << 3) & 112) | 905969672);
            int iS3 = err0Var2.s();
            boolean z6 = rk41Var3.a;
            boolean z7 = c7f1Var.b;
            qim0 qim0VarH = u291.h(u291.f(qim0Var, 1.0f), f2);
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                ven0Var = ven0Var3;
                objT4 = new aya1(ven0Var, (byte) 8);
                x340Var2.s0(objT4);
            } else {
                ven0Var = ven0Var3;
            }
            smo1.m(iS3, 1772544, (Function0) objT4, apo.r(-453541684, new kj21(c380Var2, qim0VarZ, err0Var, iydVar, (byte) 19), x340Var2), x340Var2, qim0VarH, z6, z7);
            if (zBooleanValue && ((Boolean) ven0Var.getValue()).booleanValue()) {
                v8i0.i(f3, 168746183, x340Var2, x340Var2, qim0Var);
                x0d.s(qim0Var, f5, x340Var2, false);
            } else {
                x340Var2.i0(168879762);
                x340Var2.r(false);
            }
            x0d.s(qim0Var, f7, x340Var2, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
