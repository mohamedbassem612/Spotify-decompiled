package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qbv {
    public final ak3 a;
    public final String b;
    public final boolean c;

    public qbv(ak3 ak3Var, String str, boolean z) {
        this.a = ak3Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbv)) {
            return false;
        }
        qbv qbvVar = (qbv) obj;
        return this.a == qbvVar.a && u890.j(this.b, qbvVar.b) && this.c == qbvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
