package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rfn implements ugn {
    public final boolean a;

    public rfn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfn) && this.a == ((rfn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
