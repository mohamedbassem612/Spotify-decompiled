package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wm10 implements xm10 {
    public final float a;
    public final wmb0 b;
    public final zzq0 c;

    public wm10(float f, wmb0 wmb0Var, zzq0 zzq0Var) {
        this.a = f;
        this.b = wmb0Var;
        this.c = zzq0Var;
    }

    @Override // p.xm10
    public final wmb0 a() {
        return this.b;
    }

    @Override // p.xm10
    public final vzq0 b() {
        return this.c;
    }

    @Override // p.xm10
    public final float c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm10)) {
            return false;
        }
        wm10 wm10Var = (wm10) obj;
        return p3v.c(this.a, wm10Var.a) && this.b == wm10Var.b && this.c.equals(wm10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }
}
