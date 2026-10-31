package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ck71 extends jk71 {
    public final int a;
    public final String b;
    public final boolean c;

    public ck71(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck71)) {
            return false;
        }
        ck71 ck71Var = (ck71) obj;
        return this.a == ck71Var.a && this.b.equals(ck71Var.b) && this.c == ck71Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
