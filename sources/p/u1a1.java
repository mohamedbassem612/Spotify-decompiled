package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u1a1 implements q2a1 {
    public final boolean a;

    public u1a1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1a1) && this.a == ((u1a1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
