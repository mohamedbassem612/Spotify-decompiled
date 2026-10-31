package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zv50 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ psy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zv50(psy psyVar, byte b) {
        super(1);
        this.a = b;
        this.b = psyVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        psy psyVar = this.b;
        switch (b) {
            case 0:
                h3j1 h3j1Var = (h3j1) obj;
                d0r d0rVar = psyVar.b;
                return h5p1.r(d3p1.H(d0rVar, (o3r) psyVar.i, h3j1Var), d3p1.H(d0rVar, (o3r) psyVar.t, h3j1Var), d3p1.H(d0rVar, (o3r) psyVar.X, h3j1Var), (bpb1) psyVar.h, new f3(5, (lnm) null, (byte) 13));
            default:
                ((qtr) obj).b(new jaz((Object) psyVar, lnmVar, (byte) 3));
                return rih1.a;
        }
    }
}
