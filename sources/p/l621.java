package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l621 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k811 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l621(k811 k811Var, byte b) {
        super(1);
        this.a = b;
        this.b = k811Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        k811 k811Var = this.b;
        switch (b) {
            case 0:
                lxl0 lxl0Var = (lxl0) ((idd1) k811Var.c).getValue();
                lxl0Var.getClass();
                return new kxl0(lxl0Var);
            default:
                return new vm61(2131962200, 2131962199, 2131962198, new vm0(k811Var, (lnm) null, (byte) 28), new um61(new l621(k811Var, (byte) 0), i021.Y, i021.Z));
        }
    }
}
