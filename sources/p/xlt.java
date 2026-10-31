package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xlt extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bmt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xlt(bmt bmtVar, byte b) {
        super(1);
        this.a = b;
        this.b = bmtVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bmt bmtVar = this.b;
        switch (b) {
            case 0:
                return d3p1.F(bmtVar.d, bmtVar.e, (tlt) obj);
            default:
                ((qtr) obj).b(new gz0(bmtVar, (lnm) null, (byte) 9));
                return rih1.a;
        }
    }
}
