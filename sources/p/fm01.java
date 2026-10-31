package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fm01 {
    public final int a;
    public final String b;

    public fm01(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm01)) {
            return false;
        }
        fm01 fm01Var = (fm01) obj;
        return this.a == fm01Var.a && u890.j(this.b, fm01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
