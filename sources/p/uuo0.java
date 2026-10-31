package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uuo0 extends zuo0 {
    public final boolean a;

    public uuo0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uuo0) && this.a == ((uuo0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
