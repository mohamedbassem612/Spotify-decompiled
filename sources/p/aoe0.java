package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aoe0 {
    public final String a;
    public final String b;
    public final int c;

    public aoe0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoe0)) {
            return false;
        }
        aoe0 aoe0Var = (aoe0) obj;
        return u890.j(this.a, aoe0Var.a) && u890.j(this.b, aoe0Var.b) && this.c == aoe0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
