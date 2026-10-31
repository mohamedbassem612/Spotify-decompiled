package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oxn0 implements pxn0 {
    public final String a;
    public final boolean b;

    public oxn0(String str, boolean z) {
        this.a = str;
        this.b = z;
        if (str.length() > 0) {
            return;
        }
        hhg1.n("A non-empty URL must be provided.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxn0)) {
            return false;
        }
        oxn0 oxn0Var = (oxn0) obj;
        return u890.j(this.a, oxn0Var.a) && this.b == oxn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
