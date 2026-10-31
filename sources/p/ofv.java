package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ofv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qfv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofv(qfv qfvVar, byte b) {
        super(1);
        this.a = b;
        this.b = qfvVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qfv qfvVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(qfvVar.b, (o3r) qfvVar.c, (sfv) obj);
            default:
                sfv sfvVar = (sfv) obj;
                return new ufv(sfvVar, (iix0) d3p1.H(qfvVar.b, (o3r) qfvVar.c, sfvVar).a.getValue());
        }
    }
}
