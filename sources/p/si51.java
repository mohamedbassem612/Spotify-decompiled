package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class si51 {
    public final String a;
    public final int b;

    public si51(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si51)) {
            return false;
        }
        si51 si51Var = (si51) obj;
        return u890.j(this.a, si51Var.a) && this.b == si51Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
