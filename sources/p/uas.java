package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uas extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ was b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uas(was wasVar, byte b) {
        super(0);
        this.a = b;
        this.b = wasVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        was wasVar = this.b;
        switch (b) {
            case 0:
                return new jpg0((laa) wasVar.f.get(), c6s.g);
            case 1:
                return ((s691) wasVar.j.get()).a(voo1.s(wasVar.a));
            case 2:
                ((fzw) wasVar.y.get()).a((mtf) wasVar.z.get());
                return rih1Var;
            case 3:
                op71.q(((fzw) wasVar.y.get()).b.a, (CancellationException) null);
                return rih1Var;
            case 4:
                return (wpw) wasVar.m.get();
            case 5:
                return ((k691) wasVar.k.get()).a(voo1.r(wasVar.a));
            case 6:
                return new jpg0((laa) wasVar.n.get(), c6s.S0);
            case 7:
                return ((dm91) wasVar.h.get()).a(voo1.v(wasVar.a), false);
            case 8:
                return (wpw) wasVar.o.get();
            case 9:
                return (wpw) wasVar.l.get();
            case 10:
                return (wpw) wasVar.f73p.get();
            default:
                return new jpg0(((mo51) wasVar.e.get()).a(voo1.t(wasVar.a, (xzf1) null)), c6s.T0);
        }
    }
}
