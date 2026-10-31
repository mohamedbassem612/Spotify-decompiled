package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e271 extends hxo1 {
    public final String c;
    public final qz61 d;
    public final oz61 e;

    public e271(String str, qz61 qz61Var, oz61 oz61Var) {
        this.c = str;
        this.d = qz61Var;
        this.e = oz61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e271)) {
            return false;
        }
        e271 e271Var = (e271) obj;
        return this.c.equals(e271Var.c) && u890.j(this.d, e271Var.d) && this.e.equals(e271Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String p() {
        return this.c;
    }
}
