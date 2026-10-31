package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cnh implements lnh {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;

    public cnh(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnh)) {
            return false;
        }
        cnh cnhVar = (cnh) obj;
        return u890.j(this.a, cnhVar.a) && u890.j(this.b, cnhVar.b) && this.c == cnhVar.c && this.d == cnhVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
