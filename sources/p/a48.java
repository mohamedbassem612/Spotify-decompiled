package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a48 {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;

    public a48(String str, String str2, Integer num, String str3) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final Integer d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a48)) {
            return false;
        }
        a48 a48Var = (a48) obj;
        return u890.j(this.a, a48Var.a) && u890.j(this.b, a48Var.b) && u890.j(this.c, a48Var.c) && u890.j(this.d, a48Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ a48(String str, String str2, Integer num) {
        this(str, str2, num, UUID.randomUUID().toString());
    }
}
