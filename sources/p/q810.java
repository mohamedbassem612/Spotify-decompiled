package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q810 {
    public final y4w a;
    public final Integer b;

    public q810(y4w y4wVar, Integer num) {
        this.a = y4wVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q810)) {
            return false;
        }
        q810 q810Var = (q810) obj;
        return this.a.equals(q810Var.a) && u890.j(this.b, q810Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
