package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xnk0 implements bok0 {
    public final int a;

    public xnk0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xnk0) && this.a == ((xnk0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
