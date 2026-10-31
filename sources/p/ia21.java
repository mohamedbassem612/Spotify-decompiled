package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ia21 {
    public final String a;
    public final boolean b;

    public ia21(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia21)) {
            return false;
        }
        ia21 ia21Var = (ia21) obj;
        return this.a.equals(ia21Var.a) && this.b == ia21Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
