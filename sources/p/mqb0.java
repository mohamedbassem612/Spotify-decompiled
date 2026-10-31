package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mqb0 implements Function0 {
    public final /* synthetic */ byte a;
    public final nqb0 b;

    public /* synthetic */ mqb0(nqb0 nqb0Var, byte b) {
        this.a = b;
        this.b = nqb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        nqb0 nqb0Var = this.b;
        switch (b) {
            case 0:
                Object obj = nqb0Var.i.b;
                lf30 lf30Var = nqb0Var.f.a;
                return sqg0.T(new ArrayList());
            default:
                nqb0Var.h.getClass();
                return new ArrayList(q7h.U(z6x.a, 10));
        }
    }
}
