package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ois0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ois0(pt ptVar, byte b) {
        super(1);
        this.a = b;
        this.b = ptVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pt ptVar = this.b;
        switch (b) {
            case 0:
                return new x010((bpb1) ptVar.c, (mr20) ((zc80) ptVar.b).b, new irp0(3, (lnm) null, (byte) 5), (byte) 1);
            default:
                ((qtr) obj).b(new jaz(ptVar, (lnm) null, (byte) 23));
                return rih1.a;
        }
    }
}
