package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class al31 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bl31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al31(bl31 bl31Var, byte b) {
        super(1);
        this.a = b;
        this.b = bl31Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bl31 bl31Var = this.b;
        switch (b) {
            case 0:
                return new m441(new ciw0(bl31Var, ((tk31) obj).c, (lnm) null, (byte) 15));
            case 1:
                tk31 tk31Var = (tk31) obj;
                String str = tk31Var.a;
                vnr0 vnr0Var = tk31Var.b;
                boolean z = !bl31Var.c;
                String str2 = tk31Var.d;
                qk31 qk31Var = tk31Var.g;
                return new zk31(str, vnr0Var, wk31.a, z, str2, qk31Var.a, qk31Var.b);
            default:
                ((qtr) obj).b(new k8y0(bl31Var, (lnm) null, (byte) 9));
                return rih1.a;
        }
    }
}
