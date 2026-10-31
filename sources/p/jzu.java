package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jzu {
    public final Float a;
    public final Float b;
    public final hzu c;
    public final boolean d;

    public jzu(Float f, Float f2, hzu hzuVar, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = hzuVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzu)) {
            return false;
        }
        jzu jzuVar = (jzu) obj;
        return u890.j(this.a, jzuVar.a) && u890.j(this.b, jzuVar.b) && u890.j(this.c, jzuVar.c) && this.d == jzuVar.d;
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.b;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        hzu hzuVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (hzuVar != null ? hzuVar.hashCode() : 0)) * 31);
    }
}
