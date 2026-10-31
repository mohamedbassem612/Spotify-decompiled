package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rmm extends xbk1 {
    public static final cp41 g = new cp41(z6x.a, false);
    public final fe41 b;
    public final dc31 c;
    public final kdn0 d;
    public final kdn0 e;
    public final rku f;

    public rmm(fe41 fe41Var, dc31 dc31Var) {
        this.b = fe41Var;
        this.c = dc31Var;
        kdn0 kdn0Var = new kdn0(g);
        this.d = kdn0Var;
        this.e = kdn0Var;
        this.f = new rku();
        z6x z6xVar = (List) fe41Var.b.s("CONTENT");
        V(z6xVar == null ? z6x.a : z6xVar);
    }

    public final void S() {
        this.f.a();
    }

    public final void T(String str) {
        String str2 = (String) this.b.b.s("MIX_ID");
        if (str2 == null) {
            str2 = "";
        }
        dc31 dc31Var = this.c;
        Completable completableIgnoreElements = ((Observable) dc31Var.b).map(new hr8((byte) 7, (Object) dc31Var, str2, str, true)).ignoreElements();
        completableIgnoreElements.getClass();
        this.f.b(completableIgnoreElements.o(Functions.h).subscribe(new qmm(this, (byte) 0)));
    }

    public final void U() {
        String str = (String) this.b.b.s("MIX_ID");
        if (str == null) {
            str = "";
        }
        this.f.b(dc31.f(this.c, str, false).subscribe(new qmm(this, (byte) 1)));
    }

    public final void V(List list) {
        this.d.j(new cp41(list, ((String) this.b.b.s("MIX_ID")) != null));
    }
}
