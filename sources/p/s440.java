package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s440 implements x440 {
    public final String a;
    public final boolean b;

    public s440(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s440)) {
            return false;
        }
        s440 s440Var = (s440) obj;
        return u890.j(this.a, s440Var.a) && this.b == s440Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
