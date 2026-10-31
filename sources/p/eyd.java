package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eyd extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hyd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eyd(hyd hydVar, byte b) {
        super(4);
        this.a = b;
        this.b = hydVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        hyd hydVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return hydVar.a((r6h1) obj4);
            default:
                return hydVar.c((rxd) obj4);
        }
    }
}
