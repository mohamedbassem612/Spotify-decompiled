package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f40 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f40(i40 i40Var, byte b) {
        super(1);
        this.a = b;
        this.b = i40Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        lnm lnmVar = null;
        i40 i40Var = this.b;
        switch (b) {
            case 0:
                return q601.b(h5p1.s(i40Var.b, i40Var.X.a, yoi1.g(i40Var.Y.a()), new r20((d40) obj, lnmVar, b2)));
            case 1:
                return i40Var.e((d40) obj, null, false, false);
            default:
                ((qtr) obj).b(new lu(i40Var, (lnm) null, (byte) 1));
                return rih1.a;
        }
    }
}
