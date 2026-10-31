package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o710 {
    public final String a;
    public final m210 b;
    public final boolean c;

    public o710(String str, m210 m210Var, boolean z) {
        this.a = str;
        this.b = m210Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o710)) {
            return false;
        }
        o710 o710Var = (o710) obj;
        return this.a.equals(o710Var.a) && u890.j(this.b, o710Var.b) && this.c == o710Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
