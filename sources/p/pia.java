package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pia {
    public final long a;
    public final long b;
    public final float c;

    public pia(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pia)) {
            return false;
        }
        pia piaVar = (pia) obj;
        return jfv.f(this.a, piaVar.a) && jfv.f(this.b, piaVar.b) && Float.compare(this.c, piaVar.c) == 0;
    }

    public final int hashCode() {
        ytw0 ytw0Var = jfv.b;
        return Float.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
