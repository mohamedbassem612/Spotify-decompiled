package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o371 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public o371(String str, boolean z, boolean z2, int i) {
        str = (i & 1) != 0 ? null : str;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o371)) {
            return false;
        }
        o371 o371Var = (o371) obj;
        return u890.j(this.a, o371Var.a) && this.b == o371Var.b && this.c == o371Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
