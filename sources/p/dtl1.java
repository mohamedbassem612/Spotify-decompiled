package p;

import android.os.Looper;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dtl1 {
    public final p311 a(View view) {
        o8n o8nVarU;
        a65 a65Var;
        nen0 nen0Var = gtl1.a;
        a65 a65Var2 = o6x.a;
        bj20 bj20Var = bj20.P0;
        idd1 idd1Var = w55.Z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            o8nVarU = ton1.u();
        } else {
            o8nVarU = (o8n) w55.N0.get();
            if (o8nVarU == null) {
                eg.m("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        o8n o8nVarY = o8nVarU.y(a65Var2);
        rjm0 rjm0VarA = o8nVarY.A(bj20Var);
        if (rjm0VarA != null) {
            a65 a65Var3 = new a65(rjm0VarA);
            y861 y861Var = (y861) a65Var3.c;
            synchronized (y861Var.b) {
                y861Var.a = false;
            }
            a65Var = a65Var3;
        } else {
            a65Var = null;
        }
        p811 p811Var = new p811();
        rmm0 rmm0Var = (qmm0) o8nVarY.A(xj20.P0);
        if (rmm0Var == null) {
            rmm0Var = new rmm0(view.getContext().getApplicationContext());
            p811Var.a = rmm0Var;
        }
        if (a65Var != null) {
            a65Var2 = a65Var;
        }
        o8n o8nVarY2 = o8nVarY.y(a65Var2).y(rmm0Var);
        p311 p311Var = new p311(o8nVarY2);
        synchronized (p311Var.d) {
            p311Var.u = true;
        }
        llm llmVarE = smo1.e(o8nVarY2);
        iac0 iac0VarH = x9p1.h(view);
        x8c0 lifecycle = iac0VarH != null ? iac0VarH.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new c9s(view, p311Var, (byte) 19));
            lifecycle.a(new fmf(llmVarE, a65Var, p311Var, p811Var, (byte) 1));
            return p311Var;
        }
        qf80.d("ViewTreeLifecycleOwner not found from " + view);
        jah.d();
        return null;
    }
}
