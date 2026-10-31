package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661(with = irj1.class)
public final class grj1 {
    public static final frj1 Companion = new frj1();
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public grj1(String str, Integer num, Integer num2, Integer num3) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    public final Integer a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final Integer c() {
        return this.c;
    }

    public final Integer d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grj1)) {
            return false;
        }
        grj1 grj1Var = (grj1) obj;
        return u890.j(this.a, grj1Var.a) && u890.j(this.b, grj1Var.b) && u890.j(this.c, grj1Var.c) && u890.j(this.d, grj1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }
}
