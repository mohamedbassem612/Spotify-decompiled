package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yn31 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bo31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn31(bo31 bo31Var, byte b) {
        super(1);
        this.a = b;
        this.b = bo31Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bo31 bo31Var = this.b;
        switch (b) {
            case 0:
                return j2h1.D(bo31Var.l, new d821(bo31Var, (sn3) obj, (lnm) null, (byte) 18));
            case 1:
                return j2h1.D(bo31Var.l, new d821(bo31Var, (yn3) obj, (lnm) null, (byte) 19));
            default:
                return j2h1.D(bo31Var.l, new w621((rn3) obj, bo31Var, (lnm) null, (byte) 1));
        }
    }
}
