package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qat extends sat {
    public final String a;
    public final String b;
    public final String c;

    public qat(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qat)) {
            return false;
        }
        qat qatVar = (qat) obj;
        return this.a.equals(qatVar.a) && this.b.equals(qatVar.b) && this.c.equals(qatVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
