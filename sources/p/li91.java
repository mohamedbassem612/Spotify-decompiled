package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class li91 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final skg d;
    public final boolean e;

    public li91(boolean z, boolean z2, boolean z3, skg skgVar, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = skgVar;
        this.e = z4;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public final skg d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li91)) {
            return false;
        }
        li91 li91Var = (li91) obj;
        return this.a == li91Var.a && this.b == li91Var.b && this.c == li91Var.c && this.d == li91Var.d && this.e == li91Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }
}
