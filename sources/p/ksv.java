package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ksv implements usv {
    public final boolean a;

    public ksv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksv) && this.a == ((ksv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
