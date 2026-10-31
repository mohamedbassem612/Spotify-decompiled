package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class buu {
    public final h2v a;
    public final String b;
    public final fuu c;
    public final boolean d;
    public final fuu e;
    public final fuu f;

    public buu(h2v h2vVar, String str, fuu fuuVar, boolean z, fuu fuuVar2, fuu fuuVar3) {
        this.a = h2vVar;
        this.b = str;
        this.c = fuuVar;
        this.d = z;
        this.e = fuuVar2;
        this.f = fuuVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buu)) {
            return false;
        }
        buu buuVar = (buu) obj;
        return this.a.equals(buuVar.a) && u890.j(this.b, buuVar.b) && this.c.equals(buuVar.c) && this.d == buuVar.d && this.e.equals(buuVar.e) && this.f.equals(buuVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + xcg1.g((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d)) * 31);
    }
}
