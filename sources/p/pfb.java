package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pfb {
    public final String a;
    public final String b;
    public final String c;

    public pfb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfb)) {
            return false;
        }
        String str = this.a;
        if (str != null) {
            if (!str.equals(((pfb) obj).a)) {
                return false;
            }
        } else if (((pfb) obj).a != null) {
            return false;
        }
        String str2 = this.b;
        if (str2 != null) {
            if (!str2.equals(((pfb) obj).b)) {
                return false;
            }
        } else if (((pfb) obj).b != null) {
            return false;
        }
        return this.c.equals(((pfb) obj).c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
