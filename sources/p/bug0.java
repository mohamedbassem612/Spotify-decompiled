package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bug0 {
    public final int a;
    public final int b;
    public final float c;
    public final String d;

    public bug0(float f, int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bug0)) {
            return false;
        }
        bug0 bug0Var = (bug0) obj;
        return this.a == bug0Var.a && this.b == bug0Var.b && Float.compare(this.c, bug0Var.c) == 0 && this.d.equals(bug0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x0d.f(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }
}
