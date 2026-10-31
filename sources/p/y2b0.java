package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y2b0 extends k3b0 {
    public final String a;
    public final String b;

    public y2b0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2b0)) {
            return false;
        }
        y2b0 y2b0Var = (y2b0) obj;
        return u890.j(this.a, y2b0Var.a) && u890.j(this.b, y2b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.a);
        sb.append('.');
        return gvg.k(sb, this.b, ')');
    }
}
