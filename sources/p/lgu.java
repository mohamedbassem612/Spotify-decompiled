package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lgu implements qq60 {
    public final String a;
    public final op80 b;
    public final zgu c;

    public lgu(String str, op80 op80Var, zgu zguVar) {
        this.a = str;
        this.b = op80Var;
        this.c = zguVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgu)) {
            return false;
        }
        lgu lguVar = (lgu) obj;
        return this.a.equals(lguVar.a) && this.b.equals(lguVar.b) && this.c.equals(lguVar.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
