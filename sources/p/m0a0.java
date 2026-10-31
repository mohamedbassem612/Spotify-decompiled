package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m0a0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gmn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0a0(gmn gmnVar, byte b) {
        super(1);
        this.a = b;
        this.b = gmnVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gmn gmnVar = this.b;
        switch (b) {
            case 0:
                return ((hgo) gmnVar.e).d();
            default:
                ((qtr) obj).b(new skv(gmnVar, (lnm) null, (byte) 13));
                return rih1.a;
        }
    }
}
