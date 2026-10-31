package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gec {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public gec(Integer num, Integer num2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
    }

    public static gec a(gec gecVar, String str, Integer num, int i) {
        if ((i & 1) != 0) {
            str = gecVar.a;
        }
        String str2 = gecVar.b;
        Integer num2 = gecVar.c;
        if ((i & 8) != 0) {
            num = gecVar.d;
        }
        return new gec(num2, num, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gec)) {
            return false;
        }
        gec gecVar = (gec) obj;
        return u890.j(this.a, gecVar.a) && u890.j(this.b, gecVar.b) && u890.j(this.c, gecVar.c) && u890.j(this.d, gecVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }
}
