package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rtt {
    public final String a;
    public final luq0 b;
    public final f0u c;
    public final int d;

    public rtt(String str, luq0 luq0Var, f0u f0uVar, int i) {
        this.a = str;
        this.b = luq0Var;
        this.c = f0uVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtt)) {
            return false;
        }
        rtt rttVar = (rtt) obj;
        return this.a.equals(rttVar.a) && this.b == rttVar.b && this.c == rttVar.c && this.d == rttVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = this.d;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }
}
