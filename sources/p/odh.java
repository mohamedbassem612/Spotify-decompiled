package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class odh implements mdh {
    public final String a;
    public final String b;
    public final tv80 c;

    public odh(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    @Override // p.mdh
    public final String a() {
        return this.b;
    }

    @Override // p.sdh
    public final tv80 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odh)) {
            return false;
        }
        odh odhVar = (odh) obj;
        return u890.j(this.a, odhVar.a) && u890.j(this.b, odhVar.b) && this.c.equals(odhVar.c);
    }

    @Override // p.mdh
    public final String getContextUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
