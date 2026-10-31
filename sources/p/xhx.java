package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xhx extends hab0 implements vu30 {
    public final /* synthetic */ hdn0 N0;
    public final /* synthetic */ yqg X;
    public final /* synthetic */ Function0 Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ float a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ j2i f;
    public final /* synthetic */ xtb0 g;
    public final /* synthetic */ c9n h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ frr0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhx(float f, long j, float f2, float f3, float f4, j2i j2iVar, xtb0 xtb0Var, c9n c9nVar, ven0 ven0Var, frr0 frr0Var, yqg yqgVar, Function0 function0, tob1 tob1Var, hdn0 hdn0Var) {
        super(2);
        this.a = f;
        this.b = j;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2iVar;
        this.g = xtb0Var;
        this.h = c9nVar;
        this.i = ven0Var;
        this.t = frr0Var;
        this.X = yqgVar;
        this.Y = function0;
        this.Z = tob1Var;
        this.N0 = hdn0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            ven0 ven0Var = this.i;
            if (((ll10) ven0Var.getValue()).a || ((ll10) ven0Var.getValue()).b) {
                x340Var2.i0(716769092);
                tob1 tob1Var = this.Z;
                iro1.e(this.a, ((Number) tob1Var.getValue()).floatValue(), this.b, x340Var2, 0);
                float fFloatValue = ((Number) tob1Var.getValue()).floatValue();
                int iS = this.N0.s();
                ll10 ll10Var = (ll10) ven0Var.getValue();
                boolean zI = x340Var2.i(ven0Var);
                Object objT = x340Var2.T();
                if (zI || objT == m4cVar) {
                    objT = new d7v(ven0Var, (byte) 7);
                    x340Var2.s0(objT);
                }
                iu30 iu30Var = (iu30) objT;
                frr0 frr0Var = this.t;
                boolean zI2 = x340Var2.i(frr0Var);
                yqg yqgVar = this.X;
                boolean zG = zI2 | x340Var2.g(yqgVar);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new vhx(yqgVar, frr0Var, (byte) 1);
                    x340Var2.s0(objT2);
                }
                iro1.f(this.a, this.c, this.d, fFloatValue, this.e, this.f, iS, ll10Var, this.g, this.h, iu30Var, (Function0) objT2, this.Y, x340Var2, 0);
                x340Var2.r(false);
            } else {
                x340Var2.i0(717488881);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
