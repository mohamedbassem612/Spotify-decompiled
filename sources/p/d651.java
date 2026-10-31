package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d651 {
    public final p151 a;

    public d651(p151 p151Var) {
        this.a = p151Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d651) && this.a.equals(((d651) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
