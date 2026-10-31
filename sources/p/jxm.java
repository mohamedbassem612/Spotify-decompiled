package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jxm implements mxm {
    public final String a;
    public final c380 b;

    public jxm(String str, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxm)) {
            return false;
        }
        jxm jxmVar = (jxm) obj;
        return u890.j(this.a, jxmVar.a) && this.b.equals(jxmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
