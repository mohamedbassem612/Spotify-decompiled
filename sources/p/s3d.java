package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s3d extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a4d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3d(a4d a4dVar, byte b) {
        super(1);
        this.a = b;
        this.b = a4dVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                elb0 elb0Var = (elb0) obj;
                this.b.c.a.a = hm5.e(dm5.c0(elb0Var.O(0L)), elb0Var.b());
                break;
            default:
                this.b.c.a.b = (ur80) obj;
                break;
        }
        return rih1.a;
    }
}
