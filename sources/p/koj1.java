package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class koj1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public koj1(int i, int i2, int i3, int i4, float f, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = str;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koj1)) {
            return false;
        }
        koj1 koj1Var = (koj1) obj;
        return this.a == koj1Var.a && this.b == koj1Var.b && this.c == koj1Var.c && this.d == koj1Var.d && Float.compare(this.e, koj1Var.e) == 0 && u890.j(this.f, koj1Var.f);
    }

    public final int hashCode() {
        int iF = x0d.f(kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e);
        String str = this.f;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
