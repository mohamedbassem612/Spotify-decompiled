package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bxn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ bxn(String str, String str2, int i, String str3) {
        this((i & 1) != 0 ? "" : str, "", str2, (i & 8) != 0 ? "" : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxn)) {
            return false;
        }
        bxn bxnVar = (bxn) obj;
        return u890.j(this.a, bxnVar.a) && u890.j(this.b, bxnVar.b) && u890.j(this.c, bxnVar.c) && u890.j(this.d, bxnVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public bxn(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
