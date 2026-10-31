package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k23 {
    public final axu0 a;

    public k23(axu0 axu0Var) {
        this.a = axu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k23) && this.a.equals(((k23) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
