package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xcd1 {
    public final String a;
    public final Float b;
    public final Float c;

    public xcd1(String str, Float f, Float f2) {
        this.a = str;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcd1)) {
            return false;
        }
        xcd1 xcd1Var = (xcd1) obj;
        return u890.j(this.a, xcd1Var.a) && u890.j(this.b, xcd1Var.b) && u890.j(this.c, xcd1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.c;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }
}
