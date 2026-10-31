package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hbz extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cgm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hbz(cgm0 cgm0Var, byte b) {
        super(0);
        this.a = b;
        this.b = cgm0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        cgm0 cgm0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(!cgm0Var.c);
            case 1:
                return Boolean.valueOf(!(cgm0Var.b.d));
            default:
                saz sazVar = cgm0Var.b;
                float f = sazVar.c;
                if (f <= 0.0f || (sazVar.d && f >= 1.0f)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
