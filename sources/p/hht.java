package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hht {
    public final String a;

    public hht(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hht) && this.a.equals(((hht) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
