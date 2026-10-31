package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wvh1 {
    public final String a;
    public final long b;
    public final rn21 c;
    public final uk7 d;

    public wvh1(String str, long j, rn21 rn21Var, uk7 uk7Var) {
        this.a = str;
        this.b = j;
        this.c = rn21Var;
        this.d = uk7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wvh1) {
            wvh1 wvh1Var = (wvh1) obj;
            if (this.a.equals(wvh1Var.a) && this.b == wvh1Var.b && this.c == wvh1Var.c && this.d.equals(wvh1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31)) * 31);
    }
}
