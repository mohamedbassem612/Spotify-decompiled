package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c271 extends hxo1 {
    public final String c;
    public final oz61 d;

    public c271(String str, oz61 oz61Var) {
        this.c = str;
        this.d = oz61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c271)) {
            return false;
        }
        c271 c271Var = (c271) obj;
        return this.c.equals(c271Var.c) && this.d.equals(c271Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String p() {
        return this.c;
    }
}
