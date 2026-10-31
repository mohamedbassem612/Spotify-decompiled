package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class geb {
    public final fjt a;
    public final mgo1 b;
    public final jus0 c;
    public final String d;

    public geb(fjt fjtVar, mgo1 mgo1Var, jus0 jus0Var, String str) {
        this.a = fjtVar;
        this.b = mgo1Var;
        this.c = jus0Var;
        this.d = str;
    }

    public static geb a(geb gebVar, mgo1 mgo1Var, jus0 jus0Var, String str, int i) {
        fjt fjtVar = gebVar.a;
        if ((i & 2) != 0) {
            mgo1Var = gebVar.b;
        }
        if ((i & 4) != 0) {
            jus0Var = gebVar.c;
        }
        if ((i & 8) != 0) {
            str = gebVar.d;
        }
        gebVar.getClass();
        return new geb(fjtVar, mgo1Var, jus0Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof geb)) {
            return false;
        }
        geb gebVar = (geb) obj;
        return this.a == gebVar.a && u890.j(this.b, gebVar.b) && this.c == gebVar.c && u890.j(this.d, gebVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ geb(fjt fjtVar) {
        this(fjtVar, lyw.c, jus0.a, null);
    }
}
