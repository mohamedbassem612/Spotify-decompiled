package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kwp0 extends fbp1 {
    public final int c;

    public kwp0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwp0) && this.c == ((kwp0) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
