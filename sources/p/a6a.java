package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a6a {
    public final int a;
    public final Integer b;
    public final String c;
    public final boolean d;

    public a6a(int i, Integer num, String str, int i2) {
        num = (i2 & 2) != 0 ? null : num;
        str = (i2 & 4) != 0 ? null : str;
        boolean z = (i2 & 8) == 0;
        this.a = i;
        this.b = num;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6a)) {
            return false;
        }
        a6a a6aVar = (a6a) obj;
        return this.a == a6aVar.a && u890.j(this.b, a6aVar.b) && u890.j(this.c, a6aVar.c) && this.d == a6aVar.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
