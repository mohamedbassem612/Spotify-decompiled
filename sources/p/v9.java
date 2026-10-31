package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class v9 extends gck1 implements eck1 {
    public final oe41 a;
    public final x8c0 b;

    public v9(qe41 qe41Var) {
        this.a = qe41Var.p();
        this.b = qe41Var.getLifecycle();
    }

    public final xbk1 b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        x8c0 x8c0Var = this.b;
        if (x8c0Var == null) {
            hhg1.h("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        oe41 oe41Var = this.a;
        oe41Var.getClass();
        x8c0Var.getClass();
        ge41 ge41VarQ = aqo1.q(oe41Var, x8c0Var, canonicalName, (Bundle) null);
        xbk1 xbk1VarE = e(ge41VarQ.b);
        xbk1VarE.P("androidx.lifecycle.savedstate.vm.tag", ge41VarQ);
        return xbk1VarE;
    }

    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        String str = (String) ((esn) wcn0Var).a.get(hck1.b);
        if (str == null) {
            eg.m("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        oe41 oe41Var = this.a;
        if (oe41Var == null) {
            return e(a6o1.j(wcn0Var));
        }
        oe41Var.getClass();
        x8c0 x8c0Var = this.b;
        x8c0Var.getClass();
        ge41 ge41VarQ = aqo1.q(oe41Var, x8c0Var, str, (Bundle) null);
        xbk1 xbk1VarE = e(ge41VarQ.b);
        xbk1VarE.P("androidx.lifecycle.savedstate.vm.tag", ge41VarQ);
        return xbk1VarE;
    }

    public final void d(xbk1 xbk1Var) {
        oe41 oe41Var = this.a;
        if (oe41Var != null) {
            x8c0 x8c0Var = this.b;
            x8c0Var.getClass();
            aqo1.o(xbk1Var, oe41Var, x8c0Var);
        }
    }

    public xbk1 e(fe41 fe41Var) {
        return new fnn0(fe41Var);
    }
}
