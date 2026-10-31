package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x731 {
    public final String a;
    public final vnr0 b;
    public final String c;
    public final String d;
    public final v731 e;
    public final w731 f;
    public final u731 g;

    public x731(String str, vnr0 vnr0Var, String str2, String str3, v731 v731Var, w731 w731Var, u731 u731Var) {
        this.a = str;
        this.b = vnr0Var;
        this.c = str2;
        this.d = str3;
        this.e = v731Var;
        this.f = w731Var;
        this.g = u731Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x731)) {
            return false;
        }
        x731 x731Var = (x731) obj;
        return u890.j(this.a, x731Var.a) && this.b.equals(x731Var.b) && u890.j(this.c, x731Var.c) && u890.j(this.d, x731Var.d) && this.e.equals(x731Var.e) && this.f.equals(x731Var.f) && this.g.equals(x731Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }
}
