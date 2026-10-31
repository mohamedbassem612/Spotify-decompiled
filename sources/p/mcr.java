package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mcr implements ncr {
    public final lj a;

    public mcr(lj ljVar) {
        this.a = ljVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mcr) && this.a.equals(((mcr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
