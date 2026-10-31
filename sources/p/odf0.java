package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class odf0 {
    public final fcf0 a;
    public final Throwable b;

    public odf0(fcf0 fcf0Var) {
        this.a = fcf0Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odf0)) {
            return false;
        }
        odf0 odf0Var = (odf0) obj;
        fcf0 fcf0Var = this.a;
        if (fcf0Var != null && fcf0Var == odf0Var.a) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || odf0Var.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public odf0(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
