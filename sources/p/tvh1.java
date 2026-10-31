package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tvh1 {
    public final float a;
    public final float b;
    public final float c;
    public final zzq0 d;
    public final iu30 e;
    public final iu30 f;

    public tvh1(float f, float f2, float f3, zzq0 zzq0Var, iu30 iu30Var, iu30 iu30Var2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = zzq0Var;
        this.e = iu30Var;
        this.f = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvh1)) {
            return false;
        }
        tvh1 tvh1Var = (tvh1) obj;
        return p3v.c(this.a, tvh1Var.a) && p3v.c(this.b, tvh1Var.b) && p3v.c(this.c, tvh1Var.c) && this.d.equals(tvh1Var.d) && u890.j(this.e, tvh1Var.e) && u890.j(this.f, tvh1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ktd.g(this.e, (this.d.hashCode() + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31);
    }
}
