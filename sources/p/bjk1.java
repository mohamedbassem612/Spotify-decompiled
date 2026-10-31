package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bjk1 {
    public final zuq0 a;
    public final Float b;
    public final String c;
    public final String d;
    public final cjk1 e;

    public bjk1(zuq0 zuq0Var, Float f, String str, String str2) {
        this.a = zuq0Var;
        this.b = f;
        this.c = str;
        this.d = str2;
        this.e = new cjk1(!zuq0Var.equals(xuq0.a), f != null, str != null, str2 != null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjk1)) {
            return false;
        }
        bjk1 bjk1Var = (bjk1) obj;
        return this.a.equals(bjk1Var.a) && u890.j(this.b, bjk1Var.b) && u890.j(this.c, bjk1Var.c) && u890.j(this.d, bjk1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
