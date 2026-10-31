package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h880 implements k880 {
    public final int a;
    public final String b;

    public h880(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h880)) {
            return false;
        }
        h880 h880Var = (h880) obj;
        return this.a == h880Var.a && u890.j(this.b, h880Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        String str = this.b;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
