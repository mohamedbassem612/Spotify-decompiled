package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ksz0 extends msz0 {
    public final boolean a;
    public final fsz0 b;
    public final Integer c;

    public ksz0(boolean z, fsz0 fsz0Var, Integer num) {
        this.a = z;
        this.b = fsz0Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksz0)) {
            return false;
        }
        ksz0 ksz0Var = (ksz0) obj;
        return this.a == ksz0Var.a && this.b.equals(ksz0Var.b) && u890.j(this.c, ksz0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
