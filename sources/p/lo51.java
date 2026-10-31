package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lo51 {
    public final boolean a;

    public lo51(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo51) && this.a == ((lo51) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
