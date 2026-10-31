package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e09 extends nin {
    public final String a;

    public e09(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nin)) {
            return false;
        }
        return this.a.equals(((e09) ((nin) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return l1d.n(this.a, "}", new StringBuilder("Log{content="));
    }
}
