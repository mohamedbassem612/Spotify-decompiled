package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jfo extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lfo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jfo(lfo lfoVar, byte b) {
        super(1);
        this.a = b;
        this.b = lfoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lfo lfoVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(lfoVar.d, lfoVar.e, (String) obj);
            default:
                ((qtr) obj).b(new lu(lfoVar, (lnm) null, (byte) 23));
                return rih1.a;
        }
    }
}
