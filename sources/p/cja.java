package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cja {
    public final dja a;
    public final String b;

    public cja(dja djaVar, String str) {
        this.a = djaVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cja)) {
            return false;
        }
        cja cjaVar = (cja) obj;
        return this.a == cjaVar.a && u890.j(this.b, cjaVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ cja() {
        this(dja.a, null);
    }
}
