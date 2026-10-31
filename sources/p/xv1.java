package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xv1 extends hab0 implements Function0 {
    public final /* synthetic */ ow1 a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv1(ow1 ow1Var, int i) {
        super(0);
        this.a = ow1Var;
        this.b = i;
    }

    public final Object invoke() {
        this.a.a().invoke(Integer.valueOf(this.b));
        return rih1.a;
    }
}
