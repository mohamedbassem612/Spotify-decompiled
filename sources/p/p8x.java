package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p8x extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g5l0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8x(g5l0 g5l0Var, byte b) {
        super(4);
        this.a = b;
        this.b = g5l0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        g5l0 g5l0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new r8l0(g5l0Var, 2);
            case 1:
                ((Number) obj3).intValue();
                return new s8l0(g5l0Var);
            default:
                ((Number) obj3).intValue();
                return new t8l0(g5l0Var);
        }
    }
}
