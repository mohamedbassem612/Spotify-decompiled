package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class myg extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ tyq g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ ipb1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myg(float f, float f2, Function0 function0, ven0 ven0Var, boolean z, Function0 function1, tyq tyqVar, Object obj, ipb1 ipb1Var) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = function0;
        this.d = ven0Var;
        this.e = z;
        this.f = function1;
        this.g = tyqVar;
        this.h = obj;
        this.i = ipb1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0VarX = u291.x(0.0f, this.a, 1, nim0.a);
            float f = this.b;
            qim0 qim0VarJ = u291.j(0.0f, f, 1, qim0VarX);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarJ);
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
            mod.c(new ely0[]{alg0.a.a(Boolean.TRUE), alg0.b.a(this.c), alg0.c.a(this.d.getValue()), alg0.d.a(Boolean.valueOf(this.e)), alg0.f.a(new p3v(f)), alg0.g.a(this.f)}, apo.r(1924020541, new g1c(this.g, this.h, this.i, (byte) 2), x340Var2), x340Var2, 56);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
