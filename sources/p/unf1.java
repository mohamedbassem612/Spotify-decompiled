package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class unf1 {
    public final String a;
    public final int b;

    public unf1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unf1)) {
            return false;
        }
        unf1 unf1Var = (unf1) obj;
        return this.a.equals(unf1Var.a) && this.b == unf1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
