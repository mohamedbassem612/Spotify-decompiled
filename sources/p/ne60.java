package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ne60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pe60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne60(pe60 pe60Var, byte b) {
        super(1);
        this.a = b;
        this.b = pe60Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pe60 pe60Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(pe60Var.a, pe60Var.e, (te60) obj);
            default:
                ((qtr) obj).b(new jaz((Object) pe60Var, (lnm) null, (byte) 5));
                return rih1.a;
        }
    }
}
