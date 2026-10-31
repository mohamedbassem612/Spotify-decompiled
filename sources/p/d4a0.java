package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d4a0 implements g4a0 {
    public final boolean a;

    public d4a0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4a0) && this.a == ((d4a0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
