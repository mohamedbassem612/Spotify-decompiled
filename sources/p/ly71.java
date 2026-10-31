package p;

import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ly71 {
    public static final pxg1 a = irn1.o0(ContentFeedType.OTHER, 0, mlv.a, 2);

    public static final ky71 a(vy71 vy71Var, iu30 iu30Var) {
        return new ky71(vy71Var, iu30Var);
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar) {
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1033612924);
        if (x340Var.Y(i & 1, (i & 19) != 18)) {
            String strQ = bno1.q(x340Var, 2131957933);
            tq60 tq60Var = new tq60(een.Q0);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, tq60Var);
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
            llj lljVar = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var, y580.Y);
            n5f1 n5f1VarA = m4f1.a(x340Var, 390);
            j2i j2iVarR = apo.r(2059851063, new eus(strQ, (byte) 2), x340Var);
            zzq0 zzq0Var = v4f1.a;
            pfn0 pfn0Var = gfa.a;
            boolean zH = x340Var.h(false) | x340Var.g(pfn0Var);
            Object objT = x340Var.T();
            if (zH || objT == fkj0.X) {
                objT = new x5f1(false, false, pfn0Var);
                x340Var.s0(objT);
            }
            j2iVar2 = j2iVar;
            v4f1.b(n5f1VarA, j2iVarR, (x5f1) objT, null, false, j2iVar2, x340Var, 100663344, 248);
            x340Var.r(true);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ai3(j2iVar2, i, (byte) 4);
        }
    }

    public static final vy71 c(boolean z, final iu30 iu30Var, final xy71 xy71Var, b0k b0kVar, int i, int i2) {
        Object obj = fkj0.X;
        final boolean z2 = (i2 & 1) != 0 ? false : z;
        int i3 = i2 & 8;
        boolean z3 = true;
        final boolean z4 = i3 == 0;
        x340 x340Var = (x340) b0kVar;
        wat watVar = (wat) x340Var.k(t4k.h);
        boolean zG = x340Var.g(watVar) | x340Var.d(56.0f);
        Object objT = x340Var.T();
        if (zG || objT == obj) {
            objT = new g14(watVar, (byte) 1);
            x340Var.s0(objT);
        }
        final Function0 function0 = (Function0) objT;
        boolean zG2 = x340Var.g(watVar) | x340Var.d(125.0f);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == obj) {
            objT2 = new g14(watVar, (byte) 2);
            x340Var.s0(objT2);
        }
        final Function0 function1 = (Function0) objT2;
        Object[] objArr = {Boolean.valueOf(z2), iu30Var, Boolean.valueOf(z4)};
        df41 df41Var = new df41(new iu30() { // from class: p.ty71
            public final Object invoke(Object obj2) {
                return new vy71(z2, function0, function1, (xy71) obj2, iu30Var, z4);
            }
        }, new f6f0((byte) 17));
        boolean zG3 = ((((i & 14) ^ 6) > 4 && x340Var.h(z2)) || (i & 6) == 4) | x340Var.g(function0) | x340Var.g(function1) | ((((i & 896) ^ 384) > 256 && x340Var.e(xy71Var.ordinal())) || (i & 384) == 256);
        if ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 || !x340Var.g(iu30Var)) && (i & 48) != 32) {
            z3 = false;
        }
        boolean zH = zG3 | z3 | x340Var.h(z4);
        Object objT3 = x340Var.T();
        if (zH || objT3 == obj) {
            final boolean z5 = z4;
            Function0 function2 = new Function0() { // from class: p.jy71
                public final Object invoke() {
                    return new vy71(z2, function0, function1, xy71Var, iu30Var, z5);
                }
            };
            x340Var.s0(function2);
            objT3 = function2;
        }
        return (vy71) k5p1.u(objArr, df41Var, (Function0) objT3, x340Var, 0);
    }
}
