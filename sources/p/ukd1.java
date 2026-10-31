package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ukd1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zkd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ukd1(zkd1 zkd1Var, byte b) {
        super(0);
        this.a = b;
        this.b = zkd1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        zkd1 zkd1Var = this.b;
        switch (b) {
            case 0:
                return new jpg0(((mo51) zkd1Var.j1.get()).a(voo1.t(zkd1Var.a, (xzf1) null)), d6d1.e1);
            case 1:
                return new jpg0((laa) zkd1Var.k1.get(), vkd1.b);
            case 2:
                return ((s691) zkd1Var.g1.get()).a(voo1.s(zkd1Var.a));
            case 3:
                return (wpw) zkd1Var.b1.get();
            case 4:
                return ((k691) zkd1Var.h1.get()).a(voo1.r(zkd1Var.a));
            case 5:
                return new jpg0((laa) zkd1Var.c1.get(), vkd1.c);
            case 6:
                return (wpw) zkd1Var.i1.get();
            case 7:
                return (wpw) zkd1Var.d1.get();
            case 8:
                return ((dm91) zkd1Var.f1.get()).a(voo1.v(zkd1Var.a), zkd1Var.r1.b());
            case 9:
                return (wpw) zkd1Var.e1.get();
            default:
                return zkd1Var.p1.a(zkd1Var);
        }
    }
}
