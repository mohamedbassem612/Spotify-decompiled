package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jac1 extends sio1 {
    public final int c;

    public jac1(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jac1) && this.c == ((jac1) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
