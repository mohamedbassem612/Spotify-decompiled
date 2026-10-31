package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d5f1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h5f1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5f1(h5f1 h5f1Var, byte b) {
        super(0);
        this.a = b;
        this.b = h5f1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h5f1 h5f1Var = this.b;
        switch (b) {
            case 0:
                h5f1Var.d();
                break;
            case 1:
                h5f1Var.d();
                break;
            default:
                bpb1 bpb1Var = h5f1Var.o;
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                break;
        }
        return rih1Var;
    }
}
