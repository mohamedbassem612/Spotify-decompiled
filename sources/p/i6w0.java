package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i6w0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ i6w0(String str, int i) {
        this((i & 1) != 0 ? null : str, false, false);
    }

    public static i6w0 a(i6w0 i6w0Var, boolean z, boolean z2, int i) {
        String str = i6w0Var.a;
        if ((i & 2) != 0) {
            z = i6w0Var.b;
        }
        i6w0Var.getClass();
        return new i6w0(str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6w0)) {
            return false;
        }
        i6w0 i6w0Var = (i6w0) obj;
        return u890.j(this.a, i6w0Var.a) && this.b == i6w0Var.b && this.c == i6w0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public i6w0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }
}
