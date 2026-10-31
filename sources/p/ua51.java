package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ua51 extends hab0 implements vu30 {
    public final /* synthetic */ va51 a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ xu30 c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ua51(va51 va51Var, qim0 qim0Var, xu30 xu30Var, int i, int i2) {
        super(2);
        this.a = va51Var;
        this.b = qim0Var;
        this.c = xu30Var;
        this.d = i2;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        byte b = this.d;
        bmq0.c(this.a, this.b, this.c, (b0k) obj, iP, b);
        return rih1.a;
    }
}
