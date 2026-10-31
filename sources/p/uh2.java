package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uh2 {
    public final int a;
    public final Integer b;

    public uh2(Integer num, int i) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh2)) {
            return false;
        }
        uh2 uh2Var = (uh2) obj;
        return this.a == uh2Var.a && u890.j(this.b, uh2Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
