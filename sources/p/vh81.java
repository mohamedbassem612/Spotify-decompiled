package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vh81 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ wh81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh81(wh81 wh81Var, byte b) {
        super((Object) null);
        this.b = b;
        switch (b) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.c = wh81Var;
                super(bool);
                break;
            default:
                this.c = wh81Var;
                break;
        }
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        byte b = this.b;
        wh81 wh81Var = this.c;
        switch (b) {
            case 0:
                m1q0 m1q0Var = (m1q0) obj2;
                m1q0 m1q0Var2 = (m1q0) obj;
                if (m1q0Var2 != null) {
                    m1q0Var2.e();
                }
                if (m1q0Var != null) {
                    wh81Var.c.b(m1q0Var);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    wh81Var.b();
                }
                break;
        }
    }
}
