package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xmt0 extends zmt0 {
    public final boolean a;

    public xmt0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmt0) && this.a == ((xmt0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
