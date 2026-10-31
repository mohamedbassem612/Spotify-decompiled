package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hmb1 extends rob1 {
    public final String a;
    public final String b;
    public final Integer c;

    public hmb1(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmb1)) {
            return false;
        }
        hmb1 hmb1Var = (hmb1) obj;
        return u890.j(this.a, hmb1Var.a) && u890.j(this.b, hmb1Var.b) && u890.j(this.c, hmb1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Integer num = this.c;
        return iD + (num != null ? num.hashCode() : 0);
    }
}
