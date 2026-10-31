package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hcr {
    public final hi a;

    public hcr(hi hiVar) {
        this.a = hiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcr) && u890.j(this.a, ((hcr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
