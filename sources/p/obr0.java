package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class obr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lzh b;
    public final /* synthetic */ b6r0 c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obr0(lzh lzhVar, b6r0 b6r0Var, Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = lzhVar;
        this.c = b6r0Var;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                xnn0 xnn0Var = (xnn0) obj;
                return new df41(new ntf0(this.b, this.c, this.d, xnn0Var, (byte) 22), w0q0.N0);
            default:
                b6r0 b6r0Var = this.c;
                Object obj2 = this.d;
                return new der0(this.b, b6r0Var, obj2, (xnn0) obj, null);
        }
    }
}
