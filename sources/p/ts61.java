package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ts61 extends hab0 implements Function0 {
    public final /* synthetic */ us61 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts61(us61 us61Var) {
        super(0);
        this.a = us61Var;
    }

    public final Object invoke() {
        return this.a.b.getView();
    }
}
