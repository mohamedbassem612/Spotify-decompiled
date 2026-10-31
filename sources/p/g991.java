package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDelay;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDoFinally;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g991 implements dwo {
    public final h991 a;
    public final w9u0 b;
    public final n2t c;
    public final Scheduler d;
    public final Scheduler e;
    public final vku f = new vku();

    public g991(h991 h991Var, w9u0 w9u0Var, n2t n2tVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = h991Var;
        this.b = w9u0Var;
        this.c = n2tVar;
        this.d = scheduler;
        this.e = scheduler2;
        ua91 ua91Var = h991Var.c;
        llm llmVar = (llm) ua91Var.d;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        q8n q8nVar = (q8n) ua91Var.c;
        j0d1 j0d1VarB = guo1.B();
        q8nVar.getClass();
        llm llmVarE = smo1.e(flo1.l(q8nVar, j0d1VarB));
        ua91Var.d = llmVarE;
        Flowable flowable = (Flowable) ua91Var.b;
        vbm[] vbmVarArr = q601.a;
        ua91Var.e = d5p1.t(new h801(new kge(flowable), (byte) 12), llmVarE, ey71.a, (Object) null);
        h991Var.a.a(this);
        h991Var.b.a(this);
    }

    public final void a(jm5 jm5Var) {
        boolean zEquals = jm5Var.equals(va91.e);
        w9u0 w9u0Var = this.b;
        vku vkuVar = this.f;
        if (zEquals) {
            vkuVar.a(w9u0Var.a(new d9u0("SleepTimerController", false)).subscribe());
            return;
        }
        if (jm5Var instanceof wa91) {
            CompletableFromAction completableFromAction = new CompletableFromAction(new f991(this, (byte) 1));
            Objects.requireNonNull(TimeUnit.MILLISECONDS, "unit is null");
            vkuVar.a(new CompletableDoFinally(new CompletableDelay(completableFromAction, 30000L, this.d).c(w9u0Var.a(new d9u0("SleepTimerController", false)).ignoreElement()).n(this.e), new f991(this, (byte) 0)).subscribe(ps4.X0, w841.X0));
        } else if (jm5Var.equals(va91.f)) {
            vkuVar.c();
        } else {
            if (jm5Var.equals(va91.d)) {
                return;
            }
            eg.o();
        }
    }

    public final void shutdown() {
        h991 h991Var = this.a;
        ua91 ua91Var = h991Var.c;
        llm llmVar = (llm) ua91Var.d;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        ua91Var.e = null;
        h991Var.a.stop();
        h991Var.b.stop();
        this.f.c();
    }
}
