package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sjf extends pto1 {
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public sjf(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjf)) {
            return false;
        }
        sjf sjfVar = (sjf) obj;
        return this.b == sjfVar.b && this.c == sjfVar.c && this.d == sjfVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    @Override // p.pto1
    public final boolean r() {
        return this.c;
    }

    @Override // p.pto1
    public final boolean t() {
        return this.d;
    }

    @Override // p.pto1
    public final boolean u() {
        return this.b;
    }
}
