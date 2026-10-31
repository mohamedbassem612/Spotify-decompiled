package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l200 implements b600 {
    public final boolean a;

    public l200(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l200) && this.a == ((l200) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
