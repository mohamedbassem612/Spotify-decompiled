package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nga extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kpa b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nga(kpa kpaVar, int i, byte b) {
        super(1);
        this.a = b;
        this.b = kpaVar;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        kpa kpaVar = this.b;
        switch (b) {
            case 0:
                kpaVar.invoke(Integer.valueOf(i), Integer.valueOf(((Number) obj).intValue()));
                break;
            default:
                kpaVar.invoke(Integer.valueOf(i), Integer.valueOf(((Number) obj).intValue()));
                break;
        }
        return rih1Var;
    }
}
