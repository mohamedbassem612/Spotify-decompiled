package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iyl1 {
    public final String a;
    public final Integer b;
    public final weo c;

    public iyl1(String str, Integer num, weo weoVar) {
        this.a = str;
        this.b = num;
        this.c = weoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyl1)) {
            return false;
        }
        iyl1 iyl1Var = (iyl1) obj;
        return this.a.equals(iyl1Var.a) && u890.j(this.b, iyl1Var.b) && this.c == iyl1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
