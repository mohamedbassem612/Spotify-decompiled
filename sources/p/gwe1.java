package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gwe1 {
    public final String a;
    public final int b;
    public final int c;

    public gwe1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwe1)) {
            return false;
        }
        gwe1 gwe1Var = (gwe1) obj;
        return this.a.equals(gwe1Var.a) && this.b == gwe1Var.b && this.c == gwe1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
