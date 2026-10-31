package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m9t0 {
    public final String a;

    public m9t0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9t0) && u890.j(this.a, ((m9t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
