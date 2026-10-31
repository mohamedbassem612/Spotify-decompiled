package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fcr {
    public final hi a;

    public fcr(hi hiVar) {
        this.a = hiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fcr) && this.a.equals(((fcr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
