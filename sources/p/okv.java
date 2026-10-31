package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class okv {
    public final String a;

    public okv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okv) && this.a.equals(((okv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
