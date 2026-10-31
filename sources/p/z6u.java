package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z6u {
    public final String a;

    public z6u(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6u) && this.a.equals(((z6u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
