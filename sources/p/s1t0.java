package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s1t0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v1t0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1t0(v1t0 v1t0Var, byte b) {
        super(0);
        this.a = b;
        this.b = v1t0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        v1t0 v1t0Var = this.b;
        switch (b) {
            case 0:
                ((i8h1) v1t0Var.d.getValue()).m(v1t0Var.c.e(), (xj61) null);
                return rih1.a;
            default:
                return (i8h1) v1t0Var.a.get();
        }
    }
}
