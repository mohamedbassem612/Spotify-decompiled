package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gul implements cwl {
    public final s63 a;

    public gul(s63 s63Var) {
        this.a = s63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gul) && this.a.equals(((gul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
