package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vqo implements sq61 {
    public final String a;
    public final uqo b;
    public final mr20 c;
    public final c0g d;
    public final kly0 e;
    public final tqo f;

    public vqo(String str, uqo uqoVar, mr20 mr20Var, c0g c0gVar, kly0 kly0Var, tqo tqoVar) {
        this.a = str;
        this.b = uqoVar;
        this.c = mr20Var;
        this.d = c0gVar;
        this.e = kly0Var;
        this.f = tqoVar;
        if (str.length() > 0) {
            return;
        }
        hhg1.n("A non-empty ID must be provided.");
        throw null;
    }

    public final c0g a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqo)) {
            return false;
        }
        vqo vqoVar = (vqo) obj;
        return u890.j(this.a, vqoVar.a) && u890.j(this.b, vqoVar.b) && u890.j(this.c, vqoVar.c) && u890.j(this.d, vqoVar.d) && u890.j(this.e, vqoVar.e) && u890.j(this.f, vqoVar.f);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final mr20 isVisible() {
        return this.c;
    }

    public vqo(String str, uqo uqoVar, c0g c0gVar, kly0 kly0Var, tqo tqoVar) {
        this(str, uqoVar, wbx0.X, c0gVar, kly0Var, tqoVar);
    }
}
