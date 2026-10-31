package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cf60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ye60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf60(ye60 ye60Var, byte b) {
        super(1);
        this.a = b;
        this.b = ye60Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ye60 ye60Var = this.b;
        switch (b) {
            case 0:
                return l1d.k(((Number) obj).intValue(), ((we60) ye60Var).a, "-skeleton-");
            default:
                ve60 ve60Var = (ve60) ye60Var;
                return f4i1.f(ve60Var.a, "-", ((te60) ve60Var.c.get(((Number) obj).intValue())).a);
        }
    }
}
