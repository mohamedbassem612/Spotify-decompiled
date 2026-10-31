package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u4k {
    public final String a;
    public final fie1 b;
    public final Integer c;
    public final Integer d;
    public final Map e;

    public u4k(String str, fie1 fie1Var, Integer num, Integer num2, Map map) {
        this.a = str;
        this.b = fie1Var;
        this.c = num;
        this.d = num2;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4k)) {
            return false;
        }
        u4k u4kVar = (u4k) obj;
        return u890.j(this.a, u4kVar.a) && u890.j(this.b, u4kVar.b) && u890.j(this.c, u4kVar.c) && u890.j(this.d, u4kVar.d) && u890.j(this.e, u4kVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fie1 fie1Var = this.b;
        int iHashCode2 = (iHashCode + (fie1Var == null ? 0 : fie1Var.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
