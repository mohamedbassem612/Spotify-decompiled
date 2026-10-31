package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o1o implements f4h1 {
    public final mr20 a;
    public final l1o b;
    public final frr c;
    public xab1 d;
    public f4h1 e;
    public final llm f;
    public String g;
    public final FrameLayout h;

    public o1o(Context context, Bundle bundle, kqw kqwVar, mr20 mr20Var, l1o l1oVar, frr frrVar, q8n q8nVar) {
        this.a = mr20Var;
        this.b = l1oVar;
        this.c = frrVar;
        this.e = kqwVar;
        this.f = smo1.e(q8nVar);
        this.g = bundle != null ? bundle.getString("BUNDLE_AUTOPLAYED_URI") : null;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(kqwVar.a);
        this.h = frameLayout;
    }

    public final Object getView() {
        return this.h;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_AUTOPLAYED_URI", this.g);
        Bundle bundleSerialize = this.e.serialize();
        if (bundleSerialize != null) {
            bundle.putAll(bundleSerialize);
        }
        return bundle;
    }

    public final void start() {
        Single singleF;
        this.e.start();
        this.d = fn31.T(this.f, (o8n) null, 0, new n1o(this, null, (byte) 0), 3);
        l1o l1oVar = this.b;
        String str = l1oVar.d;
        if (str == null || str.equals(this.g)) {
            return;
        }
        String str2 = l1oVar.a;
        if (l1oVar.b == 1) {
            frr frrVar = this.c;
            ybq ybqVar = frrVar.d;
            muz muzVar = frrVar.a;
            ruz ruzVar = frrVar.b;
            r7q r7qVar = ybqVar.a;
            daq daqVar = r7qVar.b;
            zeu0 zeu0Var = (zeu0) daqVar.C6.get();
            teq teqVar = r7qVar.d;
            Resources resources = (Resources) teqVar.N0.get();
            kt91 kt91Var = (kt91) daqVar.f8.get();
            Flowable flowable = (Flowable) daqVar.D5.get();
            e7p0 e7p0Var = (e7p0) teqVar.W4.get();
            eu4 eu4Var = (eu4) daqVar.af.get();
            ynb0 ynb0VarA = xqu.a(daqVar.P5);
            xye1 xye1Var = (xye1) daqVar.c3.get();
            Scheduler scheduler = (Scheduler) daqVar.z1.get();
            Scheduler scheduler2 = (Scheduler) daqVar.A2.get();
            q8n q8nVar = (q8n) daqVar.w1.get();
            tc6 tc6Var = new tc6(zeu0Var, resources, kt91Var, flowable, e7p0Var, eu4Var, ynb0VarA, xye1Var, muzVar, str2, scheduler, ruzVar, scheduler2, q8nVar);
            if (eu4Var.n()) {
                singleF = rqt0.F(q8nVar, new wt(tc6Var, str, (lnm) null, (byte) 11));
            } else {
                singleF = eu4Var.o() ? tc6Var.d(str) : tc6Var.c(str);
            }
            Disposable disposableSubscribe = singleF.toFlowable().W(frrVar.c).subscribe();
            vku vkuVar = frrVar.e;
            disposableSubscribe.getClass();
            vkuVar.a(disposableSubscribe);
        }
        this.g = str;
    }

    public final void stop() {
        xab1 xab1Var = this.d;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.e.stop();
    }
}
