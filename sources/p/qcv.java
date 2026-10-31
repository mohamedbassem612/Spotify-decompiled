package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qcv implements vcv {
    public final xlq0 a;
    public final String b;

    public qcv(xlq0 xlq0Var, String str) {
        this.a = xlq0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcv)) {
            return false;
        }
        qcv qcvVar = (qcv) obj;
        return this.a.equals(qcvVar.a) && u890.j(this.b, qcvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
