package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vqi0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final byte[] f;
    public final r281 g;

    public vqi0(String str, String str2, int i, String str3, String str4, byte[] bArr, r281 r281Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = bArr;
        this.g = r281Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqi0)) {
            return false;
        }
        vqi0 vqi0Var = (vqi0) obj;
        return this.a.equals(vqi0Var.a) && this.b.equals(vqi0Var.b) && this.c == vqi0Var.c && this.d.equals(vqi0Var.d) && u890.j(this.e, vqi0Var.e) && u890.j(this.f, vqi0Var.f) && u890.j(this.g, vqi0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        byte[] bArr = this.f;
        int iHashCode = (iD + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        r281 r281Var = this.g;
        return iHashCode + (r281Var != null ? r281Var.hashCode() : 0);
    }
}
