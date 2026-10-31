package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pog extends tog {
    public final i8g1 a;
    public final o571 b;
    public final int c;

    static {
        idd1 idd1Var = o571.c;
    }

    public pog(i8g1 i8g1Var, o571 o571Var, int i) {
        this.a = i8g1Var;
        this.b = o571Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pog)) {
            return false;
        }
        pog pogVar = (pog) obj;
        return u890.j(this.a, pogVar.a) && u890.j(this.b, pogVar.b) && this.c == pogVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
