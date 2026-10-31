package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rnk implements snk {
    public final String a;

    public rnk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnk) && u890.j(this.a, ((rnk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
