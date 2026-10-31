package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wyz0 {
    public final String a;
    public final int b;
    public final h290 c;

    public wyz0(int i, String str, h290 h290Var) {
        this.a = str;
        this.b = i;
        this.c = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyz0)) {
            return false;
        }
        wyz0 wyz0Var = (wyz0) obj;
        return this.a.equals(wyz0Var.a) && this.b == wyz0Var.b && this.c.equals(wyz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
