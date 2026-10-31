package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x60 {
    public final String a;

    public x60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x60) {
            return u890.j(this.a, ((x60) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
