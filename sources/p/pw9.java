package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pw9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wen0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw9(wen0 wen0Var, byte b) {
        super(1);
        this.a = b;
        this.b = wen0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                return new ow9(bpb1Var, (Set) obj, (byte) 0);
            case 1:
                return new ow9(bpb1Var, (Set) obj, (byte) 1);
            case 2:
                return bpb1Var;
            default:
                bpb1Var.l((lzt0) obj);
                return rih1.a;
        }
    }
}
