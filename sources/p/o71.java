package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class o71 {
    public final int a;
    public final String b;
    public final Integer c;
    public final boolean d;

    public o71(int i, String str, Integer num, boolean z) {
        this.a = i;
        this.b = str;
        this.c = num;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o71)) {
            return false;
        }
        o71 o71Var = (o71) obj;
        return this.a == o71Var.a && u890.j(this.b, o71Var.b) && u890.j(this.c, o71Var.c) && this.d == o71Var.d;
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        String str = this.b;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.d);
    }
}
