package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mrc implements orc {
    public final Long a;
    public final long b;
    public final long c;
    public final long d;

    public mrc(Long l, long j, long j2, long j3) {
        this.a = l;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrc)) {
            return false;
        }
        mrc mrcVar = (mrc) obj;
        return u890.j(this.a, mrcVar.a) && this.b == mrcVar.b && this.c == mrcVar.c && this.d == mrcVar.d;
    }

    public final int hashCode() {
        Long l = this.a;
        return Long.hashCode(this.d) + cy30.f(cy30.f((l == null ? 0 : l.hashCode()) * 31, this.b, 31), this.c, 31);
    }
}
