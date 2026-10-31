package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class udm {
    public final ki90 a;
    public final int b;
    public final String c;

    public udm(ki90 ki90Var, int i, String str) {
        this.a = ki90Var;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udm)) {
            return false;
        }
        udm udmVar = (udm) obj;
        return u890.j(this.a, udmVar.a) && this.b == udmVar.b && u890.j(this.c, udmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
