package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v1n0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ynb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1n0(ynb0 ynb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ynb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ynb0 ynb0Var = this.b;
        switch (b) {
            case 0:
                ev71 ev71Var = ((nx9) obj).s().a;
                return ev71Var != null ? ev71Var.b : (at71) ((qz4) ynb0Var.get()).d.getValue();
            default:
                ((qtr) obj).b(new u08(ynb0Var, (lnm) null, (byte) 11));
                return rih1.a;
        }
    }
}
