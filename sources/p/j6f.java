package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j6f implements r6f {
    public final String a;
    public final String b;
    public final bc71 c;

    public j6f(String str, String str2, bc71 bc71Var) {
        this.a = str;
        this.b = str2;
        this.c = bc71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6f)) {
            return false;
        }
        j6f j6fVar = (j6f) obj;
        return this.a.equals(j6fVar.a) && u890.j(this.b, j6fVar.b) && this.c.equals(j6fVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
