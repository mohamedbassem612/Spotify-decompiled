package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hd90 extends kd90 {
    public final boolean a;

    public hd90(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd90) && this.a == ((hd90) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
