package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m09 extends tin {
    public final String a;

    public m09(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tin)) {
            return false;
        }
        return this.a.equals(((m09) ((tin) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return l1d.n(this.a, "}", new StringBuilder("User{identifier="));
    }
}
