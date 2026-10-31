package p;

import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l74 implements y59 {
    public final ha4 a;
    public final h69 b;
    public final AutofillId c;

    public l74(ha4 ha4Var, h69 h69Var) {
        this.a = ha4Var;
        this.b = h69Var;
        ha4Var.setImportantForAutofill(1);
        d69 d69VarH = t6p1.h(ha4Var);
        AutofillId autofillId = d69VarH != null ? (AutofillId) d69VarH.a : null;
        if (autofillId == null) {
            throw l1d.w("Required value was null.");
        }
        this.c = autofillId;
    }
}
