package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cci0 extends hab0 implements vu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ znb0 P0;
    public final /* synthetic */ boolean Q0;
    public final /* synthetic */ znb0 R0;
    public final /* synthetic */ znb0 S0;
    public final /* synthetic */ i091 T0;
    public final /* synthetic */ ubw0 U0;
    public final /* synthetic */ ven0 V0;
    public final /* synthetic */ znb0 X;
    public final /* synthetic */ znb0 Y;
    public final /* synthetic */ znb0 Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ qq b;
    public final /* synthetic */ znb0 c;
    public final /* synthetic */ hob1 d;
    public final /* synthetic */ znb0 e;
    public final /* synthetic */ aci0 f;
    public final /* synthetic */ hcz g;
    public final /* synthetic */ float h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ znb0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cci0(qq qqVar, znb0 znb0Var, hob1 hob1Var, znb0 znb0Var2, aci0 aci0Var, hcz hczVar, float f, iu30 iu30Var, znb0 znb0Var3, znb0 znb0Var4, znb0 znb0Var5, znb0 znb0Var6, boolean z, boolean z2, znb0 znb0Var7, boolean z3, znb0 znb0Var8, znb0 znb0Var9, i091 i091Var, ubw0 ubw0Var, ven0 ven0Var, byte b) {
        super(2);
        this.a = b;
        this.b = qqVar;
        this.c = znb0Var;
        this.d = hob1Var;
        this.e = znb0Var2;
        this.f = aci0Var;
        this.g = hczVar;
        this.h = f;
        this.i = iu30Var;
        this.t = znb0Var3;
        this.X = znb0Var4;
        this.Y = znb0Var5;
        this.Z = znb0Var6;
        this.N0 = z;
        this.O0 = z2;
        this.P0 = znb0Var7;
        this.Q0 = z3;
        this.R0 = znb0Var8;
        this.S0 = znb0Var9;
        this.T0 = i091Var;
        this.U0 = ubw0Var;
        this.V0 = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qq qqVar = this.b;
                    iuj iujVar = (iuj) qqVar.o;
                    hob1 hob1Var = this.d;
                    znb0 znb0Var = hob1Var.F ? this.c : null;
                    boolean zBooleanValue = ((Boolean) this.V0.getValue()).booleanValue();
                    yqg yqgVar = (yqg) qqVar.c;
                    znb0 znb0Var2 = hob1Var.w != null ? this.e : null;
                    boolean z = this.f.b;
                    hcz hczVar = this.g;
                    vu30 vu30Var = hczVar.a;
                    String str = hczVar.b;
                    ubw0 ubw0Var = this.U0;
                    boolean zI = x340Var2.i(ubw0Var) | x340Var2.i(hob1Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new bci0(ubw0Var, hob1Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    rpo1.e(hob1Var, this.h, this.i, iujVar, this.t, this.X, this.Y, this.Z, this.N0, (qim0) null, this.O0, (znb0) null, this.P0, this.Q0, this.R0, znb0Var, zBooleanValue, znb0Var2, (znb0) null, this.S0, yqgVar, this.T0, z, vu30Var, str, (iu30) objT, x340Var2, 0, 0, 264704);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qq qqVar2 = this.b;
                    rce0.a((tl7) ((Function0) qqVar2.b).invoke(), apo.r(-485283983, new cci0(qqVar2, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, (byte) 0), x340Var4), x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }
}
