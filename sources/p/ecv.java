package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ecv {
    public final xpw a;
    public final cx0 b;
    public final xe01 c;
    public final v7v d;

    public ecv(hdv hdvVar, cx0 cx0Var, xe01 xe01Var, v7v v7vVar) {
        this.a = hdvVar;
        this.b = cx0Var;
        this.c = xe01Var;
        this.d = v7vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ecv) {
            ecv ecvVar = (ecv) obj;
            return this.a.equals(ecvVar.a) && this.b == ecvVar.b && this.c == ecvVar.c && this.d == ecvVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
