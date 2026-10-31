package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class prq0 {
    public final boolean a;

    public prq0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prq0) && this.a == ((prq0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
