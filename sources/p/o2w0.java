package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o2w0 {
    public final z2w0 a;
    public final boolean b;
    public final boolean c;

    public o2w0(z2w0 z2w0Var, boolean z, boolean z2) {
        this.a = z2w0Var;
        this.b = z;
        this.c = z2;
    }

    public final z2w0 a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2w0)) {
            return false;
        }
        o2w0 o2w0Var = (o2w0) obj;
        return this.a.equals(o2w0Var.a) && this.b == o2w0Var.b && this.c == o2w0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
