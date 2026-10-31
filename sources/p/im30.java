package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class im30 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jm30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im30(jm30 jm30Var, byte b) {
        super(0);
        this.a = b;
        this.b = jm30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jm30 jm30Var = this.b;
        switch (b) {
            case 0:
                ((fzw) jm30Var.s.get()).a((mtf) jm30Var.t.get());
                return rih1Var;
            case 1:
                op71.q(((fzw) jm30Var.s.get()).b.a, (CancellationException) null);
                return rih1Var;
            case 2:
                return ((s691) jm30Var.h.get()).a(voo1.s(jm30Var.a));
            case 3:
                return (wpw) jm30Var.j.get();
            case 4:
                return ((k691) jm30Var.i.get()).a(voo1.r(jm30Var.a));
            case 5:
                return new jpg0((laa) jm30Var.k.get(), jl30.N0);
            case 6:
                return new jpg0(((mo51) jm30Var.e.get()).a(voo1.t(jm30Var.a, (xzf1) null)), jl30.O0);
            default:
                return new jpg0((laa) jm30Var.f.get(), jl30.P0);
        }
    }
}
