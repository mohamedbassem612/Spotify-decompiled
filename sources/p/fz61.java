package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fz61 extends fuo1 {
    public final String b;
    public final String c;

    public fz61(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz61)) {
            return false;
        }
        fz61 fz61Var = (fz61) obj;
        return u890.j(this.b, fz61Var.b) && u890.j(this.c, fz61Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
