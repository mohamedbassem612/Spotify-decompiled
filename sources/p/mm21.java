package p;

import android.content.Context;
import com.spotify.reporting.reportaction.ReportWebViewActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mm21 {
    public final uww0 a;
    public final th30 b;

    public mm21(th30 th30Var, uww0 uww0Var) {
        this.a = uww0Var;
        this.b = th30Var;
    }

    public final void a(Context context, String str, String str2) {
        int i = ReportWebViewActivity.f1;
        im21 im21VarF = x9p1.f(this.a, v9p1.A(context, str2), str);
        th30 th30Var = this.b;
        th30Var.getClass();
        nu9 nu9Var = new nu9(th30Var);
        nu9Var.k(0, im21VarF, "report", 1);
        nu9Var.f();
    }
}
