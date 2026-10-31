package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jjc1 {
    public final jo70 a;

    public jjc1(jo70 jo70Var) {
        this.a = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjc1) && u890.j(this.a, ((jjc1) obj).a);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        if (jo70Var == null) {
            return 0;
        }
        return jo70Var.hashCode();
    }
}
