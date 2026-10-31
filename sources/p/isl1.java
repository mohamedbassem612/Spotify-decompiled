package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class isl1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vsl1 b;

    public /* synthetic */ isl1(vsl1 vsl1Var, byte b) {
        this.a = b;
        this.b = vsl1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vsl1 vsl1Var = this.b;
        switch (b) {
            case 0:
                return new kcf1(vsl1Var, (byte) 12);
            default:
                vsl1Var.a(((Number) ((o95) obj).e()).floatValue());
                return rih1.a;
        }
    }
}
