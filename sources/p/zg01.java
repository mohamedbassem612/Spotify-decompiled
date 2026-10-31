package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zg01 implements ez00 {
    public final boolean a;
    public final long b;

    public zg01(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg01)) {
            return false;
        }
        zg01 zg01Var = (zg01) obj;
        return this.a == zg01Var.a && this.b == zg01Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
