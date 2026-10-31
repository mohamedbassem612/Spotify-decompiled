package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class au51 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ju51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au51(ju51 ju51Var, byte b) {
        super(0);
        this.a = b;
        this.b = ju51Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ju51 ju51Var = this.b;
        switch (b) {
            case 0:
                return ((g431) ju51Var.g.get()).a(uj1.c, new xm1(ju51Var, (byte) 1));
            default:
                return new kpg0((xpw) ju51Var.f.get(), wp51.b1);
        }
    }
}
