package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dbw extends w0o1 {
    public final String c;
    public final String d;

    public dbw(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbw)) {
            return false;
        }
        dbw dbwVar = (dbw) obj;
        return u890.j(this.c, dbwVar.c) && u890.j(this.d, dbwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
