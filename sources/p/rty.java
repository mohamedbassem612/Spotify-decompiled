package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rty {
    public static final rty e = new rty(null, 15);
    public final Integer a;
    public final boolean b;
    public final vty c;
    public final qty d;

    public rty(pty ptyVar, int i) {
        Integer num = (i & 1) != 0 ? null : 3;
        boolean z = (i & 2) != 0;
        vty vtyVar = (i & 4) != 0 ? tty.a : uty.a;
        qty qtyVar = (i & 8) != 0 ? oty.a : ptyVar;
        this.a = num;
        this.b = z;
        this.c = vtyVar;
        this.d = qtyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rty)) {
            return false;
        }
        rty rtyVar = (rty) obj;
        return u890.j(this.a, rtyVar.a) && this.b == rtyVar.b && this.c.equals(rtyVar.c) && this.d.equals(rtyVar.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g((num == null ? 0 : num.hashCode()) * 31, 31, this.b)) * 31);
    }
}
