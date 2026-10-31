package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qmw0 {
    public final String a;
    public final String b;
    public final Float c;

    public qmw0(String str, String str2, Float f) {
        this.a = str;
        this.b = str2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmw0)) {
            return false;
        }
        qmw0 qmw0Var = (qmw0) obj;
        return u890.j(this.a, qmw0Var.a) && u890.j(this.b, qmw0Var.b) && u890.j(this.c, qmw0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Float f = this.c;
        return iD + (f == null ? 0 : f.hashCode());
    }
}
