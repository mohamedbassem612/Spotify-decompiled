package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jgz implements acr0 {
    public final w8r0 a;
    public final w2 b;

    public jgz(w8r0 w8r0Var, w2 w2Var) {
        this.a = w8r0Var;
        this.b = w2Var;
    }

    public final Set a() {
        return this.b.b;
    }

    public final Class b() {
        return biz.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        eiz eizVarF = this.b.f(s4b1Var);
        return new eiz(eizVarF.a, eizVarF.b, eizVarF.c, eizVarF.d, eizVarF.e, true);
    }

    public final e6w0 d() {
        return new b6w0(false);
    }

    public final Set e() {
        return w7x.a;
    }

    public final String getDescription() {
        return "Page Match error bottom sheet when no match is found";
    }

    public final boolean isEnabled() {
        return this.a.a();
    }
}
