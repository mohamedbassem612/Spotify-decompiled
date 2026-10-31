package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g2j0 implements h2j0 {
    public final String a;

    public g2j0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2j0) && u890.j(this.a, ((g2j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
