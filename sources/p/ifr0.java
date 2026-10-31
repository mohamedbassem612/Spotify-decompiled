package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ifr0 {
    public final String a;
    public final rwm b;
    public final Integer c;

    public ifr0(String str, rwm rwmVar, Integer num) {
        this.a = str;
        this.b = rwmVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifr0)) {
            return false;
        }
        ifr0 ifr0Var = (ifr0) obj;
        return u890.j(this.a, ifr0Var.a) && this.b == ifr0Var.b && u890.j(this.c, ifr0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rwm rwmVar = this.b;
        int iHashCode2 = (iHashCode + (rwmVar == null ? 0 : rwmVar.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
