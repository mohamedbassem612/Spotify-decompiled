package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eq0 {
    public final String a;
    public final boolean b;

    public eq0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq0)) {
            return false;
        }
        eq0 eq0Var = (eq0) obj;
        return this.a.equals(eq0Var.a) && this.b == eq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
