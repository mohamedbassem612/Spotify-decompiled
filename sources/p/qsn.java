package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qsn {
    public final String a;
    public final ega1 b;
    public final km90 c;

    public qsn(String str, ega1 ega1Var, km90 km90Var) {
        this.a = str;
        this.b = ega1Var;
        this.c = km90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsn)) {
            return false;
        }
        qsn qsnVar = (qsn) obj;
        return u890.j(this.a, qsnVar.a) && u890.j(this.b, qsnVar.b) && u890.j(this.c, qsnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
