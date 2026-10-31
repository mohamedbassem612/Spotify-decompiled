package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qck extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u7h b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qck(u7h u7hVar, long j, byte b) {
        super(2);
        this.a = b;
        this.b = u7hVar;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.c;
        u7h u7hVar = this.b;
        switch (b) {
            case 0:
                if (u7hVar != null) {
                    j = u7hVar.a;
                }
                return new u7h(j);
            default:
                if (u7hVar != null) {
                    j = u7hVar.a;
                }
                return new u7h(j);
        }
    }
}
