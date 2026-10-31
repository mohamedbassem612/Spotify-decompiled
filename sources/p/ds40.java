package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ds40 {
    public final int a;
    public final int b;
    public final String c;

    public ds40(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds40)) {
            return false;
        }
        ds40 ds40Var = (ds40) obj;
        return this.a == ds40Var.a && this.b == ds40Var.b && u890.j(this.c, ds40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, kaa0.f(this.a, 1407408653, 31), 31);
    }
}
