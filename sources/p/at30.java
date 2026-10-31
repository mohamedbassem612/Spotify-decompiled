package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class at30 {
    public final String a;
    public final xlk1 b;

    public at30(String str, xlk1 xlk1Var) {
        this.a = str;
        this.b = xlk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at30)) {
            return false;
        }
        at30 at30Var = (at30) obj;
        return u890.j(this.a, at30Var.a) && this.b == at30Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
