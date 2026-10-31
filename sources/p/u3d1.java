package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u3d1 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ hw61 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ qqb e;
    public final /* synthetic */ float f;
    public final /* synthetic */ j2i g;

    public u3d1(qim0 qim0Var, hw61 hw61Var, long j, float f, qqb qqbVar, float f2, j2i j2iVar) {
        this.a = qim0Var;
        this.b = hw61Var;
        this.c = j;
        this.d = f;
        this.e = qqbVar;
        this.f = f2;
        this.g = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        qim0 qim0VarC = w3d1.c(this.a, this.b, w3d1.d(this.c, this.d, x340Var2), this.e, ((wat) x340Var2.k(t4k.h)).X0(this.f));
        Object objT = x340Var2.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = new cix0((byte) 24);
            x340Var2.s0(objT);
        }
        qim0 qim0VarB = s161.b(qim0VarC, false, (iu30) objT);
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            objT2 = mia.s;
            x340Var2.s0(objT2);
        }
        qim0 qim0VarB2 = f8d1.b(qim0VarB, rih1Var, (PointerInputEventHandler) objT2);
        gfh0 gfh0VarC = t1c.c(een.d, true);
        int iK = tgp1.k(x340Var2);
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
        llj lljVar = y580.R0;
        if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
            z5c.f(iK, x340Var2, iK, lljVar);
        }
        nko1.H(qim0VarE, x340Var2, y580.Y);
        dv20.l(0, this.g, x340Var2, true);
        return rih1Var;
    }
}
