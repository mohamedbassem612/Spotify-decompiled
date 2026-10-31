package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t5l1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lfo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5l1(lfo lfoVar, byte b) {
        super(1);
        this.a = b;
        this.b = lfoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lfo lfoVar = this.b;
        switch (b) {
            case 0:
                return d3p1.F(lfoVar.d, lfoVar.e, (o5l1) obj);
            default:
                ((qtr) obj).b(new efj1(lfoVar, (lnm) null, (byte) 4));
                return rih1.a;
        }
    }
}
