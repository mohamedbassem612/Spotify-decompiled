package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c0w extends l0w {
    public final int a;

    public c0w(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0w) && this.a == ((c0w) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
