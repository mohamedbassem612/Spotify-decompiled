package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xrz0 {
    public final int a;

    public xrz0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xrz0) && this.a == ((xrz0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
