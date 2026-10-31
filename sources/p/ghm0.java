package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ghm0 {
    public final String a;
    public final List b;

    public ghm0(String str, smc0 smc0Var) {
        this.a = str;
        this.b = smc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghm0)) {
            return false;
        }
        ghm0 ghm0Var = (ghm0) obj;
        return u890.j(this.a, ghm0Var.a) && this.b.equals(ghm0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
