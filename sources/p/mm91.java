package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mm91 extends sqe {
    public final boolean d;

    public mm91(boolean z) {
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm91) && this.d == ((mm91) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }
}
