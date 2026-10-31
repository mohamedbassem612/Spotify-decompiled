package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mx61 {
    public final h8n a;
    public final h8n b;
    public final h8n c;
    public final h8n d;
    public final h8n e;
    public final h8n f;
    public final h8n g;
    public final h8n h;

    public mx61(h8n h8nVar, h8n h8nVar2, h8n h8nVar3, h8n h8nVar4, h8n h8nVar5) {
        cr31 cr31Var = nw61.e;
        cr31 cr31Var2 = nw61.g;
        cr31 cr31Var3 = nw61.h;
        this.a = h8nVar;
        this.b = h8nVar2;
        this.c = h8nVar3;
        this.d = h8nVar4;
        this.e = h8nVar5;
        this.f = cr31Var;
        this.g = cr31Var2;
        this.h = cr31Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx61)) {
            return false;
        }
        mx61 mx61Var = (mx61) obj;
        return u890.j(this.a, mx61Var.a) && u890.j(this.b, mx61Var.b) && u890.j(this.c, mx61Var.c) && u890.j(this.d, mx61Var.d) && u890.j(this.e, mx61Var.e) && u890.j(this.f, mx61Var.f) && u890.j(this.g, mx61Var.g) && u890.j(this.h, mx61Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
