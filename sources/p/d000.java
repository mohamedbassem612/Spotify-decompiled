package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d000 implements c700 {
    public final boolean a;

    public d000(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d000) && this.a == ((d000) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
