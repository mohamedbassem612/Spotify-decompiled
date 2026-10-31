package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class beh extends feh {
    public final String a;

    public beh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof beh) {
            return ((beh) obj).a.equals(this.a);
        }
        return false;
    }

    public final String g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return gvg.k(new StringBuilder("Failure{reasons="), this.a, '}');
    }
}
