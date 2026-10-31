package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fxo0 implements gxo0 {
    public final String a;
    public final String b;

    public fxo0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final List a() {
        return z6x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxo0)) {
            return false;
        }
        fxo0 fxo0Var = (fxo0) obj;
        if (!this.a.equals(fxo0Var.a) || !this.b.equals(fxo0Var.b)) {
            return false;
        }
        z6x z6xVar = z6x.a;
        return z6xVar.equals(z6xVar);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 1;
    }
}
