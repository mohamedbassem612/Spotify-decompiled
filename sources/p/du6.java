package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class du6 extends fu6 {
    public final String a;

    public du6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du6) && this.a.equals(((du6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
