package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mcf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tcf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mcf1(tcf1 tcf1Var, byte b) {
        super(1);
        this.a = b;
        this.b = tcf1Var;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tcf1 tcf1Var = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                float fFloatValue = tcf1Var != null ? ((Number) tcf1Var.b.getValue()).floatValue() : 1.0f;
                if (tcf1Var == null || (i = tcf1Var.a) == 0) {
                    i = 1;
                }
                if (i != 2) {
                    kd31Var.b(fFloatValue);
                    kd31Var.i(2);
                } else {
                    lvx.z(kd31Var, fFloatValue);
                }
                break;
            case 1:
                lvx.z((kd31) obj, tcf1Var != null ? ((Number) tcf1Var.c.getValue()).floatValue() : 1.0f);
                break;
            case 2:
                lvx.z((kd31) obj, tcf1Var != null ? ((Number) tcf1Var.d.getValue()).floatValue() : 1.0f);
                break;
            case 3:
                lvx.z((kd31) obj, tcf1Var != null ? ((Number) tcf1Var.e.getValue()).floatValue() : 1.0f);
                break;
            default:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(tcf1Var != null ? ((Number) tcf1Var.f.getValue()).floatValue() : 1.0f);
                kd31Var2.i(2);
                break;
        }
        return rih1Var;
    }
}
