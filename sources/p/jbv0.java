package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jbv0 {
    public final String a;
    public final String b;
    public final String c;

    public jbv0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbv0)) {
            return false;
        }
        jbv0 jbv0Var = (jbv0) obj;
        if (!this.a.equals(jbv0Var.a) || !this.b.equals(jbv0Var.b)) {
            return false;
        }
        bgm bgmVar = bgm.c;
        return bgmVar.equals(bgmVar) && this.c.equals(jbv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 414161009) * 31);
    }
}
