package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qfo {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ofo e;
    public final boolean f;

    public qfo(String str, String str2, String str3, String str4, ofo ofoVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ofoVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfo)) {
            return false;
        }
        qfo qfoVar = (qfo) obj;
        return this.a.equals(qfoVar.a) && this.b.equals(qfoVar.b) && this.c.equals(qfoVar.c) && this.d.equals(qfoVar.d) && u890.j(this.e, qfoVar.e) && this.f == qfoVar.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        ofo ofoVar = this.e;
        return Boolean.hashCode(this.f) + ((iD + (ofoVar == null ? 0 : ofoVar.hashCode())) * 31);
    }
}
