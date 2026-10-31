package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tst {
    public final String a;
    public final sst b;
    public final c380 c;
    public final int d;
    public final String e;
    public final String f;

    public tst(String str, sst sstVar, c9 c9Var, int i, String str2, String str3) {
        this.a = str;
        this.b = sstVar;
        this.c = c9Var;
        this.d = i;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tst)) {
            return false;
        }
        tst tstVar = (tst) obj;
        return this.a.equals(tstVar.a) && this.b.equals(tstVar.b) && this.c.equals(tstVar.c) && this.d == tstVar.d && u890.j(this.e, tstVar.e) && u890.j(this.f, tstVar.f);
    }

    public final int hashCode() {
        int iF = kaa0.f(2131954948, kaa0.f(this.d, kk0.f(this.c, kaa0.f(2131954949, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31);
        String str = this.e;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
