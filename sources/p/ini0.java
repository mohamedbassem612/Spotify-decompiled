package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ini0 extends jni0 {
    public static final ini0 d = new ini0("must be a member function", 0);
    public static final ini0 e = new ini0("must be a member or an extension function", 1);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ini0(String str, byte b) {
        super(str, (byte) 0);
        this.c = b;
    }

    @Override // p.htf
    public final boolean a(c8a0 c8a0Var) {
        switch (this.c) {
            case 0:
                return c8a0Var.X != null;
            default:
                return (c8a0Var.X == null && c8a0Var.t == null) ? false : true;
        }
    }
}
