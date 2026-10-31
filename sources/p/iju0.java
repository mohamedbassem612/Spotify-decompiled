package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iju0 implements kju0 {
    public final String a;
    public final String b;
    public final int c;

    public iju0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iju0)) {
            return false;
        }
        iju0 iju0Var = (iju0) obj;
        return u890.j(this.a, iju0Var.a) && u890.j(this.b, iju0Var.b) && this.c == iju0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
