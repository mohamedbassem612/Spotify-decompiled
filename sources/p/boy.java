package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class boy implements coy {
    public final String a;
    public final ast0 b;
    public final y4m c;
    public final r840 d;
    public final tv80 e;

    public boy(String str, ast0 ast0Var, y4m y4mVar, r840 r840Var, tv80 tv80Var) {
        this.a = str;
        this.b = ast0Var;
        this.c = y4mVar;
        this.d = r840Var;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boy)) {
            return false;
        }
        boy boyVar = (boy) obj;
        return u890.j(this.a, boyVar.a) && this.b == boyVar.b && u890.j(this.c, boyVar.c) && u890.j(this.d, boyVar.d) && this.e.equals(boyVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
