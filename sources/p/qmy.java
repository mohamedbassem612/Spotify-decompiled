package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qmy {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public qmy(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmy)) {
            return false;
        }
        qmy qmyVar = (qmy) obj;
        return this.a.equals(qmyVar.a) && this.b.equals(qmyVar.b) && this.c.equals(qmyVar.c) && this.d == qmyVar.d && this.e == qmyVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
