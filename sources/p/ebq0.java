package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ebq0 {
    public final boolean a;

    public ebq0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebq0) && this.a == ((ebq0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Integer.hashCode(2131232428) * 31);
    }
}
