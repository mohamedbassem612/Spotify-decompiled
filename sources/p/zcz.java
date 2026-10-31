package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zcz {
    public final String a;
    public final int b;
    public final int c;
    public final Integer d;
    public final boolean e;

    public zcz(String str, int i, int i2, Integer num, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = num;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcz)) {
            return false;
        }
        zcz zczVar = (zcz) obj;
        return u890.j(this.a, zczVar.a) && this.b == zczVar.b && this.c == zczVar.c && u890.j(this.d, zczVar.d) && this.e == zczVar.e;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iF + (num == null ? 0 : num.hashCode())) * 31);
    }
}
