package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xs30 {
    public final String a;
    public final boolean b;

    public xs30(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs30)) {
            return false;
        }
        xs30 xs30Var = (xs30) obj;
        return u890.j(this.a, xs30Var.a) && this.b == xs30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
