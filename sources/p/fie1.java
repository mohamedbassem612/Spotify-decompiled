package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fie1 {
    public final String a;
    public final int b;
    public final int c;

    public fie1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fie1)) {
            return false;
        }
        fie1 fie1Var = (fie1) obj;
        return this.a.equals(fie1Var.a) && this.b == fie1Var.b && this.c == fie1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
