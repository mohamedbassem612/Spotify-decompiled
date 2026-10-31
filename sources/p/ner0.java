package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ner0 implements qfr0, sfr0 {
    public final String a;
    public final String b;
    public final String c;
    public final h290 d;
    public final tfr0 e;

    public ner0(String str, String str2, String str3, h290 h290Var, tfr0 tfr0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = h290Var;
        this.e = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ner0)) {
            return false;
        }
        ner0 ner0Var = (ner0) obj;
        return u890.j(this.a, ner0Var.a) && this.b.equals(ner0Var.b) && u890.j(this.c, ner0Var.c) && this.d.equals(ner0Var.d) && this.e.equals(ner0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + kk0.g(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
