package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wcw {
    public final int a;

    public wcw(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wcw) && this.a == ((wcw) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) * 31;
    }
}
