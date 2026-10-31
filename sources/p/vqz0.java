package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vqz0 {
    public final long a;
    public final String b;
    public int c;

    public vqz0(String str, long j) {
        this.b = str;
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vqz0.class != obj.getClass()) {
            return false;
        }
        vqz0 vqz0Var = (vqz0) obj;
        return this.a == vqz0Var.a && this.b.equals(vqz0Var.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode() + ((16337 + ((int) this.a)) * 31);
        this.c = iHashCode;
        return iHashCode;
    }
}
