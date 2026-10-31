package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ife0 {
    public final Integer a;
    public final Integer b;

    public ife0(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final Integer a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ife0)) {
            return false;
        }
        ife0 ife0Var = (ife0) obj;
        return u890.j(this.a, ife0Var.a) && u890.j(this.b, ife0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
