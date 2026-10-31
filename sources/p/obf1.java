package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class obf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kia b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obf1(kia kiaVar, byte b) {
        super(1);
        this.a = b;
        this.b = kiaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kia kiaVar = this.b;
        switch (b) {
            case 0:
                kiaVar.a(((Number) obj).intValue() - 1);
                break;
            default:
                kiaVar.a(((Number) obj).intValue() - 1);
                break;
        }
        return rih1Var;
    }
}
