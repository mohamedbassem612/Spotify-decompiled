package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d2o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2o(dfm dfmVar, byte b) {
        super(1);
        this.a = b;
        this.b = dfmVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        dfm dfmVar = this.b;
        switch (b) {
            case 0:
                return (epb1) dfmVar.i;
            default:
                ((qtr) obj).b(new lu(dfmVar, (lnm) null, (byte) 20));
                return rih1.a;
        }
    }
}
