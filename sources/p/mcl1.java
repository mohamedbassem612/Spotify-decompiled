package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mcl1 extends hab0 implements zu30 {
    public final /* synthetic */ c380 a;
    public final /* synthetic */ vjr0 b;
    public final /* synthetic */ cce c;
    public final /* synthetic */ float d;
    public final /* synthetic */ jkr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcl1(c380 c380Var, vjr0 vjr0Var, cce cceVar, float f, jkr0 jkr0Var) {
        super(4);
        this.a = c380Var;
        this.b = vjr0Var;
        this.c = cceVar;
        this.d = f;
        this.e = jkr0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z2;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        z0i z0iVar = (z0i) this.a.get(iIntValue);
        Integer numValueOf = Integer.valueOf(iIntValue);
        x340 x340Var = (b0k) obj3;
        vjr0 vjr0Var = this.b;
        boolean zI = ((((iIntValue2 & 112) ^ 48) > 32 && x340Var.e(iIntValue)) || (iIntValue2 & 48) == 32) | x340Var.i(vjr0Var) | x340Var.i(z0iVar);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new ju01(vjr0Var, z0iVar, iIntValue, (byte) 16);
            x340Var.s0(objT);
        }
        qxd0.i(numValueOf, (iu30) objT, x340Var);
        o0i o0iVar = vjr0Var.a(iIntValue, z0iVar).d;
        int i = Build.VERSION.SDK_INT;
        cce cceVar = this.c;
        qim0 qim0VarC = nim0.a;
        jkr0 jkr0Var = this.e;
        float f = this.d;
        if (i < 31) {
            x340Var.i0(1916880422);
            qim0 qim0VarD = u291.d(qim0VarC, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            cceVar.a(8, o0iVar, z0iVar, x340Var, u291.d(qim0VarC, 1.0f));
            if (f > 0.0f) {
                x340Var.i0(-1285194386);
                z2 = true;
                qim0 qim0VarThen = u291.d(qim0VarC, 1.0f).then(i541.C(qim0VarC, new ik0(jkr0Var, iIntValue, (byte) 1)));
                z = false;
                t1c.a(qim0VarThen, x340Var, 0);
                x340Var.r(false);
            } else {
                z = false;
                z2 = true;
                x340Var.i0(-1285092520);
                x340Var.r(false);
            }
            x340Var.r(z2);
            x340Var.r(z);
        } else {
            x340Var.i0(1917196498);
            qim0 qim0VarD2 = u291.d(qim0VarC, 1.0f);
            if (f > 0.0f) {
                qim0VarC = i541.C(qim0VarC, new ik0(jkr0Var, iIntValue, (byte) 1));
            }
            cceVar.a(8, o0iVar, z0iVar, x340Var, qim0VarD2.then(qim0VarC));
            x340Var.r(false);
        }
        return rih1.a;
    }
}
