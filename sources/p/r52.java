package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r52 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r52(res resVar, byte b) {
        super(1);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                return resVar.s();
            default:
                ((qtr) obj).b(new ep0(resVar, (lnm) null, (byte) 1));
                return rih1.a;
        }
    }
}
