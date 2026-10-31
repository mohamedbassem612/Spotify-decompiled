package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rm91 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rm91(tm91 tm91Var, byte b) {
        super(1);
        this.a = b;
        this.b = tm91Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tm91 tm91Var = this.b;
        switch (b) {
            case 0:
                return tm91Var.i;
            default:
                ((qtr) obj).b(new gz0(tm91Var, (lnm) null, (byte) 27));
                return rih1.a;
        }
    }
}
