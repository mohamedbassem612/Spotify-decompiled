package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aj implements bj {
    public final hi a;
    public final String b;
    public final String c;

    public aj(hi hiVar, String str, String str2) {
        this.a = hiVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return u890.j(this.a, ajVar.a) && u890.j(this.b, ajVar.b) && this.c.equals(ajVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
