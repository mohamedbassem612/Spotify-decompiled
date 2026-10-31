package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class itb1 implements ptb1 {
    public final String a;
    public final d761 b;
    public final String c;

    public itb1(String str, d761 d761Var, String str2) {
        this.a = str;
        this.b = d761Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itb1)) {
            return false;
        }
        itb1 itb1Var = (itb1) obj;
        return this.a.equals(itb1Var.a) && this.b.equals(itb1Var.b) && this.c.equals(itb1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.f(this.a.hashCode() * 31, this.b.a, 31);
    }
}
