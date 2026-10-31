package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eaf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eaf(res resVar, byte b) {
        super(1);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                gaf gafVar = (gaf) obj;
                return ((mxr) resVar.d).H(gafVar.a, gafVar.b);
            default:
                ((qtr) obj).b(new f3(resVar, (lnm) null, (byte) 7));
                return rih1.a;
        }
    }
}
