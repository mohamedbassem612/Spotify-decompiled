package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pn30 implements ez00 {
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;

    public pn30(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn30)) {
            return false;
        }
        pn30 pn30Var = (pn30) obj;
        return this.a == pn30Var.a && this.b == pn30Var.b && this.c.equals(pn30Var.c) && this.d.equals(pn30Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(xcg1.g(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
    }
}
