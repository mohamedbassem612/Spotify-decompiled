package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nr10 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr10(long j, boolean z, boolean z2) {
        super(2);
        this.a = z;
        this.b = j;
        this.c = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.a;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var2.i0(889662799);
                qim0 qim0VarN = anm1.N("feedback_actions_loading_indicator", u291.r(nim0Var, 16.0f));
                uwr uwrVar = cbx.a;
                xto1.e(qim0VarN, 1, cbx.a(x340Var2).b.a, 0L, x340Var2, 48, 8);
                x340Var2.r(false);
            } else {
                x340Var2.i0(889933150);
                jtx jtxVar = jtx.c;
                uwr uwrVar2 = cbx.a;
                w0h1.a(jtxVar, new jsl(cwl1.o0(x340Var2, 2131958326)), u291.r(nim0Var, 16.0f), this.b, cbx.a(x340Var2).b.a, this.c, x340Var2, jtx.d, 0);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
