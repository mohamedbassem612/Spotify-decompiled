package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rrm0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wrm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rrm0(wrm0 wrm0Var, byte b) {
        super(1);
        this.a = b;
        this.b = wrm0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wrm0 wrm0Var = this.b;
        switch (b) {
            case 0:
                return new mrm0(krm0.a, wrm0Var.N0 ? lrm0.c : lrm0.a);
            default:
                cas casVar = (a7m0) obj;
                casVar.d = new srm0(wrm0Var, (byte) 0);
                casVar.e = new srm0(wrm0Var, (byte) 1);
                return rih1.a;
        }
    }
}
