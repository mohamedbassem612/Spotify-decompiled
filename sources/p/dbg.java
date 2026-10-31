package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dbg {
    public final gbg a;
    public final int b;

    public dbg(gbg gbgVar, int i) {
        this.a = gbgVar;
        this.b = i;
    }

    public final gbg a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbg)) {
            return false;
        }
        dbg dbgVar = (dbg) obj;
        return this.a.equals(dbgVar.a) && this.b == dbgVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
