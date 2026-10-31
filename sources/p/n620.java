package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n620 {
    public final int a;
    public final float b;

    public n620(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n620)) {
            return false;
        }
        n620 n620Var = (n620) obj;
        return this.a == n620Var.a && Float.compare(this.b, n620Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
