package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aen implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final ydn d;

    public aen(String str, String str2, String str3, ydn ydnVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ydnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aen)) {
            return false;
        }
        aen aenVar = (aen) obj;
        return u890.j(this.a, aenVar.a) && u890.j(this.b, aenVar.b) && u890.j(this.c, aenVar.c) && this.d.equals(aenVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
