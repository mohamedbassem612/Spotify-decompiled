package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uky extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vky b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uky(vky vkyVar, byte b) {
        super(1);
        this.a = b;
        this.b = vkyVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vky vkyVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(vkyVar.a, vkyVar.e, (sky) obj);
            default:
                ((qtr) obj).b(new lcm(vkyVar, (lnm) null, (byte) 3));
                return rih1.a;
        }
    }
}
