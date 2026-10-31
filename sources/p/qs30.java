package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qs30 {
    public final String a;
    public final boolean b;

    public qs30(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs30)) {
            return false;
        }
        qs30 qs30Var = (qs30) obj;
        return u890.j(this.a, qs30Var.a) && this.b == qs30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
