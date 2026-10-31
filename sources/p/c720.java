package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c720 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a720 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c720(a720 a720Var, byte b) {
        super(0);
        this.a = b;
        this.b = a720Var;
    }

    public final Object invoke() {
        byte b = this.a;
        a720 a720Var = this.b;
        switch (b) {
            case 0:
                c380 c380Var = a720Var.c;
                bw91 bw91Var = new bw91();
                bw91Var.addAll(c380Var);
                return bw91Var;
            default:
                for (Object obj : a720Var.b) {
                    if (((uha1) obj).c) {
                        return v8r.q(obj);
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
        }
    }
}
