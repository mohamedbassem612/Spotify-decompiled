package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y871 extends rc2 {
    public final String d;
    public final String e;

    public y871(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y871)) {
            return false;
        }
        y871 y871Var = (y871) obj;
        return u890.j(this.d, y871Var.d) && this.e.equals(y871Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
