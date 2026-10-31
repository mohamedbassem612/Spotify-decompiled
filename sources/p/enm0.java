package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class enm0 implements rij0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public enm0(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && enm0.class == obj.getClass()) {
            enm0 enm0Var = (enm0) obj;
            if (this.a == enm0Var.a && this.b == enm0Var.b && this.c == enm0Var.c && this.d == enm0Var.d && this.e == enm0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return anm1.z(this.e) + ((anm1.z(this.d) + ((anm1.z(this.c) + ((anm1.z(this.b) + ((anm1.z(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
