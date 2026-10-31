package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pdh implements sdh {
    public final String a;
    public final String b;
    public final tv80 c;

    public pdh(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final tv80 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdh)) {
            return false;
        }
        pdh pdhVar = (pdh) obj;
        return this.a.equals(pdhVar.a) && this.b.equals(pdhVar.b) && this.c.equals(pdhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
