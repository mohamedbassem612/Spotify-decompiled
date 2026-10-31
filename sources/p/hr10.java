package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hr10 {
    public final fr10 a;
    public final boolean b;
    public final boolean c;

    public hr10(fr10 fr10Var, boolean z, boolean z2) {
        this.a = fr10Var;
        this.b = z;
        this.c = z2;
    }

    public static hr10 a(hr10 hr10Var, fr10 fr10Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            fr10Var = hr10Var.a;
        }
        if ((i & 2) != 0) {
            z = hr10Var.b;
        }
        if ((i & 4) != 0) {
            z2 = hr10Var.c;
        }
        return new hr10(fr10Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr10)) {
            return false;
        }
        hr10 hr10Var = (hr10) obj;
        return this.a.equals(hr10Var.a) && this.b == hr10Var.b && this.c == hr10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
