package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ejt implements dkt {
    public final boolean a;
    public final bk8 b;
    public final String c;
    public final String d;
    public final n5o e;

    public ejt(boolean z, bk8 bk8Var, String str, String str2, n5o n5oVar) {
        this.a = z;
        this.b = bk8Var;
        this.c = str;
        this.d = str2;
        this.e = n5oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejt)) {
            return false;
        }
        ejt ejtVar = (ejt) obj;
        return this.a == ejtVar.a && this.b == ejtVar.b && u890.j(this.c, ejtVar.c) && u890.j(this.d, ejtVar.d) && u890.j(this.e, ejtVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n5o n5oVar = this.e;
        return iHashCode3 + (n5oVar != null ? n5oVar.hashCode() : 0);
    }
}
