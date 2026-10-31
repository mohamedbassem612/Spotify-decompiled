package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zqz0 {
    public final int a;
    public final float b;
    public final float c;
    public final zzq0 d;
    public final zzq0 e;

    public zqz0(int i, float f, float f2, zzq0 zzq0Var, zzq0 zzq0Var2) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = zzq0Var;
        this.e = zzq0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqz0)) {
            return false;
        }
        zqz0 zqz0Var = (zqz0) obj;
        return this.a == zqz0Var.a && Float.compare(this.b, zqz0Var.b) == 0 && Float.compare(this.c, zqz0Var.c) == 0 && this.d.equals(zqz0Var.d) && this.e.equals(zqz0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + x0d.f(x0d.f(l1d.C(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }
}
