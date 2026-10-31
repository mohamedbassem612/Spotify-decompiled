package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a401 {
    public final z301 a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ a401(z301 z301Var, int i) {
        this((i & 1) != 0 ? new z301((String) null, (c380) null, 0, (String) null, (String) null, false, 0, 255) : z301Var, false, false);
    }

    public static a401 a(a401 a401Var, z301 z301Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z301Var = a401Var.a;
        }
        if ((i & 2) != 0) {
            z = a401Var.b;
        }
        if ((i & 4) != 0) {
            z2 = a401Var.c;
        }
        a401Var.getClass();
        return new a401(z301Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a401)) {
            return false;
        }
        a401 a401Var = (a401) obj;
        return u890.j(this.a, a401Var.a) && this.b == a401Var.b && this.c == a401Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public a401(z301 z301Var, boolean z, boolean z2) {
        this.a = z301Var;
        this.b = z;
        this.c = z2;
    }
}
