package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e1e implements h1e {
    public final f27 a;

    public e1e(f27 f27Var) {
        this.a = f27Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1e) && this.a.equals(((e1e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
