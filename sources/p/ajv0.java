package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ajv0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public ajv0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajv0)) {
            return false;
        }
        ajv0 ajv0Var = (ajv0) obj;
        return u890.j(this.a, ajv0Var.a) && this.b == ajv0Var.b && this.c == ajv0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
