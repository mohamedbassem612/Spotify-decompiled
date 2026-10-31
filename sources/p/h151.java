package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h151 extends q151 {
    public final boolean a;
    public final String b;

    public h151(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h151)) {
            return false;
        }
        h151 h151Var = (h151) obj;
        return this.a == h151Var.a && u890.j(this.b, h151Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
