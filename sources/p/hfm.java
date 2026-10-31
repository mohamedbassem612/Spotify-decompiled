package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hfm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qlb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hfm(qlb qlbVar, byte b) {
        super(1);
        this.a = b;
        this.b = qlbVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qlb qlbVar = this.b;
        switch (b) {
            case 0:
                lem lemVar = (lem) obj;
                d0r d0rVar = (d0r) qlbVar.e;
                return d0rVar != null ? d3p1.H(d0rVar, (o3r) qlbVar.f, lemVar) : new huz(new ffm(lemVar.c), (byte) 10);
            default:
                ((qtr) obj).b(new lu(qlbVar, (lnm) null, (byte) 17));
                return rih1.a;
        }
    }
}
