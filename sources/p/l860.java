package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l860 implements n860 {
    public final boolean a;

    public l860(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l860) && this.a == ((l860) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
