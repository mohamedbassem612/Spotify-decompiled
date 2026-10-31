package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uq00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vb61 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uq00(vb61 vb61Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = vb61Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        rb61 rb61Var = rb61.b;
        vb61 vb61Var = this.b;
        switch (b) {
            case 0:
                rb61 rb61Var2 = vb61Var.c;
                String str = vb61Var.a;
                if (rb61Var2 != rb61Var) {
                    iu30Var.invoke(new sb61(str));
                } else {
                    iu30Var.invoke(new tb61(str));
                }
                break;
            default:
                rb61 rb61Var3 = vb61Var.c;
                String str2 = vb61Var.a;
                if (rb61Var3 != rb61Var) {
                    iu30Var.invoke(new sb61(str2));
                } else {
                    iu30Var.invoke(new tb61(str2));
                }
                break;
        }
        return rih1Var;
    }
}
