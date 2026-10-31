package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hh8 {
    public final String a;

    public hh8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh8) && this.a.equals(((hh8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 623937421;
    }
}
