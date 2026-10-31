package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qtr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ mmr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtr0(ven0 ven0Var, mmr0 mmr0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
        this.c = mmr0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mmr0 mmr0Var = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                oq70 oq70Var = ((li7) obj).b.a;
                if (oq70Var.getWidth() != -1 && oq70Var.getHeight() != -1) {
                    mmr0Var = new mmr0(Float.valueOf(oq70Var.getWidth()), Float.valueOf(oq70Var.getHeight()));
                }
                ven0Var.setValue(mmr0Var);
                break;
            case 1:
                oq70 oq70Var2 = ((li7) obj).b.a;
                if (oq70Var2.getWidth() != -1 && oq70Var2.getHeight() != -1) {
                    mmr0Var = new mmr0(Float.valueOf(oq70Var2.getWidth()), Float.valueOf(oq70Var2.getHeight()));
                }
                ven0Var.setValue(mmr0Var);
                break;
            default:
                oq70 oq70Var3 = ((li7) obj).b.a;
                if (oq70Var3.getWidth() != -1 && oq70Var3.getHeight() != -1) {
                    mmr0Var = new mmr0(Float.valueOf(oq70Var3.getWidth()), Float.valueOf(oq70Var3.getHeight()));
                }
                ven0Var.setValue(mmr0Var);
                break;
        }
        return rih1Var;
    }
}
