package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ocv implements vcv {
    public final wcv a;
    public final ou80 b;

    public ocv(wcv wcvVar, ou80 ou80Var) {
        this.a = wcvVar;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocv)) {
            return false;
        }
        ocv ocvVar = (ocv) obj;
        return this.a.equals(ocvVar.a) && this.b.equals(ocvVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
