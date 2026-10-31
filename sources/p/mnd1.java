package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mnd1 extends azo1 {
    public final int c;
    public final String d;

    public mnd1(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnd1)) {
            return false;
        }
        mnd1 mnd1Var = (mnd1) obj;
        return this.c == mnd1Var.c && u890.j(this.d, mnd1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }
}
