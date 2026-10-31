package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class emj0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;

    public emj0(String str, boolean z, String str2, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emj0)) {
            return false;
        }
        emj0 emj0Var = (emj0) obj;
        return this.a == emj0Var.a && u890.j(this.b, emj0Var.b) && u890.j(this.c, emj0Var.c) && this.d == emj0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
