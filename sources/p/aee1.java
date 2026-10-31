package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aee1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aee1(dfm dfmVar, byte b) {
        super(1);
        this.a = b;
        this.b = dfmVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        dfm dfmVar = this.b;
        switch (b) {
            case 0:
                return (xe01) ((zb91) dfmVar.d).b;
            default:
                ((qtr) obj).b(new bgb1(dfmVar, (lnm) null, (byte) 3));
                return rih1.a;
        }
    }
}
