package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mmt implements omt, mtd {
    public final wkt a;
    public final int b;

    public mmt(wkt wktVar, int i) {
        this.a = wktVar;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmt)) {
            return false;
        }
        mmt mmtVar = (mmt) obj;
        return this.a.equals(mmtVar.a) && this.b == mmtVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
