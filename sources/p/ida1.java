package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ida1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pda1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ida1(pda1 pda1Var, byte b) {
        super(1);
        this.a = b;
        this.b = pda1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pda1 pda1Var = this.b;
        switch (b) {
            case 0:
                pda1Var.q.setValue((String) obj);
                break;
            case 1:
                pda1Var.r.setValue((String) obj);
                break;
            case 2:
                pda1Var.q.setValue((String) obj);
                break;
            case 3:
                pda1Var.f31p.t(((Number) obj).intValue());
                break;
            default:
                pda1Var.o = Float.valueOf(((Number) obj).floatValue());
                break;
        }
        return rih1Var;
    }
}
