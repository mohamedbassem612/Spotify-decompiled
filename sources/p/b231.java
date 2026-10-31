package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b231 extends i231 {
    public final int a;
    public final int b;
    public final String c;

    public b231(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // p.i231
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b231)) {
            return false;
        }
        b231 b231Var = (b231) obj;
        return this.a == b231Var.a && this.b == b231Var.b && u890.j(this.c, b231Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, l1d.C(this.a) * 31, 31);
    }
}
