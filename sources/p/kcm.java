package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kcm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qlb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kcm(qlb qlbVar, byte b) {
        super(1);
        this.a = b;
        this.b = qlbVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qlb qlbVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(qlbVar.b, (o3r) qlbVar.f, ((gcm) obj).a);
            default:
                ((qtr) obj).b(new lcm(qlbVar, (lnm) null, (byte) 0));
                return rih1.a;
        }
    }
}
