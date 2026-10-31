package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ku extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku(res resVar, byte b) {
        super(1);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                return ((kw) resVar.f).b();
            case 1:
                return new ju(((iu) obj).a, ((Boolean) ((kw) resVar.f).b().getValue()).booleanValue());
            default:
                ((qtr) obj).b(new lu(resVar, (lnm) null, (byte) 0));
                return rih1.a;
        }
    }
}
