package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iec {
    public final gec a;
    public final gec b;
    public final mr20 c;
    public final int d;
    public final eec e;

    public iec(gec gecVar, gec gecVar2, mr20 mr20Var, int i, eec eecVar) {
        this.a = gecVar;
        this.b = gecVar2;
        this.c = mr20Var;
        this.d = i;
        this.e = eecVar;
    }

    public static iec a(iec iecVar, gec gecVar, gec gecVar2, eec eecVar, int i) {
        if ((i & 1) != 0) {
            gecVar = iecVar.a;
        }
        gec gecVar3 = gecVar;
        if ((i & 2) != 0) {
            gecVar2 = iecVar.b;
        }
        gec gecVar4 = gecVar2;
        mr20 mr20Var = iecVar.c;
        int i2 = iecVar.d;
        if ((i & 16) != 0) {
            eecVar = iecVar.e;
        }
        iecVar.getClass();
        return new iec(gecVar3, gecVar4, mr20Var, i2, eecVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iec)) {
            return false;
        }
        iec iecVar = (iec) obj;
        return this.a.equals(iecVar.a) && this.b.equals(iecVar.b) && this.c.equals(iecVar.c) && this.d == iecVar.d && this.e.equals(iecVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = this.d;
        return this.e.hashCode() + ((iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31);
    }
}
