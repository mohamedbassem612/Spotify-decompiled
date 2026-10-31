package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ot30 extends ut30 {
    public final boolean a;

    public ot30(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot30) && this.a == ((ot30) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
