package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uqo {
    public final Integer a;
    public final String b;
    public final Integer c;
    public final b2i d;

    public uqo(Integer num, String str, Integer num2, ks21 ks21Var, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        num2 = (i & 4) != 0 ? null : num2;
        ks21Var = (i & 16) != 0 ? null : ks21Var;
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = ks21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqo)) {
            return false;
        }
        uqo uqoVar = (uqo) obj;
        return u890.j(this.a, uqoVar.a) && u890.j(this.b, uqoVar.b) && u890.j(this.c, uqoVar.c) && u890.j(this.d, uqoVar.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 961;
        b2i b2iVar = this.d;
        return iHashCode3 + (b2iVar != null ? b2iVar.hashCode() : 0);
    }
}
