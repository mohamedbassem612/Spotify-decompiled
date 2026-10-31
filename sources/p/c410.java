package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c410 extends e410 {
    public final String a;
    public final String b;

    public c410(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c410)) {
            return false;
        }
        c410 c410Var = (c410) obj;
        return this.a.equals(c410Var.a) && u890.j(this.b, c410Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(2131232313) + cy30.d(this.a.hashCode() * 961, 31, this.b);
    }
}
