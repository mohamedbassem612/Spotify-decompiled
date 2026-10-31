package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mlh {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;

    public mlh(String str, String str2, String str3, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlh)) {
            return false;
        }
        mlh mlhVar = (mlh) obj;
        return this.a.equals(mlhVar.a) && u890.j(this.b, mlhVar.b) && u890.j(this.c, mlhVar.c) && u890.j(this.d, mlhVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        return iD + (l == null ? 0 : l.hashCode());
    }
}
