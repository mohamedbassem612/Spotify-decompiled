package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r3s0 {
    public final String a;
    public final ugf b;

    public r3s0(String str, ugf ugfVar) {
        this.a = str;
        this.b = ugfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3s0)) {
            return false;
        }
        r3s0 r3s0Var = (r3s0) obj;
        return u890.j(this.a, r3s0Var.a) && this.b == r3s0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
