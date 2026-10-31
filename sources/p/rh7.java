package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rh7 {
    public final int a;

    public rh7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh7) && this.a == ((rh7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
