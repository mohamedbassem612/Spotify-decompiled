package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xz01 implements j011 {
    public final String a;
    public final String b;

    public xz01(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz01)) {
            return false;
        }
        xz01 xz01Var = (xz01) obj;
        return u890.j(this.a, xz01Var.a) && u890.j(this.b, xz01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
