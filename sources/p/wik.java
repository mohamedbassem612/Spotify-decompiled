package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wik {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final int e;
    public final Integer f;
    public final Integer g;

    public wik(String str, List list, String str2, String str3, int i, Integer num, Integer num2) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = num;
        this.g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wik)) {
            return false;
        }
        wik wikVar = (wik) obj;
        return u890.j(this.a, wikVar.a) && this.b.equals(wikVar.b) && u890.j(this.c, wikVar.c) && u890.j(this.d, wikVar.d) && this.e == wikVar.e && u890.j(this.f, wikVar.f) && u890.j(this.g, wikVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iB = f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iK = ab80.k(this.e, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Integer num = this.f;
        int iHashCode2 = (iK + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
