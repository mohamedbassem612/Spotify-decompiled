package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mzg {
    public final String a;
    public final String b;
    public final boolean c;
    public final Integer d;

    public mzg(String str, String str2, boolean z, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzg)) {
            return false;
        }
        mzg mzgVar = (mzg) obj;
        return u890.j(this.a, mzgVar.a) && u890.j(this.b, mzgVar.b) && this.c == mzgVar.c && this.d.equals(mzgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
