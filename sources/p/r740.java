package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r740 {
    public final String a;
    public final boolean b;

    public r740(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r740)) {
            return false;
        }
        r740 r740Var = (r740) obj;
        return u890.j(this.a, r740Var.a) && this.b == r740Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
