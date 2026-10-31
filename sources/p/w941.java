package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w941 {
    public final String a;
    public final Integer b;
    public final String c;

    public w941(String str, String str2, Integer num) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w941)) {
            return false;
        }
        w941 w941Var = (w941) obj;
        return u890.j(this.a, w941Var.a) && u890.j(this.b, w941Var.b) && u890.j(this.c, w941Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
