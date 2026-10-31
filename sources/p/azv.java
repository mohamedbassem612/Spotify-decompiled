package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class azv extends crn1 {
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public azv(String str, String str2, Integer num, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azv)) {
            return false;
        }
        azv azvVar = (azv) obj;
        return u890.j(this.b, azvVar.b) && u890.j(this.c, azvVar.c) && u890.j(this.d, azvVar.d) && u890.j(this.e, azvVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
