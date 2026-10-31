package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class apf {
    public final float a;
    public final kuo1 b;

    public apf(float f, kuo1 kuo1Var) {
        this.a = f;
        this.b = kuo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apf)) {
            return false;
        }
        apf apfVar = (apf) obj;
        return Float.compare(this.a, apfVar.a) == 0 && this.b.equals(apfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }
}
