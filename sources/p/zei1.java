package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zei1 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final Integer f;

    public zei1(String str, String str2, String str3, String str4, ArrayList arrayList, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zei1)) {
            return false;
        }
        zei1 zei1Var = (zei1) obj;
        return this.a.equals(zei1Var.a) && this.b.equals(zei1Var.b) && u890.j(this.c, zei1Var.c) && this.d.equals(zei1Var.d) && this.e.equals(zei1Var.e) && u890.j(this.f, zei1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = p3d1.f(this.e, cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31);
        Integer num = this.f;
        return iF + (num != null ? num.hashCode() : 0);
    }
}
