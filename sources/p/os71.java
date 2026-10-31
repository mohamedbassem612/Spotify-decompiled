package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class os71 {
    public final String a;
    public final List b;

    public os71(String str, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os71)) {
            return false;
        }
        os71 os71Var = (os71) obj;
        return u890.j(this.a, os71Var.a) && this.b.equals(os71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
