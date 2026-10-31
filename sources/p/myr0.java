package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class myr0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public myr0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myr0)) {
            return false;
        }
        myr0 myr0Var = (myr0) obj;
        return this.a.equals(myr0Var.a) && this.b == myr0Var.b && this.c == myr0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
