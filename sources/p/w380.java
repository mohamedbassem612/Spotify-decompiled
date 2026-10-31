package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w380 implements yl01 {
    public final beg a;

    public w380(beg begVar) {
        this.a = begVar;
    }

    public final boolean equals(Object obj) {
        w380 w380Var = obj instanceof w380 ? (w380) obj : null;
        return this.a.equals(w380Var != null ? w380Var.a : null);
    }

    public final a8b0 getType() {
        return this.a.m();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Class{" + this.a.m() + '}';
    }
}
