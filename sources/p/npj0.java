package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class npj0 {
    public final String a;
    public final opj0 b;
    public final kqj0 c;

    public npj0(String str, opj0 opj0Var, kqj0 kqj0Var) {
        this.a = str;
        this.b = opj0Var;
        this.c = kqj0Var;
    }

    public final opj0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final kqj0 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npj0)) {
            return false;
        }
        npj0 npj0Var = (npj0) obj;
        return u890.j(this.a, npj0Var.a) && this.b == npj0Var.b && u890.j(this.c, npj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
