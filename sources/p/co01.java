package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class co01 {
    public final String a;
    public final String b;
    public final int c;

    public co01(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co01)) {
            return false;
        }
        co01 co01Var = (co01) obj;
        return u890.j(this.a, co01Var.a) && u890.j(this.b, co01Var.b) && this.c == co01Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
