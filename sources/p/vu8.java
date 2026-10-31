package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vu8 {
    public final String a;
    public final boolean b;

    public vu8(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu8)) {
            return false;
        }
        vu8 vu8Var = (vu8) obj;
        return u890.j(this.a, vu8Var.a) && this.b == vu8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
