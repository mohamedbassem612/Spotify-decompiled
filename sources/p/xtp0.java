package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xtp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ytp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xtp0(ytp0 ytp0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ytp0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ytp0 ytp0Var = this.b;
        switch (b) {
            case 0:
                hxl0 hxl0Var = (hxl0) ((idd1) ytp0Var.f).getValue();
                hxl0Var.getClass();
                return new gxl0(hxl0Var);
            default:
                return new vm61(2131961923, 2131961922, 2131961921, new lok0(ytp0Var, (lnm) null, (byte) 7), new um61(new xtp0(ytp0Var, (byte) 0), mmp0.b1, mmp0.c1));
        }
    }
}
