package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wyg1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wen0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wyg1(wen0 wen0Var, byte b) {
        super(0);
        this.a = b;
        this.b = wen0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = Boolean.FALSE;
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, bool);
                break;
            default:
                Boolean bool2 = Boolean.TRUE;
                bpb1 bpb1Var3 = bpb1Var;
                bpb1Var3.getClass();
                bpb1Var3.m((Object) null, bool2);
                break;
        }
        return rih1Var;
    }
}
