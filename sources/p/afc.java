package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class afc implements vu30 {
    public final /* synthetic */ vzq0 X;
    public final /* synthetic */ j2i Y;
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ hw61 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ i3d1 f;
    public final /* synthetic */ qqb g;
    public final /* synthetic */ idn0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ float t;

    public /* synthetic */ afc(qim0 qim0Var, boolean z, hw61 hw61Var, long j, long j2, i3d1 i3d1Var, qqb qqbVar, idn0 idn0Var, Function0 function0, float f, vzq0 vzq0Var, float f2, j2i j2iVar, float f3) {
        this.a = qim0Var;
        this.b = z;
        this.c = hw61Var;
        this.d = j;
        this.e = j2;
        this.f = i3d1Var;
        this.g = qqbVar;
        this.h = idn0Var;
        this.i = function0;
        this.t = f;
        this.X = vzq0Var;
        this.Y = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Integer) obj2).intValue();
        final byte b = 1;
        final byte b2 = 0;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            Object objT = x340Var2.T();
            Object obj3 = fkj0.X;
            if (objT == obj3) {
                objT = new u1c((byte) 3);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(this.a, false, (iu30) objT);
            n8b1 n8b1Var = x3d1.a;
            x340Var2.i0(-71932855);
            Object objT2 = x340Var2.T();
            if (objT2 == obj3) {
                objT2 = c97.b(0.0f);
                x340Var2.s0(objT2);
            }
            o95 o95Var = (o95) objT2;
            Object objT3 = x340Var2.T();
            i3d1 i3d1Var = this.f;
            if (objT3 == obj3) {
                objT3 = yv91.a(new qga0(i3d1Var, o95Var, (byte) 17));
                x340Var2.s0(objT3);
            }
            tob1 tob1Var = (tob1) objT3;
            idn0 idn0Var = this.h;
            if (idn0Var != null) {
                x340Var2.i0(237696389);
                boolean zG = x340Var2.g(idn0Var) | x340Var2.i(o95Var);
                Object objT4 = x340Var2.T();
                if (zG || objT4 == obj3) {
                    objT4 = new bfb1(idn0Var, o95Var, (lnm) null, (byte) 7);
                    x340Var2.s0(objT4);
                }
                qxd0.t(idn0Var, x340Var2, (vu30) objT4);
                x340Var2.r(false);
            } else {
                x340Var2.i0(238330649);
                x340Var2.r(false);
            }
            Object objT5 = x340Var2.T();
            if (objT5 == obj3) {
                objT5 = new pea(tob1Var, (byte) 7);
                x340Var2.s0(objT5);
            }
            qim0 qim0VarX = j9k1.x(qim0VarB, (xu30) objT5);
            final cdt cdtVar = i3d1Var.a;
            boolean zI = x340Var2.i(o95Var);
            Object objT6 = x340Var2.T();
            if (zI || objT6 == obj3) {
                objT6 = new ww21(o95Var, (byte) 16);
                x340Var2.s0(objT6);
            }
            final Function0 function0 = (Function0) objT6;
            iu30 iu30Var = new iu30() { // from class: p.ddt
                public final Object invoke(Object obj4) {
                    byte b3 = b2;
                    rih1 rih1Var = rih1.a;
                    bw61 bw61VarC = null;
                    Function0 function1 = function0;
                    cdt cdtVar2 = cdtVar;
                    h6b h6bVar = (h6b) obj4;
                    switch (b3) {
                        case 0:
                            bw61 bw61Var = cdtVar2 != null ? cdtVar2.a : null;
                            float fFloatValue = ((Number) function1.invoke()).floatValue();
                            if (bw61Var != null) {
                                bw61Var.getClass();
                                bw61VarC = anm1.C(bw61Var.h(), bw61Var, fFloatValue);
                            }
                            if (bw61VarC != null) {
                                yoi1.S(h6bVar, bw61VarC);
                            }
                            break;
                        default:
                            bw61 bw61Var2 = cdtVar2 != null ? cdtVar2.b : null;
                            float fFloatValue2 = ((Number) function1.invoke()).floatValue();
                            if (bw61Var2 != null) {
                                bw61Var2.getClass();
                                bw61VarC = anm1.C(bw61Var2.h(), bw61Var2, fFloatValue2);
                            }
                            if (bw61VarC != null) {
                                yoi1.S(h6bVar, bw61VarC);
                            }
                            break;
                    }
                    return rih1Var;
                }
            };
            hw61 hw61Var = this.c;
            qim0 qim0VarJ = sto1.j(sto1.j(qim0VarX, hw61Var, iu30Var), hw61Var, new iu30() { // from class: p.ddt
                public final Object invoke(Object obj4) {
                    byte b3 = b;
                    rih1 rih1Var = rih1.a;
                    bw61 bw61VarC = null;
                    Function0 function1 = function0;
                    cdt cdtVar2 = cdtVar;
                    h6b h6bVar = (h6b) obj4;
                    switch (b3) {
                        case 0:
                            bw61 bw61Var = cdtVar2 != null ? cdtVar2.a : null;
                            float fFloatValue = ((Number) function1.invoke()).floatValue();
                            if (bw61Var != null) {
                                bw61Var.getClass();
                                bw61VarC = anm1.C(bw61Var.h(), bw61Var, fFloatValue);
                            }
                            if (bw61VarC != null) {
                                yoi1.S(h6bVar, bw61VarC);
                            }
                            break;
                        default:
                            bw61 bw61Var2 = cdtVar2 != null ? cdtVar2.b : null;
                            float fFloatValue2 = ((Number) function1.invoke()).floatValue();
                            if (bw61Var2 != null) {
                                bw61Var2.getClass();
                                bw61VarC = anm1.C(bw61Var2.h(), bw61Var2, fFloatValue2);
                            }
                            if (bw61VarC != null) {
                                yoi1.S(h6bVar, bw61VarC);
                            }
                            break;
                    }
                    return rih1Var;
                }
            });
            x340Var2.r(false);
            qim0 qim0VarThen = i1p1.q(qim0VarJ, hw61Var).then(new zrl(this.e));
            boolean z = this.b;
            qim0 qim0VarW = uyn1.w(u291.b(0.0f, this.t, 1, bin.x(dug.f(qim0VarThen.then(new c4d1(z, hw61Var, this.g, idn0Var)), this.d, hw61Var), z, (String) null, (pm31) null, idn0Var, this.i, 6)), this.X);
            jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var2, 54);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarW);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.i0(616279701);
            x340Var2.r(false);
            this.Y.invoke(pw31.a, x340Var2, 6);
            x340Var2.i0(616605077);
            x340Var2.r(false);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
