package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sn7 {
    public final String a;
    public final boolean b;
    public final int c;

    public sn7(String str, int i, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn7)) {
            return false;
        }
        sn7 sn7Var = (sn7) obj;
        return this.a.equals(sn7Var.a) && this.b == sn7Var.b && this.c == sn7Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
