package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vc8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y6h1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc8(y6h1 y6h1Var, byte b) {
        super(2);
        this.a = b;
        this.b = y6h1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                return f6o1.v((op80) obj2, ((u761) obj).b, y6h1Var);
            default:
                return f6o1.v((op80) obj2, ((s761) obj).c, y6h1Var);
        }
    }
}
