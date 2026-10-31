package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l9y implements s9y {
    public final int a;

    public l9y(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9y) && this.a == ((l9y) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
