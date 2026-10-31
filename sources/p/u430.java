package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u430 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n6r0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u430(n6r0 n6r0Var, byte b) {
        super(4);
        this.a = b;
        this.b = n6r0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        n6r0 n6r0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new cpl0(n6r0Var.path(), (r6h1) obj4);
            case 1:
                ((Number) obj3).intValue();
                return new vol0(new mjl0(new sqk0(new yol0(n6r0Var.path(), ((wlo0) obj).a, (r6h1) obj4))));
            default:
                ((Number) obj3).intValue();
                return new jpl0(n6r0Var.path(), (r6h1) obj4);
        }
    }
}
