package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z8z {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final c821 f;
    public final String g;

    public /* synthetic */ z8z(boolean z, boolean z2, boolean z3, c821 c821Var, int i) {
        this((i & 1) != 0 ? false : z, true, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0, (i & 32) != 0 ? b821.a : c821Var, null);
    }

    public static z8z a(z8z z8zVar, String str) {
        boolean z = z8zVar.a;
        boolean z2 = z8zVar.b;
        boolean z3 = z8zVar.c;
        boolean z4 = z8zVar.d;
        boolean z5 = z8zVar.e;
        c821 c821Var = z8zVar.f;
        z8zVar.getClass();
        return new z8z(z, z2, z3, z4, z5, c821Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8z)) {
            return false;
        }
        z8z z8zVar = (z8z) obj;
        return this.a == z8zVar.a && this.b == z8zVar.b && this.c == z8zVar.c && this.d == z8zVar.d && this.e == z8zVar.e && u890.j(this.f, z8zVar.f) && u890.j(this.g, z8zVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        String str = this.g;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public z8z(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, c821 c821Var, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = c821Var;
        this.g = str;
    }
}
