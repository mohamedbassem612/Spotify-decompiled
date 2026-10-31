package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class njn0 extends qjn0 {
    public final boolean a;

    public njn0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njn0) && this.a == ((njn0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
