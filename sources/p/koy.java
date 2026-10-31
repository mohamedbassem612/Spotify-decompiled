package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class koy {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final vpb1 e;

    public koy(String str, int i, String str2, String str3, vpb1 vpb1Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = vpb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koy)) {
            return false;
        }
        koy koyVar = (koy) obj;
        return u890.j(this.a, koyVar.a) && this.b == koyVar.b && this.c.equals(koyVar.c) && this.d.equals(koyVar.d) && u890.j(this.e, koyVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
