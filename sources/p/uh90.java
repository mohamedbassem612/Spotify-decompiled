package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uh90 extends li90 {
    public final String a;
    public final Integer b;
    public final Integer c;

    public uh90(Integer num, String str, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final Integer a() {
        return this.c;
    }

    public final Integer b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh90)) {
            return false;
        }
        uh90 uh90Var = (uh90) obj;
        return u890.j(this.a, uh90Var.a) && u890.j(this.b, uh90Var.b) && u890.j(this.c, uh90Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
