package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ikm0 implements lkm0 {
    public final String a;
    public final int b;

    public ikm0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikm0)) {
            return false;
        }
        ikm0 ikm0Var = (ikm0) obj;
        return u890.j(this.a, ikm0Var.a) && this.b == ikm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
