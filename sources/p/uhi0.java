package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uhi0 extends hab0 implements vu30 {
    public final /* synthetic */ znb0 N0;
    public final /* synthetic */ znb0 O0;
    public final /* synthetic */ yqg P0;
    public final /* synthetic */ i091 Q0;
    public final /* synthetic */ ubw0 R0;
    public final /* synthetic */ ven0 S0;
    public final /* synthetic */ qim0 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ znb0 Z;
    public final /* synthetic */ znb0 a;
    public final /* synthetic */ hob1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iuj e;
    public final /* synthetic */ znb0 f;
    public final /* synthetic */ znb0 g;
    public final /* synthetic */ znb0 h;
    public final /* synthetic */ znb0 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhi0(znb0 znb0Var, hob1 hob1Var, float f, iu30 iu30Var, iuj iujVar, znb0 znb0Var2, znb0 znb0Var3, znb0 znb0Var4, znb0 znb0Var5, boolean z, qim0 qim0Var, boolean z2, znb0 znb0Var6, znb0 znb0Var7, znb0 znb0Var8, yqg yqgVar, i091 i091Var, ubw0 ubw0Var, ven0 ven0Var) {
        super(2);
        this.a = znb0Var;
        this.b = hob1Var;
        this.c = f;
        this.d = iu30Var;
        this.e = iujVar;
        this.f = znb0Var2;
        this.g = znb0Var3;
        this.h = znb0Var4;
        this.i = znb0Var5;
        this.t = z;
        this.X = qim0Var;
        this.Y = z2;
        this.Z = znb0Var6;
        this.N0 = znb0Var7;
        this.O0 = znb0Var8;
        this.P0 = yqgVar;
        this.Q0 = i091Var;
        this.R0 = ubw0Var;
        this.S0 = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            hob1 hob1Var = this.b;
            znb0 znb0Var = hob1Var.F ? this.a : null;
            boolean zBooleanValue = ((Boolean) this.S0.getValue()).booleanValue();
            ubw0 ubw0Var = this.R0;
            boolean zI = x340Var2.i(ubw0Var) | x340Var2.i(hob1Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new bci0(ubw0Var, hob1Var, (byte) 1);
                x340Var2.s0(objT);
            }
            rpo1.e(hob1Var, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (znb0) null, this.Z, false, this.N0, znb0Var, zBooleanValue, this.O0, (znb0) null, (znb0) null, this.P0, this.Q0, false, (vu30) null, (String) null, (iu30) objT, x340Var2, 0, 0, 30156800);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
