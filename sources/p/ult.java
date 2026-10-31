package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ult extends wlt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ult(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ult)) {
            return false;
        }
        ult ultVar = (ult) obj;
        return this.a.equals(ultVar.a) && this.b.equals(ultVar.b) && this.c.equals(ultVar.c) && this.d.equals(ultVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
