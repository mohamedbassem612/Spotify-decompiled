package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t630 {
    public final boolean a;
    public final String b;
    public final boolean c;

    public t630(boolean z, String str, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t630)) {
            return false;
        }
        t630 t630Var = (t630) obj;
        return this.a == t630Var.a && u890.j(this.b, t630Var.b) && this.c == t630Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
