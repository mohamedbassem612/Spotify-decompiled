package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xza {
    public final String a;
    public final String b;
    public final int c;

    public xza(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xza)) {
            return false;
        }
        xza xzaVar = (xza) obj;
        return u890.j(this.a, xzaVar.a) && u890.j(this.b, xzaVar.b) && this.c == xzaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
