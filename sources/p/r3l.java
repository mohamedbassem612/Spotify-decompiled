package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r3l {
    public final boolean a;

    public r3l(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3l) && this.a == ((r3l) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
