package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pst {
    public final hux a;
    public final int b;
    public final int c;
    public final Integer d;

    public pst(hux huxVar, int i, int i2, Integer num) {
        this.a = huxVar;
        this.b = i;
        this.c = i2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pst)) {
            return false;
        }
        pst pstVar = (pst) obj;
        return u890.j(this.a, pstVar.a) && this.b == pstVar.b && this.c == pstVar.c && u890.j(this.d, pstVar.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.d;
        return iF + (num == null ? 0 : num.hashCode());
    }
}
