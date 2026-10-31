package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o54 {
    public final boolean a;

    public o54(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o54) && this.a == ((o54) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
