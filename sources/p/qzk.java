package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qzk {
    public final String a;
    public final String b;
    public final String c;

    public qzk(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzk)) {
            return false;
        }
        qzk qzkVar = (qzk) obj;
        return this.a.equals(qzkVar.a) && u890.j(this.b, qzkVar.b) && this.c.equals(qzkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
