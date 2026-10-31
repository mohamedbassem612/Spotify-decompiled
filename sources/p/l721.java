package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l721 implements m721 {
    public final boolean a;

    public l721(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l721) && this.a == ((l721) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
