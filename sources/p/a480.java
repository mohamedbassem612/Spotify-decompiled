package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a480 {
    public final boolean a;
    public final boolean b;
    public final float c;
    public final int d;
    public final int e;
    public final String f;

    public a480(boolean z, boolean z2, float f, int i, int i2, String str) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a480)) {
            return false;
        }
        a480 a480Var = (a480) obj;
        return this.a == a480Var.a && this.b == a480Var.b && Float.compare(this.c, a480Var.c) == 0 && this.d == a480Var.d && this.e == a480Var.e && u890.j(this.f, a480Var.f);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, kaa0.f(this.d, x0d.f(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31);
        String str = this.f;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ a480(boolean z) {
        this(false, z, 0.0f, 0, 0, null);
    }
}
