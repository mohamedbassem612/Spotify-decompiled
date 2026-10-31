package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class srl {
    public final int a;
    public final long b;
    public final int c;
    public final ghk1 d;

    public srl(int i, long j, int i2, ghk1 ghk1Var) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = ghk1Var;
    }

    public final int a() {
        return this.a;
    }

    public final ghk1 b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srl)) {
            return false;
        }
        srl srlVar = (srl) obj;
        return this.a == srlVar.a && this.b == srlVar.b && this.c == srlVar.c && u890.j(this.d, srlVar.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cy30.f(Integer.hashCode(this.a) * 31, this.b, 31), 31);
        ghk1 ghk1Var = this.d;
        return iK + (ghk1Var == null ? 0 : ghk1Var.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", type=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "null" : "VIEW_DISAPPEAR";
        } else {
            str = "VIEW_APPEAR";
        }
        sb.append(str);
        sb.append(", structureCompat=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
