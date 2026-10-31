package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xnu {
    public static final xnu e = new xnu("en-US-x", "Your DJ X here. What can I play for you?", "Let DJ pick", "English");
    public static final xnu f = new xnu("", "", "", "");
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xnu(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnu)) {
            return false;
        }
        xnu xnuVar = (xnu) obj;
        return this.a.equals(xnuVar.a) && this.b.equals(xnuVar.b) && this.c.equals(xnuVar.c) && this.d.equals(xnuVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
