package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x7b extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7b(y7b y7bVar, byte b) {
        super(4);
        this.a = b;
        this.b = y7bVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        y7b y7bVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return y7bVar.a;
            default:
                ((Number) obj3).intValue();
                return y7bVar.b;
        }
    }
}
