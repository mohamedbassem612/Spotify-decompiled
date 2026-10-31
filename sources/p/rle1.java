package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rle1 {
    public final String a;
    public final String b;

    public rle1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rle1)) {
            return false;
        }
        rle1 rle1Var = (rle1) obj;
        return this.a.equals(rle1Var.a) && this.b.equals(rle1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
