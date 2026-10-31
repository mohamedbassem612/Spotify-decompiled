package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x5f implements r6f {
    public final String a;

    public x5f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5f) && this.a.equals(((x5f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
