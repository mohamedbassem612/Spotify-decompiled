package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ka60 implements la60 {
    public final String a;
    public final za60 b;
    public final za60 c;
    public final za60 d;

    public ka60(String str, za60 za60Var, za60 za60Var2, za60 za60Var3) {
        this.a = str;
        this.b = za60Var;
        this.c = za60Var2;
        this.d = za60Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka60)) {
            return false;
        }
        ka60 ka60Var = (ka60) obj;
        return this.a.equals(ka60Var.a) && this.b.equals(ka60Var.b) && this.c.equals(ka60Var.c) && this.d.equals(ka60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
