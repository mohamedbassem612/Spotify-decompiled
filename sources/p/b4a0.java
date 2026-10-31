package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b4a0 implements g4a0 {
    public final re9 a;

    public b4a0(re9 re9Var) {
        this.a = re9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4a0) && this.a.equals(((b4a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
