package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lp31 implements np31 {
    public final String a;

    public lp31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lp31) && u890.j(this.a, ((lp31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
