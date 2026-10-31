package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tv70 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final byte[] f;

    public tv70(String str, String str2, ArrayList arrayList, String str3, String str4, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv70)) {
            return false;
        }
        tv70 tv70Var = (tv70) obj;
        return u890.j(this.a, tv70Var.a) && u890.j(this.b, tv70Var.b) && this.c.equals(tv70Var.c) && u890.j(this.d, tv70Var.d) && u890.j(this.e, tv70Var.e) && u890.j(this.f, tv70Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.f;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
