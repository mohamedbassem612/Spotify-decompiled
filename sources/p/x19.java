package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x19 extends xm31 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public x19(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            bhn0.i("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            bhn0.i("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            bhn0.i("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xm31)) {
            return false;
        }
        x19 x19Var = (x19) ((xm31) obj);
        return this.b.equals(x19Var.b) && this.c.equals(x19Var.c) && this.d.equals(x19Var.d) && this.e.equals(x19Var.e) && this.f == x19Var.f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return pze0.h(this.f, "}", sb);
    }
}
