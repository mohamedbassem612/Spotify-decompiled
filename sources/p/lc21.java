package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lc21 implements mc21 {
    public final String a;

    public lc21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc21) && u890.j(this.a, ((lc21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
