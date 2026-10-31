package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x6m {
    public final String a;

    public x6m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6m) && this.a.equals(((x6m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
