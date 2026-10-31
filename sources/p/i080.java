package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i080 {
    public final String a;
    public final int b;
    public final int c;

    public i080(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i080)) {
            return false;
        }
        i080 i080Var = (i080) obj;
        return this.a.equals(i080Var.a) && this.b == i080Var.b && this.c == i080Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
