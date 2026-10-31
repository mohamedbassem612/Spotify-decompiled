package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hy80 implements iy80 {
    public final String a;
    public final boolean b;

    public hy80(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy80)) {
            return false;
        }
        hy80 hy80Var = (hy80) obj;
        return this.a.equals(hy80Var.a) && this.b == hy80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + xcg1.g(this.a.hashCode() * 31, 31, false);
    }
}
