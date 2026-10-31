package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qdp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m3n1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdp0(m3n1 m3n1Var, byte b) {
        super(0);
        this.a = b;
        this.b = m3n1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        m3n1 m3n1Var = this.b;
        switch (b) {
            case 0:
                return m3n1Var.d;
            default:
                return w6p1.i(m3n1Var);
        }
    }
}
