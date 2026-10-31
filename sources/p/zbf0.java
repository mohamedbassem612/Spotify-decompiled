package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zbf0 extends bcf0 {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public zbf0(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
        this.c = num2;
    }

    public final float a(fcf0 fcf0Var) {
        Integer num = this.c;
        if (num == null) {
            return 1.0f;
        }
        return yoi1.o(num.intValue() / fcf0Var.m, 0.0f, 1.0f);
    }

    public final float b(fcf0 fcf0Var) {
        return yoi1.o(this.a.intValue() / fcf0Var.m, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbf0)) {
            return false;
        }
        zbf0 zbf0Var = (zbf0) obj;
        return this.a.equals(zbf0Var.a) && this.b.equals(zbf0Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + pze0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Frame(min=" + this.a + ", max=" + this.b + ", maxInclusive=true)";
    }
}
