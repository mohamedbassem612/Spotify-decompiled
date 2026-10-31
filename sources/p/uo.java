package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uo implements ap {
    public final boolean a;

    public uo(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uo) && this.a == ((uo) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
