package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class f1s0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g1s0 b;

    public /* synthetic */ f1s0(g1s0 g1s0Var, byte b) {
        this.a = b;
        this.b = g1s0Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        g1s0 g1s0Var = this.b;
        switch (b) {
            case 0:
                return g1s0Var.c.f(((Boolean) obj).booleanValue());
            case 1:
                return g1s0Var.c.f(((Boolean) obj).booleanValue()).flatMap(new f1s0(g1s0Var, (byte) 2));
            default:
                return g1s0Var.a.a((c841) obj).onErrorResumeWith(g1s0Var.b.q().flatMap(new f1s0(g1s0Var, (byte) 0)).flatMap(new pjq0(g1s0Var.a, (byte) 4)));
        }
    }
}
