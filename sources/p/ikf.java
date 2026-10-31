package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ikf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jkf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ikf(jkf jkfVar, byte b) {
        super(1);
        this.a = b;
        this.b = jkfVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jkf jkfVar = this.b;
        switch (b) {
            case 0:
                return q601.b(new x010(rqt0.u(jkfVar.g.a()), rqt0.u(new jff(jkfVar.h.c(), (byte) 1)), new vm0(3, (lnm) null, (byte) 5), (byte) 1));
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.b(new k1(jkfVar, qtrVar, (lnm) null, (byte) 6));
                return rih1.a;
        }
    }
}
