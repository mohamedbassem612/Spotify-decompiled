package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zdm0 implements vu30 {
    public final /* synthetic */ float N0;
    public final /* synthetic */ vu30 O0;
    public final /* synthetic */ vu30 P0;
    public final /* synthetic */ j2i Q0;
    public final /* synthetic */ hw61 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ vy71 c;
    public final /* synthetic */ eem0 d;
    public final /* synthetic */ o95 e;
    public final /* synthetic */ c9n f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ qim0 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ boolean t;

    public zdm0(long j, Function0 function0, vy71 vy71Var, eem0 eem0Var, o95 o95Var, c9n c9nVar, iu30 iu30Var, qim0 qim0Var, float f, boolean z, hw61 hw61Var, long j2, long j3, float f2, vu30 vu30Var, vu30 vu30Var2, j2i j2iVar) {
        this.a = j;
        this.b = function0;
        this.c = vy71Var;
        this.d = eem0Var;
        this.e = o95Var;
        this.f = c9nVar;
        this.g = iu30Var;
        this.h = qim0Var;
        this.i = f;
        this.t = z;
        this.X = hw61Var;
        this.Y = j2;
        this.Z = j3;
        this.N0 = f2;
        this.O0 = vu30Var;
        this.P0 = vu30Var2;
        this.Q0 = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0VarY = voo1.y(u291.d(nim0.a, 1.0f), voo1.f);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = new g6f0((byte) 3);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarY, false, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(x340Var2);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            llj lljVar = y580.R0;
            if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var2, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var2, y580.Y);
            vy71 vy71Var = this.c;
            boolean z = ((xy71) ((mdt) vy71Var.e.X).getValue()) != xy71.a;
            this.d.getClass();
            long j = this.a;
            Function0 function0 = this.b;
            dem0.c(0, j, function0, x340Var2, z);
            dem0.b(this.e, this.f, function0, this.g, this.h, vy71Var, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, x340Var2, 70);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
