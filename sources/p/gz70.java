package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gz70 implements hz70 {
    public final jgd0 a;

    public gz70(jgd0 jgd0Var) {
        this.a = jgd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz70) && this.a == ((gz70) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
