package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oae0 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oae0(int i, float f, float f2) {
        super(2);
        cqz0 cqz0Var = dqz0.a;
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            cqz0 cqz0Var = dqz0.a;
            b6p1.f(this.b, this.c, this.a, 24576, x340Var2, nim0.a);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
