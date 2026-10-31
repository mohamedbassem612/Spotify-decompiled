package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sg41 implements tg41 {
    public final float a;
    public final long b;
    public final long c;

    public sg41(float f, long j, long j2) {
        this.a = f;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg41)) {
            return false;
        }
        sg41 sg41Var = (sg41) obj;
        return Float.compare(this.a, sg41Var.a) == 0 && this.b == sg41Var.b && this.c == sg41Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(Float.hashCode(this.a) * 31, this.b, 31);
    }
}
