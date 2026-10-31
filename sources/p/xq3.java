package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xq3 extends hr3 {
    public final boolean a;

    public xq3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq3) && this.a == ((xq3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
