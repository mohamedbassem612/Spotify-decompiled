package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y3l implements z3l {
    public final String a;

    public y3l(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3l) && this.a.equals(((y3l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
