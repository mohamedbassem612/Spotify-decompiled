package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dxo0 implements eyo0 {
    public final String a;
    public final String b;

    public dxo0(String str, String str2) {
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
        if (!(obj instanceof dxo0)) {
            return false;
        }
        dxo0 dxo0Var = (dxo0) obj;
        if (!u890.j(this.a, dxo0Var.a) || !u890.j(this.b, dxo0Var.b)) {
            return false;
        }
        z6x z6xVar = z6x.a;
        return z6xVar.equals(z6xVar);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 1;
    }
}
