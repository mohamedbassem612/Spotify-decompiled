package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m300 implements c700 {
    public final boolean a;

    public m300(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m300) && this.a == ((m300) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
