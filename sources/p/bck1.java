package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bck1 implements znb0 {
    public final tka0 a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public xbk1 e;

    public bck1(tka0 tka0Var, Function0 function0, Function0 function1, Function0 function2) {
        this.a = tka0Var;
        this.b = function0;
        this.c = function1;
        this.d = function2;
    }

    public final Object getValue() {
        xbk1 xbk1Var = this.e;
        if (xbk1Var != null) {
            return xbk1Var;
        }
        hce1 hce1Var = new hce1((rck1) this.b.invoke(), (eck1) this.c.invoke(), (esn) this.d.invoke());
        tka0 tka0Var = this.a;
        String strO = tka0Var.o();
        if (strO == null) {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        xbk1 xbk1VarT = hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0Var);
        this.e = xbk1VarT;
        return xbk1VarT;
    }

    public final boolean isInitialized() {
        return this.e != null;
    }
}
