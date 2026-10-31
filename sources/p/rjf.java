package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rjf extends pto1 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public rjf(String str, boolean z, boolean z2, boolean z3) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjf)) {
            return false;
        }
        rjf rjfVar = (rjf) obj;
        return u890.j(this.b, rjfVar.b) && this.c == rjfVar.c && this.d == rjfVar.d && this.e == rjfVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    @Override // p.pto1
    public final boolean r() {
        return this.d;
    }

    @Override // p.pto1
    public final boolean t() {
        return this.e;
    }

    @Override // p.pto1
    public final boolean u() {
        return this.c;
    }
}
