package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dpn0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ epn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dpn0(epn0 epn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = epn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        epn0 epn0Var = this.b;
        switch (b) {
            case 0:
                npn0 npn0Var = epn0Var.Z0().b;
                npn0Var.b.a(new lhv0(npn0Var.a.a, "unknown_error"));
                break;
            default:
                gpn0 gpn0VarZ0 = epn0Var.Z0();
                bpb1 bpb1Var = gpn0VarZ0.c;
                if (bpb1Var.getValue() instanceof jpn0) {
                    bpb1Var.m((Object) null, kpn0.a);
                    gpn0VarZ0.a.a(true);
                }
                break;
        }
        return rih1Var;
    }
}
