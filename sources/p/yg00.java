package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yg00 extends mh00 {
    public final String a;
    public final ou80 b;

    public yg00(String str, ou80 ou80Var) {
        this.a = str;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg00)) {
            return false;
        }
        yg00 yg00Var = (yg00) obj;
        return u890.j(this.a, yg00Var.a) && u890.j(this.b, yg00Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.a.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
