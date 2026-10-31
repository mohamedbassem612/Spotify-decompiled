package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ep61 {
    public final boolean a;
    public final String b;
    public final boolean c;

    public ep61(boolean z, String str, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public static ep61 a(ep61 ep61Var, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            z = ep61Var.a;
        }
        if ((i & 2) != 0) {
            str = ep61Var.b;
        }
        return new ep61(z, str, (i & 4) != 0 ? ep61Var.c : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep61)) {
            return false;
        }
        ep61 ep61Var = (ep61) obj;
        return this.a == ep61Var.a && this.b.equals(ep61Var.b) && this.c == ep61Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
