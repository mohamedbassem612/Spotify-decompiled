package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ds00 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public ds00(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds00)) {
            return false;
        }
        ds00 ds00Var = (ds00) obj;
        return this.a == ds00Var.a && this.b == ds00Var.b && this.c == ds00Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(l1d.C(this.a) * 31, 31, this.b);
    }
}
