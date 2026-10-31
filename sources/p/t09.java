package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t09 {
    public static final t09 f;
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    static {
        ajq0 ajq0Var = new ajq0();
        ajq0Var.S();
        ajq0Var.Q();
        ajq0Var.O();
        ajq0Var.P();
        ajq0Var.R();
        f = ajq0Var.i();
    }

    public t09(long j, int i, int i2, long j2, int i3) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t09) {
            t09 t09Var = (t09) obj;
            if (this.a == t09Var.a && this.b == t09Var.b && this.c == t09Var.c && this.d == t09Var.d && this.e == t09Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return this.e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return gvg.j(sb, this.e, "}");
    }
}
