package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ohn0 extends rhn0 {
    public final shn0 a;

    public ohn0(shn0 shn0Var) {
        this.a = shn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ohn0) && this.a == ((ohn0) obj).a;
    }

    public final int hashCode() {
        shn0 shn0Var = this.a;
        if (shn0Var == null) {
            return 0;
        }
        return shn0Var.hashCode();
    }
}
