package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uvl1 {
    public final String a;
    public final int b;

    public uvl1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvl1)) {
            return false;
        }
        uvl1 uvl1Var = (uvl1) obj;
        return u890.j(this.a, uvl1Var.a) && this.b == uvl1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return l1d.o(sb, this.b, ')');
    }
}
