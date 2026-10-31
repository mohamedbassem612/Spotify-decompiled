package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class usx0 extends ktx0 {
    public final String a;
    public final String b;

    public usx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usx0)) {
            return false;
        }
        usx0 usx0Var = (usx0) obj;
        return u890.j(this.a, usx0Var.a) && u890.j(this.b, usx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
