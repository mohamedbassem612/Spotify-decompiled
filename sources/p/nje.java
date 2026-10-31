package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nje {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;

    public nje(String str, String str2, String str3, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nje)) {
            return false;
        }
        nje njeVar = (nje) obj;
        return u890.j(this.a, njeVar.a) && u890.j(this.b, njeVar.b) && u890.j(this.c, njeVar.c) && u890.j(this.d, njeVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }
}
