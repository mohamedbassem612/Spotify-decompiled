package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vdh1 implements xdh1 {
    public final String a;
    public final ynb0 b;
    public final boolean c;

    public vdh1(String str, ynb0 ynb0Var, boolean z) {
        this.a = str;
        this.b = ynb0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdh1)) {
            return false;
        }
        vdh1 vdh1Var = (vdh1) obj;
        return u890.j(this.a, vdh1Var.a) && u890.j(this.b, vdh1Var.b) && this.c == vdh1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
