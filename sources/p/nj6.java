package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nj6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b4g1 b;
    public final /* synthetic */ xd6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj6(b4g1 b4g1Var, xd6 xd6Var, byte b) {
        super(0);
        this.a = b;
        this.b = b4g1Var;
        this.c = xd6Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xd6 xd6Var = this.c;
        b4g1 b4g1Var = this.b;
        float fS = 0.0f;
        switch (b) {
            case 0:
                if (!b4g1Var.a() && xd6Var != null) {
                    fS = xd6Var.c.s();
                }
                return Float.valueOf(fS);
            default:
                if (!b4g1Var.a() && xd6Var != null) {
                    fS = xd6Var.d.s();
                }
                return Float.valueOf(fS);
        }
    }
}
