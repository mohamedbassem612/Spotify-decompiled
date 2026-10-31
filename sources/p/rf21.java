package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rf21 {
    public final String a;
    public final ksl b;
    public final dzo1 c;

    public rf21(String str, ksl kslVar, dzo1 dzo1Var) {
        this.a = str;
        this.b = kslVar;
        this.c = dzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf21)) {
            return false;
        }
        rf21 rf21Var = (rf21) obj;
        return u890.j(this.a, rf21Var.a) && this.b.equals(rf21Var.b) && this.c.equals(rf21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
