package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nvg {
    public final Integer a;
    public final String b;
    public final String c;
    public final Long d;

    public nvg(Integer num, String str, String str2, Long l) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = l;
    }

    public final String a() {
        return this.b;
    }

    public final Integer b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final Long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvg)) {
            return false;
        }
        nvg nvgVar = (nvg) obj;
        return u890.j(this.a, nvgVar.a) && u890.j(this.b, nvgVar.b) && u890.j(this.c, nvgVar.c) && u890.j(this.d, nvgVar.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "Broadcasts(id=" + this.a + ", from=" + this.b + ", deviceId=" + this.c + ", createdAt=" + this.d + ")";
    }
}
