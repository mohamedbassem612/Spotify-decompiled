package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c9f1 {
    public final String a;
    public final rwm b;
    public final Integer c;

    public c9f1(String str, rwm rwmVar, Integer num) {
        this.a = str;
        this.b = rwmVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9f1)) {
            return false;
        }
        c9f1 c9f1Var = (c9f1) obj;
        return u890.j(this.a, c9f1Var.a) && this.b == c9f1Var.b && u890.j(this.c, c9f1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rwm rwmVar = this.b;
        int iHashCode2 = (iHashCode + (rwmVar == null ? 0 : rwmVar.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
