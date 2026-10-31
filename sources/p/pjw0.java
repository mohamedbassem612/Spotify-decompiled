package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pjw0 implements ez00 {
    public final String a;
    public final njw0 b;
    public final String c;

    public pjw0(String str, njw0 njw0Var, String str2) {
        this.a = str;
        this.b = njw0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjw0)) {
            return false;
        }
        pjw0 pjw0Var = (pjw0) obj;
        return u890.j(this.a, pjw0Var.a) && this.b.equals(pjw0Var.b) && this.c.equals(pjw0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }
}
