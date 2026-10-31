package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uov0 implements vov0 {
    public final String a;
    public final String b;
    public final boolean c;

    public uov0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uov0)) {
            return false;
        }
        uov0 uov0Var = (uov0) obj;
        return u890.j(this.a, uov0Var.a) && u890.j(this.b, uov0Var.b) && this.c == uov0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
