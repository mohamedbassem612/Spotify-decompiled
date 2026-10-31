package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vf41 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ ffn0 f;
    public final /* synthetic */ vu30 g;

    /* JADX WARN: Multi-variable type inference failed */
    public vf41(int i, vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, vu30 vu30Var3, ffn0 ffn0Var, vu30 vu30Var4) {
        this.a = i;
        this.b = vu30Var;
        this.c = j2iVar;
        this.d = vu30Var2;
        this.e = vu30Var3;
        this.f = ffn0Var;
        this.g = vu30Var4;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            cgj1.o(this.a, this.b, this.c, this.d, this.e, this.f, this.g, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
