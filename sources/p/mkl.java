package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mkl extends okl {
    public final int a;
    public final String b;

    public mkl(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkl)) {
            return false;
        }
        mkl mklVar = (mkl) obj;
        return this.a == mklVar.a && u890.j(this.b, mklVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
