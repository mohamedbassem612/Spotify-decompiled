package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class axy extends hab0 implements Function0 {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ ela1 b;
    public final /* synthetic */ u771 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(iu30 iu30Var, ela1 ela1Var, u771 u771Var, int i) {
        super(0);
        this.a = iu30Var;
        this.b = ela1Var;
        this.c = u771Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(new pwy(this.b, this.c, this.d));
        return rih1.a;
    }
}
