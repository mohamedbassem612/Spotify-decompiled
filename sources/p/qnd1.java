package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qnd1 extends czo1 {
    public final int c;
    public final int d;

    public qnd1(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnd1)) {
            return false;
        }
        qnd1 qnd1Var = (qnd1) obj;
        return this.c == qnd1Var.c && this.d == qnd1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
    }
}
