package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dwi1 extends nyo1 {
    public final String c;
    public final String d;
    public final tv80 e;

    public dwi1(String str, String str2, tv80 tv80Var) {
        this.c = str;
        this.d = str2;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwi1)) {
            return false;
        }
        dwi1 dwi1Var = (dwi1) obj;
        return this.c.equals(dwi1Var.c) && this.d.equals(dwi1Var.d) && u890.j(this.e, dwi1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }
}
