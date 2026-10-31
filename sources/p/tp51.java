package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tp51 {
    public final String a;
    public final int b;

    public tp51(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp51)) {
            return false;
        }
        tp51 tp51Var = (tp51) obj;
        return u890.j(this.a, tp51Var.a) && this.b == tp51Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
