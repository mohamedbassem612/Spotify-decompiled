package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oif0 implements yif0 {
    public final int a;

    public oif0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oif0) && this.a == ((oif0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
