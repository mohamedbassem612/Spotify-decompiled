package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tih extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdn0 b;
    public final /* synthetic */ hdn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tih(hdn0 hdn0Var, hdn0 hdn0Var2, byte b) {
        super(1);
        this.a = b;
        this.b = hdn0Var;
        this.c = hdn0Var2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        err0 err0Var = this.c;
        err0 err0Var2 = this.b;
        switch (b) {
            case 0:
                long j = ((yr80) obj).a;
                err0Var2.t((int) (4294967295L & j));
                err0Var.t((int) (j >> 32));
                break;
            case 1:
                elb0 elb0Var = (elb0) obj;
                err0Var2.t((int) (elb0Var.b() >> 32));
                err0Var.t((int) (elb0Var.b() & 4294967295L));
                break;
            case 2:
                elb0 elb0Var2 = (elb0) obj;
                err0 err0Var3 = err0Var2;
                err0 err0Var4 = err0Var;
                if (err0Var3.s() < err0Var4.s() + ((int) (elb0Var2.b() & 4294967295L))) {
                    err0Var3.t(err0Var4.s() + ((int) (elb0Var2.b() & 4294967295L)));
                }
                break;
            case 3:
                elb0 elb0Var3 = (elb0) obj;
                err0Var2.t((int) (4294967295L & elb0Var3.b()));
                err0Var.t((int) (elb0Var3.b() >> 32));
                break;
            default:
                elb0 elb0Var4 = (elb0) obj;
                err0Var2.t((int) (4294967295L & elb0Var4.b()));
                err0Var.t((int) (elb0Var4.b() >> 32));
                break;
        }
        return rih1Var;
    }
}
