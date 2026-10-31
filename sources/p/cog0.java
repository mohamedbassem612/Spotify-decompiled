package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class cog0 implements h661 {
    public final String a;
    public final h661 b;
    public final h661 c;
    public final byte d;

    public cog0(String str, h661 h661Var, h661 h661Var2) {
        this.a = str;
        this.b = h661Var;
        this.c = h661Var2;
        this.d = (byte) 2;
    }

    public final int c(String str) {
        Integer numC0 = nhc1.c0(str);
        if (numC0 != null) {
            return numC0.intValue();
        }
        hhg1.n(str.concat(" is not a valid map index"));
        return 0;
    }

    public final int d() {
        return this.d;
    }

    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cog0)) {
            return false;
        }
        cog0 cog0Var = (cog0) obj;
        return u890.j(this.a, cog0Var.a) && u890.j(this.b, cog0Var.b) && u890.j(this.c, cog0Var.c);
    }

    public final List f(int i) {
        if (i >= 0) {
            return z6x.a;
        }
        hhg1.f(l1d.n(this.a, " expects only non-negative indices", cy30.r(i, "Illegal index ", ", ")));
        return null;
    }

    public final h661 g(int i) {
        if (i < 0) {
            hhg1.f(l1d.n(this.a, " expects only non-negative indices", cy30.r(i, "Illegal index ", ", ")));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        eg.m("Unreached");
        return null;
    }

    public final yoi1 getKind() {
        return vic1.h;
    }

    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        hhg1.f(l1d.n(this.a, " expects only non-negative indices", cy30.r(i, "Illegal index ", ", ")));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }

    public /* synthetic */ cog0(h661 h661Var, h661 h661Var2) {
        this("kotlin.collections.HashMap", h661Var, h661Var2);
    }
}
