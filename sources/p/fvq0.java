package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fvq0 extends hab0 implements vu30 {
    public final /* synthetic */ nwb N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ c9n P0;
    public final /* synthetic */ dxb Q0;
    public final /* synthetic */ ven0 R0;
    public final /* synthetic */ kvq0 S0;
    public final /* synthetic */ Function0 T0;
    public final /* synthetic */ iu30 U0;
    public final /* synthetic */ ven0 V0;
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ ven0 Z;
    public final /* synthetic */ vy71 a;
    public final /* synthetic */ hcr0 b;
    public final /* synthetic */ cxb c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvq0(vy71 vy71Var, hcr0 hcr0Var, cxb cxbVar, boolean z, Function0 function0, long j, float f, boolean z2, boolean z3, ven0 ven0Var, ven0 ven0Var2, View view, ven0 ven0Var3, nwb nwbVar, boolean z4, c9n c9nVar, dxb dxbVar, ven0 ven0Var4, kvq0 kvq0Var, Function0 function1, iu30 iu30Var, ven0 ven0Var5) {
        super(2);
        this.a = vy71Var;
        this.b = hcr0Var;
        this.c = cxbVar;
        this.d = z;
        this.e = function0;
        this.f = j;
        this.g = f;
        this.h = z2;
        this.i = z3;
        this.t = ven0Var;
        this.X = ven0Var2;
        this.Y = view;
        this.Z = ven0Var3;
        this.N0 = nwbVar;
        this.O0 = z4;
        this.P0 = c9nVar;
        this.Q0 = dxbVar;
        this.R0 = ven0Var4;
        this.S0 = kvq0Var;
        this.T0 = function1;
        this.U0 = iu30Var;
        this.V0 = ven0Var5;
    }

    public final Object invoke(Object obj, Object obj2) {
        j2i j2iVarR;
        cxb cxbVar;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            vy71 vy71Var = this.a;
            u390 u390Var = new u390(vy71Var);
            qim0 qim0VarK = d9y0.k(nim0.a, ((Boolean) this.t.getValue()).booleanValue() ? 1.0f : 0.0f);
            nxb nxbVar = (nxb) this.X.getValue();
            boolean z = nxbVar != null ? nxbVar.j : true;
            hcr0 hcr0Var = this.b;
            if (hcr0Var == null || (cxbVar = this.c) == null) {
                x340Var2.i0(-1987390592);
                x340Var2.r(false);
                j2iVarR = null;
            } else {
                x340Var2.i0(-1988014436);
                j2iVarR = apo.r(-847251261, new vbn0(hcr0Var, this.Y, cxbVar, (byte) 20), x340Var2);
                x340Var2.r(false);
            }
            Function0 function0 = this.e;
            boolean zG = x340Var2.g(function0);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new swi0(function0, this.Z, (byte) 4);
                x340Var2.s0(objT);
            }
            x74.g(u390Var, this.d, (Function0) objT, qim0VarK, this.f, this.g, this.h, false, this.i, false, false, z, j2iVarR, apo.r(1914061412, new wmk0(this.N0, this.O0, this.P0, vy71Var, this.e, this.Q0, this.Z, this.R0, this.S0, this.T0, this.U0, this.V0), x340Var2), x340Var2, 805306368, 3078, 128);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
