package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class omq0 extends ovo0 {
    public final String a;
    public final boolean b;

    public omq0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omq0)) {
            return false;
        }
        omq0 omq0Var = (omq0) obj;
        return u890.j(this.a, omq0Var.a) && this.b == omq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
