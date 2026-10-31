package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kqv extends hab0 implements vu30 {
    public final /* synthetic */ ru31 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ftv c;
    public final /* synthetic */ ftv d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ cqs0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqv(ru31 ru31Var, int i, ftv ftvVar, ftv ftvVar2, boolean z, boolean z2, boolean z3, boolean z4, cqs0 cqs0Var) {
        super(2);
        this.a = ru31Var;
        this.b = i;
        this.c = ftvVar;
        this.d = ftvVar2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = cqs0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            otw.c(this.a, new fu31(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, 320), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
