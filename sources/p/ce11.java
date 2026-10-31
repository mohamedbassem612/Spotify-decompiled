package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ce11 {
    public final String a;
    public final boolean b;

    public ce11(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce11)) {
            return false;
        }
        ce11 ce11Var = (ce11) obj;
        return this.a.equals(ce11Var.a) && this.b == ce11Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
