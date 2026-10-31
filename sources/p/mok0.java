package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mok0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ psy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mok0(psy psyVar, byte b) {
        super(1);
        this.a = b;
        this.b = psyVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        psy psyVar = this.b;
        switch (b) {
            case 0:
                cok0 cok0Var = (cok0) obj;
                d0r d0rVar = psyVar.b;
                return new x010(d3p1.H(d0rVar, (o3r) psyVar.X, cok0Var), d3p1.H(d0rVar, (o3r) psyVar.c, cok0Var), new lok0(3, (lnm) null, (byte) 0), (byte) 1);
            default:
                ((qtr) obj).b(new jaz(psyVar, (lnm) null, (byte) 15));
                return rih1.a;
        }
    }
}
