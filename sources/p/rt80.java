package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rt80 extends jm5 {
    public final String d;
    public final int e;

    public rt80(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt80)) {
            return false;
        }
        rt80 rt80Var = (rt80) obj;
        return this.d.equals(rt80Var.d) && this.e == rt80Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
