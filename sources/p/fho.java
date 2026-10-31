package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fho extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fho(hho hhoVar, byte b) {
        super(1);
        this.a = b;
        this.b = hhoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hho hhoVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(hhoVar.a, hhoVar.d, (uho) obj);
            default:
                ((qtr) obj).b(new gz0(hhoVar, (lnm) null, (byte) 6));
                return rih1.a;
        }
    }
}
