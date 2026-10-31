package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xp8 {
    public final wq8 a;
    public final String b;

    public xp8(String str, wq8 wq8Var) {
        this.a = wq8Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp8)) {
            return false;
        }
        xp8 xp8Var = (xp8) obj;
        return u890.j(this.a, xp8Var.a) && this.b.equals(xp8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
