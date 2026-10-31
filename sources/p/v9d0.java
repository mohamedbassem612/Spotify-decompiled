package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v9d0 {
    public final Integer a;
    public final boolean b;
    public final lax c;

    public v9d0(Integer num, boolean z, lax laxVar) {
        this.a = num;
        this.b = z;
        this.c = laxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9d0)) {
            return false;
        }
        v9d0 v9d0Var = (v9d0) obj;
        return u890.j(this.a, v9d0Var.a) && this.b == v9d0Var.b && u890.j(this.c, v9d0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.c.hashCode() + xcg1.g((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
    }
}
