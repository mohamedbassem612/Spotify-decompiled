package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class si11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ti11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si11(ti11 ti11Var, byte b) {
        super(1);
        this.a = b;
        this.b = ti11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ti11 ti11Var = this.b;
        switch (b) {
            case 0:
                rwq0.z((qtr) obj, new g001(ti11Var, (byte) 19));
                return rih1.a;
            default:
                return ti11Var.h;
        }
    }
}
