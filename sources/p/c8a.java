package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c8a extends d8a {
    public final int a;

    public c8a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8a) && this.a == ((c8a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
