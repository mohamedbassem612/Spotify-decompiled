package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w200 implements y600 {
    public final String a;
    public final String b;

    public w200(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w200)) {
            return false;
        }
        w200 w200Var = (w200) obj;
        return u890.j(this.a, w200Var.a) && u890.j(this.b, w200Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
