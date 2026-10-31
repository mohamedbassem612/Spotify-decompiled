package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i360 extends n360 {
    public final boolean b;
    public final String a = "";
    public final l360 c = l360.a;

    public i360(boolean z) {
        this.b = z;
    }

    public final l360 b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i360)) {
            return false;
        }
        i360 i360Var = (i360) obj;
        return this.a.equals(i360Var.a) && this.b == i360Var.b && this.c == i360Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 961, this.b);
    }
}
