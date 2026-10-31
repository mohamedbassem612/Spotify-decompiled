package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s77 implements t77 {
    public final String a;
    public final yud b;
    public final String c;

    public s77(String str, yud yudVar, String str2) {
        this.a = str;
        this.b = yudVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s77)) {
            return false;
        }
        s77 s77Var = (s77) obj;
        return u890.j(this.a, s77Var.a) && u890.j(this.b, s77Var.b) && this.c.equals(s77Var.c);
    }

    @Override // p.t77
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yud yudVar = this.b;
        return this.c.hashCode() + ((iHashCode + (yudVar == null ? 0 : yudVar.hashCode())) * 31);
    }
}
