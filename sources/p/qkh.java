package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qkh implements ukh {
    public final h290 a;
    public final String b;
    public final int c;
    public final boolean d;
    public final uwe1 e;

    public qkh(h290 h290Var, String str, int i, boolean z, uwe1 uwe1Var) {
        this.a = h290Var;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = uwe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkh)) {
            return false;
        }
        qkh qkhVar = (qkh) obj;
        return this.a.equals(qkhVar.a) && this.b.equals(qkhVar.b) && this.c == qkhVar.c && this.d == qkhVar.d && this.e.equals(qkhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }
}
