package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nh51 {
    public final String a;
    public final int b = 2;

    public nh51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh51)) {
            return false;
        }
        nh51 nh51Var = (nh51) obj;
        return u890.j(this.a, nh51Var.a) && this.b == nh51Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
