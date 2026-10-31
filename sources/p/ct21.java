package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ct21 implements chu {
    public final String a;
    public final boolean b;

    public ct21(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct21)) {
            return false;
        }
        ct21 ct21Var = (ct21) obj;
        return u890.j(this.a, ct21Var.a) && this.b == ct21Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
