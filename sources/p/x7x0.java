package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x7x0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lww0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7x0(lww0 lww0Var, byte b) {
        super(1);
        this.a = b;
        this.b = lww0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lww0 lww0Var = this.b;
        switch (b) {
            case 0:
                lww0Var.b((int) (((yr80) obj).a & 4294967295L), lww0Var.b.s());
                break;
            case 1:
                ((kd31) obj).E(lww0Var.c.s());
                break;
            case 2:
                lww0Var.b(lww0Var.a.s(), (int) (((yr80) obj).a & 4294967295L));
                break;
            default:
                ((kd31) obj).E(lww0Var.c.s());
                break;
        }
        return rih1Var;
    }
}
