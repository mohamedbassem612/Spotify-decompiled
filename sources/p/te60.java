package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class te60 {
    public final String a;
    public final ie60 b;
    public final Integer c;

    public te60(String str, ie60 ie60Var, Integer num) {
        this.a = str;
        this.b = ie60Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te60)) {
            return false;
        }
        te60 te60Var = (te60) obj;
        return u890.j(this.a, te60Var.a) && this.b.equals(te60Var.b) && u890.j(this.c, te60Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
