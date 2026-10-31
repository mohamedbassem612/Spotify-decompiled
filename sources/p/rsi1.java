package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rsi1 extends jni0 {
    public static final rsi1 d = new rsi1("must have no value parameters", 0);
    public static final rsi1 e = new rsi1("must have a single value parameter", 1);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rsi1(String str, byte b) {
        super(str, (byte) 1);
        this.c = b;
    }

    @Override // p.htf
    public final boolean a(c8a0 c8a0Var) {
        switch (this.c) {
            case 0:
                return c8a0Var.F().isEmpty();
            case 1:
                return c8a0Var.F().size() == 1;
            default:
                return c8a0Var.F().size() == 2;
        }
    }
}
