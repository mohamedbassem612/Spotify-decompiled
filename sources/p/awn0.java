package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class awn0 implements cwn0 {
    public final ou80 a;

    public awn0(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final ou80 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awn0) && u890.j(this.a, ((awn0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
