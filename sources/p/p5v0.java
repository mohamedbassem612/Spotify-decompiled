package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p5v0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q5v0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5v0(q5v0 q5v0Var, byte b) {
        super(0);
        this.a = b;
        this.b = q5v0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        q5v0 q5v0Var = this.b;
        switch (b) {
            case 0:
                return new jpg0((laa) q5v0Var.e.get(), o5v0.b);
            case 1:
                return ((s691) q5v0Var.j.get()).a(voo1.s(q5v0Var.a));
            case 2:
                ((f3x) q5v0Var.z.get()).a();
                return rih1Var;
            case 3:
                ((f3x) q5v0Var.z.get()).f.c();
                return rih1Var;
            case 4:
                return (wpw) q5v0Var.g.get();
            case 5:
                return ((k691) q5v0Var.k.get()).a(voo1.r(q5v0Var.a));
            case 6:
                return new jpg0((laa) q5v0Var.h.get(), o5v0.O0);
            case 7:
                return ((dm91) q5v0Var.l.get()).a(voo1.v(q5v0Var.a), false);
            case 8:
                return (wpw) q5v0Var.f.get();
            case 9:
                return (wpw) q5v0Var.m.get();
            case 10:
                return (wpw) q5v0Var.i.get();
            default:
                return new jpg0(((mo51) q5v0Var.d.get()).a(voo1.t(q5v0Var.a, (xzf1) null)), o5v0.P0);
        }
    }
}
