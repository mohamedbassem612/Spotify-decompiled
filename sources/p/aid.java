package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aid {
    public final String a;
    public final String b;
    public final String c;

    public aid(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aid)) {
            return false;
        }
        aid aidVar = (aid) obj;
        return this.a.equals(aidVar.a) && this.b.equals(aidVar.b) && this.c.equals(aidVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
