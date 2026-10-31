package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h980 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final joj0 d;
    public final String e;

    public h980(Object obj, Object obj2, joj0 joj0Var, joj0 joj0Var2, String str) {
        this.a = obj;
        this.b = obj2;
        this.c = joj0Var;
        this.d = joj0Var2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h980)) {
            return false;
        }
        h980 h980Var = (h980) obj;
        return this.a.equals(h980Var.a) && u890.j(this.b, h980Var.b) && u890.j(this.c, h980Var.c) && this.d.equals(h980Var.d) && this.e.equals(h980Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.a);
        sb.append(", compilerVersion=");
        sb.append(this.b);
        sb.append(", languageVersion=");
        sb.append(this.c);
        sb.append(", expectedVersion=");
        sb.append(this.d);
        sb.append(", filePath=");
        return gvg.k(sb, this.e, ')');
    }
}
