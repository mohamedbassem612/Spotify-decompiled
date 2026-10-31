package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nii0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final n1x f;

    public nii0(String str, String str2, String str3, String str4, String str5, n1x n1xVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = n1xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nii0)) {
            return false;
        }
        nii0 nii0Var = (nii0) obj;
        return this.a.equals(nii0Var.a) && this.b.equals(nii0Var.b) && this.c.equals(nii0Var.c) && this.d.equals(nii0Var.d) && u890.j(this.e, nii0Var.e) && u890.j(this.f, nii0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        n1x n1xVar = this.f;
        return iHashCode + (n1xVar != null ? n1xVar.hashCode() : 0);
    }
}
