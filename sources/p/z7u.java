package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z7u {
    public final String a;

    public z7u(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7u) && this.a.equals(((z7u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
