package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xtv {
    public final boolean a;

    public xtv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xtv) && this.a == ((xtv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
