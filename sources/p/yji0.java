package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yji0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qlb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yji0(qlb qlbVar, byte b) {
        super(1);
        this.a = b;
        this.b = qlbVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qlb qlbVar = this.b;
        switch (b) {
            case 0:
                wji0 wji0Var = (wji0) obj;
                return new x010(d3p1.H(qlbVar.b, (o3r) qlbVar.f, wji0Var), ((tji0) qlbVar.c).a(wji0Var.a), new dwf0(wji0Var, (lnm) null, (byte) 3), (byte) 1);
            default:
                ((qtr) obj).b(new jaz(qlbVar, (lnm) null, (byte) 13));
                return rih1.a;
        }
    }
}
