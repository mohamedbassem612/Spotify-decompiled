package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gv80 extends lm5 {
    public final String d;
    public final boolean e;

    public gv80(String str, boolean z) {
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv80)) {
            return false;
        }
        gv80 gv80Var = (gv80) obj;
        return u890.j(this.d, gv80Var.d) && this.e == gv80Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
