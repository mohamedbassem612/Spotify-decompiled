package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class egq0 {
    public final boolean a;

    public egq0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egq0) && this.a == ((egq0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Integer.hashCode(2131232428) * 31);
    }
}
