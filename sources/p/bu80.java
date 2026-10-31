package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bu80 extends j82 {
    public final String d;
    public final int e;

    public bu80(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu80)) {
            return false;
        }
        bu80 bu80Var = (bu80) obj;
        return u890.j(this.d, bu80Var.d) && this.e == bu80Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
