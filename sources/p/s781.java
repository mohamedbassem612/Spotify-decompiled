package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s781 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final Integer e;
    public final int f;

    public s781(String str, String str2, String str3, List list, Integer num, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = num;
        this.f = i;
    }

    public static s781 a(s781 s781Var, String str) {
        String str2 = s781Var.a;
        String str3 = s781Var.b;
        List list = s781Var.d;
        Integer num = s781Var.e;
        int i = s781Var.f;
        s781Var.getClass();
        return new s781(str2, str3, str, list, num, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s781)) {
            return false;
        }
        s781 s781Var = (s781) obj;
        return u890.j(this.a, s781Var.a) && u890.j(this.b, s781Var.b) && u890.j(this.c, s781Var.c) && u890.j(this.d, s781Var.d) && u890.j(this.e, s781Var.e) && this.f == s781Var.f;
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        return l1d.C(this.f) + ((iB + (num == null ? 0 : num.hashCode())) * 31);
    }
}
