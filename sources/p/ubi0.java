package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ubi0 extends hab0 implements vu30 {
    public final /* synthetic */ znb0 N0;
    public final /* synthetic */ znb0 O0;
    public final /* synthetic */ yqg P0;
    public final /* synthetic */ i091 Q0;
    public final /* synthetic */ boolean R0;
    public final /* synthetic */ znb0 X;
    public final /* synthetic */ znb0 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ iob1 a;
    public final /* synthetic */ znb0 b;
    public final /* synthetic */ znb0 c;
    public final /* synthetic */ hob1 d;
    public final /* synthetic */ znb0 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ iuj h;
    public final /* synthetic */ znb0 i;
    public final /* synthetic */ znb0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubi0(iob1 iob1Var, znb0 znb0Var, znb0 znb0Var2, hob1 hob1Var, znb0 znb0Var3, iu30 iu30Var, float f, iuj iujVar, znb0 znb0Var4, znb0 znb0Var5, znb0 znb0Var6, znb0 znb0Var7, boolean z, znb0 znb0Var8, znb0 znb0Var9, yqg yqgVar, i091 i091Var, boolean z2) {
        super(2);
        this.a = iob1Var;
        this.b = znb0Var;
        this.c = znb0Var2;
        this.d = hob1Var;
        this.e = znb0Var3;
        this.f = iu30Var;
        this.g = f;
        this.h = iujVar;
        this.i = znb0Var4;
        this.t = znb0Var5;
        this.X = znb0Var6;
        this.Y = znb0Var7;
        this.Z = z;
        this.N0 = znb0Var8;
        this.O0 = znb0Var9;
        this.P0 = yqgVar;
        this.Q0 = i091Var;
        this.R0 = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.a.y.h;
            znb0 znb0Var = z ? this.b : null;
            znb0 znb0Var2 = z ? this.c : null;
            hob1 hob1Var = this.d;
            znb0 znb0Var3 = hob1Var.w != null ? this.e : null;
            iu30 iu30Var = this.f;
            boolean zG = x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new mhg0(iu30Var, (byte) 20);
                x340Var2.s0(objT);
            }
            qim0 qim0VarW = jzn1.w(nim0.a, (iu30) objT, x340Var2);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = nbi0.Y;
                x340Var2.s0(objT2);
            }
            rpo1.e(hob1Var, this.g, iu30Var, this.h, this.i, this.t, this.X, this.Y, this.Z, qim0VarW, false, this.N0, znb0Var, false, znb0Var2, (znb0) null, false, znb0Var3, this.O0, (znb0) null, this.P0, this.Q0, this.R0, (vu30) null, (String) null, (iu30) objT2, x340Var2, 0, 196608, 25797632);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
