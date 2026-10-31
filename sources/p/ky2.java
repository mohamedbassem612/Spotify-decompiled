package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ky2 extends hab0 implements vu30 {
    public final /* synthetic */ ly2 a;
    public final /* synthetic */ jy2 b;
    public final /* synthetic */ short c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ky2(ly2 ly2Var, jy2 jy2Var, int i) {
        super(2);
        this.a = ly2Var;
        this.b = jy2Var;
        this.c = i;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.c | 1);
        this.a.b(this.b, (b0k) obj, iP);
        return rih1.a;
    }
}
