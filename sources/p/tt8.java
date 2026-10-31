package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tt8 extends wt8 {
    public final boolean a;

    public tt8(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt8) && this.a == ((tt8) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
