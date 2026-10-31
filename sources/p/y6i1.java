package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y6i1 {
    public final String a;

    public y6i1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6i1) && u890.j(this.a, ((y6i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
