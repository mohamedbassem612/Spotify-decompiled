package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kw70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ ohd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kw70(c9n c9nVar, ohd ohdVar, byte b) {
        super(1);
        this.a = b;
        this.b = c9nVar;
        this.c = ohdVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ohd ohdVar = this.c;
        c9n c9nVar = this.b;
        switch (b) {
            case 0:
                fn31.T(c9nVar, (o8n) null, 0, new nx5(ohdVar, ((Number) obj).intValue(), (lnm) null, (byte) 6), 3);
                break;
            default:
                fn31.T(c9nVar, (o8n) null, 0, new y160(ohdVar, (Exception) obj, (lnm) null, (byte) 7), 3);
                break;
        }
        return rih1Var;
    }
}
