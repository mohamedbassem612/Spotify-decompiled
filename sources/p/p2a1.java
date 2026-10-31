package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p2a1 implements q2a1 {
    public final boolean a;

    public p2a1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2a1) && this.a == ((p2a1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
