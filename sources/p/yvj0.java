package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yvj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qlb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yvj0(qlb qlbVar, byte b) {
        super(1);
        this.a = b;
        this.b = qlbVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qlb qlbVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(qlbVar.b, (o3r) qlbVar.f, (vvj0) obj);
            default:
                ((qtr) obj).b(new eri0((avl1) qlbVar, (lnm) null, (byte) 2));
                return rih1.a;
        }
    }
}
