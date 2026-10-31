package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vk70 extends hab0 implements xu30 {
    public final /* synthetic */ oma1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ hn20 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk70(oma1 oma1Var, float f, float f2, int i, hn20 hn20Var, String str) {
        super(3);
        this.a = oma1Var;
        this.b = f;
        this.c = f2;
        this.d = i;
        this.e = hn20Var;
        this.f = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        oma1 oma1Var = this.a;
        boolean z = oma1Var.a;
        et40 et40Var = et40.a;
        if (z) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(680728278);
            fc11.g(ow31.a(et40Var), x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(680788821);
            x340Var3.r(false);
        }
        gt40 gt40VarE0 = dm5.e0(et40Var, this.b - (2.0f * this.c));
        yoi1.d(new p05(this.d), this.f, gt40VarE0, 0, new u8h(new oxe1(this.e)), x340Var, 32768, 8);
        if (oma1Var.b) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(681057622);
            fc11.g(ow31.a(et40Var), x340Var4, 0);
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(681118165);
            x340Var5.r(false);
        }
        return rih1.a;
    }
}
