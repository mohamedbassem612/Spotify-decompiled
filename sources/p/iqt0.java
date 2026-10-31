package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iqt0 {
    public final boolean a;

    public iqt0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqt0) && this.a == ((iqt0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
