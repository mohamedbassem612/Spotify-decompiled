package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class av70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ epb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av70(epb1 epb1Var, byte b) {
        super(1);
        this.a = b;
        this.b = epb1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        epb1 epb1Var = this.b;
        switch (b) {
            case 0:
                fai0 fai0Var = new fai0();
                fai0Var.m(new ea10((ioj0) epb1Var.Y.getValue()));
                fai0Var.n(epb1Var, new df3(fai0Var, (byte) 5));
                return fai0Var;
            default:
                return epb1Var;
        }
    }
}
