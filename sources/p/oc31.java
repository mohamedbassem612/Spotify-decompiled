package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oc31 {
    public final String a;
    public final boolean b;
    public final String c;

    public oc31(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc31)) {
            return false;
        }
        oc31 oc31Var = (oc31) obj;
        return u890.j(this.a, oc31Var.a) && this.b == oc31Var.b && this.c.equals(oc31Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
