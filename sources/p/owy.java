package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class owy extends swy {
    public final ela1 a;
    public final u771 b;
    public final int c;
    public final String d;
    public final Throwable e;

    public owy(ela1 ela1Var, u771 u771Var, int i, String str, Throwable th) {
        this.a = ela1Var;
        this.b = u771Var;
        this.c = i;
        this.d = str;
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owy)) {
            return false;
        }
        owy owyVar = (owy) obj;
        return u890.j(this.a, owyVar.a) && u890.j(this.b, owyVar.b) && this.c == owyVar.c && this.d.equals(owyVar.d) && this.e.equals(owyVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(ab80.k(this.c, cfm0.g(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
