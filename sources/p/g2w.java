package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g2w extends h2w {
    public final int a;
    public final boolean b;

    public g2w(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2w)) {
            return false;
        }
        g2w g2wVar = (g2w) obj;
        return this.a == g2wVar.a && this.b == g2wVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
