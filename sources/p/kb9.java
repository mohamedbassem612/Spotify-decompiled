package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kb9 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public kb9(String str, String str2, Integer num, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb9)) {
            return false;
        }
        kb9 kb9Var = (kb9) obj;
        return this.a.equals(kb9Var.a) && u890.j(this.b, kb9Var.b) && this.c.equals(kb9Var.c) && u890.j(this.d, kb9Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Integer num = this.d;
        return iD + (num != null ? num.hashCode() : 0);
    }
}
