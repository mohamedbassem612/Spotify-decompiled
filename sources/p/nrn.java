package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nrn extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ wen0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrn(iu30 iu30Var, wen0 wen0Var) {
        super(0);
        this.c = iu30Var;
        this.b = wen0Var;
    }

    public final Object invoke() {
        bpb1 bpb1Var;
        Object value;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        bpb1 bpb1Var2 = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(fwk.a);
                do {
                    bpb1Var = bpb1Var2;
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, new frn(((frn) value).a, true)));
                break;
            default:
                frn frnVar = new frn();
                bpb1 bpb1Var3 = bpb1Var2;
                bpb1Var3.getClass();
                bpb1Var3.m((Object) null, frnVar);
                iu30Var.invoke(iwk.a);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrn(wen0 wen0Var, iu30 iu30Var) {
        super(0);
        this.b = wen0Var;
        this.c = iu30Var;
    }
}
