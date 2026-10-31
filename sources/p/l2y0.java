package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l2y0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m2y0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2y0(m2y0 m2y0Var, byte b) {
        super(1);
        this.a = b;
        this.b = m2y0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        m2y0 m2y0Var = this.b;
        switch (b) {
            case 0:
                return new xwm0(m2y0Var, (byte) 12);
            default:
                m2y0Var.h.a.l((String) obj);
                return rih1.a;
        }
    }
}
