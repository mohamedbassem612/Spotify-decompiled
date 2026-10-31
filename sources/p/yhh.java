package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yhh extends eih {
    public final boolean a;

    public yhh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhh) && this.a == ((yhh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
