package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vqb {
    public static final oex a = new oex(0, (vu30) null, wnb.d, (vu30) null, 11);
    public static final nex b = new nex(8);

    public static final void a(crb crbVar, qim0 qim0Var, boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        Function0 function2;
        boolean z3;
        qim0 qim0Var2;
        qim0 qim0VarB;
        Function0 function3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1391698949);
        int i5 = i | (x340Var.g(crbVar) ? 4 : 2);
        int i6 = i5 | 48;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i5 | 432;
            z2 = z;
        } else {
            z2 = z;
            i3 = i6 | (x340Var.h(z2) ? 256 : 128);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | 3072;
        } else {
            i4 = i3 | (x340Var.i(function0) ? 2048 : 1024);
        }
        int i9 = i4 | (x340Var.i(function1) ? 16384 : 8192);
        if (x340Var.Y(i9 & 1, (i9 & 9363) != 9362)) {
            if (i7 != 0) {
                z2 = false;
            }
            Function0 function4 = i8 != 0 ? null : function0;
            String strO0 = cwl1.o0(x340Var, 2131952989);
            j2i j2iVarR = apo.r(1020779108, new tqb(crbVar, (byte) 1), x340Var);
            x340Var.i0(1687883666);
            qim0 qim0Var3 = nim0.a;
            if (z2) {
                uwr uwrVar = cbx.a;
                avw0 avw0Var = cbx.b(x340Var).c;
                qim0 qim0VarX = vgo1.x(cbx.a(x340Var).c.a, er31.a);
                boolean zG = x340Var.g(strO0);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new nb9(strO0, (byte) 23);
                    x340Var.s0(objT);
                }
                qim0VarB = s161.b(qim0VarX, false, (iu30) objT);
            } else {
                qim0VarB = qim0Var3;
            }
            x340Var.r(false);
            int i10 = i9 & 896;
            int i11 = 57344 & i9;
            boolean z4 = (i11 == 16384) | (i10 == 256);
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new y96(z2, function1, (byte) 2);
                x340Var.s0(objT2);
            }
            Function0 function5 = (Function0) objT2;
            if (crbVar instanceof zqb) {
                x340Var.i0(785283770);
                qim0 qim0Var4 = qim0VarB;
                lex lexVarZ = yoo1.z(x340Var);
                boolean zG2 = x340Var.g(function5);
                Object objT3 = x340Var.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new pj8(function5, (byte) 9);
                    x340Var.s0(objT3);
                }
                poo1.e(new gbx(z50.c, (Function0) objT3), a, lexVarZ, qim0Var4, 0, null, null, null, null, null, null, false, null, j2iVarR, x340Var, 0, 3072, 8176);
                x340Var = x340Var;
                x340Var.r(false);
                function3 = function4;
            } else {
                qim0 qim0Var5 = qim0VarB;
                if (crbVar instanceof arb) {
                    x340Var.i0(785552571);
                    arb arbVar = (arb) crbVar;
                    boolean z5 = (i10 == 256) | ((i9 & 7168) == 2048) | (i11 == 16384);
                    Object objT4 = x340Var.T();
                    if (z5 || objT4 == m4cVar) {
                        objT4 = new eb7(z2, function4, function1, (byte) 1);
                        x340Var.s0(objT4);
                    }
                    function3 = function4;
                    b(function5, (Function0) objT4, j2iVarR, arbVar, qim0Var5, x340Var, ((i9 << 9) & 7168) | 384);
                    x340Var.r(false);
                } else {
                    function3 = function4;
                    if (!(crbVar instanceof brb)) {
                        throw p3d1.k(x340Var, 1687898607, false);
                    }
                    x340Var.i0(785820938);
                    boolean z6 = ((brb) crbVar).c;
                    lex lexVarZ2 = yoo1.z(x340Var);
                    qex qexVarZ = who1.z(b, x340Var);
                    boolean zG3 = x340Var.g(function5);
                    Object objT5 = x340Var.T();
                    if (zG3 || objT5 == m4cVar) {
                        objT5 = new vj0(function5, (byte) 9);
                        x340Var.s0(objT5);
                    }
                    poo1.g(z6, (iu30) objT5, qexVarZ, lexVarZ2, qim0Var5, 0, a, null, null, null, null, null, null, false, null, j2iVarR, x340Var, 0, 196608, 32672);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            }
            function2 = function3;
            z3 = z2;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            function2 = function0;
            z3 = z2;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqb(crbVar, qim0Var2, z3, function2, function1, i, i2);
        }
    }

    public static final void b(Function0 function0, Function0 function1, j2i j2iVar, arb arbVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(526180593);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var2.g(arbVar) : x340Var2.i(arbVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, nim0.a);
            hzj.A.getClass();
            vu30 vu30VarR = null;
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.i0(-386096760);
            boolean z = arbVar.b;
            lex lexVarZ = yoo1.z(x340Var2);
            qex qexVarZ = who1.z(b, x340Var2);
            qim0 qim0VarX = z ? lrn1.x(qim0Var, 1.0f) : qim0Var;
            if (z) {
                x340Var2.i0(-385765805);
            } else {
                x340Var2.i0(-385729225);
                vu30VarR = apo.r(-500791159, new uqb(arbVar, (byte) 0), x340Var2);
            }
            x340Var2.r(false);
            vu30 vu30Var = vu30VarR;
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new vj0(function0, (byte) 10);
                x340Var2.s0(objT);
            }
            oex oexVar = a;
            poo1.g(z, (iu30) objT, qexVarZ, lexVarZ, qim0VarX, 0, oexVar, null, null, vu30Var, null, null, null, false, null, j2iVar, x340Var2, 0, (i2 << 9) & 458752, 32160);
            x340Var = x340Var2;
            if (z) {
                lex lexVarZ2 = yoo1.z(x340Var);
                gbx gbxVar = new gbx(z50.c, function1);
                String strO0 = cwl1.o0(x340Var, 2131961644);
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = cbx.b(x340Var).b;
                cvx cvxVar5 = cbx.b(x340Var).b;
                poo1.e(gbxVar, oexVar, lexVarZ2, null, 0, strO0, null, apo.r(712017108, new uqb(arbVar, (byte) 1), x340Var), null, null, null, true, new zzq0(4.0f, 4.0f, 8.0f, 4.0f), null, x340Var, 12582912, 3120, 1880);
                x340Var = x340Var;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 17, i, function0, function1, j2iVar, arbVar, qim0Var);
        }
    }
}
