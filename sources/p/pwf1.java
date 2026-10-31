package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pwf1 implements Function {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qwf1 b;
    public final /* synthetic */ s4b1 c;

    public pwf1(s4b1 s4b1Var, qwf1 qwf1Var) {
        this.c = s4b1Var;
        this.b = qwf1Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        qwf1 qwf1Var = this.b;
        s4b1 s4b1Var = this.c;
        switch (b) {
            case 0:
                return (((Boolean) obj).booleanValue() || s4b1Var.u()) ? qwf1Var.c(s4b1Var).map(a2x0.U0).timeout(10L, TimeUnit.SECONDS, qwf1Var.b).onErrorResumeNext(w1x0.Y0).map(y1x0.T0) : qwf1Var.f(s4b1Var);
            default:
                return ((Boolean) obj).booleanValue() ? qwf1Var.e(s4b1Var) : qwf1Var.d(s4b1Var);
        }
    }

    public pwf1(qwf1 qwf1Var, s4b1 s4b1Var) {
        this.b = qwf1Var;
        this.c = s4b1Var;
    }
}
