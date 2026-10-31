package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v400 implements y600 {
    public final p2c0 a;
    public final boolean b;

    public v400(p2c0 p2c0Var, boolean z) {
        this.a = p2c0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v400)) {
            return false;
        }
        v400 v400Var = (v400) obj;
        return this.a.equals(v400Var.a) && this.b == v400Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
