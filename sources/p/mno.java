package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mno implements nno {
    public final String a;
    public final int b;
    public final int c;

    public mno(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mno)) {
            return false;
        }
        mno mnoVar = (mno) obj;
        return u890.j(this.a, mnoVar.a) && this.b == mnoVar.b && this.c == mnoVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
