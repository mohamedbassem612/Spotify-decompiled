package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oei1 {
    public final String a;
    public final String b;
    public final boolean c;

    public oei1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oei1)) {
            return false;
        }
        oei1 oei1Var = (oei1) obj;
        return this.a.equals(oei1Var.a) && this.b.equals(oei1Var.b) && this.c == oei1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
