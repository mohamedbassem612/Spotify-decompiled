package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lsn extends ti {
    public final String b;
    public final x6d1 c;

    public lsn(String str, x6d1 x6d1Var) {
        super(str);
        this.b = str;
        this.c = x6d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsn)) {
            return false;
        }
        lsn lsnVar = (lsn) obj;
        return this.b.equals(lsnVar.b) && this.c.equals(lsnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
