package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c3z {
    public final boolean a;
    public final boolean b;
    public final Integer c;

    public c3z(boolean z, boolean z2, Integer num) {
        this.a = z;
        this.b = z2;
        this.c = num;
    }

    public static c3z a(c3z c3zVar, boolean z, boolean z2, Integer num, int i) {
        if ((i & 1) != 0) {
            z = c3zVar.a;
        }
        if ((i & 2) != 0) {
            z2 = c3zVar.b;
        }
        if ((i & 4) != 0) {
            num = c3zVar.c;
        }
        c3zVar.getClass();
        return new c3z(z, z2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3z)) {
            return false;
        }
        c3z c3zVar = (c3z) obj;
        return this.a == c3zVar.a && this.b == c3zVar.b && u890.j(this.c, c3zVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return iG + (num == null ? 0 : num.hashCode());
    }
}
