package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ikh extends pkh {
    public final String b;
    public final int c;
    public final c380 d;

    public ikh(int i, String str, c380 c380Var) {
        super(fkh.e);
        this.b = str;
        this.c = i;
        this.d = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikh)) {
            return false;
        }
        ikh ikhVar = (ikh) obj;
        return this.b.equals(ikhVar.b) && this.c == ikhVar.c && u890.j(this.d, ikhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, this.b.hashCode() * 31, 31);
    }
}
