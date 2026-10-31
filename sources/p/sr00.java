package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sr00 {
    public final boolean a;
    public final boolean b;

    public sr00(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr00)) {
            return false;
        }
        sr00 sr00Var = (sr00) obj;
        return this.a == sr00Var.a && this.b == sr00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
