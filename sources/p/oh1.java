package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oh1 {
    public final String a;
    public final String b;
    public final String c;

    public oh1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh1)) {
            return false;
        }
        oh1 oh1Var = (oh1) obj;
        return this.a.equals(oh1Var.a) && this.b.equals(oh1Var.b) && this.c.equals(oh1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
