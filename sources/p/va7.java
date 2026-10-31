package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class va7 implements za7 {
    public final ou80 a;

    public va7(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va7) && u890.j(this.a, ((va7) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
