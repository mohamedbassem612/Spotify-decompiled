package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mnj0 extends snj0 {
    public final String b;
    public final Long c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnj0(String str, Long l, int i) {
        super(false);
        l = (i & 2) != 0 ? null : l;
        boolean z = (i & 4) == 0;
        this.b = str;
        this.c = l;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnj0)) {
            return false;
        }
        mnj0 mnj0Var = (mnj0) obj;
        return u890.j(this.b, mnj0Var.b) && u890.j(this.c, mnj0Var.c) && this.d == mnj0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Long l = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }
}
