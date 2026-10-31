package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rvt0 {
    public final String a;
    public final float b;
    public final long c;

    public rvt0(long j, String str, float f) {
        this.a = str;
        this.b = f;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvt0)) {
            return false;
        }
        rvt0 rvt0Var = (rvt0) obj;
        return u890.j(this.a, rvt0Var.a) && Float.compare(this.b, rvt0Var.b) == 0 && this.c == rvt0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + x0d.f(this.a.hashCode() * 31, 31, this.b);
    }
}
