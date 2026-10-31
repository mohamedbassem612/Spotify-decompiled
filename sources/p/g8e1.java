package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g8e1 {
    public final String a;

    public g8e1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8e1) && this.a.equals(((g8e1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
