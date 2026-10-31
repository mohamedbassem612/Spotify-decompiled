package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lo90 {
    public final boolean a;

    public lo90(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo90) && this.a == ((lo90) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
