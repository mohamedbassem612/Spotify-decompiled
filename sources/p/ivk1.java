package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ivk1 {
    public final byte[] a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ivk1(byte[] bArr, String str, String str2, String str3, String str4) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivk1)) {
            return false;
        }
        ivk1 ivk1Var = (ivk1) obj;
        return this.a.equals(ivk1Var.a) && u890.j(this.b, ivk1Var.b) && u890.j(this.c, ivk1Var.c) && u890.j(this.d, ivk1Var.d) && this.e.equals(ivk1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(Arrays.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
