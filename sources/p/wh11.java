package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wh11 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yh11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh11(yh11 yh11Var, byte b) {
        super(0);
        this.a = b;
        this.b = yh11Var;
    }

    public final Object invoke() {
        byte b = this.a;
        yh11 yh11Var = this.b;
        switch (b) {
            case 0:
                return (wpw) yh11Var.f90p.get();
            case 1:
                return new jpg0((laa) yh11Var.q.get(), fd11.O0);
            case 2:
                return (wpw) yh11Var.r.get();
            case 3:
                return (wpw) yh11Var.s.get();
            default:
                return new jpg0((laa) yh11Var.h.get(), fd11.R0);
        }
    }
}
