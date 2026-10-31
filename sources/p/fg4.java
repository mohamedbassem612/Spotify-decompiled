package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fg4 {
    public final boolean a;

    public fg4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fg4) && this.a == ((fg4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
