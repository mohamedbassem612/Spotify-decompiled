package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uza1 extends hab0 implements vu30 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ vy71 Y;
    public final /* synthetic */ wat Z;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ g2z d;
    public final /* synthetic */ c0b1 e;
    public final /* synthetic */ o2u0 f;
    public final /* synthetic */ s24 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ c9n t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uza1(boolean z, float f, float f2, g2z g2zVar, c0b1 c0b1Var, o2u0 o2u0Var, s24 s24Var, ven0 ven0Var, iu30 iu30Var, c9n c9nVar, ven0 ven0Var2, vy71 vy71Var, wat watVar) {
        super(2);
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = g2zVar;
        this.e = c0b1Var;
        this.f = o2u0Var;
        this.g = s24Var;
        this.h = ven0Var;
        this.i = iu30Var;
        this.t = c9nVar;
        this.X = ven0Var2;
        this.Y = vy71Var;
        this.Z = watVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        iu30 iu30Var;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zBooleanValue = ((Boolean) this.h.getValue()).booleanValue();
            c0b1 c0b1Var = this.e;
            String str = c0b1Var.a;
            iu30 iu30Var2 = this.i;
            s24 s24Var = this.g;
            o2u0 o2u0Var = this.f;
            if (o2u0Var == null) {
                x340Var2.i0(1375597368);
                x340Var2.r(false);
                function0 = null;
            } else {
                x340Var2.i0(1375597369);
                boolean zI = x340Var2.i(s24Var) | x340Var2.i(o2u0Var) | x340Var2.g(iu30Var2);
                Object objT = x340Var2.T();
                if (zI || objT == m4cVar) {
                    objT = new m551(s24Var, o2u0Var, iu30Var2, (byte) 22);
                    x340Var2.s0(objT);
                }
                x340Var2.r(false);
                function0 = (Function0) objT;
            }
            boolean zI2 = x340Var2.i(s24Var);
            Object objT2 = x340Var2.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new tza1(s24Var, (byte) 0);
                x340Var2.s0(objT2);
            }
            iu30 iu30Var3 = (iu30) objT2;
            boolean zI3 = x340Var2.i(s24Var);
            Object objT3 = x340Var2.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new tza1(s24Var, (byte) 1);
                x340Var2.s0(objT3);
            }
            q1o1.b(zBooleanValue, this.a, this.b, this.c, this.d, str, function0, iu30Var3, (iu30) objT3, apo.r(-661733842, new wh91(s24Var, (byte) 14), x340Var2), x340Var2, 805306368);
            float fM = dsa0.m(x340Var2, 2131167047);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(fM, 0.0f, 2, nim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
            rbt rbtVar = (rbt) s24Var.b;
            boolean zG = x340Var2.g(iu30Var2);
            c9n c9nVar = this.t;
            boolean zI4 = zG | x340Var2.i(c9nVar);
            ven0 ven0Var = this.X;
            boolean zI5 = zI4 | x340Var2.i(ven0Var);
            vy71 vy71Var = this.Y;
            boolean zI6 = zI5 | x340Var2.i(vy71Var);
            Object objT4 = x340Var2.T();
            if (zI6 || objT4 == m4cVar) {
                iu30Var = iu30Var2;
                odp0 odp0Var = new odp0(iu30Var, c9nVar, vy71Var, ven0Var, (byte) 18);
                x340Var2.s0(odp0Var);
                objT4 = odp0Var;
            } else {
                iu30Var = iu30Var2;
            }
            Function0 function1 = (Function0) objT4;
            boolean zG2 = x340Var2.g(iu30Var);
            Object objT5 = x340Var2.T();
            if (zG2 || objT5 == m4cVar) {
                objT5 = new pba1(iu30Var, (byte) 8);
                x340Var2.s0(objT5);
            }
            Function0 function2 = (Function0) objT5;
            boolean zI7 = x340Var2.i(s24Var);
            wat watVar = this.Z;
            boolean zI8 = zI7 | x340Var2.i(watVar);
            Object objT6 = x340Var2.T();
            if (zI8 || objT6 == m4cVar) {
                objT6 = new sza1(s24Var, watVar, (byte) 1);
                x340Var2.s0(objT6);
            }
            men1.f(c0b1Var, rbtVar, function1, function2, ern1.x(nim0Var, (iu30) objT6), x340Var2, 0);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
