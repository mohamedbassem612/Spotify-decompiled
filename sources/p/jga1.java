package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jga1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kga1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jga1(kga1 kga1Var, byte b) {
        super(0);
        this.a = b;
        this.b = kga1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kga1 kga1Var = this.b;
        switch (b) {
            case 0:
                String strE = kga1Var.a.e(kga1.f, (String) null);
                if (strE != null) {
                    return kga1.d(strE);
                }
                return null;
            default:
                String strE2 = kga1Var.a.e(kga1.e, (String) null);
                if (strE2 != null) {
                    return kga1.d(strE2);
                }
                return null;
        }
    }
}
