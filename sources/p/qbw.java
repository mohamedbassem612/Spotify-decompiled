package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qbw {
    public final String a;
    public final String b;
    public final String c;
    public final qo10 d;

    public qbw(String str, String str2, String str3, qo10 qo10Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qo10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbw)) {
            return false;
        }
        qbw qbwVar = (qbw) obj;
        return u890.j(this.a, qbwVar.a) && u890.j(this.b, qbwVar.b) && u890.j(this.c, qbwVar.c) && this.d.equals(qbwVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
