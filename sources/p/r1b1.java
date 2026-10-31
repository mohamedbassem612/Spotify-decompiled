package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r1b1 {
    public final boolean a;

    public r1b1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1b1) && this.a == ((r1b1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
