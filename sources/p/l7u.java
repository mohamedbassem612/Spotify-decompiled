package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l7u {
    public final String a;

    public l7u(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7u) && this.a.equals(((l7u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
