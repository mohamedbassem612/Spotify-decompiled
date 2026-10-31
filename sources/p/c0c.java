package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.CompositeDisposable;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c0c implements EventSource {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ c0c(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Disposable a(Consumer consumer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                los losVar = ((d0c) obj).a;
                return new b0c(new CompositeDisposable(new Disposable[]{new b0c(losVar.b(new m42(consumer, (byte) 5)), (byte) 1), new b0c(losVar.d(new m42(consumer, (byte) 6)), (byte) 1)}), (byte) 0);
            case 1:
                j0d1 j0d1VarB = guo1.B();
                fns fnsVar = igu.a;
                llm llmVarE = smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
                fn31.T(llmVarE, (o8n) null, 0, new bag(this, consumer, (lnm) null, (byte) 12), 3);
                return new b0c(llmVarE, (byte) 2);
            case 2:
                kun kunVar = (kun) obj;
                ymd0 ymd0Var = kunVar.g;
                iac0 iac0Var = kunVar.e;
                ymd0Var.f(iac0Var, new jun(consumer, (byte) 0));
                kunVar.h.f(iac0Var, new jun(consumer, (byte) 1));
                fai0 fai0Var = kunVar.N0;
                if (fai0Var != null) {
                    fai0Var.f(iac0Var, new jun(consumer, (byte) 2));
                }
                ymd0 ymd0Var2 = kunVar.f;
                if (ymd0Var2 != null) {
                    ymd0Var2.f(iac0Var, new jun(consumer, (byte) 3));
                }
                return new b0c(kunVar, (byte) 3);
            case 3:
                return new del(((fvv) obj).a.b(new m42(consumer, (byte) 10)), (byte) 1);
            case 4:
                rjd rjdVar = new rjd(consumer, (byte) 4);
                ((iac0) obj).getLifecycle().a(rjdVar);
                return new a150(this, rjdVar, (byte) 0);
            default:
                ug3 ug3Var = (ug3) obj;
                jun junVar = new jun(ug3Var, consumer);
                ((fai0) ug3Var.b).g(junVar);
                return new a150(ug3Var, junVar, (byte) 1);
        }
    }
}
