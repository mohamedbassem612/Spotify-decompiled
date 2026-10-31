package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ebg implements gbg {
    public final int a;

    public ebg(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebg) && this.a == ((ebg) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
