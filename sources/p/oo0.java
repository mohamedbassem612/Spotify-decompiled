package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oo0 implements zo0 {
    public final int a;
    public final String b;

    public oo0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0)) {
            return false;
        }
        oo0 oo0Var = (oo0) obj;
        return this.a == oo0Var.a && u890.j(this.b, oo0Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        String str = this.b;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
