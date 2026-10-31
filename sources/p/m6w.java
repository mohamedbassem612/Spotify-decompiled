package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m6w implements o6w {
    public final boolean a;

    public m6w(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6w) && this.a == ((m6w) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
