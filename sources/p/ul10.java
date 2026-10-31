package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ul10 extends vl10 {
    public final String a;
    public final boolean b;

    public ul10(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul10)) {
            return false;
        }
        ul10 ul10Var = (ul10) obj;
        return u890.j(this.a, ul10Var.a) && this.b == ul10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
