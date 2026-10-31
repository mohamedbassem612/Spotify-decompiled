package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q7y {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public q7y(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7y)) {
            return false;
        }
        q7y q7yVar = (q7y) obj;
        return this.a.equals(q7yVar.a) && this.b.equals(q7yVar.b) && this.c.equals(q7yVar.c) && this.d.equals(q7yVar.d) && this.e.equals(q7yVar.e) && u890.j(this.f, q7yVar.f) && u890.j(this.g, q7yVar.g) && this.h.equals(q7yVar.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return this.h.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
