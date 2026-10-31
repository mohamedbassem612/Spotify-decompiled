package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yvi0 extends awi0 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;

    public yvi0(String str, String str2, String str3, String str4, String str5, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvi0)) {
            return false;
        }
        yvi0 yvi0Var = (yvi0) obj;
        return this.a.equals(yvi0Var.a) && this.b.equals(yvi0Var.b) && this.c.equals(yvi0Var.c) && this.d.equals(yvi0Var.d) && u890.j(this.e, yvi0Var.e) && u890.j(this.f, yvi0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
