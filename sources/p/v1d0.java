package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v1d0 implements x1d0 {
    public final irn0 a;

    public v1d0(irn0 irn0Var) {
        this.a = irn0Var;
    }

    public final irn0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1d0) && u890.j(this.a, ((v1d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
