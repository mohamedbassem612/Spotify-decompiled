package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p30 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ r30 b;
    public final /* synthetic */ zob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(zob1 zob1Var, r30 r30Var) {
        super(1);
        this.c = zob1Var;
        this.b = r30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zob1 zob1Var = this.c;
        r30 r30Var = this.b;
        switch (b) {
            case 0:
                return new x010(zob1Var, r30Var.O0, new o30(3, null, (byte) 0), (byte) 1);
            default:
                return r30Var.e(new j30((ioj0) zob1Var.getValue(), w7x.a), (k30) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(r30 r30Var, zob1 zob1Var) {
        super(1);
        this.b = r30Var;
        this.c = zob1Var;
    }
}
