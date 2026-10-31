package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dki0 implements Function0 {
    public final /* synthetic */ byte a;
    public final eki0 b;
    public final o5 c;
    public final t8 d;
    public final int e;
    public final int f;
    public final zgy0 g;

    public /* synthetic */ dki0(eki0 eki0Var, o5 o5Var, t8 t8Var, int i, int i2, zgy0 zgy0Var, byte b) {
        this.a = b;
        this.b = eki0Var;
        this.c = o5Var;
        this.d = t8Var;
        this.e = i;
        this.f = i2;
        this.g = zgy0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        eki0 eki0Var = this.b;
        switch (b) {
            case 0:
                return o7h.l1(((kf5) ((ks6) eki0Var.a.b).e).h(this.c, this.d, this.e, this.f, this.g));
            default:
                return o7h.l1(((kf5) ((ks6) eki0Var.a.b).e).i(this.c, this.d, this.e, this.f, this.g));
        }
    }
}
