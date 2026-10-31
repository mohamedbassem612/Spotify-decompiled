package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class szt {
    public final ozt a;
    public final qzt b;
    public final pzt c;
    public final rzt d;

    public szt(ozt oztVar, qzt qztVar, pzt pztVar, rzt rztVar) {
        this.a = oztVar;
        this.b = qztVar;
        this.c = pztVar;
        this.d = rztVar;
    }

    public static szt a(szt sztVar, ozt oztVar, qzt qztVar, pzt pztVar, int i) {
        if ((i & 1) != 0) {
            oztVar = sztVar.a;
        }
        if ((i & 2) != 0) {
            qztVar = sztVar.b;
        }
        if ((i & 4) != 0) {
            pztVar = sztVar.c;
        }
        return new szt(oztVar, qztVar, pztVar, sztVar.d);
    }

    public final ozt b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szt)) {
            return false;
        }
        szt sztVar = (szt) obj;
        return this.a.equals(sztVar.a) && this.b.equals(sztVar.b) && this.c.equals(sztVar.c) && this.d.equals(sztVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31);
    }
}
