package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lc61 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc61(uc61 uc61Var, byte b) {
        super(0);
        this.a = b;
        this.b = uc61Var;
    }

    public final Object invoke() {
        byte b = this.a;
        uc61 uc61Var = this.b;
        switch (b) {
            case 0:
                uc61Var.h.a(urb.a);
                return rih1.a;
            default:
                jpq jpqVar = uc61Var.b;
                xe01 xe01Var = uc61Var.k;
                bpb1 bpb1Var = uc61Var.g;
                lc61 lc61Var = new lc61(uc61Var, (byte) 0);
                jpqVar.getClass();
                return new et90(xe01Var, lc61Var, bpb1Var);
        }
    }
}
