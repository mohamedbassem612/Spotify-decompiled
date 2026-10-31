package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nch extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ atq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nch(v9c v9cVar, atq0 atq0Var) {
        super(1);
        this.b = atq0Var;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        xsq0 xsq0Var = this.b;
        switch (b) {
            case 0:
                c481 c481Var = (c481) ((zsq0) obj).a;
                boolean z = c481Var.a.m;
                if (z && (xsq0Var instanceof zsq0) && ((Boolean) ((zsq0) xsq0Var).a).booleanValue()) {
                    i = 3;
                } else {
                    i = z ? 2 : 1;
                }
                return new zsq0(new yv00(c481Var, i));
            default:
                return xsq0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nch(atq0 atq0Var) {
        super(1);
        this.b = atq0Var;
    }
}
