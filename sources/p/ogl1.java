package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ogl1 {
    public final String a;
    public final ktl b;

    public ogl1(String str, ktl ktlVar) {
        this.a = str;
        this.b = ktlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogl1)) {
            return false;
        }
        ogl1 ogl1Var = (ogl1) obj;
        return u890.j(this.a, ogl1Var.a) && this.b == ogl1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public /* synthetic */ ogl1(String str) {
        this(str, ktl.a);
    }
}
