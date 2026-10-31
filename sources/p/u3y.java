package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u3y {
    public final int a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public u3y(String str, int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    public static u3y a(u3y u3yVar, int i, String str, int i2) {
        if ((i2 & 1) != 0) {
            i = u3yVar.a;
        }
        boolean z = (i2 & 2) != 0 ? u3yVar.b : true;
        if ((i2 & 4) != 0) {
            str = u3yVar.c;
        }
        return new u3y(str, i, z, (i2 & 8) != 0 ? u3yVar.d : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3y)) {
            return false;
        }
        u3y u3yVar = (u3y) obj;
        return this.a == u3yVar.a && this.b == u3yVar.b && this.c.equals(u3yVar.c) && this.d == u3yVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(xcg1.g(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
    }
}
