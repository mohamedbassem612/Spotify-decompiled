package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fpg {
    public final String a;

    public fpg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpg) && this.a.equals(((fpg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
