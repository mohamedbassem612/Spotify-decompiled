package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y400 implements p600 {
    public final String a;
    public final boolean b;

    public y400(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y400)) {
            return false;
        }
        y400 y400Var = (y400) obj;
        return u890.j(this.a, y400Var.a) && this.b == y400Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
