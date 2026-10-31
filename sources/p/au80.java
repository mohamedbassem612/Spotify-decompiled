package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class au80 extends j82 {
    public final String d;
    public final int e;

    public au80(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au80)) {
            return false;
        }
        au80 au80Var = (au80) obj;
        return u890.j(this.d, au80Var.d) && this.e == au80Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
