package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ur91 implements xu30 {
    public final /* synthetic */ wr91 a;
    public final /* synthetic */ wr91 b;
    public final /* synthetic */ vg10 c;
    public final /* synthetic */ String d;

    public ur91(wr91 wr91Var, wr91 wr91Var2, vg10 vg10Var, String str) {
        this.a = wr91Var;
        this.b = wr91Var2;
        this.c = vg10Var;
        this.d = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool;
        vu30 vu30Var = (vu30) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Object obj4 = fkj0.X;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.i(vu30Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            wr91 wr91Var = this.b;
            wr91 wr91Var2 = this.a;
            boolean zJ = u890.j(wr91Var2, wr91Var);
            n8b1 n8b1VarW = t890.w(x340Var2, 5);
            boolean zG = x340Var2.g(wr91Var2);
            vg10 vg10Var = this.c;
            boolean zI = zG | x340Var2.i(vg10Var);
            Object objT = x340Var2.T();
            if (zI || objT == obj4) {
                objT = new qga0(wr91Var2, vg10Var, (byte) 15);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == obj4) {
                objT2 = c97.b(!zJ ? 1.0f : 0.0f);
                x340Var2.s0(objT2);
            }
            o95 o95Var = (o95) objT2;
            Boolean boolValueOf = Boolean.valueOf(zJ);
            boolean zI2 = x340Var2.i(o95Var) | x340Var2.h(zJ) | x340Var2.i(n8b1VarW) | x340Var2.g(function0);
            Object objT3 = x340Var2.T();
            if (zI2 || objT3 == obj4) {
                du2 du2Var = new du2(o95Var, zJ, n8b1VarW, function0, (lnm) null, (byte) 18);
                x340Var2.s0(du2Var);
                objT3 = du2Var;
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT3);
            ie5 ie5Var = o95Var.c;
            n8b1 n8b1VarW2 = t890.w(x340Var2, 2);
            Object objT4 = x340Var2.T();
            if (objT4 == obj4) {
                objT4 = c97.b(zJ ? 0.8f : 1.0f);
                x340Var2.s0(objT4);
            }
            o95 o95Var2 = (o95) objT4;
            Boolean boolValueOf2 = Boolean.valueOf(zJ);
            boolean zI3 = x340Var2.i(o95Var2) | x340Var2.h(zJ) | x340Var2.i(n8b1VarW2);
            Object objT5 = x340Var2.T();
            if (zI3 || objT5 == obj4) {
                bool = boolValueOf2;
                hl0 hl0Var = new hl0(o95Var2, zJ, n8b1VarW2, (lnm) null, (byte) 24);
                x340Var2.s0(hl0Var);
                objT5 = hl0Var;
            } else {
                bool = boolValueOf2;
            }
            qxd0.t(bool, x340Var2, (vu30) objT5);
            ie5 ie5Var2 = o95Var2.c;
            qim0 qim0VarE = i541.E(nim0.a, ((Number) ie5Var2.b.getValue()).floatValue(), ((Number) ie5Var2.b.getValue()).floatValue(), ((Number) ie5Var.b.getValue()).floatValue(), 0.0f, (hw61) null, 131064);
            boolean zH = x340Var2.h(zJ) | x340Var2.g(wr91Var2);
            String str = this.d;
            boolean zG2 = zH | x340Var2.g(str);
            Object objT6 = x340Var2.T();
            if (zG2 || objT6 == obj4) {
                objT6 = new ojr0(zJ, str, wr91Var2, (byte) 2);
                x340Var2.s0(objT6);
            }
            qim0 qim0VarB = s161.b(qim0VarE, false, (iu30) objT6);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(x340Var2);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB);
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
            llj lljVar = y580.R0;
            if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var2, iK, lljVar);
            }
            nko1.H(qim0VarE2, x340Var2, y580.Y);
            us71.j(iIntValue & 14, vu30Var, x340Var2, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
