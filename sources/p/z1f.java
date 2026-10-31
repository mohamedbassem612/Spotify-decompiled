package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z1f implements q3f {
    public final String a;

    public z1f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1f) && this.a.equals(((z1f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
