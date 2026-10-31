package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dcd1 {
    public final boolean a;

    public dcd1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dcd1) && this.a == ((dcd1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
