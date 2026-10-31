package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u4d1 implements g5d1 {
    public final boolean a;

    public u4d1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4d1) && this.a == ((u4d1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
