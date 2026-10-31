package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pqy0 implements vqy0 {
    public final boolean a;

    public pqy0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqy0) && this.a == ((pqy0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
