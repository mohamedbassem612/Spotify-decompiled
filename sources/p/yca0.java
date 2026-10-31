package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yca0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pzw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yca0(pzw pzwVar, byte b) {
        super(4);
        this.a = b;
        this.b = pzwVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        pzw pzwVar = this.b;
        switch (b) {
            case 0:
                uca0 uca0Var = (uca0) obj;
                ((Number) obj3).intValue();
                return new ral0((bbl0) pzwVar.g, uca0Var.a.a, y9g1.A(uca0Var.g));
            default:
                uca0 uca0Var2 = (uca0) obj;
                ((Number) obj3).intValue();
                return new wal0((bbl0) pzwVar.g, uca0Var2.a.a, y9g1.A(uca0Var2.g));
        }
    }
}
