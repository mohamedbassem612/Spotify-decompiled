package p;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pct0 {
    public final Context a;
    public AutofillManager b;

    public pct0(Context context) {
        this.a = context;
    }

    public final void a() {
        b().commit();
    }

    public final AutofillManager b() {
        AutofillManager autofillManager = this.b;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManagerI = qpp0.i(this.a.getSystemService(qpp0.k()));
        if (autofillManagerI != null) {
            this.b = autofillManagerI;
            return autofillManagerI;
        }
        eg.m("Could not locate AutofillManager from context");
        return null;
    }

    public final void c(ha4 ha4Var, int i, AutofillValue autofillValue) {
        b().notifyValueChanged(ha4Var, i, autofillValue);
    }

    public final void d(ha4 ha4Var, int i, Rect rect) {
        b().notifyViewEntered(ha4Var, i, rect);
    }

    public final void e(int i, ha4 ha4Var) {
        b().notifyViewExited(ha4Var, i);
    }

    public final void f(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            z59.a(view, b(), i, z);
        }
    }

    public final void g(ha4 ha4Var, int i, Rect rect) {
        b().requestAutofill(ha4Var, i, rect);
    }
}
