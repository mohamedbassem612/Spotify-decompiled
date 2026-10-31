package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g100 implements k600 {
    public final String a;

    public g100(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g100) && this.a.equals(((g100) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
