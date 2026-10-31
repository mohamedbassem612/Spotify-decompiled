package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yxc0 {
    public final String a;
    public final h290 b;

    public yxc0(String str, h290 h290Var) {
        this.a = str;
        this.b = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxc0)) {
            return false;
        }
        yxc0 yxc0Var = (yxc0) obj;
        return this.a.equals(yxc0Var.a) && this.b.equals(yxc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
